/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import static Frames.IssueBooks.tblIssueBooks;
import static Frames.IssueBooks.*;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Udeshika Ranaweera
 */
public class LogicIssueBooks 
{
 Connection con=null;
 PreparedStatement pst=null;
 ResultSet rs=null;
 
 String issuebookid;
 String BookID;
 String MemberId;
 String MemberName;

 String BookTitle;
 String IssueDate;
 String DueDate;
 int issuebooknum;
 
 String IssueDay;
 String IssueMonth;
 String IssueYear;
 String IssueDay1;
 String IssueMonth1;
 String IssueYear1;

 
 public LogicIssueBooks()
{
   con=DBConnection.connect(); 
}
 
  public void Add(String MemberId,String MemberName,String BookID,String BookTitle,String IssueDay, String IssueMonth,String IssueYear,String IssueDay1, String IssueMonth1,String IssueYear1)
 {
     
     this.MemberId=MemberId;
     this.MemberName=MemberName;
     this.BookID=BookID;
     this.BookTitle=BookTitle;
     this.IssueDate=IssueDay+'/'+IssueMonth+'/'+IssueYear;
     this.DueDate=IssueDay1+'/'+IssueMonth1+'/'+IssueYear1;
     
     
  String sql="INSERT INTO issuebook (MemberId,MemberName,BookNo,BookTitle,IssueDate,DueDate)VALUES('"+this.MemberId+"','"+this.MemberName+"','"+this.BookID+"','"+this.BookTitle+"','"+this.IssueDate+"','"+this.DueDate+"')";

       try 
     {
         
         pst=con.prepareStatement(sql);
         pst.execute();
         tableLoad();
             
     }
       catch (Exception e) 
     {
         JOptionPane.showMessageDialog(null, e);
     }
       
        String selectissueqtysql="SELECT Quantity_InHand FROM books where BookID ='"+this.BookID+"'";
       
       try{
             pst=con.prepareStatement(selectissueqtysql);
              rs=pst.executeQuery();
              
             if(rs.next())
             {
                 this.issuebooknum = rs.getInt("Quantity_InHand");
                 this.issuebooknum = this.issuebooknum - 1;
             }
             
             
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
       }
       
      
        
        try{
            String upadateissueqtysql="UPDATE books SET Quantity_InHand="+this.issuebooknum+"";
              
            pst=con.prepareStatement(upadateissueqtysql);
            pst.execute();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        logicBooks newBook = new logicBooks();
        newBook.tableLoad();
 }

     public void tableLoad()
    {
          try 
          {
              String sql = "SELECT * FROM issuebook";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();

              tblIssueBooks.setModel(DbUtils.resultSetToTableModel(rs)); 
          } 
          catch (Exception e) 
          {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
    }
     

            
 
    
 public void updateTable(String IssueBookId,String MemberId,String MemberName,String BookID,String BookTitle,String IssueDay, String IssueMonth,String IssueYear,String IssueDay1, String IssueMonth1,String IssueYear1)
    {
        this.issuebookid = IssueBookId;
        this.BookID= BookID;
        this.MemberId= MemberId;
        this.MemberName=MemberName;
       
        this.BookTitle=BookTitle;
        this.IssueDate=IssueDay+'/'+IssueMonth+'/'+IssueYear;
        this.DueDate=IssueDay1+'/'+IssueMonth1+'/'+IssueYear1;
        
        
        String sql = "UPDATE issuebook SET MemberId= '"+this.MemberId+"',MemberName='"+this.MemberName+"',BookNo='"+this.BookID+"',BookTitle='"+this.BookTitle+"',IssueDate='"+this.IssueDate+"',DueDate='"+this.DueDate+"' WHERE IssueBookId = '"+this.issuebookid+"'";
        
        try 
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            tableLoad(); 
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
            
           public void delete(String BookID)
    {
        this.BookID = BookID; 
        String sql = "DELETE FROM issuebook WHERE IssueBookId ='"+this.BookID+"'";
        try 
        {
             pst = con.prepareStatement(sql);
             pst.execute();
             tableLoad();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
           
       public void find(String filter, String searchItem)
    {
        
      String sql ="";
      
        switch (filter) {
            case "IssueBook ID":
                sql ="SELECT * FROM issuebook where IssueBookId LIKE '%"+searchItem+"%'";
                break;
            case "Member Id":
                sql ="SELECT * FROM issuebook where MemberId LIKE '%"+searchItem+"%'";
                break;
            case "Member Name":
                sql ="SELECT * FROM issuebook where MemberName LIKE '%"+searchItem+"%'";
                break;
            case "Book ID":
                sql ="SELECT * FROM issuebook where BookNo LIKE '%"+searchItem+"%'";
                break;
            case "Book Title":
                sql ="SELECT * FROM issuebook where BookTitle LIKE '%"+searchItem+"%'";
                break;
            case "Issue Date":
                sql ="SELECT * FROM issuebook where IssueDate LIKE '%"+searchItem+"%'";
                break;
            case "Due Date":
                sql ="SELECT * FROM issuebook where DueDate LIKE '%"+searchItem+"%'";
                break;
            default:
                break;
        }
      
        try 
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
          
           tblIssueBooks.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
                    
    }
       
       public void findBookTitle(String BookID)
       {
               this.BookID= BookID;
           try 
           {
           
               String BookTitlesql="SELECT Title FROM books WHERE BookID='"+this.BookID+"'";
               
                pst = con.prepareStatement(BookTitlesql);
                rs = pst.executeQuery();
                
                if(rs.next())
                {
                   String searched_booktitile = rs.getString("Title");
                   txtBookTitle.setText(searched_booktitile);
               }
               
           } catch (Exception e) 
           {
                JOptionPane.showMessageDialog(null, e);
           }
       }
       
            public void findMembername(String MemberId)
       {
               this.MemberId= MemberId;
           try 
           {
           
               String MemberNamesql="SELECT Name FROM members WHERE MemberId='"+this.MemberId+"'";
               
                pst = con.prepareStatement(MemberNamesql);
                rs = pst.executeQuery();
                
                if(rs.next())
                {
                   String searched_membername = rs.getString("Name");
                   txtMemberName.setText(searched_membername);
               }
               
           } catch (Exception e) 
           {
                JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
           }
       }
 
}

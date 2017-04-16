/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import static Frames.Books.tblBooks;
import Frames.ReturnBooks;
import static Frames.ReturnBooks.*;
import static Frames.ReturnBooks.txtBookTitle;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Sachin
 */
public class logicReturnBooks {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String RetutnBookID;
    String BookID;
    String BookTitle;
    String MemberID;
    String MemberName;
    String IssueDate;
    String DueDate;
    Float Fine;
    String ReturnID;
    
    String findbookid;
    String memberid;
    String calfine_duedate;
    
    int issuebooknum;
    
     public logicReturnBooks()
    {
        con = DBConnection.connect();
    }
     
    public void clear()
     {
        txtBookid.setText("");
        txtBookTitle.setText("");
        cmbMemberID.removeAllItems();
        txtName.setText("");
        txtIssueDate.setText("");
        txtDueDate.setText("");
        lblFine.setText("0.0");
     }
     
     public void Add(String BookID,String BookTitle,String MemberID,String MemberName,String IssueDate,String DueDate, Float Fine)
    {
        this.BookID = BookID ;
        this.BookTitle = BookTitle;
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.IssueDate = IssueDate;
        this.DueDate = DueDate;
        this.Fine = Fine;
        
        
    
        try 
        {
            String sql = "INSERT INTO returnbook(BookID,BookTitle,MemberID,MemberName,IssueDate,DueDate,Fine) VALUES('"+this.BookID+"','"
                +this.BookTitle+"','"+this.MemberID+"','"+this.MemberName+"','"+this.IssueDate+"','"+this.DueDate+"',"+this.Fine+")";
        
        pst = con.prepareStatement(sql);
        pst.execute();
        
        
        JOptionPane.showMessageDialog(null,"Records added");
        
        
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
         String selectissueqtysql="SELECT Quantity_InHand FROM books where BookID ='"+this.BookID+"'";
       
       try
       {
             pst=con.prepareStatement(selectissueqtysql);
              rs=pst.executeQuery();
              
             if(rs.next())
             {
                 this.issuebooknum = rs.getInt("Quantity_InHand");
                 this.issuebooknum = this.issuebooknum+1;
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
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        tableLoad();
        logicBooks books = new logicBooks();
        books.tableLoad();
    }
     
     public void tableLoad()
    {
          try 
          {
              String sql = "SELECT * FROM returnbook";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
              
               tblReturnBooks.setModel(DbUtils.resultSetToTableModel(rs));
          } 
          catch (Exception e) 
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
    }
     
     public void findbook(String bookid)
     {
         this.findbookid = bookid;
         
         try
         {
             String Booktitile_sql = "SELECT BookTitle from issuebook where BookNo ='"+this.findbookid+" '";
             
              pst = con.prepareStatement(Booktitile_sql);
              rs = pst.executeQuery();
              
               if(rs.next())
               {
                   String searched_booktitile = rs.getString("BookTitle");
                   txtBookTitle.setText(searched_booktitile);
               }
            
         }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
         }
         
         try {
            
            String memberid_sql = "SELECT MemberId FROM issuebook where BookNo ='"+this.findbookid+"'";
            pst = con.prepareStatement(memberid_sql);
            rs = pst.executeQuery();
            
            ReturnBooks.cmbMemberID.removeAllItems(); 
            
            while(rs.next())
            {
                String ID =  rs.getString("MemberId");
                ReturnBooks.cmbMemberID.addItem(ID);
            }
            
            
        } catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
     }
     
     public void findmemberdetails(String memberid)
     {
         this.memberid = memberid;
         
         try
         {
             String membername = "SELECT MemberName FROM issuebook where MemberId ='"+this.memberid+"'";
             
              pst = con.prepareStatement(membername);
              rs = pst.executeQuery();
              
               if(rs.next())
               {
                   String searched_membername = rs.getString("MemberName");
                   txtName.setText(searched_membername);
               }
               
               String issuedate =  "SELECT IssueDate FROM issuebook where MemberId ='"+this.memberid+"'";
               
              pst = con.prepareStatement(issuedate);
              rs = pst.executeQuery();
              
               if(rs.next())
               {
                   String searched_date = rs.getString("IssueDate");
                   txtIssueDate.setText(searched_date);
               }
               
               String duedate = "SELECT DueDate FROM issuebook where MemberId ='"+this.memberid+"'";
               
               pst = con.prepareStatement(duedate);
              rs = pst.executeQuery();
              
               if(rs.next())
               {
                   String searched_duedate = rs.getString("DueDate");
                   txtDueDate.setText(searched_duedate);
               }
         }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
         }
         
         
         
     }
     
     public void calculatefine(String duedate)
         {
           
             this.calfine_duedate = duedate;
             int calday;
             int calmonth;
             float finerate;
             float total_fine;
             
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            String date = dateFormat.format(cal.getTime());
            
            //taking the two day values from the two days
            String sub_day = this.calfine_duedate.substring(0, 2);
            String sub_curday = date.substring(0, 2);
             
            int sub_day_int = Integer.parseInt(sub_day);
            int sub_curday_int = Integer.parseInt(sub_curday);
            
            //taking the two month values from the two months
            String sub_month = this.calfine_duedate.substring(3, 5);
            String sub_curmonth = date.substring(3, 5);
            
            int sub_month_int = Integer.parseInt(sub_month);
            int sub_curmonth_int = Integer.parseInt(sub_curmonth);
            int diff_of_months = sub_curmonth_int - sub_month_int;
            
            //check the date difference
            if(sub_day_int>sub_curday_int)
            {
                calday = 31-sub_day_int;
                calday = calday + sub_curday_int;
            }
            
            else
                calday = sub_curday_int - sub_day_int;
            
            
            if(diff_of_months>=2)
            {
                calday = calday + (31*diff_of_months);
            }
            
            //getting the default fine rate
            try
            {
            String difault_fine_rate_sql = "SELECT Default_FineRate from settings";
            
            pst = con.prepareStatement(difault_fine_rate_sql);
            rs = pst.executeQuery();
            
            if(rs.next())
              {
              finerate = rs.getFloat("Default_FineRate");
             
              total_fine = finerate*calday;
              
              String total_caled_fine = Float.toString(total_fine);
              lblFine.setText(total_caled_fine);
              
              }
            
            
            
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
            }
         }
     
      public void find(String filter, String searchItem)
      {
      String sql ="";
 
        switch (filter) {
            case "Return Book ID":
                sql ="SELECT * from returnbook where ReturnBookID LIKE '%"+searchItem+"%'";
                break;
            case "Book ID":
                sql ="SELECT * from returnbook where BookID LIKE '%"+searchItem+"%'";
                break;
            case "Book Title":
                sql ="SELECT * from returnbook where BookTitle LIKE '%"+searchItem+"%'";
                break;
            case "Member ID":
                sql ="SELECT * from returnbook where MemberID LIKE '%"+searchItem+"%'";
                break;
            case "Member Name":
                sql ="SELECT * from returnbook where MemberName LIKE '%"+searchItem+"%'";
                break;
            case "Issue Date":
                sql ="SELECT * from returnbook where IssueDate LIKE '%"+searchItem+"%'";
                break;
            case "Due Date":
                sql ="SELECT * from returnbook where DueDate LIKE '%"+searchItem+"%'";
                break;
            case "Fine":
                sql ="SELECT * from returnbook where Fine LIKE '%"+searchItem+"%'";
                break;
            default:
                break;
        }
        
        try 
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
             
            tblReturnBooks.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
      
      public void delete(String ReturnID)
    {
        this.ReturnID = ReturnID; 
       
        try 
        {
             String sql = "DELETE FROM returnbook WHERE ReturnBookID ='"+this.ReturnID+"'";
             
             pst = con.prepareStatement(sql);
             pst.execute();
             
              JOptionPane.showMessageDialog(null,"Records Deleted");
        } 
        catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        tableLoad();
    }
}

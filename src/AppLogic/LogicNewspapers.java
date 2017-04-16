/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import Frames.Newspapers;
import static Frames.Newspapers.tblNewspapers;
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
public class LogicNewspapers 
{
 Connection con=null;
 PreparedStatement pst=null;
 ResultSet rs=null;
 
 String PaperId;
 String Name;
 String SubscriptionType;
 String IssueDate;
 String IssueDay;
 String IssueMonth;
 String IssueYear;
 int NumberofCopies;
 String Categories;
 
public LogicNewspapers()
{
   con=DBConnection.connect(); 
}

public void Add(String Name,String NumberofCopies,String SubscriptionType,String IssueDay, String IssueMonth,String IssueYear,String Categories)
{
     this.Name=Name;
     this.NumberofCopies=Integer.parseInt(NumberofCopies);
     this.SubscriptionType=SubscriptionType;
     this.IssueDate=IssueDay+'/'+IssueMonth+'/'+IssueYear;
     this.Categories=Categories;
     

          try 
     {
         String sql="INSERT INTO newspapers (Name,NumberofCopies,SubscriptionType,IssueDate,Category)VALUES('"+this.Name+"',"+this.NumberofCopies+",'"+this.SubscriptionType+"','"+this.IssueDate+"','"+this.Categories+"')";
       
         pst=con.prepareStatement(sql);
         pst.execute();
          tableLoad();
     } catch (Exception e) 
     {
         JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
     }
}

  public void tableLoad()
    {
          try 
          {
              String sql = "SELECT * FROM newspapers";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();

               tblNewspapers.setModel(DbUtils.resultSetToTableModel(rs)); 
          } 
          catch (Exception e) 
          {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
    }
  
       public void LoadCategories()
    {
        try {
            
            String sql = "select Category FROM category";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           
            Newspapers.cmbCategory.removeAllItems(); 
            
            while(rs.next())
            {
                String name =  rs.getString("Category");
                Newspapers.cmbCategory.addItem(name);
            }
            
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
        
              public void updateTable(String PaperId,String Name,String NumberofCopies,String SubscriptionType,String IssueDay, String IssueMonth,String IssueYear,String Categories)
    {
        this.PaperId = PaperId;
        this.Name=Name;
        this.NumberofCopies=Integer.parseInt(NumberofCopies);
        this.SubscriptionType=SubscriptionType;
        this.IssueDate=IssueDay+'/'+IssueMonth+'/'+IssueYear;
        this.Categories=Categories;
        
        
        String sql = "UPDATE newspapers SET Name= '"+this.Name+"',NumberofCopies="+this.NumberofCopies+",SubscriptionType='"+this.SubscriptionType+"',IssueDate='"+this.IssueDate+"',	Category='"+this.Categories+"' WHERE PaperId = '"+this.PaperId+"'";
        
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
           
           public void delete(String PaperId )
    {
        this.PaperId  = PaperId; 
        String sql = "DELETE FROM newspapers  WHERE PaperId ='"+this.PaperId +"'";
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
            case "Paper ID":
                sql ="SELECT * from newspapers where PaperId LIKE '%"+searchItem+"%'";
                break;
            case "Name":
                sql ="SELECT * from newspapers where Name LIKE '%"+searchItem+"%'";
                break;
            case "No of Copies":
                sql ="SELECT * from newspapers where NumberofCopies LIKE '%"+searchItem+"%'";
                break;
            case "Subscription Type":
                sql ="SELECT * from newspapers where SubscriptionType LIKE '%"+searchItem+"%'";
                break;
            case "Issue Date":
                sql ="SELECT * from newspapers where IssueDate LIKE '%"+searchItem+"%'";
                break;
            case "Category":
                sql ="SELECT * from newspapers where Category LIKE '%"+searchItem+"%'";
                break;
            default:
                break;
        }
      
        try 
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
          
            tblNewspapers.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
                    
    }


}

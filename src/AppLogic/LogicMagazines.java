/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import Frames.Magazines;
import static Frames.Magazines.cmbCategory;

import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import static Frames.Magazines.tblMagazines;
import javax.swing.JOptionPane;

/**
 *
 * @author Udeshika Ranaweera
 */
public class LogicMagazines 
{
 Connection con=null;
 PreparedStatement pst=null;
 ResultSet rs=null;
 
 String MagazineId;
 String Name;
 String SubscriptionType;
 String IssueDate;
 String IssueDay;
 String IssueMonth;
 String IssueYear;
 int NoOfCopies;
 String Categories;
 
 public LogicMagazines()
 {
     con=DBConnection.connect();
 }
 
  public void Add(String Name,String NumofCopies,String SubscriptionType,String IssueDay, String IssueMonth,String IssueYear,String Categories)
 {
     this.Name=Name;
     this.NoOfCopies=Integer.parseInt(NumofCopies);
     this.SubscriptionType=SubscriptionType;
     this.IssueDate=IssueDay+'/'+IssueMonth+'/'+IssueYear;
     this.Categories=Categories;

     try 
     {
         String sql="INSERT INTO magazines (Name,NumofCopies,SubscriptionType,IssueDate,Category) VALUES('"+this.Name+"',"+this.NoOfCopies+",'"+this.SubscriptionType+"','"+this.IssueDate+"','"+this.Categories+"')";
         
         pst=con.prepareStatement(sql);
         pst.execute();
         tableLoad();
     } 
     catch (Exception e) 
     {
        JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
     }
     
 }
 
     public void tableLoad()
    {
          try 
          {
              String sql = "SELECT * FROM magazines";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();

               tblMagazines.setModel(DbUtils.resultSetToTableModel(rs)); 
          } 
          catch (Exception e) 
          {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
    }
     
        public void LoadCategories()
    {
        try {
            
            String sql = "SELECT Category FROM category";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           
            Magazines.cmbCategory.removeAllItems(); 
            while(rs.next())
            {
                String name =  rs.getString("Category");
                Magazines.cmbCategory.addItem(name);
            }
            
        } catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
        
         public void updateTable(String MagazineId,String Name,String NumofCopies,String SubscriptionType,String IssueDay, String IssueMonth,String IssueYear,String Categories)
    {
        this.MagazineId=MagazineId ;
        this.Name=Name;
        this.NoOfCopies=Integer.parseInt(NumofCopies);
        this.SubscriptionType=SubscriptionType;
        this.IssueDate=IssueDay+'/'+IssueMonth+'/'+IssueYear;
        this.Categories=Categories;
        
        
        String sql = "UPDATE magazines SET Name= '"+this.Name+"',NumofCopies="+this.NoOfCopies+",SubscriptionType='"+this.SubscriptionType+"',	IssueDate='"+this.IssueDate+"',Category='"+this.Categories+"' WHERE MagazineId = '"+this.MagazineId+"'";
        
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
        
        public void delete(String MagazineId)
    {
        this.MagazineId = MagazineId; 
        String sql = "DELETE FROM magazines WHERE MagazineId ='"+this.MagazineId+"'";
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
            case "Magazine ID":
                sql ="SELECT * from magazines where MagazineId LIKE '%"+searchItem+"%'";
                break;
            case "Name":
                sql ="SELECT * from magazines where Name LIKE '%"+searchItem+"%'";
                break;
            case "No of Copies":
                sql ="SELECT * from magazines where NumofCopies LIKE '%"+searchItem+"%'";
                break;
            case "Subscription Type":
                sql ="SELECT * from magazines where SubscriptionType LIKE '%"+searchItem+"%'";
                break;
            case "Issue Date":
                sql ="SELECT * from magazines where IssueDate LIKE '%"+searchItem+"%'";
                break;
            case "Category":
                sql ="SELECT * from magazines where Category LIKE '%"+searchItem+"%'";
                break;
            default:
                break;
        }
      
        try 
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
          
              tblMagazines.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
                    
    }
}

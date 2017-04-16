/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import Frames.Books;
import static Frames.Books.tblBooks;
import Source.DBConnection;
import Source.Validation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sachin
 */
public class logicBooks {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String BookID;
    int ISBN;
    String Title;
    String Category;
    String Author_Name;
    int Edition;
    int Quantity;
    int Quantity_InHand;
    
    public logicBooks()
    {
        con = DBConnection.connect();
    }
    
    public void Add(String ISBN,String Title,String Category,String Author_Name,String Edition,String Quantity,String Quantity_InHand)
    {
        
        this.ISBN = Integer.parseInt(ISBN) ;
        this.Title = Title;
        this.Category = Category;
        this.Author_Name = Author_Name;
        this.Edition = Integer.parseInt(Edition);
        this.Quantity = Integer.parseInt(Quantity);
        this.Quantity_InHand = this.Quantity;
     
        try 
        {
            String sql = "INSERT INTO books(ISBN,Title,Category,Author_Name,Edition,Quantity,Quantity_InHand) VALUES("+this.ISBN+",'"
                +this.Title+"','"+this.Category+"','"+this.Author_Name+"',"+this.Edition+","+this.Quantity+","+this.Quantity_InHand+")";
        
        pst = con.prepareStatement(sql);
        pst.execute();
        
        
        JOptionPane.showMessageDialog(null,"Records added");
        
        
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
       
        
    }
    
    public void updateTable(String BookID,String ISBN,String Title,String Category,String Author_Name,String Edition,String Quantity,String Quantity_InHand)
    {
        this.BookID = BookID; 
        this.ISBN = Integer.parseInt(ISBN);
        this.Title = Title;
        this.Category = Category;
        this.Author_Name = Author_Name;
        this.Edition = Integer.parseInt(Edition);
        this.Quantity = Integer.parseInt(Quantity);
        this.Quantity_InHand = this.Quantity;
        
        try 
        {
             String sql = "UPDATE books SET ISBN= "+this.ISBN+", Title= '"+this.Title+"',Category = '"+this.Category+"',Author_Name='"+this.Author_Name+"',Edition="+this.Edition+",Quantity="+this.Quantity+",Quantity_InHand="+this.Quantity_InHand+" WHERE BookID = '"+this.BookID+"'";
             
            pst = con.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Records Updated");
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void delete(String BookID)
    {
        this.BookID = BookID; 
       
        try 
        {
             String sql = "DELETE FROM books WHERE BookID ='"+this.BookID+"'";
             
             pst = con.prepareStatement(sql);
             pst.execute();
             
              JOptionPane.showMessageDialog(null,"Records Deleted");
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void tableLoad()
    {
          try 
          {
              String sql = "SELECT * FROM books";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
              
               tblBooks.setModel(DbUtils.resultSetToTableModel(rs));
          } 
          catch (Exception e) 
          {
              JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
          }
    }
     
     public void LoadCategories()
    {
        try {
            
            String sql = "SELECT Category FROM category";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            Books.cmbCatagory.removeAllItems(); 
            
            while(rs.next())
            {
                String name =  rs.getString("Category");
                Books.cmbCatagory.addItem(name);
            }
            
         
            
        } catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
     
      public void find(String filter, String searchItem)
    {
        
      String sql ="";
 
        switch (filter) {
            case "Book ID":
                sql ="SELECT * from books where BookID LIKE '%"+searchItem+"%'";
                break;
            case "ISBN":
                sql ="SELECT * from books where ISBN LIKE '%"+searchItem+"%'";
                break;
            case "Title":
                sql ="SELECT * from books where Title LIKE '%"+searchItem+"%'";
                break;
            case "Category":
                sql ="SELECT * from books where Category LIKE '%"+searchItem+"%'";
                break;
            case "Author Name":
                sql ="SELECT * from books where Author_Name LIKE '%"+searchItem+"%'";
                break;
            case "Edition":
                sql ="SELECT * from books where Edition LIKE '%"+searchItem+"%'";
                break;
            case "Quantity":
                sql ="SELECT * from books where Quantity LIKE '%"+searchItem+"%'";
                break;
            default:
                break;
        }
        
        try 
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
             
            tblBooks.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
        }
                                   
    }
      
}

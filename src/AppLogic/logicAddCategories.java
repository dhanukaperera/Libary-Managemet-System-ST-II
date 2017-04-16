/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import static Frames.AddCategories.tblAddCategories;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Chamod Ratnayaka
 */
public class logicAddCategories {
    
    Connection con = null ;
    PreparedStatement pet = null ;
    ResultSet rs = null ;
    
    String CategoryId ;
    String Category ;
    String Description ;
     
     public logicAddCategories(){
     
     con = DBConnection.connect();
     
     }
     
     public void Add(String Category, String Description){
     
     this.Category = Category ;
     this.Description = Description ;
     
         try {
             String sql = "INSERT INTO category(Category,Description) VALUES('"+this.Category+"','"+this.Description+"')";
             pet = con.prepareStatement(sql);
             pet.execute();
             tableLoad();
             
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);             
         }
         
         logicBooks logic = new logicBooks();
         logic.LoadCategories();
         
         LogicCD_DVD logic_cddvd = new LogicCD_DVD();
         logic_cddvd.LoadCategories();
         
         LogicMagazines logic_mag = new LogicMagazines();
         logic_mag.LoadCategories();
         
         LogicNewspapers logic_news = new LogicNewspapers();
         logic_news.LoadCategories();
         
     }
     
      public void tableLoad(){
      
          try {
              String sql = "SELECT CategoryID ,Category ,Description FROM category" ;
              
              pet = con.prepareStatement(sql);
              rs = pet.executeQuery();              
              tblAddCategories.setModel(DbUtils.resultSetToTableModel(rs)); 
          } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
      public void Update(String CategoryId, String Category, String Description){
      
          this.CategoryId = CategoryId;
          this.Category = Category ;
          this.Description = Description ;
          
          try {
               String sql = "UPDATE category SET Category ='"+this.Category+"', Description ='"+this.Description+"' WHERE CategoryID = '"+this.CategoryId+"'";
               
               pet = con.prepareStatement(sql);
               pet.execute();
               JOptionPane.showMessageDialog(null,"Records added");
               tableLoad();
               
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
       public void delete(String CateoryId){
      
       this.CategoryId = CateoryId;
       String sql = "DELETE FROM category  WHERE CategoryID ='"+this.CategoryId+"'" ;
      
          try {
             pet = con.prepareStatement(sql);
             pet.execute();
             tableLoad();
             
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
       
        public void find(String filter, String searchItem){
      
          String sql = "" ;
          
          switch(filter){
          
              case "Category ID":
                  sql = "SELECT CategoryID,Category,Description FROM category WHERE CategoryID LIKE '%"+searchItem+"%'";
                  break;
              case "Category":
                  sql = "SELECT CategoryID,Category,Description FROM category WHERE Category LIKE '%"+searchItem+"%'";
                  break;
              case "Description":
                  sql = "SELECT CategoryID,Category,Description FROM category WHERE Description LIKE '%"+searchItem+"%'";
                  break;
              default:
                  break;    
          
          }
      
           try 
           {
            pet = con.prepareStatement(sql);
            rs = pet.executeQuery(); 
            tblAddCategories.setModel(DbUtils.resultSetToTableModel(rs)); 
           } 
           catch (Exception e) 
           {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
           }
    
}

}

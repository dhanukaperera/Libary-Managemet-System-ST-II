/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;



import static Frames.AddAccountType.tblAddAccountType;
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
public class logicAddAccountType {
    
     Connection con = null ;
     PreparedStatement pet = null ;
     ResultSet rs = null ;
     
     String TypeId ;
     String Type ;
     String Books ;
     String CD_DVD ;
     String NewsPapers ;
     String Magazines ;
     String Members ; 
     String IssueBooks; 
     String ReturnBooks;
     String Staff;
     String Categories;
    
  
     
     
     public logicAddAccountType(){
     
     con = DBConnection.connect();
     
     }
     
     public void Add(String Type, String Books, String CD_DVD , String NewsPapers, String Magazines, String Members,String IssueBooks, String ReturnBooks, String Staff, String Categories){   
     this.Type = Type ;
     this.Books = Books ;
     this.CD_DVD = CD_DVD ;
     this.Categories = Categories ;
     this.IssueBooks =IssueBooks ;
     this.Magazines = Magazines ;
     this.Members = Members ;
     this.NewsPapers = NewsPapers ;
     this.ReturnBooks = ReturnBooks ;
     this.Staff = Staff ;
     
         try {
             String sql = "INSERT INTO accounttype(Type,Books,CD_DVD,NewsPapers,Magazines,Members,IssueBooks,ReturnBooks,Staff,Categories) VALUES('"+this.Type+"','"+this.Books+"','"+this.CD_DVD+"','"+this.NewsPapers+"','"+this.Magazines+"','"+this.Members+"','"+this.IssueBooks+"','"+this.ReturnBooks+"','"+this.Staff+"','"+this.Categories+"')";            
             pet = con.prepareStatement(sql);
             pet.execute();
             tableLoad();
             
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);             
         }
     }
     
      public void tableLoad(){
      
          try {
              String sql = "SELECT TypeID ,Type ,Books,CD_DVD,NewsPapers,Magazines,Members,IssueBooks,ReturnBooks,Staff,Categories FROM accounttype" ;
              
              pet = con.prepareStatement(sql);
              rs = pet.executeQuery();              
              tblAddAccountType.setModel(DbUtils.resultSetToTableModel(rs)); 
          } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
      public void Update(String TypeId, String Type, String Books, String CD_DVD , String NewsPapers, String Magazines, String Members,String IssueBooks, String ReturnBooks, String Staff, String Categories){
      
          this.TypeId = TypeId;
          this.Type = Type ;
          this.Books = Books ;
          this.CD_DVD = CD_DVD ;
          this.Categories = Categories ;
          this.IssueBooks =IssueBooks ;
          this.Magazines = Magazines ;
          this.Members = Members ;
          this.NewsPapers = NewsPapers ;
          this.ReturnBooks = ReturnBooks ;
          this.Staff = Staff ;
          
          try {
               String sql = "UPDATE accounttype SET Type ='"+this.Type+"',Books='"+this.Books+"',CD_DVD='"+this.CD_DVD+"',NewsPapers='"+this.NewsPapers+"',Magazines='"+this.Magazines+"',Members='"+this.Members+"',IssueBooks='"+this.IssueBooks+"',ReturnBooks='"+this.ReturnBooks+"',Staff='"+this.Staff+"',Categories='"+this.Categories+"' WHERE TypeId = '"+this.TypeId+"'";
               
               pet = con.prepareStatement(sql);
               pet.execute();
               JOptionPane.showMessageDialog(null,"Records added");
               tableLoad();
               
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
      public void delete(String TypeId){
      
      this.TypeId = TypeId;
      String sql = "DELETE FROM accounttype  WHERE TypeId ='"+this.TypeId+"'" ;
      
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
          
              case "Type Id":
                  sql = "SELECT TypeId,Type FROM accounttype WHERE TypeId LIKE '%"+searchItem+"%'";
                  break;
              case "Account Type":
                  sql = "SELECT TypeId,Type FROM accounttype WHERE Type LIKE '%"+searchItem+"%'";
                  break;
              default:
                  break;    
          
          }
      
           try 
           {
            pet = con.prepareStatement(sql);
            rs = pet.executeQuery(); 
            tblAddAccountType.setModel(DbUtils.resultSetToTableModel(rs)); 
           } 
           catch (Exception e) 
           {
            JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
           }
      
      }
      
      
      
     
    
}

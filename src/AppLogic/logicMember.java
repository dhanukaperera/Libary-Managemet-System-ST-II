/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import static Frames.Members.tblMembers;
import Source.DBConnection ;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Chamod Ratnayaka
 */
public class logicMember {
      Connection con = null ;
      PreparedStatement pet = null ;
      ResultSet rs = null ;

      String MemberID ;
      String Name ;
      String Address ;
      String Gender ;
      int ContactNo ;
      String Email ;
      
      public logicMember(){
         
           con = DBConnection.connect();
      }
     
      public void Add(String Name ,String Address ,String Gender ,String ContactNo,String Email ){
          
       this.Name = Name ;  
       this.Address = Address ;
       this.ContactNo = Integer.parseInt(ContactNo) ;
       this.Gender = Gender ;
       this.Email = Email ;
      
        try {
        String sql = "INSERT INTO members(Name,Address,Gender,Contact_No,Email) VALUES ('"+this.Name+"','"+this.Address+"','"+this.Gender+"','"+this.ContactNo+"','"+this.Email+"')";
            
        pet = con.prepareStatement(sql);
        pet.execute();
        tableLoad();
           
        }                                       

       catch(Exception e){
         JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
       
        } 
       
      }
      
      public void tableLoad(){
      
          try {
              String sql = "SELECT MemberID ,Name ,Address ,Gender ,Contact_No ,Email FROM members" ;
              
              pet = con.prepareStatement(sql);
              rs = pet.executeQuery();              
             tblMembers.setModel(DbUtils.resultSetToTableModel(rs)); 
          } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
      
      public void Update(String MemberID ,String Name ,String Address ,String Gender ,String ContactNo,String Email){
      
      this.MemberID = MemberID; 
      this.Name = Name ;  
      this.Address = Address ;
      this.ContactNo = Integer.parseInt(ContactNo) ;
      this.Gender = Gender ;
      this.Email = Email ;
      
       try {
        String sql = "UPDATE members SET Name ='"+this.Name+"', Address ='"+this.Address+"', Gender ='"+this.Gender+"', Contact_No ='"+this.ContactNo+"', Email = '"+this.Email+"' WHERE MemberID = '"+this.MemberID+"'";
            
        pet = con.prepareStatement(sql);
        pet.execute();
        JOptionPane.showMessageDialog(null,"Records added");
        tableLoad();
     
           
        }                                       
       catch(Exception e){
         JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
      
        } 
      }
      
      public void delete(String MemberID){
      
      this.MemberID = MemberID;
      String sql = "DELETE FROM members WHERE MemberID ='"+this.MemberID+"'" ;
      
          try {
             pet = con.prepareStatement(sql);
             pet.execute();
             tableLoad();
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
          }
      }
      
      
    
       public void find(String filter, String searchItem)
       {
        
       String sql = "";
       
      
          switch (filter) {
              case "Member ID":
                  sql ="SELECT MemberID,Name,Address,Gender,Contact_No,Email FROM members where MemberID LIKE '%"+searchItem+"%'";
                  break;
              case "Name":
                  sql ="SELECT MemberID,Name,Address,Gender,Contact_No,Email FROM members where Name LIKE '%"+searchItem+"%'";
                  break;
              case "Address":
                  sql ="SELECT MemberID,Name,Address,Gender,Contact_No,Email FROM members where Address LIKE '%"+searchItem+"%'";
                  break;
              case "Gender":
                  sql ="SELECT MemberID,Name,Address,Gender,Contact_No,Email FROM members where Gender LIKE '%"+searchItem+"%'";
                  break;
              case "Contact No":
                  sql ="SELECT MemberID,Name,Address,Gender,Contact_No,Email FROM members where Contact_No LIKE '%"+searchItem+"%'";
                  break;
              case "Email":
                  sql ="SELECT MemberID,Name,Address,Gender,Contact_No,Email FROM members where Email LIKE '%"+searchItem+"%'";
                  break;
              default:
                  break;
          }
       
      
        try 
        {
            pet = con.prepareStatement(sql);
            rs = pet.executeQuery();
            tblMembers.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
                    
    }
       
      
           
        
            
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import static Frames.ManagePermissions.*;
import static Frames.ManagePermissions.lblNoOfStaffMembers;
import static Frames.ReturnBooks.tblReturnBooks;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sachin
 */
public class logicSettings {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String adminusername;
    String adminuserpassword;
    String staffpassword;
    float finerate;
    String notices;
    
     public logicSettings()
    {
        con = DBConnection.connect();
    }
     
     public void tableLoad()
    {
          try 
          {
              //staff table count loading method
              String staffsql = "SELECT COUNT(StaffId) FROM staff";
              
              pst = con.prepareStatement(staffsql);
              rs = pst.executeQuery();
              
              if(rs.next())
              {
              int num = rs.getInt("COUNT(StaffId)");
              String staffnum = Integer.toString(num);
              lblNoOfStaffMembers.setText(staffnum);
              
              }
              
              
          } 
          catch (Exception e) 
          {
              System.out.print(e);
          }
          
          try{
              //member table count loading method
              String memberssql = "SELECT COUNT(MemberID) FROM members";
               pst = con.prepareStatement(memberssql);
              rs = pst.executeQuery();
              
               if(rs.next())
               {
               int num1 = rs.getInt("COUNT(MemberID)");
              String membernum = Integer.toString(num1);
              lblMembers.setText(membernum);
               }
          }
          catch(Exception e) 
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
          
          try
          {
              //book table count loading method
              String booksssql = "SELECT COUNT(BookID) FROM books";
              pst = con.prepareStatement(booksssql);
              rs = pst.executeQuery();
              
                if(rs.next())
                {
               int num2 = rs.getInt("COUNT(BookID)");
              String booknum = Integer.toString(num2);
              lblBooks.setText(booknum);
                }
          }
          catch(Exception e) 
          {
              
          }
          
          try
          {
              //newspapers table count method
            String newspaperssql = "SELECT COUNT(PaperId) FROM newspapers";
            pst = con.prepareStatement(newspaperssql);
              rs = pst.executeQuery();
              
               if(rs.next())
                {
               int num3 = rs.getInt("COUNT(PaperId)");
              String mewspapernum = Integer.toString(num3);
              lblNewspapers.setText(mewspapernum);
                }
              
          }
          catch(Exception e) 
          {
          }
          
          try
          {
              //magazine table count method
              String magazinesql = "SELECT COUNT(MagazineId) FROM magazines";
               pst = con.prepareStatement(magazinesql);
              rs = pst.executeQuery();
              
              
                 if(rs.next())
                 {
               int num4 = rs.getInt("COUNT(MagazineId)");
              String magazinenum = Integer.toString(num4);
              lblMagazine.setText(magazinenum);
                 }
          }
          catch(Exception e)
          {
              
          }
          
          try
          {
              //cddvd table count load method
               String CD_DVDsql = "SELECT COUNT(DiskId) FROM cddvd";
               
                 pst = con.prepareStatement(CD_DVDsql);
              rs = pst.executeQuery();
              
               if(rs.next()){
                  int num5 = rs.getInt("COUNT(DiskId)");
              String disknum = Integer.toString(num5);
              lblCD_DVD.setText(disknum);
               }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
          
          try
          {
              //Admin User name loading method
              String adminusernamesql = "SELECT Admin_UserName from settings";
              pst = con.prepareStatement(adminusernamesql);
              rs = pst.executeQuery();
              
               if(rs.next()){
                   String adminnam= rs.getString("Admin_UserName");
                   txtAdminUserName.setText(adminnam);
               }
          }
          catch(Exception e)
          {
              
          }
          
          try
          {
              //Admin User password loading method
              String adminpasswordsql = "SELECT Admin_Password from settings";
              pst = con.prepareStatement(adminpasswordsql);
              rs = pst.executeQuery();
              
               if(rs.next()){
                   String adminpass= rs.getString("Admin_Password");
                   txtAdminPassword1.setText(adminpass);
               }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
          
          try
          {
              //Default Staff Password
              String defstaffpasswordsql = "SELECT Default_StaffPassword from settings";
              pst = con.prepareStatement(defstaffpasswordsql);
              rs = pst.executeQuery();
              
               if(rs.next()){
                   String staffpass= rs.getString("Default_StaffPassword");
                   txtStaffPassword.setText(staffpass);
               }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
          
          
           try
          {
              //Fine rate
              String fineratesql = "SELECT Default_FineRate from settings";
              pst = con.prepareStatement(fineratesql);
              rs = pst.executeQuery();
              
               if(rs.next()){
                   float finerate = rs.getFloat("Default_FineRate");
                   String fineratestring = Float.toString(finerate);
                   txtFineRate.setText(fineratestring);
               }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
           
           
           try
          {
              //Notices
              String noticessql = "SELECT Notices from settings";
              pst = con.prepareStatement(noticessql);
              rs = pst.executeQuery();
              
               if(rs.next()){
                   String notices = rs.getString("Notices");
                   txtnotices.setText(notices);
               }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
          }
                 
    }
    
     public void updateTable(String Admin_Username, String Admin_Password,String Default_Staff_password,String FineRate,String Notice )
     {
         this.adminusername = Admin_Username;
         this.adminuserpassword = Admin_Password;
         this.staffpassword = Default_Staff_password;
         this.finerate = Float.parseFloat(FineRate);
         this.notices = Notice;
         
         try 
        {
             String sql = "UPDATE settings SET Admin_UserName= '"+this.adminusername+"', Admin_Password = '"+this.adminuserpassword+"',Default_StaffPassword = '"+this.staffpassword+"',Default_FineRate='"+this.finerate+"',Notices='"+this.notices+"'";
             
            pst = con.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Records Updated");
        } 
        catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
         
     }
}

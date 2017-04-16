/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import Frames.Staff;
import static Frames.Staff.cmbAccoutType;
import static Frames.Staff.tblStaff;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dhanuka Perera
 */
public class LogicSfaff 
{
    Connection con = null; 
    PreparedStatement pst = null;  
    ResultSet rs = null;
    
    String StaffId;
    String Name;
    String Address;
    int phone;
    String gender;
    String email;
    String username;
    String password;
    String accountType;
    
    public LogicSfaff()
    {
        con = DBConnection.connect();
    }
    
    public void Add(String Name,String Address,String phone,String gender,String email,String accountType)
    {
        this.Name = Name;
        this.Address = Address;
        this.phone = Integer.parseInt(phone);
        this.gender = gender;
        this.email = email;
        this.accountType = accountType;
        
        String sqldefpassword = "SELECT Default_StaffPassword from settings";
        
        try {
             pst = con.prepareStatement(sqldefpassword);
            rs = pst.executeQuery();
            
            if(rs.next()){
                
                 this.password = rs.getString("Default_StaffPassword");
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
      
        
        String sqlStaff = "INSERT INTO staff(Name,Address,Gender,Role,ContactNo,Email)" + " VALUES('"+this.Name+"','"+this.Address+"','"+this.gender+"','"+this.accountType+"',"+this.phone+",'"+this.email+"')";
        String sqlLogin = "INSERT INTO login(Password,AccountType)" + " VALUES('"+this.password+"','"+this.accountType+"')";
        
        
        try 
        {
            pst = con.prepareStatement(sqlStaff);
            pst.execute();
           tableLoad();
            
            pst = con.prepareStatement(sqlLogin);
            pst.execute();
            
           
            
        } 
        catch (Exception e) 
        {
           //JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null,e);
        }
 
    }
   
    public void tableLoad()
    {
        String sqlStaff = "SELECT StaffId,Name,Address,Gender,Role,ContactNo,Email FROM staff";

        try 
        {
              
            pst = con.prepareStatement(sqlStaff);
            rs = pst.executeQuery();
          
            tblStaff.setModel(DbUtils.resultSetToTableModel(rs)); 
           
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void LoadCategories()
    {
        try {
            
            String sql = "SELECT Type FROM accounttype";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           
             
            Staff.cmbAccoutType.removeAllItems(); 
            while(rs.next())
            {
                String currentAccountType =  rs.getString("Type");
                cmbAccoutType.addItem(currentAccountType);
            }
            
           
            
        } catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
   
    public void updateTable(String StaffId, String Name,String Address,String phone,String gender,String email,String accountType)
    {
        this.StaffId = StaffId;
        this.Name = Name;
        this.Address = Address;
        this.phone = Integer.parseInt(phone);
        this.gender = gender;
        this.email = email;
        this.accountType = accountType;
        
        String sql = "UPDATE staff SET Name= '" + this.Name + "', Address= '" + this.Address + "',Gender = '" + this.gender + "',Role='" + this.accountType + "',ContactNo="+this.phone+",Email= '"+this.email+"' WHERE StaffId = '" + this.StaffId + "'";
        System.out.println(sql);
            try {
               pst = con.prepareStatement(sql);
               pst.execute();
               tableLoad();

            } catch (Exception e) {
                
               JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
            }
        
       
    }
    
    public void delete(String StaffId)
    {
        this.StaffId = StaffId;
        String sqlStaff = "DELETE FROM staff WHERE StaffId ='"+this.StaffId+"'";
        String sqlLogin = "DELETE FROM login WHERE UserName ='"+this.StaffId+"'";
        try 
        {
             pst = con.prepareStatement(sqlStaff);
             pst.execute();
             
             pst = con.prepareStatement(sqlLogin);
             pst.execute();
             
             tableLoad();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Insert Valid Record","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}

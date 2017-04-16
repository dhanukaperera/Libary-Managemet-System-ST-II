/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import Frames.Home;
import static Frames.Home.txtAccountType;
import Frames.Main;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhanuka Perera
 */

public class LogicHome 
{   
    Connection con = null; 
    PreparedStatement pst = null;  
    ResultSet rs = null;
    
    String userId;
    String name;
    String accountType;
    String address;
    String gender;
    String contactNo;
    String password;
    String email;
    int phone;
    
    String adminUserName;
    String adminPassword;
    String adminAddress;
    String adminGender;
    String adminContact_NO;
    String adminEmail;
    
    String notices;
    
    public LogicHome()
    {
        con = DBConnection.connect();
        
        //getData();
    }
    
    public void loadAdminPfofileData()
    {
        //System.out.println("admin profile" + this.adminUserName);
        try 
        {
            String getAdminUserName = "Select Admin_UserName FROM settings";
            pst = con.prepareStatement(getAdminUserName);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.adminUserName =  rs.getString("Admin_UserName");
            }
            
            
            String getAdmin_Password = "Select Admin_Password FROM settings";
            pst = con.prepareStatement(getAdmin_Password);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.adminPassword =  rs.getString("Admin_Password");
            }
            
            
            
            String getAdminAddress = "Select Address FROM settings";
            pst = con.prepareStatement(getAdminAddress);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.adminAddress =  rs.getString("Address");
            }
            
            String getAdminGender = "Select Gender FROM settings";
            pst = con.prepareStatement(getAdminGender);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.adminGender =  rs.getString("Gender");
            }
            
            String getAdminContact_NO = "Select Contact_NO FROM settings";
            pst = con.prepareStatement(getAdminContact_NO);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.adminContact_NO =  rs.getString("Contact_NO");
            }
            
            String getAdminEmail = "Select Email FROM settings";
            pst = con.prepareStatement(getAdminEmail);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.adminEmail =  rs.getString("Email");
            }
            
           
              
        } 
        catch (Exception e) 
        {
            
        }
        setAdminProfileData();
    }
    
    public void setAdminProfileData()
    {
        System.out.println("Admin user name : "+ this.adminUserName);
        System.out.println("Admin pass : "+this.adminPassword);
        System.out.println("Admin address : "+this.adminAddress);
        System.out.println("Admin gender : "+this.adminGender);
        System.out.println("Admin contact : "+this.adminContact_NO);
        System.out.println("Admin email : "+ this.adminEmail); 
            
        Home.txtName.setText("Library Management System");
        Home.txtAccountType.setText("Admin");
        Home.txtStaffID.setText("root");
        Home.txtAddress.setText(this.adminAddress);
        Home.txtContactNo.setText(this.adminContact_NO);
        Home.txtEmail.setText(this.adminEmail);
        Home.txtPassword.setText(this.adminPassword);    
            
         //setProfileIcon();   
            
    }
    
    public void loadProfileData(String puserId)
    {
        con = DBConnection.connect();
        this.userId = puserId;
        
        try {
            
             String getName = "Select Name FROM staff WHERE StaffId = '"+this.userId+"'";
            pst = con.prepareStatement(getName);
            rs = pst.executeQuery();
            
        while(rs.next())
        {
            this.name =  rs.getString("Name");
        }
            
        
            String getAddress = "Select Address FROM staff WHERE StaffId = '"+this.userId+"'";
            pst = con.prepareStatement(getAddress);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.address =  rs.getString("Address");
            }
            
            String getGender = "Select Gender FROM staff WHERE StaffId = '"+this.userId+"'";
            pst = con.prepareStatement(getGender);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.gender =  rs.getString("Gender");
            }
            
            String getRole = "Select Role FROM staff WHERE StaffId = '"+this.userId+"'";
            pst = con.prepareStatement(getRole);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.accountType =  rs.getString("Role");
            }
            
            String getContactNo = "Select ContactNo FROM staff WHERE StaffId = '"+this.userId+"'";
            pst = con.prepareStatement(getContactNo);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.contactNo =  rs.getString("ContactNo");
            }
            
            String getEmail = "Select Email FROM staff WHERE StaffId = '"+this.userId+"'";
            pst = con.prepareStatement(getEmail);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.email =  rs.getString("Email");
            }
            
            String getPassword = "Select Password FROM login WHERE UserName = '"+this.userId+"'";
            pst = con.prepareStatement(getPassword);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.password =  rs.getString("Password");
            }
        
        System.out.println("name" + this.name);
        System.out.println(this.address);
        System.out.println(this.gender);
        System.out.println(this.accountType);
        System.out.println(this.contactNo);
        System.out.println(this.email);
        System.out.println("Pass : "+this.password);
        
        setProfileData();
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    
    public void setProfileData()
    {
        Home.txtName.setText(this.name);
        Home.txtAccountType.setText(this.accountType);
        Home.txtStaffID.setText(this.userId);
        Home.txtAddress.setText(this.address);
        Home.txtContactNo.setText(this.contactNo);
        Home.txtEmail.setText(this.email);
        Home.txtPassword.setText(this.password);
        Home.cmbGender.setSelectedItem(this.gender);
       // setProfileIcon();
        
    }
   
    
    
    
    public void editProfile(String userId,String name, String accountType, String address,String Gender,String phone, String email, String password)
    {
    
    this.userId =userId; 
    this.name = name;
    this.accountType = accountType;
    this.address = address;
    this.gender = Gender;
    this.phone = Integer.parseInt(phone) ;
    this.password =  password;
    this.email = email;
      
        
        String sqlUpdateStaff = "UPDATE staff SET Name= '" + this.name + "', Address= '" + this.address + "',Gender = '" + this.gender + "',Role='" + this.accountType + "',ContactNo="+this.phone+",Email= '"+this.email+"' WHERE StaffId = '" + this.userId + "'";
        String sqlUpdateLogin = "UPDATE login SET Password= '" + this.password + "' WHERE UserName = '" + this.userId + "'";
        try 
        {
            pst = con.prepareStatement(sqlUpdateStaff);
            pst.execute();
            
            pst = con.prepareStatement(sqlUpdateLogin);
            pst.execute();
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    public void editAdminProfile(String address,String Gender,String phone, String email, String password)
    {
       // this.adminUserName =name ;
        this.adminPassword =password ;
        this.adminAddress = address;
        this.adminGender = Gender;
        this.adminContact_NO = phone;
        this.adminEmail = email;
        
        String sqlUpdateAdmin = "UPDATE settings SET Admin_Password= '" + this.adminPassword + "', Address= '" + this.adminAddress + "',Gender = '" + this.adminGender + "',Contact_NO='" + this.adminContact_NO + "',Email='"+this.adminEmail+"' WHERE Admin_UserName = '"+this.adminUserName+"'";
        
        try 
        {
            pst = con.prepareStatement(sqlUpdateAdmin);
            pst.execute();
            
           
        } 
        catch (Exception e) 
        {
            
        }
        
    }
    
    public void LoadNotice()
    {
        //Home.lblNotice
        
        try 
        {
            String sqlLoadNotices = "Select Notices FROM settings";
            pst = con.prepareStatement(sqlLoadNotices);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.notices =  rs.getString("Notices");
               
            }
            Home.lblNotice.setText(this.notices);
        } 
        catch (Exception e) 
        {
            
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import Frames.Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dhanuka Perera
 */
public class StaffLogin {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public static String username;
    public static String password;
    
    public static String adminUserName;
    public static String adminPassword;
    
    public static String accoutType;
    String userId;
    
    String bookState;
    String CD_DVDState;
    String newsPapersState;
    String magazinesState;
    String membersState;
    String issueBooksState;
    String returnBooksState;
    String staffState;
    String CategoriesState;
    
    boolean Books;
    boolean CD_DVDs;
    boolean Newspapers;
    boolean Magazines;
    boolean Members;
    boolean IssueBooks;
    boolean ReturnBooks;
    boolean Staff;
    boolean AddCategories;
    boolean AddAccountType;
    boolean ManagePermissions;
    
   
    
    
    
    //boolean permitions[] = new boolean[12];
    
    
    public StaffLogin()
    {
         con = DBConnection.connect();
    }
    
    
    public void LoginUser(String username,String password)
    {
        StaffLogin.username = username;
        StaffLogin.password = password;
        
        
       
        
       
        String sqlGetAccountType = "Select AccountType FROM login WHERE UserName = '"+StaffLogin.username+"' AND Password = '"+StaffLogin.password+"'";
       
        try 
        {
            //  String sql = "UPDATE cddvd SET Title= '" + this.diskTitle + "', NoofDisks= '" + this.NoOfDisks + "',Category = '" + this.Category + "',	Authorname='" + this.authorName + "',Quantity='" + this.quantity + "' WHERE DiskId = '" + this.diskId + "'";

            pst = con.prepareStatement(sqlGetAccountType);
            rs = pst.executeQuery();
        
            
             while(rs.next())
            {
                StaffLogin.accoutType =  rs.getString("AccountType");
                System.out.println(accoutType);
            }
             
            
             /*
             getAddminInfo();
             //this.accoutType != null
            if(this.username.equals(this.adminUserName) && this.password.equals(this.adminPassword))
            {
                
                  Main goAdmin;
                  
                goAdmin = new Main();
        
                goAdmin.setVisible(true);
            }
            else if(this.accoutType != null)
            {
               getStates();
               
            }
            else
            {
                 //JOptionPane.showMessageDialog(null,"Error","Please Enter a Valid UserName and Password",JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Please Enter a Valid UserName and Password");
            }
            */
             
             
            
            
              
        }  
        catch (Exception e) 
        {
            
        }
      
    }
    
    
    public void getStates()
    {
        //String getBookState = "Select Books FROM accounttype WHERE Type = '"+this.accoutType+"'";
        
        try 
        {
            String getBookState = "Select Books FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getBookState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.bookState =  rs.getString("Books");
            }
            
            String getCD_DVDState = "Select CD_DVD FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getCD_DVDState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.CD_DVDState =  rs.getString("CD_DVD");
            }
             
            String getNewsPapersState = "Select NewsPapers FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getNewsPapersState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.newsPapersState =  rs.getString("NewsPapers");
            }
            
            String getMagazinesState = "Select Magazines FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getMagazinesState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.magazinesState =  rs.getString("Magazines");
            }
             
            String getMembersState = "Select Members FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getMembersState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.membersState =  rs.getString("Members");
            }
             
            
            String getIssueBooksState = "Select IssueBooks FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getIssueBooksState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.issueBooksState =  rs.getString("IssueBooks");
            }
            
            String getReturnBooksState = "Select ReturnBooks FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getReturnBooksState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.returnBooksState =  rs.getString("ReturnBooks");
            }
            
            String getStaffState = "Select Staff FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getStaffState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.staffState =  rs.getString("Staff");
            }
             
            String getCategoriesState = "Select Categories FROM accounttype WHERE Type = '"+StaffLogin.accoutType+"'";
            pst = con.prepareStatement(getCategoriesState);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.CategoriesState =  rs.getString("Categories");
            }
            
              
            setArray();
            
            // Main openLMS = new Main();
            
            //openLMS.setSize(1366, 766);
            //Main.pnlAppLoader.setSize(1366, 766);
            
           // this.dispose();
            
           // openLMS.setVisible(true);
            
            
        } 
        catch (Exception e) 
        {
            
        }
        
        
         
        System.out.println(this.bookState);
        System.out.println(this.CD_DVDState);
        System.out.println(this.newsPapersState);
        System.out.println(this.magazinesState);
        System.out.println(this.membersState);
        System.out.println(this.issueBooksState);
        System.out.println(this.returnBooksState);
        System.out.println(this.staffState);
        System.out.println(this.CategoriesState);
        
        System.out.println(this.userId);
       
        
    }
    
    
    private void setArray()
    {
        /*
        this.permitions[0] = this.bookState.equals("Allow");
        this.permitions[1] = this.CD_DVDState.equals("Allow");
        this.permitions[2] = this.newsPapersState.equals("Allow");
        this.permitions[3] = this.magazinesState.equals("Allow");
        this.permitions[4] = this.membersState.equals("Allow");
        this.permitions[5] = this.issueBooksState.equals("Allow");
        this.permitions[6] = this.returnBooksState.equals("Allow");
        this.permitions[7] = this.staffState.equals("Allow");
        this.permitions[8] = this.CategoriesState.equals("Allow");
         */
        
        this.Books = this.bookState.equals("Allow");
        this.CD_DVDs = this.CD_DVDState.equals("Allow");
        this.Newspapers = this.newsPapersState.equals("Allow");
        this.Magazines = this.magazinesState.equals("Allow");
        this.Members = this.membersState.equals("Allow");
        this.IssueBooks = this.issueBooksState.equals("Allow");
        this.ReturnBooks = this.returnBooksState.equals("Allow");
        this.Staff = this.staffState.equals("Allow");
        this.AddCategories = this.CategoriesState.equals("Allow");
      
        getuserID();
        Main openLMS = new Main(this.Books,this.CD_DVDs,this.Newspapers,this.Magazines,this.Members,this.IssueBooks,this.ReturnBooks,this.Staff,this.AddCategories,this.AddAccountType,false, this.userId);
        
        openLMS.setVisible(true);
        
        
        //this.dispose();

       

   
        
        /*
        this.Books = this.bookState.equals("Allow");
        
        this.CD_DVDs = this.CD_DVDState.equals("Allow");
        
        if(this.newsPapersState.equals("Allow"))
        {
            btnNewspapers.setVisible(true);
        }
        else
        {
            btnNewspapers.setVisible(false);
        }
        
        if(this.magazinesState.equals("Allow"))
        {
            btnMagazines.setVisible(true);
        }
        else
        {
            btnMagazines.setVisible(false);
        }
        
        if(this.membersState.equals("Allow"))
        {
            btnMembers.setVisible(true);
        }
        else
        {
            btnMembers.setVisible(false);
        }
        
        if(this.issueBooksState.equals("Allow"))
        {
            btnIssueBooks.setVisible(true);
        }
        else
        {
            btnIssueBooks.setVisible(false);
        }
        
        if(this.returnBooksState.equals("Allow"))
        {
            btnReturnBooks.setVisible(true);
        }
        else
        {
            btnReturnBooks.setVisible(false);
        }
        
        if(this.staffState.equals("Allow"))
        {
            btnStaff.setVisible(true);
        }
        else
        {
            btnStaff.setVisible(false);
        }
        
        if(this.CategoriesState.equals("Allow"))
        {
            btnAddCategories.setVisible(true);
        }
        else
        {
            btnAddCategories.setVisible(false);
        }
        
        if(this.accoutType.equals("Allow"))
        {
            btnAddAccountTypes.setVisible(true);
        }
        else
        {
            btnAddAccountTypes.setVisible(false);
        }
        */
        
        
    }
    
    public void getuserID()
    {
        try 
        {
            String sqlGetUserId = "Select UserName FROM login WHERE UserName = '"+StaffLogin.username+"' AND Password = '"+StaffLogin.password+"'";
            pst = con.prepareStatement(sqlGetUserId);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                this.userId =  rs.getString("UserName");
            }
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    public void getAddminInfo()
    {
        try 
        {
            String getAdmminUserName = "Select Admin_UserName FROM settings";
            pst = con.prepareStatement(getAdmminUserName);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                StaffLogin.adminUserName =  rs.getString("Admin_UserName");
            }
            
            String getAdmminPassword = "Select Admin_Password FROM settings";
            pst = con.prepareStatement(getAdmminPassword);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                StaffLogin.adminPassword =  rs.getString("Admin_Password");
            }
            System.out.println("Ad use "+StaffLogin.adminUserName);
        } 
        catch (Exception e) 
        {
            
        }
    }
    
}





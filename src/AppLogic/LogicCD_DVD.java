// Don't write ANY import codes. They will automatically get!!!
package AppLogic;

import Frames.CD_DVDs;
import static Frames.CD_DVDs.cmbCatorgies;
import static Frames.CD_DVDs.tblCDDVDs;
import Source.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class LogicCD_DVD 
{ 
    Connection con = null; 
    PreparedStatement pst = null;  
    ResultSet rs = null;
    
    
    
    String diskId;    
    String diskTitle; 
    int NoOfDisks;
    String Category;
    String authorName ;
    int quantity;
    
    public LogicCD_DVD()
    {
         con = DBConnection.connect();
    }
    
   
    public void Add(String diskTitle, String NoOfDisks, String Category, String authorName , String quantity)
    {
        this.diskTitle = diskTitle;
        this.NoOfDisks = Integer.parseInt(NoOfDisks);
        this.Category = Category;
        this.authorName = authorName;
        this.quantity = Integer.parseInt(quantity);
        
        String sql = "INSERT INTO cddvd(Title,NoofDisks,Category,Authorname,Quantity)" + " VALUES('"+this.diskTitle+"',"+this.NoOfDisks+",'"+this.Category+"','"+this.authorName+"',"+this.quantity+")";
        
        try 
        {
            pst = con.prepareStatement(sql);
            pst.execute();
            tableLoad();
            
        }
        catch (Exception e) 
        {

            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        
        }
    }
    

    public void tableLoad()
    {
        String sql = "SELECT DiskId,Title,NoofDisks as No_Of_Disks,Category,Authorname as Author_Name,Quantity FROM cddvd";
        try 
        {
              
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(); 
            tblCDDVDs.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
           
           
        }
    }
  
    public void LoadCategories()
    {
        try {
            
            String sql = "SELECT Category FROM category";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           
             
            CD_DVDs.cmbCatorgies.removeAllItems(); 
            while(rs.next())
            {
                String name =  rs.getString("Category");
                cmbCatorgies.addItem(name);
            }
            
            
            
        } catch (Exception e) 
        {
             
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateTable(String diskId,String diskTitle, String NoOfDisks, String Category, String authorName , String quantity)
    {
        this.diskId = diskId; 
        this.diskTitle = diskTitle;
        this.NoOfDisks = Integer.parseInt(NoOfDisks);
        this.Category = Category;
        this.authorName = authorName;
        this.quantity = Integer.parseInt(quantity);
        
        
        String sql = "UPDATE cddvd SET Title= '" + this.diskTitle + "', NoofDisks= '" + this.NoOfDisks + "',Category = '" + this.Category + "',	Authorname='" + this.authorName + "',Quantity='" + this.quantity + "' WHERE DiskId = '" + this.diskId + "'";

            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                tableLoad();

            } catch (Exception e) {
               
                JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
            }
            
       
    }
   
    public void delete(String diskId)
    {
        this.diskId = diskId; 
        String sql = "DELETE FROM cddvd WHERE DiskId ='"+this.diskId+"'";
        try 
        {
             pst = con.prepareStatement(sql);
             pst.execute();
             tableLoad();
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void find(String filter, String searchItem)
    {
        
      String sql ="";
     
        switch (filter) {
            case "Title":
                sql ="SELECT DiskId,Title,NoofDisks,Category,Authorname,Quantity from cddvd where Title LIKE '%"+searchItem+"%'";
                break;
            case "Disk Id":
                sql ="SELECT DiskId,Title,NoofDisks,Category,Authorname,Quantity from cddvd where DiskId LIKE '%"+searchItem+"%'";
                break;
            case "Category":
                sql ="SELECT DiskId,Title,NoofDisks,Category,Authorname,Quantity from cddvd where Category LIKE '%"+searchItem+"%'";
                break;
            case "Author Name":
                sql ="SELECT DiskId,Title,NoofDisks,Category,Authorname,Quantity from cddvd where Authorname LIKE '%"+searchItem+"%'";
                break;
            default:
                break;
        }
        
        try 
        {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
           
            tblCDDVDs.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
                    
    }

   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppLogic;

import Source.DBConnection;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.sf.jasperreports.engine.JasperPrint;
import java.sql.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.view.JasperDesignViewer;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.*;
import javax.swing.*;
import java.util.HashMap;
import net.sf.jasperreports.view.JRViewer;
import java.awt.Container;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
/**
 *
 * @author Sachin
 */
public class iReportView extends JFrame {
    
    public iReportView (String filename)
    {
        this(filename,null);
    }
    
    public iReportView(String filename, HashMap para)
    {
     super("Library Management System");
        
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
     con = DBConnection.connect();
     
     try
     {    
         JasperPrint print = JasperFillManager.fillReport(filename, para,con);
         JRViewer viewer = new JRViewer(print);
         Container c = getContentPane();
         c.add(viewer);
         
     }
     catch(JRException jRException)
     {
         JOptionPane.showMessageDialog(null, jRException);
     }
     
        setBounds(10,10,900,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
}

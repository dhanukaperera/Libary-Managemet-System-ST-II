/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import AppLogic.LogicMagazines;
import AppLogic.iReportView;
import Source.Validation;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhanuka Perera
 */
public class Magazines extends javax.swing.JPanel {

    /**
     * Creates new form Magazines
     */
    
    LogicMagazines newmagazines=new LogicMagazines();  
    public Magazines() {
        initComponents();
        newmagazines.LoadCategories();
        newmagazines.tableLoad();
        
           if(txtFind.getText()==null)
            newmagazines.tableLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appBackground = new javax.swing.JPanel();
        btnAdd = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnReport = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        lblFindIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbList = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSubscriptionType = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoOfCopies = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        cmbDay = new javax.swing.JComboBox();
        cmbMonth = new javax.swing.JComboBox();
        cmbYear = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMagazines = new javax.swing.JTable();

        appBackground.setBackground(new java.awt.Color(51, 51, 51));
        appBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                appBackgroundMouseMoved(evt);
            }
        });
        appBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appBackgroundMouseClicked(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/add.png"))); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddMouseReleased(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit.png"))); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateMouseReleased(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteMouseReleased(evt);
            }
        });

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/reports.png"))); // NOI18N
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMouseExited(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/clear2.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        txtFind.setFont(new java.awt.Font("Myriad Web Pro", 2, 14)); // NOI18N
        txtFind.setForeground(new java.awt.Color(255, 255, 255));
        txtFind.setText("Find...");
        txtFind.setBorder(null);
        txtFind.setOpaque(false);
        txtFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFindMouseClicked(evt);
            }
        });
        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindKeyReleased(evt);
            }
        });

        lblFindIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/touch.png"))); // NOI18N

        cmbList.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        cmbList.setForeground(new java.awt.Color(51, 51, 51));
        cmbList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Magazine ID", "Name", "No of Copies", "Subscription Type", "Issue Date", "Category" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbList, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFindIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFindIcon))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(cmbList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subscription type");

        jLabel5.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Issue date");

        txtName.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtSubscriptionType.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        txtSubscriptionType.setForeground(new java.awt.Color(51, 51, 51));
        txtSubscriptionType.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtSubscriptionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubscriptionTypeActionPerformed(evt);
            }
        });
        txtSubscriptionType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSubscriptionTypeKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No of Copies");

        jLabel6.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");

        txtNoOfCopies.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        txtNoOfCopies.setForeground(new java.awt.Color(51, 51, 51));
        txtNoOfCopies.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtNoOfCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfCopiesActionPerformed(evt);
            }
        });
        txtNoOfCopies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoOfCopiesKeyReleased(evt);
            }
        });

        cmbCategory.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        cmbCategory.setForeground(new java.awt.Color(51, 51, 51));
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoOfCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoOfCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbDay.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        cmbDay.setForeground(new java.awt.Color(51, 51, 51));
        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DAY", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMonth.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        cmbMonth.setForeground(new java.awt.Color(51, 51, 51));
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MONTH", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cmbYear.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        cmbYear.setForeground(new java.awt.Color(51, 51, 51));
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YEAR", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSubscriptionType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSubscriptionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblMagazines.setBackground(new java.awt.Color(51, 51, 51));
        tblMagazines.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        tblMagazines.setForeground(new java.awt.Color(255, 255, 255));
        tblMagazines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMagazines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMagazinesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMagazines);

        javax.swing.GroupLayout appBackgroundLayout = new javax.swing.GroupLayout(appBackground);
        appBackground.setLayout(appBackgroundLayout);
        appBackgroundLayout.setHorizontalGroup(
            appBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, appBackgroundLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        appBackgroundLayout.setVerticalGroup(
            appBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnReport)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     private void clear()
    {
        txtName.setText("");
        txtSubscriptionType.setText("");
       
        txtNoOfCopies.setText("");
        txtFind.setText("Find...");
        
    }
    
    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        try {
                 ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/add_hover.png"));
        btnAdd.setIcon(changeIcon);
        } catch (Exception e) {
            //Err
        }
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
          try {
                 ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/add.png"));
        btnAdd.setIcon(changeIcon);
        } catch (Exception e) {
            //Err
        }
    }//GEN-LAST:event_btnAddMouseExited

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyPressed
           try {
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/touch_hover.png"));
        lblFindIcon.setIcon(changeIcon);
        } catch (Exception e) {
            //Err
        }
    }//GEN-LAST:event_txtFindKeyPressed

    private void appBackgroundMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appBackgroundMouseMoved
            try {
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/touch.png"));
        lblFindIcon.setIcon(changeIcon);
        } catch (Exception e) {
            //Err
        }
    }//GEN-LAST:event_appBackgroundMouseMoved

    private void txtFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFindMouseClicked
        txtFind.setText("");
    }//GEN-LAST:event_txtFindMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
     
        if((Validation.isEmpty(txtName.getText()) == false)&&(Validation.isEmpty(txtNoOfCopies.getText()) == false)&&(Validation.isEmpty(txtSubscriptionType.getText()) == false))
        {
            
                newmagazines.Add(txtName.getText(),txtNoOfCopies.getText(),txtSubscriptionType.getText(), cmbDay.getSelectedItem().toString(),cmbMonth.getSelectedItem().toString(),cmbYear.getSelectedItem().toString(), cmbCategory.getSelectedItem().toString());
                newmagazines.tableLoad();
          
        }
      
        else
        {
            JOptionPane.showMessageDialog(null,"Please Fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
        clear();

    }//GEN-LAST:event_btnAddMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSubscriptionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubscriptionTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubscriptionTypeActionPerformed

    private void txtNoOfCopiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfCopiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfCopiesActionPerformed

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        // TODO add your handling code here:
            try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/edit_hover.png"));
           btnUpdate.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
         try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/edit.png"));
            btnUpdate.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
         try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/delete_hover.png"));
            btnDelete.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
          try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/delete.png"));
            btnDelete.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
         try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/clear2_hover.png"));
            btnClear.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
        try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/clear2.png"));
            btnClear.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnClearMouseExited

    private void btnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseEntered
        // TODO add your handling code here:
         try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/reports_hover.png"));
            btnReport.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnReportMouseEntered

    private void btnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseExited
        // TODO add your handling code here:
           try 
        {
            ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/reports.png"));
            btnReport.setIcon(changeIcon);
            
        } catch (Exception e) {
            // Err
        }
    }//GEN-LAST:event_btnReportMouseExited

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearMouseClicked

    private void appBackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appBackgroundMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_appBackgroundMouseClicked

    private void tblMagazinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMagazinesMouseClicked
        // TODO add your handling code here:
             int getSelectedRow = tblMagazines.getSelectedRow();
         
       // String MagazineId = tblMagazines.getValueAt(getSelectedRow, 0).toString();
        String 	Name= tblMagazines.getValueAt(getSelectedRow, 1).toString();
        String NumofCopies=tblMagazines.getValueAt(getSelectedRow, 2).toString();
        String 	SubscriptionType= tblMagazines.getValueAt(getSelectedRow, 3).toString();
        String IssueDate= tblMagazines.getValueAt(getSelectedRow, 4).toString();
        String Category= tblMagazines.getValueAt(getSelectedRow, 5).toString();
       
        txtName.setText(Name);
        txtNoOfCopies.setText(NumofCopies);
       txtSubscriptionType.setText(SubscriptionType);
        
       cmbCategory.setSelectedItem(Category);
       
        String day = IssueDate.substring(0,2);
       cmbDay.setSelectedItem(day);
       
       String month = IssueDate.substring(3,5);
       cmbMonth.setSelectedItem(month);
       
       String year = IssueDate.substring(6,10);
       cmbYear.setSelectedItem(year);
    }//GEN-LAST:event_tblMagazinesMouseClicked

    private void txtFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyReleased
        // TODO add your handling code here:
        // LogicMagazines newmagazines=new LogicMagazines();
                  newmagazines.find(cmbList.getSelectedItem().toString(), txtFind.getText());

    }//GEN-LAST:event_txtFindKeyReleased

    private void btnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseReleased
        // TODO add your handling code here:
         //LogicMagazines newmagazines=new LogicMagazines();
       
    }//GEN-LAST:event_btnAddMouseReleased

    private void btnUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseReleased
        // TODO add your handling code here:
          
        int msg =  JOptionPane.showConfirmDialog(null,"Do you really want to UPDATE this record?");
        
        if(msg==0)
        {
            int getRowId =  tblMagazines.getSelectedRow();
         
            String MagazineId =  tblMagazines.getValueAt(getRowId, 0).toString();
           if((Validation.isEmpty(txtName.getText()) == false)&&(Validation.isEmpty(txtNoOfCopies.getText()) == false)&&(Validation.isEmpty(txtSubscriptionType.getText()) == false)){
            newmagazines.updateTable(MagazineId,txtName.getText(),txtNoOfCopies.getText(),txtSubscriptionType.getText(), cmbDay.getSelectedItem().toString(),cmbMonth.getSelectedItem().toString(),cmbYear.getSelectedItem().toString(), cmbCategory.getSelectedItem().toString());
           }
           else{
           
            JOptionPane.showMessageDialog(null,"Please Fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
            
           }
           }
       clear();
    }//GEN-LAST:event_btnUpdateMouseReleased

    private void btnDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseReleased
        // TODO add your handling code here:
          int msg = JOptionPane.showConfirmDialog(null, "Do you really want to DELETE this record?");
          //LogicMagazines newmagazines=new LogicMagazines();
        if (msg == 0) 
        {
            int getRowId = tblMagazines.getSelectedRow();

            String MagazineId = tblMagazines.getValueAt(getRowId, 0).toString();

            newmagazines.delete(MagazineId);
            clear();
        }
    }//GEN-LAST:event_btnDeleteMouseReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if(Validation.validatetext(txtName.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please Enter a valid name","Error",JOptionPane.ERROR_MESSAGE);
            txtName.setText("");
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNoOfCopiesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfCopiesKeyReleased
        // TODO add your handling code here:
        if(Validation.validatenumbers(txtNoOfCopies.getText()))
        {
           JOptionPane.showMessageDialog(null,"Please Enter a valid number","Error",JOptionPane.ERROR_MESSAGE);
           txtNoOfCopies.setText("");
        }
    }//GEN-LAST:event_txtNoOfCopiesKeyReleased

    private void txtSubscriptionTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubscriptionTypeKeyReleased
        // TODO add your handling code here:
         if(Validation.validatetext(txtSubscriptionType.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please Enter a valid Subscription Type","Error",JOptionPane.ERROR_MESSAGE);
            txtSubscriptionType.setText("");
        }
        
    }//GEN-LAST:event_txtSubscriptionTypeKeyReleased

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        iReportView r = new iReportView( Main.path+ "\\src\\Reports\\Magazine.jasper");
        r.setVisible(true);
    }//GEN-LAST:event_btnReportMouseClicked

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appBackground;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnReport;
    private javax.swing.JLabel btnUpdate;
    public static javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox<String> cmbList;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFindIcon;
    public static javax.swing.JTable tblMagazines;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoOfCopies;
    private javax.swing.JTextField txtSubscriptionType;
    // End of variables declaration//GEN-END:variables
}
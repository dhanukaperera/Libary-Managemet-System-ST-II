/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import AppLogic.LogicCD_DVD;
import AppLogic.LogicHome;
import AppLogic.LogicMagazines;
import AppLogic.LogicNewspapers;
import AppLogic.LogicSfaff;
import AppLogic.logicAddAccountType;
import AppLogic.logicBooks;
import javax.swing.ImageIcon;

/**
 *
 * @author Dhanuka Perera
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int xMousePos;
    int yMousePos;
   
    Home homeFrame;
    Books booksFrame;
    CD_DVDs cd_dvdsFrame;
    Newspapers newspapersFrame;
    Magazines magazinesFrame;
    Members membersFrame;
    IssueBooks issueBooksFrame;
    ReturnBooks returnBooks;
    Staff staffFrame;
    AddCategories addCategoriesFrame;
    AddAccountType addAccountType;
    ManagePermissions managePermissionsFrame;
    
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
    
    public static String userID;
    
    final public static String path="C:\\Users\\Dhanuka Perera\\Desktop\\ST-II-Project-Final\\Library Management  System - ST-II -Final";
    
    
    public Main(boolean pBooks,boolean pCD_DVDs,boolean pNewspapers,boolean pMagazines,boolean pMembers ,boolean pIssueBooks,boolean pReturnBooks,boolean pStaff,boolean pAddCategories,boolean pAddAccountType,boolean pManagePermissions,String puserId)
    { 
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/LMS_100x100.png")).getImage());
        
        
        this.Books =pBooks ;
        this.CD_DVDs=pCD_DVDs;
        this.Newspapers=pNewspapers;
        this.Magazines=pMagazines;
        this.Members=pMembers;
        this.IssueBooks = pIssueBooks;
        this.ReturnBooks = pReturnBooks;
        this.Staff = pStaff;
        this.AddCategories = pAddCategories;
        this.AddAccountType = pAddAccountType;
        this.ManagePermissions =pManagePermissions;
       
        Main.userID = puserId;
        System.out.println("User : " + Main.userID);
        
        homeFrame = new Home(puserId);
        homeFrame.setLocation(0,0);
        homeFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(homeFrame);
        homeFrame.setVisible(true);
        
        booksFrame = new Books();
        booksFrame.setLocation(0,0);
        booksFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(booksFrame);        
        booksFrame.setVisible(false);
        
        cd_dvdsFrame = new CD_DVDs();
        cd_dvdsFrame.setLocation(0,0);
        cd_dvdsFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(cd_dvdsFrame);        
        cd_dvdsFrame.setVisible(false);
        
        newspapersFrame = new Newspapers();
        newspapersFrame.setLocation(0,0);
        newspapersFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(newspapersFrame);        
        newspapersFrame.setVisible(false);
        
        magazinesFrame = new Magazines();
        magazinesFrame.setLocation(0,0);
        magazinesFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(magazinesFrame);        
        magazinesFrame.setVisible(false);
        
        membersFrame = new Members();
        membersFrame.setLocation(0,0);
        membersFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(membersFrame);        
        membersFrame.setVisible(false);
        
        issueBooksFrame = new IssueBooks();
        issueBooksFrame.setLocation(0,0);
        issueBooksFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(issueBooksFrame);        
        issueBooksFrame.setVisible(false);
        
        returnBooks = new ReturnBooks();
        returnBooks.setLocation(0,0);
        returnBooks.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(returnBooks);        
        returnBooks.setVisible(false);
        
        staffFrame = new Staff();
        staffFrame.setLocation(0,0);
        staffFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(staffFrame);        
        staffFrame.setVisible(false);
        
        addCategoriesFrame = new AddCategories();
        addCategoriesFrame.setLocation(0,0);
        addCategoriesFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(addCategoriesFrame);        
        addCategoriesFrame.setVisible(false);
        
        addAccountType = new AddAccountType();
        addAccountType.setLocation(0,0);
        addAccountType.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(addAccountType);        
        addAccountType.setVisible(false);
        
        managePermissionsFrame = new ManagePermissions();
        managePermissionsFrame.setLocation(0,0);
        managePermissionsFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(managePermissionsFrame);        
        managePermissionsFrame.setVisible(false);
        
        
        
        
        btnBooks.setVisible(false);
        btnCD_DVDS.setVisible(false);
        btnNewspapers.setVisible(false);
        btnMagazines.setVisible(false);
        btnMembers.setVisible(false);
        btnIssueBooks.setVisible(false);
        btnReturnBooks.setVisible(false);
        btnStaff.setVisible(false);
        btnAddCategories.setVisible(false);
        btnAddAccountTypes.setVisible(false);
        btnMagazines.setVisible(false);
        
        
        
     
     
     
        if(this.Books == true)
        {
            btnBooks.setVisible(true);
        }
        else
        {
            btnBooks.setVisible(false);
        }
        
        if(this.CD_DVDs == true)
        {
            btnCD_DVDS.setVisible(true);
        }
        else
        {
            btnCD_DVDS.setVisible(false);
        }
        
        if(this.Newspapers == true)
        {
            btnNewspapers.setVisible(true);
        }
        else
        {
            btnNewspapers.setVisible(false);
        }
        
        if(this.Magazines == true)
        {
            btnMagazines.setVisible(true);
        }
        else
        {
            btnMagazines.setVisible(false);
        }
     
        if(this.Members == true)
        {
            btnMembers.setVisible(true);
        }
        else
        {
            btnMembers.setVisible(false);
        }
        
        if(this.IssueBooks == true)
        {
            btnIssueBooks.setVisible(true);
        }
        else
        {
            btnIssueBooks.setVisible(false);
        }
        
        if(this.ReturnBooks == true)
        {
            btnReturnBooks.setVisible(true);
        }
        else
        {
            btnReturnBooks.setVisible(false);
        }
        
        if(this.Staff == true)
        {
            btnStaff.setVisible(true);
        }
        else
        {
            btnStaff.setVisible(false);
        }
        
        if(this.AddCategories == true)
        {
            btnAddCategories.setVisible(true);
        }
        else
        {
            btnAddCategories.setVisible(false);
        }
        
        if(this.AddAccountType == true)
        {
            btnAddAccountTypes.setVisible(true);
        }
        else
        {
            btnAddAccountTypes.setVisible(false);
        }
        
        if(this.ManagePermissions == true)
        {
            btnManagePermissions.setVisible(true);
        }
        else
        {
            btnManagePermissions.setVisible(false);
        }
    }
    
    
    
    public Main() {
        initComponents();
        
        this.setIconImage(new ImageIcon(getClass().getResource("/Resources/LMS_100x100.png")).getImage());
        
        homeFrame = new Home();
        homeFrame.setLocation(0,0);
        homeFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(homeFrame);
        homeFrame.setVisible(true);
        
        booksFrame = new Books();
        booksFrame.setLocation(0,0);
        booksFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(booksFrame);        
        booksFrame.setVisible(false);
        
        cd_dvdsFrame = new CD_DVDs();
        cd_dvdsFrame.setLocation(0,0);
        cd_dvdsFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(cd_dvdsFrame);        
        cd_dvdsFrame.setVisible(false);
        
        newspapersFrame = new Newspapers();
        newspapersFrame.setLocation(0,0);
        newspapersFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(newspapersFrame);        
        newspapersFrame.setVisible(false);
        
        magazinesFrame = new Magazines();
        magazinesFrame.setLocation(0,0);
        magazinesFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(magazinesFrame);        
        magazinesFrame.setVisible(false);
        
        membersFrame = new Members();
        membersFrame.setLocation(0,0);
        membersFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(membersFrame);        
        membersFrame.setVisible(false);
        
        issueBooksFrame = new IssueBooks();
        issueBooksFrame.setLocation(0,0);
        issueBooksFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(issueBooksFrame);        
        issueBooksFrame.setVisible(false);
        
        returnBooks = new ReturnBooks();
        returnBooks.setLocation(0,0);
        returnBooks.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(returnBooks);        
        returnBooks.setVisible(false);
        
        staffFrame = new Staff();
        staffFrame.setLocation(0,0);
        staffFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(staffFrame);        
        staffFrame.setVisible(false);
        
        addCategoriesFrame = new AddCategories();
        addCategoriesFrame.setLocation(0,0);
        addCategoriesFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(addCategoriesFrame);        
        addCategoriesFrame.setVisible(false);
        
        addAccountType = new AddAccountType();
        addAccountType.setLocation(0,0);
        addAccountType.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(addAccountType);        
        addAccountType.setVisible(false);
        
        managePermissionsFrame = new ManagePermissions();
        managePermissionsFrame.setLocation(0,0);
        managePermissionsFrame.setSize(pnlAppLoader.getWidth(), pnlAppLoader.getHeight());
        pnlAppLoader.add(managePermissionsFrame);        
        managePermissionsFrame.setVisible(false);
    }

   

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlTitleBar = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        btnBooks = new javax.swing.JLabel();
        btnNewspapers = new javax.swing.JLabel();
        btnCD_DVDS = new javax.swing.JLabel();
        btnReturnBooks = new javax.swing.JLabel();
        btnIssueBooks = new javax.swing.JLabel();
        btnMembers = new javax.swing.JLabel();
        btnMagazines = new javax.swing.JLabel();
        btnManagePermissions = new javax.swing.JLabel();
        btnAddAccountTypes = new javax.swing.JLabel();
        btnAddCategories = new javax.swing.JLabel();
        btnStaff = new javax.swing.JLabel();
        pnlAppLoader = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(51, 51, 51));

        pnlTitleBar.setBackground(new java.awt.Color(0, 0, 0));
        pnlTitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTitleBarMouseDragged(evt);
            }
        });
        pnlTitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTitleBarMousePressed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/close.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Myriad Web Pro", 0, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LMS.png"))); // NOI18N
        lblTitle.setText("Library Management System : Home");

        btnLogout.setFont(new java.awt.Font("Myriad Web Pro", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTitleBarLayout = new javax.swing.GroupLayout(pnlTitleBar);
        pnlTitleBar.setLayout(pnlTitleBarLayout);
        pnlTitleBarLayout.setHorizontalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(18, 18, 18)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(6, 6, 6))
        );
        pnlTitleBarLayout.setVerticalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose)
            .addComponent(btnMinimize)
            .addComponent(btnLogout)
            .addComponent(lblTitle)
        );

        pnlMenu.setBackground(new java.awt.Color(44, 62, 80));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Home.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        btnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Books.png"))); // NOI18N
        btnBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBooksMouseExited(evt);
            }
        });

        btnNewspapers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Newspapers.png"))); // NOI18N
        btnNewspapers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewspapersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewspapersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewspapersMouseExited(evt);
            }
        });

        btnCD_DVDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/CD-DVD.png"))); // NOI18N
        btnCD_DVDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCD_DVDSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCD_DVDSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCD_DVDSMouseExited(evt);
            }
        });

        btnReturnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/IssueBooks.png"))); // NOI18N
        btnReturnBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReturnBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReturnBooksMouseExited(evt);
            }
        });

        btnIssueBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ReturnBooks.png"))); // NOI18N
        btnIssueBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIssueBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIssueBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIssueBooksMouseExited(evt);
            }
        });

        btnMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AddMember.png"))); // NOI18N
        btnMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMembersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMembersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMembersMouseExited(evt);
            }
        });

        btnMagazines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Magazines.png"))); // NOI18N
        btnMagazines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMagazinesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMagazinesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMagazinesMouseExited(evt);
            }
        });

        btnManagePermissions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ManagePermissions.png"))); // NOI18N
        btnManagePermissions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManagePermissionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManagePermissionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManagePermissionsMouseExited(evt);
            }
        });

        btnAddAccountTypes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AddAccountType   .png"))); // NOI18N
        btnAddAccountTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAccountTypesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddAccountTypesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddAccountTypesMouseExited(evt);
            }
        });

        btnAddCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AddCategories.png"))); // NOI18N
        btnAddCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCategoriesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddCategoriesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddCategoriesMouseExited(evt);
            }
        });

        btnStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AddStaff.png"))); // NOI18N
        btnStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStaffMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCD_DVDS)
                            .addComponent(btnNewspapers)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome)
                            .addComponent(btnBooks)
                            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMagazines)
                                .addComponent(btnMembers)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIssueBooks)
                                    .addComponent(btnReturnBooks)))
                            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnStaff)
                                .addComponent(btnAddCategories)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddAccountTypes)
                                    .addComponent(btnManagePermissions))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCD_DVDS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewspapers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMagazines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMembers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIssueBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturnBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCategories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddAccountTypes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManagePermissions)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAppLoader.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlAppLoaderLayout = new javax.swing.GroupLayout(pnlAppLoader);
        pnlAppLoader.setLayout(pnlAppLoaderLayout);
        pnlAppLoaderLayout.setHorizontalGroup(
            pnlAppLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAppLoaderLayout.setVerticalGroup(
            pnlAppLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAppLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAppLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
           System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        
        LogicHome loadData = new LogicHome();
        loadData.LoadNotice();
        
        homeFrame.setVisible(true);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        //Changing title
        lblTitle.setText("Library Management System : Home");
        
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBooksMouseClicked

        logicBooks loadData = new logicBooks();
        loadData.LoadCategories();
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(true);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Books");
        
        
        
      

    }//GEN-LAST:event_btnBooksMouseClicked

    private void btnNewspapersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewspapersMouseClicked
        
       
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(true);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Newspapers");

    }//GEN-LAST:event_btnNewspapersMouseClicked

    private void btnCD_DVDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCD_DVDSMouseClicked
        
        LogicCD_DVD loadData = new LogicCD_DVD();
        loadData.LoadCategories();
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(true);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : CD/DVD");
     
    }//GEN-LAST:event_btnCD_DVDSMouseClicked

    private void btnReturnBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBooksMouseClicked
        
        LogicNewspapers loadData = new LogicNewspapers();
        loadData.LoadCategories();
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(true);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Return Books");

    }//GEN-LAST:event_btnReturnBooksMouseClicked

    private void btnIssueBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueBooksMouseClicked
        
        
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(true);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Issue Books");
    }//GEN-LAST:event_btnIssueBooksMouseClicked

    private void btnMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMouseClicked

        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(true);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Memebers");

    }//GEN-LAST:event_btnMembersMouseClicked

    private void btnMagazinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMagazinesMouseClicked
        
        LogicMagazines loadData = new LogicMagazines();
        loadData.LoadCategories();
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(true);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Magazines");

    }//GEN-LAST:event_btnMagazinesMouseClicked

    private void btnManagePermissionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManagePermissionsMouseClicked

        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(true);
        
        lblTitle.setText("Library Management System : Settings");
      
    }//GEN-LAST:event_btnManagePermissionsMouseClicked

    private void btnAddAccountTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAccountTypesMouseClicked

        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(true);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Account Types");

    }//GEN-LAST:event_btnAddAccountTypesMouseClicked

    private void btnAddCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoriesMouseClicked
        
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(false);
        addCategoriesFrame.setVisible(true);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Categories");

    }//GEN-LAST:event_btnAddCategoriesMouseClicked

    private void btnStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffMouseClicked
        
        LogicSfaff loadData = new LogicSfaff();
        loadData.LoadCategories();
        
        homeFrame.setVisible(false);
        booksFrame.setVisible(false);
        cd_dvdsFrame.setVisible(false);
        newspapersFrame.setVisible(false);
        magazinesFrame.setVisible(false);
        membersFrame.setVisible(false);
        issueBooksFrame.setVisible(false);
        returnBooks.setVisible(false);
        staffFrame.setVisible(true);
        addCategoriesFrame.setVisible(false);
        addAccountType.setVisible(false);
        managePermissionsFrame.setVisible(false);
        
        lblTitle.setText("Library Management System : Staff");

    }//GEN-LAST:event_btnStaffMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/close_hover.png"));
        btnClose.setIcon(changeIcon);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
         this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/minimize_hover.png"));
        btnMinimize.setIcon(changeIcon);
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/minimize.png"));
        btnMinimize.setIcon(changeIcon);
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void pnlTitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTitleBarMousePressed
        xMousePos = evt.getX();
        yMousePos = evt.getY();
    }//GEN-LAST:event_pnlTitleBarMousePressed

    private void pnlTitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTitleBarMouseDragged
        int ScreenX =  evt.getXOnScreen();
        int ScreeY = evt.getYOnScreen();
        
        this.setLocation(ScreenX - xMousePos, ScreeY - yMousePos);
    }//GEN-LAST:event_pnlTitleBarMouseDragged

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/close.png"));
        btnClose.setIcon(changeIcon);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Home_hover.png"));
              btnHome.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Home.png"));
              btnHome.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBooksMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Books_Hover.png"));
              btnBooks.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnBooksMouseEntered

    private void btnBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBooksMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Books.png"));
              btnBooks.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnBooksMouseExited

    private void btnCD_DVDSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCD_DVDSMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/CD-DVD_Hover.png"));
              btnCD_DVDS.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnCD_DVDSMouseEntered

    private void btnCD_DVDSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCD_DVDSMouseExited
        try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/CD-DVD.png"));
              btnCD_DVDS.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnCD_DVDSMouseExited

    private void btnNewspapersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewspapersMouseEntered
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Newspapers_Hover.png"));
              btnNewspapers.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnNewspapersMouseEntered

    private void btnNewspapersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewspapersMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Newspapers.png"));
              btnNewspapers.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnNewspapersMouseExited

    private void btnMagazinesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMagazinesMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Magazines_Hover.png"));
              btnMagazines.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnMagazinesMouseEntered

    private void btnMagazinesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMagazinesMouseExited
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/Magazines.png"));
              btnMagazines.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnMagazinesMouseExited

    private void btnMembersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddMember_Hover.png"));
              btnMembers.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnMembersMouseEntered

    private void btnMembersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddMember.png"));
              btnMembers.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnMembersMouseExited

    private void btnIssueBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueBooksMouseEntered
           try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/ReturnBooks_Hover.png"));
              btnIssueBooks.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnIssueBooksMouseEntered

    private void btnIssueBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueBooksMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/ReturnBooks.png"));
              btnIssueBooks.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnIssueBooksMouseExited

    private void btnReturnBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBooksMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/IssueBooks_Hover.png"));
              btnReturnBooks.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnReturnBooksMouseEntered

    private void btnReturnBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnBooksMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/IssueBooks.png"));
              btnReturnBooks.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnReturnBooksMouseExited

    private void btnStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffMouseEntered
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddStaff_Hover.png"));
              btnStaff.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnStaffMouseEntered

    private void btnStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddStaff.png"));
              btnStaff.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnStaffMouseExited

    private void btnAddCategoriesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoriesMouseEntered
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddCategories_Hover.png"));
              btnAddCategories.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnAddCategoriesMouseEntered

    private void btnAddCategoriesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoriesMouseExited
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddCategories.png"));
              btnAddCategories.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnAddCategoriesMouseExited

    private void btnAddAccountTypesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAccountTypesMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddAccountType_Hover .png"));
              btnAddAccountTypes.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnAddAccountTypesMouseEntered

    private void btnAddAccountTypesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAccountTypesMouseExited
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/AddAccountType   .png"));
              btnAddAccountTypes.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnAddAccountTypesMouseExited

    private void btnManagePermissionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManagePermissionsMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/ManagePermissions_Hover.png"));
              btnManagePermissions.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnManagePermissionsMouseEntered

    private void btnManagePermissionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManagePermissionsMouseExited
          try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/ManagePermissions.png"));
              btnManagePermissions.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnManagePermissionsMouseExited

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        Login backToLogin = new Login();
        backToLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/logout_hover.png"));
              btnLogout.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
         try {
              ImageIcon changeIcon = new ImageIcon(getClass().getResource("/Resources/logout.png"));
              btnLogout.setIcon(changeIcon);
        } catch (Exception e) {
            //Error
        }
    }//GEN-LAST:event_btnLogoutMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel btnAddAccountTypes;
    public static javax.swing.JLabel btnAddCategories;
    public static javax.swing.JLabel btnBooks;
    public static javax.swing.JLabel btnCD_DVDS;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnHome;
    public static javax.swing.JLabel btnIssueBooks;
    private javax.swing.JLabel btnLogout;
    public static javax.swing.JLabel btnMagazines;
    private javax.swing.JLabel btnManagePermissions;
    public static javax.swing.JLabel btnMembers;
    private javax.swing.JLabel btnMinimize;
    public static javax.swing.JLabel btnNewspapers;
    public static javax.swing.JLabel btnReturnBooks;
    public static javax.swing.JLabel btnStaff;
    private javax.swing.JLabel lblTitle;
    public static javax.swing.JPanel pnlAppLoader;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTitleBar;
    // End of variables declaration//GEN-END:variables
}

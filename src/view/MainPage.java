/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EquipmentsDB;
import controller.SportsItemsDB;
import controller.WearablesDB;
import model.ProductList;
import database.DbConnection;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Void
 */
public class MainPage extends javax.swing.JFrame {

    //Boolean isVisible = true;
    static Object[] data = new Object[4];   
    static int total = 0;
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    
    public MainPage() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Adding last three entries from every categories in home
        
        ArrayList<ProductList> list = WearablesDB.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear sportsitemsTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/wearables/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = SportsItemsDB.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/sportsitems/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = EquipmentsDB.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/equipments/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        
    }
    
    public void doPanelHideShow()
    {
       
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        cardParentPanel = new javax.swing.JPanel();
        signUpPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        signUpNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        signUpEmailField = new javax.swing.JTextField();
        emptyField = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        signUpCardNumberField = new javax.swing.JTextField();
        signUpPasswordField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        LogUpButton = new javax.swing.JButton();
        signUpUsernameField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        usernameExists = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        wearablesPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        wearablesTable = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartItemTable = new javax.swing.JTable();
        billLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        itemsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sportsitemsTable = new javax.swing.JTable();
        equipPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        equipmentsTable = new javax.swing.JTable();
        signInPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        signInUsernameField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        signInPasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        showPassword1 = new javax.swing.JCheckBox();
        warningLabel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Optionsbar = new javax.swing.JPanel();
        wearablesButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        sports_itesmsButton = new javax.swing.JButton();
        equipments = new javax.swing.JButton();
        Contact = new javax.swing.JButton();
        About = new javax.swing.JButton();
        newlyAdded1 = new javax.swing.JButton();
        Topbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sports Casual");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1005));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(null);

        cardParentPanel.setLayout(new java.awt.CardLayout());

        signUpPanel.setPreferredSize(new java.awt.Dimension(1670, 840));
        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 77, 64));
        jLabel9.setText("Name");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator1.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 310, 2));

        signUpNameField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signUpNameField.setForeground(new java.awt.Color(0, 77, 64));
        signUpNameField.setBorder(null);
        signUpNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpNameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 310, 50));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 77, 64));
        jLabel10.setText("Email");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator2.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator2.setOpaque(true);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 310, 2));

        signUpEmailField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signUpEmailField.setForeground(new java.awt.Color(0, 77, 64));
        signUpEmailField.setBorder(null);
        signUpEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpEmailFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 310, 50));

        emptyField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        emptyField.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(emptyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator3.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator3.setOpaque(true);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 310, 2));

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 77, 64));
        jLabel12.setText("Password");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator4.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator4.setOpaque(true);
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 310, 2));

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 77, 64));
        jLabel13.setText("Already a member?");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 670, -1, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator5.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator5.setOpaque(true);
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 310, 2));

        signUpCardNumberField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signUpCardNumberField.setForeground(new java.awt.Color(0, 77, 64));
        signUpCardNumberField.setBorder(null);
        signUpCardNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpCardNumberFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpCardNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 310, 50));

        signUpPasswordField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signUpPasswordField.setForeground(new java.awt.Color(0, 77, 64));
        signUpPasswordField.setBorder(null);
        jPanel4.add(signUpPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 310, 50));

        jLabel14.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 77, 64));
        jLabel14.setText("Card No.(Optional)");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        signInButton.setBackground(new java.awt.Color(255, 255, 255));
        signInButton.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(0, 150, 136));
        signInButton.setText("Sign In.");
        signInButton.setToolTipText("Sign In with your existed credentials.");
        signInButton.setBorder(null);
        signInButton.setBorderPainted(false);
        signInButton.setContentAreaFilled(false);
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signInButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signInButtonMouseReleased(evt);
            }
        });
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        jPanel4.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, 90, 20));

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        showPassword.setForeground(new java.awt.Color(0, 77, 64));
        showPassword.setToolTipText("Show/Hide Password");
        showPassword.setBorderPaintedFlat(true);
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 20, 20));

        LogUpButton.setBackground(new java.awt.Color(0, 153, 204));
        LogUpButton.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        LogUpButton.setForeground(new java.awt.Color(255, 255, 255));
        LogUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Checked_24px.png"))); // NOI18N
        LogUpButton.setText("Sign Up");
        LogUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogUpButtonActionPerformed(evt);
            }
        });
        jPanel4.add(LogUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 140, 50));

        signUpUsernameField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signUpUsernameField.setForeground(new java.awt.Color(0, 77, 64));
        signUpUsernameField.setBorder(null);
        signUpUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpUsernameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 310, 50));

        jLabel24.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 77, 64));
        jLabel24.setText("Username");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        usernameExists.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        usernameExists.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(usernameExists, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 160, 30));

        signUpPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 1140, 850));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sign Up!");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 149, -1, 168));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_accounts_main.png"))); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 168));

        signUpPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 850));

        cardParentPanel.add(signUpPanel, "card6");

        homePanel.setPreferredSize(new java.awt.Dimension(1670, 840));

        homeTable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        homeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        homeTable.getTableHeader().setReorderingAllowed(false);
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(homeTable);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        cardParentPanel.add(homePanel, "card5");

        searchTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        searchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        cardParentPanel.add(searchPanel, "card9");

        wearablesPanel.setPreferredSize(new java.awt.Dimension(1670, 840));

        wearablesTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        wearablesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        wearablesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wearablesTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        wearablesTable.getTableHeader().setReorderingAllowed(false);
        wearablesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wearablesTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(wearablesTable);

        javax.swing.GroupLayout wearablesPanelLayout = new javax.swing.GroupLayout(wearablesPanel);
        wearablesPanel.setLayout(wearablesPanelLayout);
        wearablesPanelLayout.setHorizontalGroup(
            wearablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        wearablesPanelLayout.setVerticalGroup(
            wearablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        cardParentPanel.add(wearablesPanel, "card4");

        cartPanel.setPreferredSize(new java.awt.Dimension(1670, 840));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        cartItemTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cartItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model", "Price", "Quantity"
            }
        ));
        cartItemTable.setEnabled(false);
        cartItemTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(cartItemTable);

        billLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        billLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Rs.");

        buyButton.setBackground(new java.awt.Color(0, 153, 204));
        buyButton.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Buy_24px.png"))); // NOI18N
        buyButton.setText("Buy");
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Total Bill:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1065, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cartPanelLayout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 60, Short.MAX_VALUE)))
        );

        cardParentPanel.add(cartPanel, "card8");

        itemsPanel.setPreferredSize(new java.awt.Dimension(1670, 840));

        sportsitemsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        sportsitemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        sportsitemsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sportsitemsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        sportsitemsTable.getTableHeader().setReorderingAllowed(false);
        sportsitemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sportsitemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sportsitemsTable);

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        cardParentPanel.add(itemsPanel, "card3");

        equipPanel.setPreferredSize(new java.awt.Dimension(1670, 840));

        equipmentsTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        equipmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Price", "Stock", "Features", "Photo"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        equipmentsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipmentsTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        equipmentsTable.getTableHeader().setReorderingAllowed(false);
        equipmentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equipmentsTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(equipmentsTable);

        javax.swing.GroupLayout equipPanelLayout = new javax.swing.GroupLayout(equipPanel);
        equipPanel.setLayout(equipPanelLayout);
        equipPanelLayout.setHorizontalGroup(
            equipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        equipPanelLayout.setVerticalGroup(
            equipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        cardParentPanel.add(equipPanel, "card2");

        signInPanel.setPreferredSize(new java.awt.Dimension(1670, 840));
        signInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        signInPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 850));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel6FocusGained(evt);
            }
        });
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 77, 64));
        jLabel19.setText("Username");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator8.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator8.setOpaque(true);
        jPanel6.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 310, 2));

        signInUsernameField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signInUsernameField.setForeground(new java.awt.Color(0, 77, 64));
        signInUsernameField.setBorder(null);
        signInUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInUsernameFieldActionPerformed(evt);
            }
        });
        jPanel6.add(signInUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 310, 50));

        jLabel20.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 77, 64));
        jLabel20.setText("Password");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 77, 64));
        jSeparator9.setForeground(new java.awt.Color(0, 77, 64));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator9.setOpaque(true);
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 310, 2));

        jLabel21.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 77, 64));
        jLabel21.setText("Haven't signed up?");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, -1, 30));

        signInPasswordField.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        signInPasswordField.setForeground(new java.awt.Color(0, 77, 64));
        signInPasswordField.setBorder(null);
        jPanel6.add(signInPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 310, 50));

        LogInButton.setBackground(new java.awt.Color(0, 153, 204));
        LogInButton.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        LogInButton.setText("Sign In");
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel6.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 130, 50));

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 150, 136));
        signUpButton.setText("Sign Up now.");
        signUpButton.setToolTipText("Sign In with your existed credentials.");
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUpButtonMouseReleased(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel6.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 130, 30));

        showPassword1.setBackground(new java.awt.Color(255, 255, 255));
        showPassword1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        showPassword1.setForeground(new java.awt.Color(0, 77, 64));
        showPassword1.setToolTipText("Show/Hide Password");
        showPassword1.setBorderPaintedFlat(true);
        showPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword1.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword1ActionPerformed(evt);
            }
        });
        jPanel6.add(showPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 20, 20));

        warningLabel.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        warningLabel.setBorder(null);
        warningLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningLabelActionPerformed(evt);
            }
        });
        jPanel6.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 310, 50));

        jLabel17.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Sign In");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        signInPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 960, 850));

        cardParentPanel.add(signInPanel, "card7");

        BackgroundPanel.add(cardParentPanel);
        cardParentPanel.setBounds(0, 139, 1920, 850);

        Optionsbar.setBackground(new java.awt.Color(0, 153, 204));

        wearablesButton.setBackground(new java.awt.Color(0, 153, 204));
        wearablesButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        wearablesButton.setForeground(new java.awt.Color(255, 255, 255));
        wearablesButton.setText("Wearables");
        wearablesButton.setToolTipText("Sports Wear");
        wearablesButton.setBorder(new javax.swing.border.MatteBorder(null));
        wearablesButton.setBorderPainted(false);
        wearablesButton.setContentAreaFilled(false);
        wearablesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wearablesButton.setOpaque(true);
        wearablesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wearablesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wearablesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wearablesButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wearablesButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                wearablesButtonMouseReleased(evt);
            }
        });
        wearablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wearablesButtonActionPerformed(evt);
            }
        });

        accountButton.setBackground(new java.awt.Color(0, 153, 204));
        accountButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Person_48px.png"))); // NOI18N
        accountButton.setToolTipText("Account Information");
        accountButton.setBorder(new javax.swing.border.MatteBorder(null));
        accountButton.setBorderPainted(false);
        accountButton.setContentAreaFilled(false);
        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountButton.setOpaque(true);
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                accountButtonMouseReleased(evt);
            }
        });
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(0, 153, 204));
        cartButton.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_OpenCart_24px.png"))); // NOI18N
        cartButton.setText("Cart");
        cartButton.setToolTipText("Check Cart");
        cartButton.setBorder(new javax.swing.border.MatteBorder(null));
        cartButton.setBorderPainted(false);
        cartButton.setContentAreaFilled(false);
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.setMaximumSize(new java.awt.Dimension(67, 49));
        cartButton.setOpaque(true);
        cartButton.setPreferredSize(new java.awt.Dimension(67, 49));
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cartButtonMouseReleased(evt);
            }
        });
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        sports_itesmsButton.setBackground(new java.awt.Color(0, 153, 204));
        sports_itesmsButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        sports_itesmsButton.setForeground(new java.awt.Color(255, 255, 255));
        sports_itesmsButton.setText("Sports Items");
        sports_itesmsButton.setToolTipText("Goods for Sports");
        sports_itesmsButton.setBorder(new javax.swing.border.MatteBorder(null));
        sports_itesmsButton.setBorderPainted(false);
        sports_itesmsButton.setContentAreaFilled(false);
        sports_itesmsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sports_itesmsButton.setOpaque(true);
        sports_itesmsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sports_itesmsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sports_itesmsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sports_itesmsButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sports_itesmsButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sports_itesmsButtonMouseReleased(evt);
            }
        });
        sports_itesmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sports_itesmsButtonActionPerformed(evt);
            }
        });

        equipments.setBackground(new java.awt.Color(0, 153, 204));
        equipments.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        equipments.setForeground(new java.awt.Color(255, 255, 255));
        equipments.setText("Sports Equipments");
        equipments.setToolTipText("Tools used in Sports!");
        equipments.setBorder(new javax.swing.border.MatteBorder(null));
        equipments.setBorderPainted(false);
        equipments.setContentAreaFilled(false);
        equipments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipments.setOpaque(true);
        equipments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equipmentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equipmentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equipmentsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                equipmentsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                equipmentsMouseReleased(evt);
            }
        });
        equipments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentsActionPerformed(evt);
            }
        });

        Contact.setBackground(new java.awt.Color(0, 153, 204));
        Contact.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        Contact.setForeground(new java.awt.Color(255, 255, 255));
        Contact.setText("Contact");
        Contact.setToolTipText("Get in touch with us!");
        Contact.setBorder(new javax.swing.border.MatteBorder(null));
        Contact.setBorderPainted(false);
        Contact.setContentAreaFilled(false);
        Contact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Contact.setOpaque(true);
        Contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContactMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContactMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ContactMouseReleased(evt);
            }
        });
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });

        About.setBackground(new java.awt.Color(0, 153, 204));
        About.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        About.setForeground(new java.awt.Color(255, 255, 255));
        About.setText("About");
        About.setToolTipText("Get to know us");
        About.setBorder(new javax.swing.border.MatteBorder(null));
        About.setBorderPainted(false);
        About.setContentAreaFilled(false);
        About.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        About.setOpaque(true);
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AboutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AboutMouseReleased(evt);
            }
        });
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });

        newlyAdded1.setBackground(new java.awt.Color(0, 153, 204));
        newlyAdded1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        newlyAdded1.setForeground(new java.awt.Color(255, 255, 255));
        newlyAdded1.setText("Newly Added");
        newlyAdded1.setToolTipText("Check what's new!");
        newlyAdded1.setBorder(new javax.swing.border.MatteBorder(null));
        newlyAdded1.setBorderPainted(false);
        newlyAdded1.setContentAreaFilled(false);
        newlyAdded1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newlyAdded1.setOpaque(true);
        newlyAdded1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newlyAdded1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newlyAdded1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newlyAdded1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newlyAdded1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newlyAdded1MouseReleased(evt);
            }
        });
        newlyAdded1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlyAdded1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsbarLayout = new javax.swing.GroupLayout(Optionsbar);
        Optionsbar.setLayout(OptionsbarLayout);
        OptionsbarLayout.setHorizontalGroup(
            OptionsbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newlyAdded1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wearablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sports_itesmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equipments, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 976, Short.MAX_VALUE)
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        OptionsbarLayout.setVerticalGroup(
            OptionsbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(accountButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OptionsbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(wearablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sports_itesmsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(equipments, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(newlyAdded1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BackgroundPanel.add(Optionsbar);
        Optionsbar.setBounds(0, 80, 1920, 52);

        Topbar.setBackground(new java.awt.Color(0, 204, 204));
        Topbar.setPreferredSize(new java.awt.Dimension(1199, 72));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sports Casual");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sports.png"))); // NOI18N

        searchBar.setBackground(new java.awt.Color(0, 153, 204));
        searchBar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorder(null);
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(0, 204, 204));
        searchButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png"))); // NOI18N
        searchButton.setToolTipText("Search for Items");
        searchButton.setBorder(new javax.swing.border.MatteBorder(null));
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setOpaque(true);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchButtonMouseReleased(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");

        javax.swing.GroupLayout TopbarLayout = new javax.swing.GroupLayout(Topbar);
        Topbar.setLayout(TopbarLayout);
        TopbarLayout.setHorizontalGroup(
            TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1084, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TopbarLayout.setVerticalGroup(
            TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TopbarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(TopbarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        BackgroundPanel.add(Topbar);
        Topbar.setBounds(0, 0, 1920, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel6ComponentShown

    private void jPanel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel6FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel6FocusGained

    private void warningLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warningLabelActionPerformed

    private void showPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword1ActionPerformed
        // TODO add your handling code here:
        if(showPassword1.isSelected()){
            signInPasswordField.setEchoChar((char)0);
        }
        else
        signInPasswordField.setEchoChar('*');
    }//GEN-LAST:event_showPassword1ActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(signUpPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signUpButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseReleased
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signUpButtonMouseReleased

    private void signUpButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMousePressed
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(0, 77, 64));
    }//GEN-LAST:event_signUpButtonMousePressed

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signUpButtonMouseExited

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered
        // TODO add your handling code here:
        signUpButton.setForeground(new Color(48, 79, 254));
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:

        JFrame adminPanel = new AdminPanel();
        if(signInUsernameField.getText().equals("admin") && signInPasswordField.getText().equals("admin")){
            signInStatus = true;
            adminPanel.setVisible(true);
            logger = signInUsernameField.getText();
            signInUsernameField.setText("");
            signInPasswordField.setText("");
            warningLabel.setText("");
            cardParentPanel.removeAll();
            cardParentPanel.add(homePanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
            wrongPass = 0;
        }
        else{

            boolean flag = DbConnection.signer(signInUsernameField.getText(), signInPasswordField.getText());

            if(flag){
                signInStatus = true;
                cardParentPanel.removeAll();
                cardParentPanel.add(homePanel);
                cardParentPanel.repaint();
                cardParentPanel.revalidate();
                logger = signInUsernameField.getText();
                warningLabel.setText("");
                signInUsernameField.setText("");
                signInPasswordField.setText("");
                wrongPass = 0;
            }

            else{
                warningLabel.setText("Wrong username/password!");
                wrongPass++;

                if(wrongPass>=3){
                    PasswordFrame fpf = new PasswordFrame();
                }

                signInUsernameField.setText("");
                signInPasswordField.setText("");
            }

        }

    }//GEN-LAST:event_LogInButtonActionPerformed

    private void signInUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInUsernameFieldActionPerformed

    private void signUpUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpUsernameFieldActionPerformed

    private void LogUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogUpButtonActionPerformed
        // TODO add your handling code here:
        if(signUpUsernameField.getText().equals("")||signUpNameField.getText().equals("")||signUpEmailField.getText().equals("")
            ||signUpPasswordField.getText().equals(""))
        emptyField.setText("*One or more required fields are empty!");
        else{
            int test = DbConnection.insertToUser(signUpUsernameField.getText(), signUpNameField.getText(),
                signUpEmailField.getText(), signUpPasswordField.getText(),
                signUpCardNumberField.getText());

            if(test == 19){
                usernameExists.setText("Username exists!");
                emptyField.setText("");
                signUpUsernameField.setText("");
            }

            else{
                signUpUsernameField.setText("");
                signUpNameField.setText("");
                signUpEmailField.setText("");
                signUpPasswordField.setText("");
                signUpCardNumberField.setText("");
                emptyField.setText("");
            }
        }
    }//GEN-LAST:event_LogUpButtonActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
        if(showPassword.isSelected()){
            signUpPasswordField.setEchoChar((char)0);
        }
        else
        signUpPasswordField.setEchoChar('*');
    }//GEN-LAST:event_showPasswordActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(signInPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_signInButtonActionPerformed

    private void signInButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseReleased
        // TODO add your handling code here:
        signInButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signInButtonMouseReleased

    private void signInButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMousePressed
        // TODO add your handling code here:
        signInButton.setForeground(new Color(0, 77, 64));
    }//GEN-LAST:event_signInButtonMousePressed

    private void signInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseExited
        // TODO add your handling code here:
        signInButton.setForeground(new Color(0, 150, 136));
    }//GEN-LAST:event_signInButtonMouseExited

    private void signInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseEntered
        // TODO add your handling code here:
        signInButton.setForeground(new Color(48, 79, 254));
    }//GEN-LAST:event_signInButtonMouseEntered

    private void signUpCardNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpCardNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpCardNumberFieldActionPerformed

    private void signUpEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpEmailFieldActionPerformed

    private void signUpNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpNameFieldActionPerformed

    private void equipmentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();

        int selectedRow = equipmentsTable.getSelectedRow();
        TableModel tm = equipmentsTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_equipmentsTableMouseClicked

    private void sportsitemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sportsitemsTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();

        int selectedRow = sportsitemsTable.getSelectedRow();
        TableModel tm = sportsitemsTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_sportsitemsTableMouseClicked

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
        if(!signInStatus){
            cardParentPanel.removeAll();
            cardParentPanel.add(signInPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();

            warningLabel.setText("Please Sign In first.");

        }
        else{
            Date date = new Date();
            JFrame da = new DeliveryAddress(logger, Integer.parseInt(billLabel.getText()), date.toString());
            da.setVisible(true);
        }
    }//GEN-LAST:event_buyButtonActionPerformed

    private void wearablesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wearablesTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();

        int selectedRow = wearablesTable.getSelectedRow();
        TableModel tm = wearablesTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_wearablesTableMouseClicked

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = searchTable.getSelectedRow();

        if(Search.wearables!=0 && rowIndex<Search.wearables)
        ProductInformation.categoryChooser = "wearables";
        else if(Search.sportsitems!=0 && rowIndex>=Search.wearables && rowIndex<Search.wearables+Search.sportsitems)
        ProductInformation.categoryChooser = "sportsitemss";
        else
        ProductInformation.categoryChooser = "equipments";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = searchTable.getSelectedRow();
        TableModel tm = searchTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);

    }//GEN-LAST:event_searchTableMouseClicked

    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = homeTable.getSelectedRow();

        if(rowIndex<=2)
        ProductInformation.categoryChooser = "wearables";
        else if(rowIndex>2 && rowIndex<=5)
        ProductInformation.categoryChooser = "sportsitems";
        else
        ProductInformation.categoryChooser = "equipments";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = homeTable.getSelectedRow();
        TableModel tm = homeTable.getModel();

        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);

    }//GEN-LAST:event_homeTableMouseClicked

    private void newlyAdded1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlyAdded1ActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(homePanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();

        //Adding last three entries from every categories in home

        ArrayList<ProductList> list = WearablesDB.homePageContent();

        Object rowData[] = new Object[6];

        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

        model.setRowCount(0); //To clear sportsitemsTable

        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/wearables/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        list.clear();

        list = SportsItemsDB.homePageContent();

        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/sportsitems/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();

        list = EquipmentsDB.homePageContent();

        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/equipments/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_newlyAdded1ActionPerformed

    private void newlyAdded1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAdded1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_newlyAdded1MouseReleased

    private void newlyAdded1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAdded1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newlyAdded1MousePressed

    private void newlyAdded1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAdded1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_newlyAdded1MouseExited

    private void newlyAdded1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAdded1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_newlyAdded1MouseEntered

    private void newlyAdded1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newlyAdded1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newlyAdded1MouseClicked

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
        About obj = new About();
        obj.setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void AboutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutMouseReleased

    private void AboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutMousePressed

    private void AboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutMouseExited

    private void AboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutMouseEntered

    private void AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutMouseClicked

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
        Contact obj = new Contact();
        obj.setVisible(true);
    }//GEN-LAST:event_ContactActionPerformed

    private void ContactMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactMouseReleased

    private void ContactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactMousePressed

    private void ContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactMouseExited

    private void ContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactMouseEntered

    private void ContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactMouseClicked

    private void equipmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentsActionPerformed
        // TODO add your handling code here:
        ProductInformation.categoryChooser = "equipments";
        ArrayList<ProductList> list = EquipmentsDB.TableGenerator();
        Object rowData[] = new Object[6];

        DefaultTableModel model =  (DefaultTableModel) equipmentsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        equipmentsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        equipmentsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        equipmentsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        equipmentsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        equipmentsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

        model.setRowCount(0); //To clear sportsitemsTable

        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/equipments/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

            rowData[5] = ii;
            model.addRow(rowData);
            equipmentsTable.setRowHeight(150);
            equipmentsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_equipmentsActionPerformed

    private void equipmentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentsMouseReleased
        // TODO add your handling code here:
        equipments.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_equipmentsMouseReleased

    private void equipmentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentsMousePressed
        // TODO add your handling code here:
        equipments.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_equipmentsMousePressed

    private void equipmentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentsMouseExited
        // TODO add your handling code here:
        equipments.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_equipmentsMouseExited

    private void equipmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentsMouseEntered
        // TODO add your handling code here:
        equipments.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_equipmentsMouseEntered

    private void equipmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentsMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(equipPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_equipmentsMouseClicked

    private void sports_itesmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sports_itesmsButtonActionPerformed
        // TODO add your handling code here:
        ProductInformation.categoryChooser = "sportsitemss";
        ArrayList<ProductList> list = SportsItemsDB.TableGenerator();
        String[] columnName = {};
        Object rowData[] = new Object[6];

        DefaultTableModel model =  (DefaultTableModel) sportsitemsTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        sportsitemsTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        sportsitemsTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        sportsitemsTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        sportsitemsTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        sportsitemsTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

        model.setRowCount(0); //To clear sportsitemsTable

        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/sportsitems/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

            rowData[5] = ii;
            model.addRow(rowData);
            sportsitemsTable.setRowHeight(150);
            sportsitemsTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_sports_itesmsButtonActionPerformed

    private void sports_itesmsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sports_itesmsButtonMouseReleased
        // TODO add your handling code here:
        sports_itesmsButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_sports_itesmsButtonMouseReleased

    private void sports_itesmsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sports_itesmsButtonMousePressed
        // TODO add your handling code here:
        sports_itesmsButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_sports_itesmsButtonMousePressed

    private void sports_itesmsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sports_itesmsButtonMouseExited
        // TODO add your handling code here:
        sports_itesmsButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_sports_itesmsButtonMouseExited

    private void sports_itesmsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sports_itesmsButtonMouseEntered
        // TODO add your handling code here:
        sports_itesmsButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_sports_itesmsButtonMouseEntered

    private void sports_itesmsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sports_itesmsButtonMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(itemsPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_sports_itesmsButtonMouseClicked

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        cardParentPanel.removeAll();
        cardParentPanel.add(cartPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();

        DefaultTableModel model =  (DefaultTableModel) cartItemTable.getModel();
        model.setRowCount(0);
        total = 0;
        tot = "";

        for(int i=0; i<ProductInformation.cartItem.size(); i++){
            data[0] = ProductInformation.cartItem.get(i).getBrand();
            data[1] = ProductInformation.cartItem.get(i).getModel();
            data[2] = ProductInformation.cartItem.get(i).getPrice();
            data[3] = ProductInformation.cartItem.get(i).getQty();

            model.addRow(data);
            cartItemTable.setRowHeight(20);
            total+=Integer.parseInt(cartItemTable.getValueAt(i, 2)+"");

        }

        billLabel.setText(String.valueOf(total));
    }//GEN-LAST:event_cartButtonActionPerformed

    private void cartButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseReleased
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_cartButtonMouseReleased

    private void cartButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMousePressed
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_cartButtonMousePressed

    private void cartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseExited
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_cartButtonMouseExited

    private void cartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseEntered
        // TODO add your handling code here:
        cartButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_cartButtonMouseEntered

    private void cartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cartButtonMouseClicked

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
        if(signInStatus==false){
            cardParentPanel.removeAll();
            cardParentPanel.add(signUpPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
        }
        else{
            SignedIn si = new SignedIn();
            si.setVisible(true);
            si.loggerName.setText(logger);
        }
    }//GEN-LAST:event_accountButtonActionPerformed

    private void accountButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseReleased
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_accountButtonMouseReleased

    private void accountButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMousePressed
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_accountButtonMousePressed

    private void accountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseExited
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_accountButtonMouseExited

    private void accountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseEntered
        // TODO add your handling code here:
        accountButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_accountButtonMouseEntered

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accountButtonMouseClicked

    private void wearablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wearablesButtonActionPerformed
        // TODO add your handling code here:
        ProductInformation.categoryChooser = "wearables";
        ArrayList<ProductList> list = WearablesDB.TableGenerator();
        Object rowData[] = new Object[6];

        DefaultTableModel model =  (DefaultTableModel) wearablesTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        wearablesTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        wearablesTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        wearablesTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        wearablesTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        wearablesTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

        model.setRowCount(0); //To clear sportsitemsTable

        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/wearables/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

            rowData[5] = ii;
            model.addRow(rowData);
            wearablesTable.setRowHeight(150);
            wearablesTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_wearablesButtonActionPerformed

    private void wearablesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wearablesButtonMouseReleased
        // TODO add your handling code here:
        wearablesButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_wearablesButtonMouseReleased

    private void wearablesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wearablesButtonMousePressed
        // TODO add your handling code here:
        wearablesButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_wearablesButtonMousePressed

    private void wearablesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wearablesButtonMouseExited
        // TODO add your handling code here:
        wearablesButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_wearablesButtonMouseExited

    private void wearablesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wearablesButtonMouseEntered
        // TODO add your handling code here:
        wearablesButton.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_wearablesButtonMouseEntered

    private void wearablesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wearablesButtonMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(wearablesPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_wearablesButtonMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        //ProductInformation.categoryChooser = "sportsitemss";
        Search.wearables=0;
        Search.sportsitems=0;
        Search.equipments=0;

        ArrayList<ProductList> list = Search.sportsitemsSearch(searchBar.getText());
        Object rowData[] = new Object[6];
        int i, j, k;

        if(searchBar.getText().equals(""))
        JOptionPane.showMessageDialog(null, "Search field empty!");
        else if(Search.wearables==0 && Search.sportsitems==0 && Search.equipments==0)
        JOptionPane.showMessageDialog(null, "Sorry! Product does not exist!");
        else{
            cardParentPanel.removeAll();
            cardParentPanel.add(searchPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();

            DefaultTableModel model =  (DefaultTableModel) searchTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            searchTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

            model.setRowCount(0);
            for(i=0 ; i<Search.wearables; i++){
                rowData[0] = list.get(i).getBrand();
                rowData[1] = list.get(i).getModel();
                rowData[2] = list.get(i).getPrice();
                rowData[3] = list.get(i).getQty();
                rowData[4] = list.get(i).getDescription();
                String temp = list.get(i).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/wearables/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            for(k=i; k<Search.sportsitems+Search.wearables; k++){
                rowData[0] = list.get(k).getBrand();
                rowData[1] = list.get(k).getModel();
                rowData[2] = list.get(k).getPrice();
                rowData[3] = list.get(k).getQty();
                rowData[4] = list.get(k).getDescription();
                String temp = list.get(k).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/sportsitems/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            System.out.println();
            for(j=k; j<Search.sportsitems+Search.wearables+Search.equipments; j++){
                rowData[0] = list.get(j).getBrand();
                rowData[1] = list.get(j).getModel();
                rowData[2] = list.get(j).getPrice();
                rowData[3] = list.get(j).getQty();
                rowData[4] = list.get(j).getDescription();
                String temp = list.get(j).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/equipments/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseReleased
        // TODO add your handling code here:
        searchButton.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_searchButtonMouseReleased

    private void searchButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMousePressed
        // TODO add your handling code here:
        searchButton.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_searchButtonMousePressed

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseExited

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseEntered

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
        // TODO add your handling code here:
        searchBar.setText("");
    }//GEN-LAST:event_searchBarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

        static String logger;
    
    ProductInformation pi = new ProductInformation();
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
        JFrame newMain = new MainPage();
        newMain.setTitle("SportsCasual");
        newMain.setVisible(true);
        newMain.setResizable(true);
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton Contact;
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton LogUpButton;
    private javax.swing.JPanel Optionsbar;
    private javax.swing.JPanel Topbar;
    private javax.swing.JButton accountButton;
    public static javax.swing.JLabel billLabel;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel cardParentPanel;
    private javax.swing.JButton cartButton;
    public static javax.swing.JTable cartItemTable;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel emptyField;
    private javax.swing.JPanel equipPanel;
    private javax.swing.JButton equipments;
    private javax.swing.JTable equipmentsTable;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTable homeTable;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton newlyAdded1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JCheckBox showPassword1;
    private javax.swing.JButton signInButton;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JPasswordField signInPasswordField;
    private javax.swing.JTextField signInUsernameField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField signUpCardNumberField;
    private javax.swing.JTextField signUpEmailField;
    private javax.swing.JTextField signUpNameField;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPasswordField signUpPasswordField;
    private javax.swing.JTextField signUpUsernameField;
    private javax.swing.JButton sports_itesmsButton;
    private javax.swing.JTable sportsitemsTable;
    private javax.swing.JLabel usernameExists;
    private javax.swing.JTextField warningLabel;
    private javax.swing.JButton wearablesButton;
    private javax.swing.JPanel wearablesPanel;
    private javax.swing.JTable wearablesTable;
    // End of variables declaration//GEN-END:variables
}

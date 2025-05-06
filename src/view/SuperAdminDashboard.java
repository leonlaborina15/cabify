package view;

import controller.DashboardController;
import controller.UserController;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Session;

public class SuperAdminDashboard extends javax.swing.JFrame {

    public SuperAdminDashboard() {
        
        initComponents();
        loadDashboardData();
        loadRestaurantManagementTable();
        populateRestoAdminDropdown();
                 loadUserProfile();


        Font headerFont = new Font("Segoe UI", Font.BOLD, 12);
        Color headerColor = new Color(242,242,242);


        restoTable.getTableHeader().setFont(headerFont);
        restoTable.getTableHeader().setOpaque(false);
        restoTable.getTableHeader().setBackground(headerColor);
        restoTable.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        restoTable.getColumnModel().getColumn(0).setMaxWidth(50);
        restoTable.getColumnModel().getColumn(0).setMinWidth(50);
        restoTable.getColumnModel().getColumn(0).setResizable(false);
        restoTable.getColumnModel().getColumn(3).setMaxWidth(100);
        restoTable.getColumnModel().getColumn(3).setMinWidth(100);
        restoTable.getColumnModel().getColumn(3).setResizable(false);

        restoTableManagement.getTableHeader().setFont(headerFont);
        restoTableManagement.getTableHeader().setOpaque(false);
        restoTableManagement.getTableHeader().setBackground(headerColor);
        restoTableManagement.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        restoTableManagement.getColumnModel().getColumn(0).setMaxWidth(50);
        restoTableManagement.getColumnModel().getColumn(0).setMinWidth(50);
        restoTableManagement.getColumnModel().getColumn(0).setResizable(false);
        restoTableManagement.getColumnModel().getColumn(3).setMaxWidth(100);
        restoTableManagement.getColumnModel().getColumn(3).setMinWidth(100);
        restoTableManagement.getColumnModel().getColumn(3).setResizable(false);

        auditTable.getTableHeader().setFont(headerFont);
        auditTable.getTableHeader().setOpaque(false);
        auditTable.getTableHeader().setBackground(headerColor);
        auditTable.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        auditTable.getColumnModel().getColumn(0).setMaxWidth(50);
        auditTable.getColumnModel().getColumn(0).setMinWidth(50);
        auditTable.getColumnModel().getColumn(0).setResizable(false);
        auditTable.getColumnModel().getColumn(2).setMaxWidth(150);
        auditTable.getColumnModel().getColumn(2).setMinWidth(150);
        auditTable.getColumnModel().getColumn(2).setResizable(false);
        auditTable.getColumnModel().getColumn(0).setResizable(false);
        auditTable.getColumnModel().getColumn(1).setMaxWidth(150);
        auditTable.getColumnModel().getColumn(1).setMinWidth(150);
        auditTable.getColumnModel().getColumn(1).setResizable(false);

        setDefaultFormState();

        loadAuditLogs();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        userEmailLabel = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        Username2 = new javax.swing.JLabel();
        updateUser = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        tabPanne = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        totalResto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        totalUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalNotifSent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        restoTable = new javax.swing.JTable();
        viewResto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        restoTableManagement = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        location = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        restoName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        restoAdminDropdown = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        addRestoBtn = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        editRestoBtn = new javax.swing.JButton();
        deleteRestoBtn = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        inputSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        auditTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        notifMessage = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        notifCategory = new javax.swing.JComboBox<>();
        sendNotif = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Username3 = new javax.swing.JLabel();
        Username4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        updateUser1 = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();

        userEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userEmailLabel.setText("Email Address");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(userEmailLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(userEmailLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Username1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Username1.setForeground(new java.awt.Color(255, 255, 255));
        Username1.setText("FullName");

        Username2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Username2.setForeground(new java.awt.Color(255, 255, 255));
        Username2.setText("Email Address");

        updateUser.setBackground(new java.awt.Color(118, 171, 174));
        updateUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateUser.setForeground(new java.awt.Color(255, 255, 255));
        updateUser.setText("UPDATE");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PROFILE");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameLabel.setText("Email Address");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(userNameLabel)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(userNameLabel)
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurant List");

        jPanel1.setBackground(new java.awt.Color(118, 171, 174));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        totalResto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        totalResto.setForeground(new java.awt.Color(255, 255, 255));
        totalResto.setText("20");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Restaurants");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(totalResto)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalResto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(118, 171, 174));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Users");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerifyInputWhenFocusTarget(false);

        totalUser.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        totalUser.setForeground(new java.awt.Color(255, 255, 255));
        totalUser.setText("20");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(totalUser))
                    .addComponent(jLabel4))
                .addGap(69, 69, 69))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(totalUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );

        jPanel5.setBackground(new java.awt.Color(118, 171, 174));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Notification Sent");

        totalNotifSent.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        totalNotifSent.setForeground(new java.awt.Color(255, 255, 255));
        totalNotifSent.setText("20");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(65, 65, 65))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(totalNotifSent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalNotifSent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        restoTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        restoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Resto Id", "Restaurant Name", "Location", "Capacity", "Resto Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restoTable.setFocusable(false);
        restoTable.setRowHeight(25);
        restoTable.setSelectionBackground(new java.awt.Color(34, 40, 49));
        restoTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        restoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(restoTable);

        viewResto.setBackground(new java.awt.Color(118, 171, 174));
        viewResto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewResto.setForeground(new java.awt.Color(255, 255, 255));
        viewResto.setText("View All");
        viewResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRestoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUPER ADMIN DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(321, 321, 321))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(viewResto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(649, 649, 649))
                        .addComponent(jScrollPane1)))
                .addGap(166, 166, 166))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(viewResto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        tabPanne.addTab("Home", jPanel2);

        jPanel3.setBackground(new java.awt.Color(34, 40, 49));

        restoTableManagement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        restoTableManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Resto Id", "Restaurant Name", "Location", "Capacity", "Resto Admin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restoTableManagement.setFocusable(false);
        restoTableManagement.setRowHeight(25);
        restoTableManagement.setSelectionBackground(new java.awt.Color(34, 40, 49));
        restoTableManagement.setSelectionForeground(new java.awt.Color(255, 255, 255));
        restoTableManagement.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(restoTableManagement);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        location.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        capacity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Location:");

        restoName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Name:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Capacity:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Admin:");

        restoAdminDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        restoAdminDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoAdminDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)))
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capacity)
                    .addComponent(location)
                    .addComponent(restoName)
                    .addComponent(restoAdminDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(67, 67, 67))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restoAdminDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setToolTipText("");

        addRestoBtn.setBackground(new java.awt.Color(118, 171, 174));
        addRestoBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        addRestoBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRestoBtn.setText("Add New");
        addRestoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRestoBtnActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(49, 54, 63));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(49, 54, 63));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        editRestoBtn.setBackground(new java.awt.Color(118, 171, 174));
        editRestoBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editRestoBtn.setForeground(new java.awt.Color(255, 255, 255));
        editRestoBtn.setText("Edit");
        editRestoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRestoBtnActionPerformed(evt);
            }
        });

        deleteRestoBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteRestoBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteRestoBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteRestoBtn.setText("Delete");
        deleteRestoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRestoBtnActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(118, 171, 174));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addRestoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editRestoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteRestoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteRestoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editRestoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addRestoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(118, 171, 174));
        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(49, 54, 63));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RESTAURANT MANAGEMENT");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(inputSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(97, 97, 97))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tabPanne.addTab("Manage Restaurant", jPanel3);

        jPanel7.setBackground(new java.awt.Color(34, 40, 49));

        auditTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        auditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Log_Id", "Performed By", "Action", "Description", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        auditTable.setFocusable(false);
        auditTable.setRowHeight(25);
        auditTable.setSelectionBackground(new java.awt.Color(34, 40, 49));
        jScrollPane3.setViewportView(auditTable);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AUDIT LOGS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        tabPanne.addTab("Audit Logs", jPanel7);

        jPanel6.setBackground(new java.awt.Color(34, 40, 49));

        notifMessage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Category:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Message:");

        notifCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crowd Status", "System Update", "Emergency", "Nothing" }));
        notifCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifCategoryActionPerformed(evt);
            }
        });

        sendNotif.setBackground(new java.awt.Color(118, 171, 174));
        sendNotif.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sendNotif.setForeground(new java.awt.Color(255, 255, 255));
        sendNotif.setText("SEND");
        sendNotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendNotifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notifCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addComponent(notifMessage)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendNotif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notifMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notifCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(sendNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SEND NOTIFICATIONS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        tabPanne.addTab("Notifications", jPanel6);

        jPanel12.setBackground(new java.awt.Color(34, 40, 49));

        Username3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Username3.setForeground(new java.awt.Color(255, 255, 255));
        Username3.setText("Email Address");

        Username4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Username4.setForeground(new java.awt.Color(255, 255, 255));
        Username4.setText("FullName");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PROFILE");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Email Address");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(16, 16, 16))
        );

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("Email Address");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(emailLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        updateUser1.setBackground(new java.awt.Color(118, 171, 174));
        updateUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateUser1.setForeground(new java.awt.Color(255, 255, 255));
        updateUser1.setText("UPDATE");
        updateUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUser1ActionPerformed(evt);
            }
        });

        logout1.setBackground(new java.awt.Color(255, 51, 51));
        logout1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 255, 255));
        logout1.setText("Logout");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Username4)
                    .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Username3)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel10)
                .addGap(45, 45, 45)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Username4)
                    .addComponent(Username3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateUser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        tabPanne.addTab("Profile", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) restoTableManagement.getModel();
        String name = restoName.getText().trim();
        String loc = location.getText().trim();
        String cap = capacity.getText().trim();
        String selected = (String) restoAdminDropdown.getSelectedItem();
        String adminId = null;

        if (!"None".equals(selected)) {
            int idx = selected.lastIndexOf("ID: ");
            if (idx != -1) {
                adminId = selected.substring(idx + 4, selected.length() - 1).trim();
            }
        }
        int selectedRow = restoTableManagement.getSelectedRow();

        if (name.isEmpty() || loc.isEmpty() || cap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        DashboardController controller = new DashboardController();

        if (selectedRow >= 0) {
            String restaurantId = model.getValueAt(selectedRow, 0).toString();
            boolean success = controller.updateRestaurantAdmin(
                    restaurantId,
                    adminId,
                    name,
                    loc,
                    Integer.parseInt(cap)
            );
            if (success) {
                if (adminId != null) {
                    controller.setUserRoleToAdmin(adminId);
                }
                controller.addAuditLog(1, "Updated Restaurant",
                        "Updated restaurant ID: " + restaurantId + " to name: " + name
                        + ", location: " + loc + ", capacity: " + cap);
                loadRestaurantManagementTable();
                loadAuditLogs();
                JOptionPane.showMessageDialog(this, "Update Succesfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update restaurant in database!");
            }
        } else {
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to add this restaurant?",
                    "Confirm Add",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }
            boolean success = controller.addRestaurant(
                    name,
                    loc,
                    Integer.parseInt(cap),
                    adminId
            );
            if (success) {
                if (adminId != null) {
                    controller.setUserRoleToAdmin(adminId);
                }
                controller.addAuditLog(1, "Created Restaurant", "Added new restaurant: " + name + " at " + loc + ", capacity: " + cap);
                loadRestaurantManagementTable();
                loadAuditLogs();
                JOptionPane.showMessageDialog(this, "Restaurant added successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add restaurant to database.");
            }
        }
        setDefaultFormState();
        btnClearActionPerformed(null);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void deleteRestoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRestoBtnActionPerformed
        int selectedRow = restoTableManagement.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a restaurant to delete.");
            return;
        }
        // Confirmation before delete
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete the selected restaurant?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION
        );
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) restoTableManagement.getModel();
        String restaurantId = model.getValueAt(selectedRow, 0).toString(); // 0 = Resto Id

        DashboardController controller = new DashboardController();
        boolean success = controller.deleteRestaurantById(restaurantId);

        if (success) {
            controller.addAuditLog(1, "Deleted Restaurant",
                    "Deleted restaurant ID: " + restaurantId);
            model.removeRow(selectedRow);
            loadAuditLogs();
            JOptionPane.showMessageDialog(this, "Restaurant deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete restaurant from database.");
        }
        setDefaultFormState();
        btnClearActionPerformed(null);
    }//GEN-LAST:event_deleteRestoBtnActionPerformed

    private void editRestoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRestoBtnActionPerformed
        int selectedRow = restoTableManagement.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row to edit.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) restoTableManagement.getModel();

        restoName.setText((String) model.getValueAt(selectedRow, 1));
        location.setText((String) model.getValueAt(selectedRow, 2));
        capacity.setText(String.valueOf(model.getValueAt(selectedRow, 3)));
        Object adminObj = model.getValueAt(selectedRow, 4);
        if (adminObj == null || adminObj.toString().trim().isEmpty() || adminObj.toString().contains("No Admin")) {
            restoAdminDropdown.setSelectedIndex(0); // "None"
        } else {
            String adminName = adminObj.toString();
            for (int i = 1; i < restoAdminDropdown.getItemCount(); i++) {
                String item = (String) restoAdminDropdown.getItemAt(i);
                if (item.startsWith(adminName + " (ID:")) {
                    restoAdminDropdown.setSelectedIndex(i);
                    break;
                }
            }
        }
        setEditFormState();
    }//GEN-LAST:event_editRestoBtnActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (btnClose.getText().equals("Cancel")) {

            setDefaultFormState();
            btnClearActionPerformed(null);
            restoTableManagement.clearSelection();
        } else {

        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        location.setText("");
        capacity.setText("");
        restoName.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void addRestoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRestoBtnActionPerformed
        restoName.setText("");
        location.setText("");
        capacity.setText("");
        restoAdminDropdown.setSelectedIndex(0);
        restoTableManagement.clearSelection();
        setEditFormState();
    }//GEN-LAST:event_addRestoBtnActionPerformed

    private void restoAdminDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoAdminDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restoAdminDropdownActionPerformed

    private void viewRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRestoActionPerformed
        tabPanne.setSelectedIndex(1);
    }//GEN-LAST:event_viewRestoActionPerformed

    private void sendNotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendNotifActionPerformed
        String message = notifMessage.getText().trim();
        String category = (String) notifCategory.getSelectedItem();

        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a notification message.");
            return;
        }

        DashboardController controller = new DashboardController();
        boolean success = controller.sendNotification(message, category);

        if (success) {
            
              controller.addAuditLog(1, "Sent Notification",
            "Notification sent: " + message + " (Category: " + category + ")");
              
            JOptionPane.showMessageDialog(this, "Notification sent successfully!");
            notifMessage.setText("");
            notifCategory.setSelectedIndex(0);
            loadAuditLogs();


        } else {
            JOptionPane.showMessageDialog(this, "Failed to send notification.");
        }
    }//GEN-LAST:event_sendNotifActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
 String query = inputSearch.getText().trim().toLowerCase();

    DashboardController dashboardController = new DashboardController();
    List<String[]> restaurantData = dashboardController.getAllRestaurants(); 
    DefaultTableModel model = (DefaultTableModel) restoTableManagement.getModel();
    model.setRowCount(0); // Clear previous rows

    if (query.isEmpty()) {
        for (String[] resto : restaurantData) {
            model.addRow(resto);
        }
    } else {
        for (String[] resto : restaurantData) {
            boolean matches = false;
            for (int i = 1; i < resto.length; i++) {
                if (resto[i] != null && resto[i].toLowerCase().contains(query)) {
                    matches = true;
                    break;
                }
            }
            if (matches) {
                model.addRow(resto);
            }
        }
    }    }//GEN-LAST:event_searchBtnActionPerformed

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
    searchBtnActionPerformed(null);
    }//GEN-LAST:event_inputSearchActionPerformed

    private void notifCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notifCategoryActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        String currentName = userNameLabel.getText();
        String currentEmail = userEmailLabel.getText();

        String newName = JOptionPane.showInputDialog(this, "Enter new name:", currentName);
        if (newName == null || newName.trim().isEmpty()) return;

        String newEmail = JOptionPane.showInputDialog(this, "Enter new email:", currentEmail);
        if (newEmail == null || newEmail.trim().isEmpty()) return;

        int adminId = Session.getInstance().getAdminId();
        UserController userController = new UserController();
        try {
            boolean success = userController.updateUserProfile(adminId, newName, newEmail);
            if (success) {
                JOptionPane.showMessageDialog(this, "Profile updated successfully.");
                loadUserProfile();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update profile.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating profile: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateUserActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
     
    }//GEN-LAST:event_logoutActionPerformed

    private void updateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUser1ActionPerformed
        String currentName = nameLabel.getText();
        String currentEmail = emailLabel.getText();

        String newName = JOptionPane.showInputDialog(this, "Enter new name:", currentName);
        if (newName == null || newName.trim().isEmpty()) return;

        String newEmail = JOptionPane.showInputDialog(this, "Enter new email:", currentEmail);
        if (newEmail == null || newEmail.trim().isEmpty()) return;

        int adminId = Session.getInstance().getAdminId();
        UserController userController = new UserController();
        try {
            boolean success = userController.updateUserProfile(adminId, newName, newEmail);
            if (success) {
                JOptionPane.showMessageDialog(this, "Profile updated successfully.");
                loadUserProfile();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update profile.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating profile: " + ex.getMessage());}
    }//GEN-LAST:event_updateUser1ActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        Session.getInstance().logout();

        LoginView login = new LoginView();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_logout1ActionPerformed

    private void setDefaultFormState() {
        restoName.setEnabled(false);
        location.setEnabled(false);
        capacity.setEnabled(false);
        restoAdminDropdown.setEnabled(false);

        btnSave.setEnabled(false);
        btnClear.setEnabled(false);
        btnClose.setText("Close");
        btnClose.setEnabled(true);

        addRestoBtn.setEnabled(true);
        editRestoBtn.setEnabled(true);
        deleteRestoBtn.setEnabled(true);

        restoTableManagement.setEnabled(true);
    }

    private void setEditFormState() {
        restoName.setEnabled(true);
        location.setEnabled(true);
        capacity.setEnabled(true);
        restoAdminDropdown.setEnabled(true);

        btnSave.setEnabled(true);
        btnClear.setEnabled(true);
        btnClose.setText("Cancel");
        btnClose.setEnabled(true);

        addRestoBtn.setEnabled(false);
        editRestoBtn.setEnabled(false);
        deleteRestoBtn.setEnabled(false);

        restoTableManagement.setEnabled(false);
    }

    private void populateRestoAdminDropdown() {
        restoAdminDropdown.removeAllItems();
        restoAdminDropdown.addItem("None");

        DashboardController dashboardController = new DashboardController();
        List<String[]> users = dashboardController.getAllUsers();

        for (String[] user : users) {
            // e.g. Bob Smith (ID: 12)
            restoAdminDropdown.addItem(user[1] + " (ID: " + user[0] + ")");
        }
    }

    private void loadAuditLogs() {
        DashboardController controller = new DashboardController();
        List<String[]> logs = controller.getAllLogs();
        DefaultTableModel model = (DefaultTableModel) auditTable.getModel();
        model.setRowCount(0); // Clear existing rows
        for (String[] log : logs) {
            model.addRow(log);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuperAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperAdminDashboard().setVisible(true);
            }
        });
    }

    private void loadDashboardData() {
        try {
            DashboardController dashboardController = new DashboardController();

            int totalUsers = dashboardController.getTotalUsers();
            int totalRestaurants = dashboardController.getTotalRestaurants();

            totalUser.setText(String.valueOf(totalUsers));
            totalResto.setText(String.valueOf(totalRestaurants));

            List<String[]> restaurantData = dashboardController.getAllRestaurants();
            DefaultTableModel model = (DefaultTableModel) restoTable.getModel();
            model.setRowCount(0); 
            for (String[] resto : restaurantData) {
                model.addRow(resto);
            }
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to load dashboard data.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadRestaurantManagementTable() {
        try {
            DashboardController dashboardController = new DashboardController();
            List<String[]> restaurantData = dashboardController.getAllRestaurants();
            DefaultTableModel model = (DefaultTableModel) restoTableManagement.getModel();
            model.setRowCount(0);
            for (String[] resto : restaurantData) {

                model.addRow(resto);
            }
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to load restaurant data.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Username1;
    private javax.swing.JLabel Username2;
    private javax.swing.JLabel Username3;
    private javax.swing.JLabel Username4;
    private javax.swing.JButton addRestoBtn;
    private javax.swing.JTable auditTable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField capacity;
    private javax.swing.JButton deleteRestoBtn;
    private javax.swing.JButton editRestoBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField location;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> notifCategory;
    private javax.swing.JTextField notifMessage;
    private javax.swing.JComboBox<String> restoAdminDropdown;
    private javax.swing.JTextField restoName;
    private javax.swing.JTable restoTable;
    private javax.swing.JTable restoTableManagement;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton sendNotif;
    private javax.swing.JTabbedPane tabPanne;
    private javax.swing.JLabel totalNotifSent;
    private javax.swing.JLabel totalResto;
    private javax.swing.JLabel totalUser;
    private javax.swing.JButton updateUser;
    private javax.swing.JButton updateUser1;
    private javax.swing.JLabel userEmailLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JButton viewResto;
    // End of variables declaration//GEN-END:variables

    private void loadUserProfile() {
    int adminId = Session.getInstance().getAdminId();
    UserController userController = new UserController();
    try {
        model.User user = userController.getUserById(adminId);
        if (user != null) {
            nameLabel.setText(user.getName());
            emailLabel.setText(user.getEmail());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Unable to load profile info.");
    }
}
}

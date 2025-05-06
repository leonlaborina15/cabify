
package view;

import controller.DashboardController;
import controller.RestaurantController;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Restaurant;


public class UserView extends javax.swing.JFrame {
        private List<Restaurant> restaurantList; 
    private RestaurantController restaurantController = new RestaurantController();

    public UserView() {
         initComponents();
        loadRestaurantsToTable();
        setupTableRowSelection();
        viewDetails.setEnabled(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchBtnActionPerformed(evt);
    }
});
inputSearch.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchBtnActionPerformed(evt);
    }
});

filterByDistanceOrCrowd.addActionListener(evt -> sortAndReloadTable());
    ascendingDescending.addActionListener(evt -> sortAndReloadTable());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateCapacity1 = new javax.swing.JButton();
        tabPanne = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        inputSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        restoTableView = new javax.swing.JTable();
        ascendingDescending = new javax.swing.JComboBox<>();
        filterByDistanceOrCrowd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        restoName = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        restoStatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        waitTimeLabel = new javax.swing.JLabel();
        viewDetails = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        capacityBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        waitTimeLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        restoStatus1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        updateCapacity = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        restoName1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        restoStatus2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        updateCapacity1.setBackground(new java.awt.Color(118, 171, 174));
        updateCapacity1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateCapacity1.setForeground(new java.awt.Color(255, 255, 255));
        updateCapacity1.setText("BACK");
        updateCapacity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCapacity1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));

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

        restoTableView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        restoTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Location", "Current Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restoTableView.setFocusable(false);
        restoTableView.setRowHeight(25);
        restoTableView.setSelectionBackground(new java.awt.Color(34, 40, 49));
        restoTableView.setSelectionForeground(new java.awt.Color(255, 255, 255));
        restoTableView.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(restoTableView);

        ascendingDescending.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        filterByDistanceOrCrowd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distance", "Capacity" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filter Restaurant By:");

        jPanel8.setBackground(new java.awt.Color(49, 54, 63));

        restoName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restoName.setForeground(new java.awt.Color(255, 255, 255));
        restoName.setText("BONCHON");
        restoName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        restoName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(restoName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restoName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        distanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        distanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        distanceLabel.setText("23 km");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Wait Time:");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        restoStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restoStatus.setText("OPEN");
        restoStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        restoStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(restoStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(restoStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disctance:");

        waitTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        waitTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        waitTimeLabel.setText("10 minutes");

        viewDetails.setBackground(new java.awt.Color(118, 171, 174));
        viewDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewDetails.setForeground(new java.awt.Color(255, 255, 255));
        viewDetails.setText("View Details");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waitTimeLabel)
                            .addComponent(distanceLabel)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(filterByDistanceOrCrowd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ascendingDescending, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ascendingDescending, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filterByDistanceOrCrowd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(waitTimeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(distanceLabel))
                        .addGap(37, 37, 37)
                        .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        tabPanne.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));

        capacityBar.setBackground(new java.awt.Color(49, 54, 63));
        capacityBar.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setText("Crowd");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Wait Time:");

        waitTimeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        waitTimeLabel1.setText("10 minutes");

        jPanel11.setBackground(new java.awt.Color(49, 54, 63));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        restoStatus1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restoStatus1.setForeground(new java.awt.Color(255, 255, 255));
        restoStatus1.setText("OPEN");
        restoStatus1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        restoStatus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(restoStatus1)
                .addGap(20, 20, 20))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(restoStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(waitTimeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(capacityBar, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(capacityBar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(waitTimeLabel1))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Route Options:");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Motor:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Walking: ");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Car:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("13 Minutes");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("20 Minutes");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("10 Minutes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel15)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(78, 78, 78))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        updateCapacity.setBackground(new java.awt.Color(118, 171, 174));
        updateCapacity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateCapacity.setForeground(new java.awt.Color(255, 255, 255));
        updateCapacity.setText("BACK");
        updateCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCapacityActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(49, 54, 63));

        restoName1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        restoName1.setForeground(new java.awt.Color(255, 255, 255));
        restoName1.setText("BONCHON");
        restoName1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        restoName1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel12.setBackground(new java.awt.Color(255, 51, 51));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        restoStatus2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restoStatus2.setForeground(new java.awt.Color(255, 255, 255));
        restoStatus2.setText("SUBSCRIBED");
        restoStatus2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        restoStatus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restoStatus2)
                .addGap(42, 42, 42))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(restoStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(restoName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restoName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCapacity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(updateCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tabPanne.addTab("Restaurant", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        tabPanne.addTab("Profile", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanne, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanne, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        searchBtnActionPerformed(null);
    }//GEN-LAST:event_inputSearchActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
  String query = inputSearch.getText().trim().toLowerCase();
    DefaultTableModel model = (DefaultTableModel) restoTableView.getModel();
    model.setRowCount(0);

    if (query.isEmpty()) {
        for (Restaurant r : restaurantList) {
            model.addRow(new Object[]{
                r.getName(),
                r.getLocation(),
                r.getMaxCapacity()
            });
        }
    } else {
        for (Restaurant r : restaurantList) {
            if ((r.getName() != null && r.getName().toLowerCase().contains(query))
                || (r.getLocation() != null && r.getLocation().toLowerCase().contains(query))
                || (r.getStatus() != null && r.getStatus().toLowerCase().contains(query))) {
                model.addRow(new Object[]{
                    r.getName(),
                    r.getLocation(),
                    r.getMaxCapacity()
                });
            }
        }
    }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
int selectedRow = restoTableView.getSelectedRow();
    if (selectedRow >= 0 && selectedRow < restaurantList.size()) {
        Restaurant r = restaurantList.get(selectedRow);
        showRestaurantDetails(r);
        tabPanne.setSelectedIndex(1); 
    }    }//GEN-LAST:event_viewDetailsActionPerformed

    private void updateCapacity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCapacity1ActionPerformed
        tabPanne.setSelectedIndex(0);
    }//GEN-LAST:event_updateCapacity1ActionPerformed

    private void updateCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCapacityActionPerformed
        tabPanne.setSelectedIndex(0);
    }//GEN-LAST:event_updateCapacityActionPerformed

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ascendingDescending;
    private javax.swing.JProgressBar capacityBar;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JComboBox<String> filterByDistanceOrCrowd;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel restoName;
    private javax.swing.JLabel restoName1;
    private javax.swing.JLabel restoName2;
    private javax.swing.JLabel restoStatus;
    private javax.swing.JLabel restoStatus1;
    private javax.swing.JLabel restoStatus2;
    private javax.swing.JTable restoTableView;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTabbedPane tabPanne;
    private javax.swing.JButton updateCapacity;
    private javax.swing.JButton updateCapacity1;
    private javax.swing.JButton viewDetails;
    private javax.swing.JLabel waitTimeLabel;
    private javax.swing.JLabel waitTimeLabel1;
    // End of variables declaration//GEN-END:variables

   private void loadRestaurantsToTable() {
        try {
            restaurantList = restaurantController.getAllRestaurants();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load restaurant data.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) restoTableView.getModel();
        model.setRowCount(0); // Clear table
        for (Restaurant r : restaurantList) {
            model.addRow(new Object[]{
                r.getName(),
                r.getLocation(),
                r.getCurrentCapacity() 
            });
        }
    }

    private void setupTableRowSelection() {
       restoTableView.getSelectionModel().addListSelectionListener(e -> {
    if (!e.getValueIsAdjusting()) {
        int selectedRow = restoTableView.getSelectedRow();
        if (selectedRow >= 0 && selectedRow < restaurantList.size()) {
            Restaurant r = restaurantList.get(selectedRow);
            restoName.setText(r.getName());
            restoStatus.setText(
                r.getStatus() != null && r.getStatus().equalsIgnoreCase("Open") ? "OPEN" : "CLOSED"
            );
            restoStatus.setForeground(
                r.getStatus() != null && r.getStatus().equalsIgnoreCase("Open")
                    ? new java.awt.Color(0, 128, 0)
                    : java.awt.Color.RED
            );

            waitTimeLabel.setText(r.getWaitTime() + " minutes");

            distanceLabel.setText(String.format("%.2f km", r.getDistanceKm()));

            viewDetails.setEnabled(true);
        } else {
            restoName.setText("");
            restoStatus.setText("");
            waitTimeLabel.setText("");
            distanceLabel.setText("");
            viewDetails.setEnabled(false);
        }
    }
});
    }

 private void sortAndReloadTable() {
    String sortBy = (String) filterByDistanceOrCrowd.getSelectedItem();
    String sortOrder = (String) ascendingDescending.getSelectedItem();

    Comparator<Restaurant> comparator = null;

    if ("Distance".equals(sortBy)) {
        comparator = Comparator.comparingDouble(Restaurant::getDistanceKm);
    } else if ("Capacity".equals(sortBy)) {
        
        comparator = Comparator.comparingDouble(r -> {
            if (r.getMaxCapacity() > 0) {
                return (double) r.getCurrentCapacity() / r.getMaxCapacity();
            } else {
                return 0.0;
            }
        });
    }

    if (comparator != null) {
        if ("Descending".equals(sortOrder)) {
            comparator = comparator.reversed();
        }
        Collections.sort(restaurantList, comparator);
    }

    reloadTableWithCurrentList();
}

private void reloadTableWithCurrentList() {
    DefaultTableModel model = (DefaultTableModel) restoTableView.getModel();
    model.setRowCount(0); // Clear table
    for (Restaurant r : restaurantList) {
        model.addRow(new Object[]{
            r.getName(),
            r.getLocation(),
            r.getMaxCapacity()
        });
    }
}

  private void showRestaurantDetails(Restaurant r) {
    restoName1.setText(r.getName());

    int max = r.getMaxCapacity();
    int current = r.getCurrentCapacity();
    int percent = (max > 0) ? (int) ((current * 100.0) / max) : 0;
    capacityBar.setValue(percent);
    capacityBar.setStringPainted(true);
    capacityBar.setString(percent + "% Full");
    if (percent < 50) {
        capacityBar.setForeground(new java.awt.Color(0, 153, 0));
    } else if (percent < 80) {
        capacityBar.setForeground(new java.awt.Color(255, 204, 0));
    } else {
        capacityBar.setForeground(java.awt.Color.RED);
    }

    waitTimeLabel1.setText(r.getWaitTime() + " minutes");

    restoStatus1.setText(r.getStatus() != null && r.getStatus().equalsIgnoreCase("Open") ? "OPEN" : "CLOSED");
    restoStatus1.setForeground(
        r.getStatus() != null && r.getStatus().equalsIgnoreCase("Open")
            ? new java.awt.Color(255, 255, 255)
            : java.awt.Color.RED
    );

    double dist = r.getDistanceKm();
    jLabel15.setText(String.format("%.0f Minutes", dist * 2));  
    jLabel16.setText(String.format("%.0f Minutes", dist * 0.7));  
    jLabel14.setText(String.format("%.0f Minutes", dist * 0.9));  
}
}

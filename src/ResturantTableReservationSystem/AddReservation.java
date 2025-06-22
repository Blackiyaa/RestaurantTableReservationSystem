package ResturantTableReservationSystem;

import Controller.AdministratorController;
import Controller.ReservationController;
import Model.Reservation;
import Model.Customer;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AddReservation extends javax.swing.JFrame {

    public AddReservation() {
         initComponents();
        
        initTabbedPaneListener();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        txtCusid.setText(String.valueOf(Customer.id));
        txtCusid.setEditable(false);
        
        //for single booking
        StartDatePicker.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    updateComboBox();
                }
            }
        });
        
        StartTimePick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    updateComboBox();
                
            }
        });

        EndTimePick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!"...".equals(StartTimePick.getSelectedItem().toString())) {
                    updateComboBox();
                }
            }
        });
 
        //for continous booking
        StartDatePickerC.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    updateComboBoxC();
                }
            }
        });
        
        EndDatePickerC.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    updateComboBoxC();
                }
            }
        });
        
        StartTimePickC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    updateComboBoxC();
                
            }
        });
        
        EndTimePickC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    updateComboBoxC();
                
            }
        });
        
        //for specific
        StartDatePickerS.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    updateComboBoxSpecific();
                }
            }
        });
        
        EndDatePickerS.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    updateComboBoxSpecific();
                }
            }
        });

        StartTimePickS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateComboBoxSpecific();
            }
        });

        EndTimePickS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateComboBoxSpecific();
            }
        });
        
        ActionListener checkBoxListner = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateComboBoxSpecific();
            }
        };
        
        ch_sunday.addActionListener(checkBoxListner);
        ch_monday.addActionListener(checkBoxListner);
        ch_tuesday.addActionListener(checkBoxListner);
        ch_wednesday.addActionListener(checkBoxListner);
        ch_thursday.addActionListener(checkBoxListner);
        ch_friday.addActionListener(checkBoxListner);
        ch_saturday.addActionListener(checkBoxListner);
    }
    
    private void initTabbedPaneListener() {
        TabbedPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });
    }
    
    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {
        int selectedIndex = TabbedPanel.getSelectedIndex();

        // Update JComboBox value based on selected tab index
        switch (selectedIndex) {
            case 0:
                ReservationTypeComboBox.setSelectedItem("Book For Single Date");
                break;
            case 1:
                ReservationTypeComboBox.setSelectedItem("Book For Continous Period");
                break;
            case 2:
                ReservationTypeComboBox.setSelectedItem("Book For Specific Days");
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtCusid = new javax.swing.JTextField();
        ReservationTypeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BookBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        TableBtn = new javax.swing.JButton();
        ReservedBtn = new javax.swing.JButton();
        ResBtn = new javax.swing.JButton();
        TabbedPanel = new Animations.TabbedPaneCustom();
        jPanel3 = new javax.swing.JPanel();
        StartDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        StartTimePick = new javax.swing.JComboBox<>();
        EndTimePick = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TableCombo1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        StartDatePickerC = new com.github.lgooddatepicker.components.DatePicker();
        EndDatePickerC = new com.github.lgooddatepicker.components.DatePicker();
        StartTimePickC = new javax.swing.JComboBox<>();
        EndTimePickC = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TableCombo2 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        StartDatePickerS = new com.github.lgooddatepicker.components.DatePicker();
        EndDatePickerS = new com.github.lgooddatepicker.components.DatePicker();
        StartTimePickS = new javax.swing.JComboBox<>();
        EndTimePickS = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ch_sunday = new javax.swing.JCheckBox();
        ch_thursday = new javax.swing.JCheckBox();
        ch_monday = new javax.swing.JCheckBox();
        ch_friday = new javax.swing.JCheckBox();
        ch_tuesday = new javax.swing.JCheckBox();
        ch_saturday = new javax.swing.JCheckBox();
        ch_wednesday = new javax.swing.JCheckBox();
        TableCombo3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,10));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCusid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCusid.setBackground(new java.awt.Color(204, 204, 204));
        txtCusid.setForeground(new java.awt.Color(0, 0, 0));
        txtCusid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusidActionPerformed(evt);
            }
        });

        ReservationTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book For Single Date", "Book For Continous Period", "Book For Specific Days" }));
        ReservationTypeComboBox.setBackground(new java.awt.Color(204, 204, 204));
        ReservationTypeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReservationTypeComboBox.setForeground(new java.awt.Color(0, 0, 0));
        ReservationTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer ID  :");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtCusid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(ReservationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReservationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCusid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 670, 50));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setText("Reserve Your Table");
        jLabel2.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 320, 60));

        BookBtn.setText("Book Now!");
        BookBtn.setBackground(new java.awt.Color(0, 0, 0));
        BookBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BookBtn.setForeground(new java.awt.Color(255, 255, 255));
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255,10));

        HomeBtn.setText("Home");
        HomeBtn.setBackground(new java.awt.Color(255, 255, 255));
        HomeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(0, 0, 0));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        TableBtn.setText("View Table Details");
        TableBtn.setBackground(new java.awt.Color(255, 255, 255));
        TableBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableBtn.setForeground(new java.awt.Color(0, 0, 0));
        TableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableBtnActionPerformed(evt);
            }
        });

        ReservedBtn.setText("View Reserved Tables");
        ReservedBtn.setBackground(new java.awt.Color(255, 255, 255));
        ReservedBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ReservedBtn.setForeground(new java.awt.Color(0, 0, 0));
        ReservedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeBtn)
                .addGap(18, 18, 18)
                .addComponent(TableBtn)
                .addGap(18, 18, 18)
                .addComponent(ReservedBtn)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeBtn)
                    .addComponent(TableBtn)
                    .addComponent(ReservedBtn))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 1090, 40));

        ResBtn.setBackground(new java.awt.Color(255, 255, 255));
        ResBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ResBtn.setForeground(new java.awt.Color(0, 0, 0));
        ResBtn.setText("To Reservation Details");
        ResBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ResBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 720, -1, -1));

        TabbedPanel.setBackground(new java.awt.Color(0, 0, 0,80));
        TabbedPanel.setSelectedColor(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,200));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        StartTimePick.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", " " }));
        StartTimePick.setBackground(new java.awt.Color(204, 204, 204));
        StartTimePick.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StartTimePick.setForeground(new java.awt.Color(0, 0, 0));
        StartTimePick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTimePickActionPerformed(evt);
            }
        });

        EndTimePick.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        EndTimePick.setBackground(new java.awt.Color(204, 204, 204));
        EndTimePick.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EndTimePick.setForeground(new java.awt.Color(51, 51, 51));
        EndTimePick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTimePickActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Details For Single Date Booking...");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Date                      :");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Start Time            :");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("End Time              :");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        TableCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a table", " " }));
        TableCombo1.setBackground(new java.awt.Color(204, 204, 204));
        TableCombo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TableCombo1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel19.setText("Available Tables  :");
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StartDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EndTimePick, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StartTimePick, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TableCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(StartDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(StartTimePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TableCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(EndTimePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        TabbedPanel.addTab("Single Date Booking", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,200));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        StartTimePickC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00" }));
        StartTimePickC.setBackground(new java.awt.Color(204, 204, 204));
        StartTimePickC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StartTimePickC.setForeground(new java.awt.Color(0, 0, 0));
        StartTimePickC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTimePickCActionPerformed(evt);
            }
        });

        EndTimePickC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        EndTimePickC.setBackground(new java.awt.Color(204, 204, 204));
        EndTimePickC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EndTimePickC.setForeground(new java.awt.Color(0, 0, 0));
        EndTimePickC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTimePickCActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Details For Continous Period Booking...");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("Start Date          :");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("End Date            :");
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Start Time          :");
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("End Time            :");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setText("Available Table      :");
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));

        TableCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a table" }));
        TableCombo2.setBackground(new java.awt.Color(204, 204, 204));
        TableCombo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TableCombo2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(StartDatePickerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(StartTimePickC, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EndDatePickerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EndTimePickC, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TableCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(StartDatePickerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(EndDatePickerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(StartTimePickC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(EndTimePickC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TableCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Continous Period Booking", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,200));

        StartTimePickS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", " " }));
        StartTimePickS.setBackground(new java.awt.Color(204, 204, 204));
        StartTimePickS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StartTimePickS.setForeground(new java.awt.Color(0, 0, 0));
        StartTimePickS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTimePickSActionPerformed(evt);
            }
        });

        EndTimePickS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        EndTimePickS.setBackground(new java.awt.Color(204, 204, 204));
        EndTimePickS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EndTimePickS.setForeground(new java.awt.Color(0, 0, 0));
        EndTimePickS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTimePickSActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter Details For Specific Days Booking... ");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));

        jLabel14.setText("Start Date        :");
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("End Date         :");
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Start Time        :");
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setText("End Time         :");
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Select Specifc Days...");
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));

        ch_sunday.setText("Sunday");
        ch_sunday.setForeground(new java.awt.Color(255, 255, 255));
        ch_sunday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_sundayActionPerformed(evt);
            }
        });

        ch_thursday.setText("Thursday");
        ch_thursday.setForeground(new java.awt.Color(255, 255, 255));

        ch_monday.setText("Monday");
        ch_monday.setForeground(new java.awt.Color(255, 255, 255));
        ch_monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_mondayActionPerformed(evt);
            }
        });

        ch_friday.setText("Friday");
        ch_friday.setForeground(new java.awt.Color(255, 255, 255));
        ch_friday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_fridayActionPerformed(evt);
            }
        });

        ch_tuesday.setText("Tuesday");
        ch_tuesday.setForeground(new java.awt.Color(255, 255, 255));

        ch_saturday.setText("Saturday");
        ch_saturday.setForeground(new java.awt.Color(255, 255, 255));
        ch_saturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_saturdayActionPerformed(evt);
            }
        });

        ch_wednesday.setText("Wednesday");
        ch_wednesday.setForeground(new java.awt.Color(255, 255, 255));

        TableCombo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a table" }));
        TableCombo3.setBackground(new java.awt.Color(204, 204, 204));
        TableCombo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TableCombo3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel21.setText("Available Tables        :");
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StartTimePickS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel18))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StartDatePickerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EndTimePickS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndDatePickerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGap(49, 49, 49))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(ch_sunday)
                        .addGap(18, 18, 18)
                        .addComponent(ch_monday)
                        .addGap(18, 18, 18)
                        .addComponent(ch_tuesday)
                        .addGap(18, 18, 18)
                        .addComponent(ch_wednesday)
                        .addGap(18, 18, 18)
                        .addComponent(ch_thursday)
                        .addGap(18, 18, 18)
                        .addComponent(ch_friday)
                        .addGap(18, 18, 18)
                        .addComponent(ch_saturday))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TableCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(StartDatePickerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(StartTimePickS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(EndDatePickerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EndTimePickS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addGap(58, 58, 58))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_sunday)
                    .addComponent(ch_monday)
                    .addComponent(ch_tuesday)
                    .addComponent(ch_wednesday)
                    .addComponent(ch_thursday)
                    .addComponent(ch_friday)
                    .addComponent(ch_saturday))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TableCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Specific Days Booking", jPanel5);

        jPanel1.add(TabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 720, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/b.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCusidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusidActionPerformed

    private void ReservationTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationTypeComboBoxActionPerformed

        if(ReservationTypeComboBox.getSelectedItem().toString().equals("Book For Single Date")){

            TabbedPanel.setSelectedIndex(0);
        }else if(ReservationTypeComboBox.getSelectedItem().toString().equals("Book For Continous Period")){

            TabbedPanel.setSelectedIndex(1);
        }else if(ReservationTypeComboBox.getSelectedItem().toString().equals("Book For Specific Days")){

            TabbedPanel.setSelectedIndex(2);
        }
    }//GEN-LAST:event_ReservationTypeComboBoxActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed

        Reservation res=null;
        boolean isAvailiable = true;

        int cid = Integer.parseInt(txtCusid.getText());
        //String tid = TableComboBox.getSelectedItem().toString();
        String rType = ReservationTypeComboBox.getSelectedItem().toString();

        LocalDate startDate = StartDatePicker.getDate();

        LocalDate startDateC = StartDatePickerC.getDate();
        LocalDate endDateC = EndDatePickerC.getDate();

        LocalDate startDateS = StartDatePickerS.getDate();
        LocalDate endDateS = EndDatePickerS.getDate();

        String startT = StartTimePick.getSelectedItem().toString();
        String endT = EndTimePick.getSelectedItem().toString();

        String startTC = StartTimePickC.getSelectedItem().toString();
        String endTC = EndTimePickC.getSelectedItem().toString();

        String startTS = StartTimePickS.getSelectedItem().toString();
        String endTS = EndTimePickS.getSelectedItem().toString();

        List<DayOfWeek> selectedDays = new ArrayList<>();
        List<LocalDate> specificDays = new ArrayList<>();

        if(rType.equals("Book For Single Date")){

            String tid = TableCombo1.getSelectedItem().toString();

            try{
                if(!startDate.equals(null)&&!startT.equals("...")&&!endT.equals("...")&&!tid.equals("Select a table")){
                    LocalTime startTime = LocalTime.parse(startT);
                    LocalTime endTime = LocalTime.parse(endT);

                    if(ReservationController.checkStartTimeWithEndTime(startTime, endTime)){
                        if(ReservationController.checkEqualityDateWithCurrentDate(startDate, startDate)==true){
                            if(ReservationController.checkEqualityDateWithCurrentTime(startDate, startTime, endTime)==true){

                                res = new Reservation(cid, tid, rType, startDate, startTime, endTime, startDate);

                                AdministratorController.insertReservationForSingleBooking(res);

                                new AddReservation().setVisible(true);
                                this.dispose();

                            }else{
                                JOptionPane.showMessageDialog(null, "You cannot choose time before current time because you are going to make your reservation today!","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "You cannot choose date before current date!","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Start time and End time input incorrectly!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please fill in all fields of Book For Single Date","Error",JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please fill in all fields of Book For Single Date","Warning",JOptionPane.WARNING_MESSAGE);
                this.setVisible(true);
            }

        }else if(rType.equals("Book For Continous Period")){

            String tid = TableCombo2.getSelectedItem().toString();
            try{
                if(!startDateC.equals(null)&&!endDateC.equals(null)&&!startTC.equals("...")&&!endTC.equals("...")&&!tid.equals("Select a table")){
                    LocalTime startTimeC = LocalTime.parse(startTC);
                    LocalTime endTimeC = LocalTime.parse(endTC);

                    if(ReservationController.checkStartDateWithEndDate(startDateC, endDateC)){

                        if(ReservationController.checkEqualityStartDateWithEndDate(startDateC, endDateC)){
                            if(ReservationController.checkEqualityDateWithCurrentDate(startDateC, startDateC)==true){
                                if(ReservationController.checkEqualityDateWithCurrentTime(startDateC, startTimeC, endTimeC)==true){

                                    res = new Reservation(cid, tid, rType, startDateC, startTimeC, endTimeC, endDateC);

                                    AdministratorController.insertReservationForContinousBooking(res);

                                    new AddReservation().setVisible(true);
                                    this.dispose();

                                }else{
                                    JOptionPane.showMessageDialog(null, "You cannot choose time before current time because you are going to make your reservation onwards today!","Error",JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "You cannot choose date before current date!","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Cannot Chose same date for this booking type!","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Start Date and End Date input incorrectly!","Error",JOptionPane.ERROR_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Please fill in all fields of Book For Continous Period","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please fill in all fields of Book For Continous Period","Warning",JOptionPane.WARNING_MESSAGE);
                this.setVisible(true);
            }
        }else if(rType.equals("Book For Specific Days")){

            String tid = TableCombo3.getSelectedItem().toString();
            try{
                if(!startDateS.equals(null)&&!endDateS.equals(null)&&!startTS.equals("...")&&!endTS.equals("...")&&!tid.equals("Select a table")){
                    LocalTime startTimeS = LocalTime.parse(startTS);
                    LocalTime endTimeS = LocalTime.parse(endTS);

                    if(ch_sunday.isSelected()==true||ch_monday.isSelected()==true||ch_tuesday.isSelected()==true||ch_wednesday.isSelected()==true||ch_thursday.isSelected()==true||ch_friday.isSelected()==true||ch_saturday.isSelected()==true){

                        if(ch_sunday.isSelected()==true){
                            selectedDays.add(DayOfWeek.SUNDAY);
                        }
                        if(ch_monday.isSelected()==true){
                            selectedDays.add(DayOfWeek.MONDAY);
                        }
                        if(ch_tuesday.isSelected()==true){
                            selectedDays.add(DayOfWeek.TUESDAY);
                        }
                        if(ch_wednesday.isSelected()==true){
                            selectedDays.add(DayOfWeek.WEDNESDAY);
                        }
                        if(ch_thursday.isSelected()==true){
                            selectedDays.add(DayOfWeek.THURSDAY);
                        }
                        if(ch_friday.isSelected()==true){
                            selectedDays.add(DayOfWeek.FRIDAY);
                        }
                        if(ch_saturday.isSelected()==true){
                            selectedDays.add(DayOfWeek.SATURDAY);
                        }

                        specificDays = ReservationController.getSpecificDays(startDateS, endDateS, selectedDays);
                        //if(ReservationController.notDate!=1){
                            if(ReservationController.checkStartDateWithEndDate(startDateS, endDateS)){

                                if(ReservationController.checkEqualityDateWithCurrentDate(startDateS, startDateS)==true){
                                    if(ReservationController.checkEqualityDateWithCurrentTime(startDateS, startTimeS, endTimeS)==true){
                                        
                                            for(LocalDate sDate : specificDays){
                                                res = new Reservation(cid, tid, rType, sDate, startTimeS, endTimeS, sDate);

                                                AdministratorController.insertReservationForSpecificBooking(res,sDate);

                                            }
                                            JOptionPane.showMessageDialog(null, "Table Reserved Successfully! \n Download Your Reservation Slip from View Reservation Details Page Page");
                                            new AddReservation().setVisible(true);
                                            this.dispose();
                                        
                                    }else{
                                        JOptionPane.showMessageDialog(null, "You cannot choose time before current time because you are going to make your reservation onwards today!","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null, "You cannot choose date before current date!","Error",JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Start Date and End Date input incorrectly!","Error",JOptionPane.ERROR_MESSAGE);
                            }
                            /*}else{
                            JOptionPane.showMessageDialog(null, "There is no selected day of week within given date period");
                        }*/
                    }else{
                        JOptionPane.showMessageDialog(null, "Select at least one day","Warning",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please fill in all fields of Book For Specific Days","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null, "Please fill in all fields of Book For Specific Days");
                this.setVisible(true);
            }

        }
    }//GEN-LAST:event_BookBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new AdministratorMainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void TableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableBtnActionPerformed
        new TableView().setVisible(true);
    }//GEN-LAST:event_TableBtnActionPerformed

    private void ReservedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservedBtnActionPerformed
        new ReservationView().setVisible(true);
    }//GEN-LAST:event_ReservedBtnActionPerformed

    private void StartTimePickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTimePickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartTimePickActionPerformed

    private void EndTimePickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTimePickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndTimePickActionPerformed

    private void StartTimePickCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTimePickCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartTimePickCActionPerformed

    private void EndTimePickCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTimePickCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndTimePickCActionPerformed

    private void StartTimePickSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTimePickSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartTimePickSActionPerformed

    private void EndTimePickSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTimePickSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndTimePickSActionPerformed

    private void ch_sundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_sundayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_sundayActionPerformed

    private void ch_mondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_mondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_mondayActionPerformed

    private void ch_fridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_fridayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_fridayActionPerformed

    private void ch_saturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_saturdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_saturdayActionPerformed

    private void ResBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResBtnActionPerformed
        new ViewReservationDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ResBtnActionPerformed

    private void updateComboBox() {
        LocalDate startDate = StartDatePicker.getDate();

        String startT = StartTimePick.getSelectedItem().toString();
        String endT = EndTimePick.getSelectedItem().toString();

        if (!startT.equals("...") && !endT.equals("...")) {
            LocalTime startTime = LocalTime.parse(startT);
            LocalTime endTime = LocalTime.parse(endT);

            ReservationController.getTableAvailiableSingleBooking(startDate, startTime, endTime, startDate);
        }

        update();
    }
    
    private void updateComboBoxC() {
        LocalDate startDate = StartDatePickerC.getDate();
        LocalDate endDate = EndDatePickerC.getDate();
        
        String startTC = StartTimePickC.getSelectedItem().toString();
        String endTC = EndTimePickC.getSelectedItem().toString();

        if (!startTC.equals("...") && !endTC.equals("...")) {
            LocalTime startTime = LocalTime.parse(startTC);
            LocalTime endTime = LocalTime.parse(endTC);

            ReservationController.getTableAvailiableContinousBooking(startDate, startTime, endTime, endDate);
        }

        updateC();
    }
    
    public void update(){
    
        TableCombo1.removeAllItems();
        
        boolean availableTables = false;
        
        try{
        
            while(ReservationController.rsCombo.next()){
                TableCombo1.addItem(ReservationController.rsCombo.getString("tableID"));
            }
        }catch(Exception e){
        
        }finally{
            try{
                if (ReservationController.rsCombo != null) {
                ReservationController.rsCombo.close();
                }
                if (ReservationController.pstCombo != null) {
                    ReservationController.pstCombo.close();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
        }
    
        if (!availableTables) {
            TableCombo1.addItem("Not Available");
        }
    
    }
    
    public void updateC(){
    
        TableCombo2.removeAllItems();
        
        boolean availableTables = false;
        
        try{
        
            while(ReservationController.rsCombo.next()){
                TableCombo2.addItem(ReservationController.rsCombo.getString("tableID"));
            }
            
            
        }catch(Exception e){
        
        }finally{
            try{
                if (ReservationController.rsCombo != null) {
                ReservationController.rsCombo.close();
                }
                if (ReservationController.pstCombo != null) {
                    ReservationController.pstCombo.close();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
        }
    
        if (!availableTables) {
            TableCombo2.addItem("Not Available");
        }
    
    }
    
    private void updateComboBoxSpecific() {
        LocalDate startDateS = StartDatePickerS.getDate();
        LocalDate endDateS = EndDatePickerS.getDate();
        String startTS = StartTimePickS.getSelectedItem().toString();
        String endTS = EndTimePickS.getSelectedItem().toString();

        if (!startTS.equals("...") && !endTS.equals("...")){
            LocalTime startTimeS = LocalTime.parse(startTS);
            LocalTime endTimeS = LocalTime.parse(endTS);
            
            List<DayOfWeek> selectedDays = new ArrayList<>();

            if(ch_sunday.isSelected()==true){
                selectedDays.add(DayOfWeek.SUNDAY);
            }
            if(ch_monday.isSelected()==true){
                selectedDays.add(DayOfWeek.MONDAY);
            }
            if(ch_tuesday.isSelected()==true){
                selectedDays.add(DayOfWeek.TUESDAY);
            }
            if(ch_wednesday.isSelected()==true){
                selectedDays.add(DayOfWeek.WEDNESDAY);
            }
            if(ch_thursday.isSelected()==true){
                selectedDays.add(DayOfWeek.THURSDAY);
            }
            if(ch_friday.isSelected()==true){
                selectedDays.add(DayOfWeek.FRIDAY);
            }
            if(ch_saturday.isSelected()==true){
                selectedDays.add(DayOfWeek.SATURDAY);
            }                    
            
            List<String> availableTables = ReservationController.getTableAvailiableSpecificDaysBooking(startDateS, startTimeS, endTimeS, endDateS);

            TableCombo3.removeAllItems();
            for (String table : availableTables) {
                TableCombo3.addItem(table);
            }
        }
            
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBtn;
    private com.github.lgooddatepicker.components.DatePicker EndDatePickerC;
    private com.github.lgooddatepicker.components.DatePicker EndDatePickerS;
    private javax.swing.JComboBox<String> EndTimePick;
    private javax.swing.JComboBox<String> EndTimePickC;
    private javax.swing.JComboBox<String> EndTimePickS;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton ResBtn;
    private javax.swing.JComboBox<String> ReservationTypeComboBox;
    private javax.swing.JButton ReservedBtn;
    private com.github.lgooddatepicker.components.DatePicker StartDatePicker;
    private com.github.lgooddatepicker.components.DatePicker StartDatePickerC;
    private com.github.lgooddatepicker.components.DatePicker StartDatePickerS;
    private javax.swing.JComboBox<String> StartTimePick;
    private javax.swing.JComboBox<String> StartTimePickC;
    private javax.swing.JComboBox<String> StartTimePickS;
    private Animations.TabbedPaneCustom TabbedPanel;
    private javax.swing.JButton TableBtn;
    private javax.swing.JComboBox<String> TableCombo1;
    private javax.swing.JComboBox<String> TableCombo2;
    private javax.swing.JComboBox<String> TableCombo3;
    private javax.swing.JCheckBox ch_friday;
    private javax.swing.JCheckBox ch_monday;
    private javax.swing.JCheckBox ch_saturday;
    private javax.swing.JCheckBox ch_sunday;
    private javax.swing.JCheckBox ch_thursday;
    private javax.swing.JCheckBox ch_tuesday;
    private javax.swing.JCheckBox ch_wednesday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtCusid;
    // End of variables declaration//GEN-END:variables
}

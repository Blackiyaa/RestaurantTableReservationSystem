
package ResturantTableReservationSystem;

import Controller.CustomerController;
import Controller.AdministratorController;
import Controller.ReservationController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import net.proteanit.sql.DbUtils;

public class ViewReservationDetails extends javax.swing.JFrame {

    public ViewReservationDetails() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        tableLoadUpcoming();
        tableLoadOld();
        
        txt_rid.setEditable(false);
        txt_cid.setEditable(false);
        txt_tid.setEditable(false);
        txt_rtype.setEditable(false);
        txt_sdate.setEditable(false);
        txt_stime.setEditable(false);
        txt_etime.setEditable(false);
        txt_edate.setEditable(false);
        ReservationSlip.setEnabled(false);
        CancelRes.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OldBookingTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpcomingBookingTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        CancelRes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_rid = new javax.swing.JTextField();
        txt_cid = new javax.swing.JTextField();
        txt_tid = new javax.swing.JTextField();
        txt_rtype = new javax.swing.JTextField();
        txt_sdate = new javax.swing.JTextField();
        txt_stime = new javax.swing.JTextField();
        txt_etime = new javax.swing.JTextField();
        txt_edate = new javax.swing.JTextField();
        ReservationSlip = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_Amount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,80));

        OldBookingTable.setBackground(new java.awt.Color(0, 0, 0));
        OldBookingTable.setForeground(new java.awt.Color(255, 255, 255));
        OldBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resevation ID", "Customer ID", "Table ID", "Reservation Type", "Start Date", "Start Time", "End Time", "End Date", "Reservation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OldBookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OldBookingTableMouseClicked(evt);
            }
        });
        OldBookingTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OldBookingTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(OldBookingTable);

        jLabel13.setText("Old Reservations...");
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(506, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(60, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 690, 290));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));

        UpcomingBookingTable.setBackground(new java.awt.Color(0, 0, 0));
        UpcomingBookingTable.setForeground(new java.awt.Color(255, 255, 255));
        UpcomingBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Customer ID", "Table ID", "Reservation Type", "Start Date", "Start Time", "End Time", "End Date", "Reservation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UpcomingBookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpcomingBookingTableMouseClicked(evt);
            }
        });
        UpcomingBookingTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UpcomingBookingTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(UpcomingBookingTable);

        jLabel12.setText("Upoming Reservation...");
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        CancelRes.setText("Cancel Reservation!");
        CancelRes.setBackground(new java.awt.Color(0, 102, 102));
        CancelRes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelRes.setForeground(new java.awt.Color(255, 255, 255));
        CancelRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(CancelRes)))
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(CancelRes)
                .addGap(15, 15, 15))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(60, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 690, 300));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel1.setText("Reservation ID        :");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText(" Customer ID           :");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Table ID                   :");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Reservation Type   :");
        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Start Date     :");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Start Time     :");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("End Time      :");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("End Date      :");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        txt_rid.setBackground(new java.awt.Color(204, 204, 204));
        txt_rid.setForeground(new java.awt.Color(0, 0, 0));
        txt_rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ridActionPerformed(evt);
            }
        });

        txt_cid.setBackground(new java.awt.Color(204, 204, 204));
        txt_cid.setForeground(new java.awt.Color(0, 0, 0));

        txt_tid.setBackground(new java.awt.Color(204, 204, 204));
        txt_tid.setForeground(new java.awt.Color(0, 0, 0));
        txt_tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tidActionPerformed(evt);
            }
        });

        txt_rtype.setBackground(new java.awt.Color(204, 204, 204));
        txt_rtype.setForeground(new java.awt.Color(0, 0, 0));
        txt_rtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rtypeActionPerformed(evt);
            }
        });

        txt_sdate.setBackground(new java.awt.Color(204, 204, 204));
        txt_sdate.setForeground(new java.awt.Color(0, 0, 0));
        txt_sdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdateActionPerformed(evt);
            }
        });

        txt_stime.setBackground(new java.awt.Color(204, 204, 204));
        txt_stime.setForeground(new java.awt.Color(0, 0, 0));
        txt_stime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stimeActionPerformed(evt);
            }
        });

        txt_etime.setBackground(new java.awt.Color(204, 204, 204));
        txt_etime.setForeground(new java.awt.Color(0, 0, 0));
        txt_etime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_etimeActionPerformed(evt);
            }
        });

        txt_edate.setBackground(new java.awt.Color(204, 204, 204));
        txt_edate.setForeground(new java.awt.Color(0, 0, 0));
        txt_edate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edateActionPerformed(evt);
            }
        });

        ReservationSlip.setText("Download Reservation Slip");
        ReservationSlip.setBackground(new java.awt.Color(0, 102, 102));
        ReservationSlip.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ReservationSlip.setForeground(new java.awt.Color(255, 255, 255));
        ReservationSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationSlipActionPerformed(evt);
            }
        });

        jLabel10.setText("Click table rows for get values...");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Payable Amount for table : ");
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        txt_Amount.setBackground(new java.awt.Color(204, 204, 204));
        txt_Amount.setForeground(new java.awt.Color(0, 0, 0));
        txt_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReservationSlip)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_cid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tid)
                                    .addComponent(txt_rtype, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_stime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_etime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_edate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txt_rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_stime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_rtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(ReservationSlip)
                .addGap(51, 51, 51))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 590, 600));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel11.setText("My Reservations");
        jLabel11.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 280, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/HomeIcon.png"))); // NOI18N
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/b.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OldBookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OldBookingTableMouseClicked
        tableDataOld();
        ReservationSlip.setEnabled(true);
        CancelRes.setEnabled(false);
    }//GEN-LAST:event_OldBookingTableMouseClicked

    private void OldBookingTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OldBookingTableKeyReleased
        tableDataOld();
        ReservationSlip.setEnabled(true);
    }//GEN-LAST:event_OldBookingTableKeyReleased

    private void UpcomingBookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpcomingBookingTableMouseClicked
        tableDataUpcoming();
        ReservationSlip.setEnabled(true);
        CancelRes.setEnabled(true);
    }//GEN-LAST:event_UpcomingBookingTableMouseClicked

    private void UpcomingBookingTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpcomingBookingTableKeyReleased
        tableDataUpcoming();
        ReservationSlip.setEnabled(true);
    }//GEN-LAST:event_UpcomingBookingTableKeyReleased

    private void CancelResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelResActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete Record",JOptionPane.YES_NO_OPTION);

        try{
            if(UpcomingBookingTable.getSelectedRowCount() == 1) {
                int selectRow = UpcomingBookingTable.getSelectedRow();

                if (selectRow != -1) { // Check if a row is selected
                    if(x==0){
                        Object value = UpcomingBookingTable.getValueAt(selectRow, 0);

                        String id = String.valueOf(value);
                        CustomerController.CancelResevation(id);

                        tableLoadUpcoming();
                        refresh();
                        CancelRes.setEnabled(false);

                    }else{
                        this.setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Please select a customer for deletion");
                }
            }else if (UpcomingBookingTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            }else{
                JOptionPane.showMessageDialog(null, "Please select a single customer for deletion");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
    }//GEN-LAST:event_CancelResActionPerformed

    private void txt_ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ridActionPerformed

    private void txt_tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tidActionPerformed

    private void txt_rtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rtypeActionPerformed

    private void txt_sdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdateActionPerformed

    private void txt_stimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stimeActionPerformed

    private void txt_etimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_etimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_etimeActionPerformed

    private void txt_edateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edateActionPerformed

    private void ReservationSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationSlipActionPerformed

        String rid = txt_rid.getText();
        String cid = txt_cid.getText();
        String tid = txt_tid.getText();
        String rtype = txt_rtype.getText();
        String sDate = txt_sdate.getText();
        String sTime = txt_stime.getText();
        String eTime = txt_etime.getText();
        String eDate = txt_edate.getText();
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        String payAmount = txt_Amount.getText();

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(rid+"-"+cid+"-Booking Slip"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){

            String filePath = dialog.getSelectedFile().getPath();

            try{
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));

                myDocument.open();

                myDocument.add(new Paragraph("RESERVATION SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,30,Font.BOLD)));
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Reservation ID : "+rid,FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Customer ID       : "+cid,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("Table ID           : "+tid,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("Reservation Type : "+rtype,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("Start Date       : "+sDate,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("Start Time       : "+sTime,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("End Time           :"+eTime,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("End Date           : "+eDate,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.PLAIN)));
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------\n"));
                myDocument.add(new Paragraph("Payble Amount for Table  : Rs."+payAmount,FontFactory.getFont(FontFactory.TIMES_BOLD,22,Font.BOLD)));
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------\n"));
                myDocument.add(new Paragraph("Generated on "+currentDate+" at "+formattedTime,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.PLAIN)));
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();

                JOptionPane.showMessageDialog(null, "Slip Downloaded Successfully!");

                refresh();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_ReservationSlipActionPerformed

    private void txt_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdministratorMainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void tableDataUpcoming(){
        int r = UpcomingBookingTable.getSelectedRow();
    
        String rid = UpcomingBookingTable.getValueAt(r, 0).toString();
        String cid = UpcomingBookingTable.getValueAt(r, 1).toString();
        String tid = UpcomingBookingTable.getValueAt(r, 2).toString();
        String rtype = UpcomingBookingTable.getValueAt(r, 3).toString();
        String sDate = UpcomingBookingTable.getValueAt(r, 4).toString();
        String sTime = UpcomingBookingTable.getValueAt(r, 5).toString();
        String eTime = UpcomingBookingTable.getValueAt(r, 6).toString();
        String eDate = UpcomingBookingTable.getValueAt(r, 7).toString();
            
        txt_rid.setText(rid);
        txt_cid.setText(cid);
        txt_tid.setText(tid);
        txt_rtype.setText(rtype);
        txt_sdate.setText(sDate);
        txt_stime.setText(sTime);
        txt_etime.setText(eTime);
        txt_edate.setText(eDate);
        
        
        //to get table payment
        LocalDate startDate = LocalDate.parse(sDate);
        LocalDate endDate = LocalDate.parse(eDate);
        
        String[] parts1 = sTime.split(":");
        int startTime = Integer.parseInt(parts1[0]);
        
        String[] parts2 = eTime.split(":");
        int endTime = Integer.parseInt(parts2[0]);
        
        int dayCount = ReservationController.getCountBetweenDays(startDate, endDate);
        int hourCount = ReservationController.getCountBetweenTime(startTime, endTime);
        
        double charge = ReservationController.getTablePrice(tid);
        
        double totalCharge = 0.0;
        
        if(rtype.equals("Book For Single Date")||rtype.equals("Book For Specific Days")){
            totalCharge = charge * hourCount*1;
        }else if(rtype.equals("Book For Continous Period")){
            totalCharge = (charge * hourCount) * dayCount;
        }
        
        String totCharge = Double.toString(totalCharge);
        txt_Amount.setText(totCharge);
    }
    
    public void tableDataOld(){
        int r = OldBookingTable.getSelectedRow();
    
        String rid = UpcomingBookingTable.getValueAt(r, 0).toString();
        String cid = UpcomingBookingTable.getValueAt(r, 1).toString();
        String tid = UpcomingBookingTable.getValueAt(r, 2).toString();
        String rtype = UpcomingBookingTable.getValueAt(r, 3).toString();
        String sDate = UpcomingBookingTable.getValueAt(r, 4).toString();
        String sTime = UpcomingBookingTable.getValueAt(r, 5).toString();
        String eTime = UpcomingBookingTable.getValueAt(r, 6).toString();
        String eDate = UpcomingBookingTable.getValueAt(r, 7).toString();
            
        txt_rid.setText(rid);
        txt_cid.setText(cid);
        txt_tid.setText(tid);
        txt_rtype.setText(rtype);
        txt_sdate.setText(sDate);
        txt_stime.setText(sTime);
        txt_etime.setText(eTime);
        txt_edate.setText(eDate);
        
        
        //to get table payment
        LocalDate startDate = LocalDate.parse(sDate);
        LocalDate endDate = LocalDate.parse(eDate);
        
        String[] parts1 = sTime.split(":");
        int startTime = Integer.parseInt(parts1[0]);
        
        String[] parts2 = eTime.split(":");
        int endTime = Integer.parseInt(parts2[0]);
        
        int dayCount = ReservationController.getCountBetweenDays(startDate, endDate);
        int hourCount = ReservationController.getCountBetweenTime(startTime, endTime);
        
        double charge = ReservationController.getTablePrice(tid);
        
        double totalCharge = 0.0;
        
        if(rtype.equals("Book For Single Date")||rtype.equals("Book For Specific Days")){
            totalCharge = charge * hourCount*1;
        }else if(rtype.equals("Book For Continous Period")){
            totalCharge = (charge * hourCount) * dayCount;
        }
        
        String totCharge = Double.toString(totalCharge);
        txt_Amount.setText(totCharge);
    }
    
    
    public void tableLoadUpcoming(){
    
        AdministratorController.viewUpcomingReservatonDetails();
        
        try{
            
            UpcomingBookingTable.setModel(DbUtils.resultSetToTableModel(AdministratorController.rs));
            
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{

                AdministratorController.rs.close();
                AdministratorController.pst.close();
            }catch(Exception e){

            }
        
        }
    }
    
    public void tableLoadOld(){
    
        AdministratorController.viewOldReservatonDetails();
        
        try{
            
            OldBookingTable.setModel(DbUtils.resultSetToTableModel(AdministratorController.rsLoad));
            
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{

                AdministratorController.rsLoad.close();
                AdministratorController.pstLoad.close();
            }catch(Exception e){

            }
        
        }
    }
    
    public void refresh(){
        txt_rid.setText("");
        txt_cid.setText("");
        txt_tid.setText("");
        txt_rtype.setText("");
        txt_sdate.setText("");
        txt_stime.setText("");
        txt_etime.setText("");
        txt_edate.setText("");
    }
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReservationDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelRes;
    private javax.swing.JTable OldBookingTable;
    private javax.swing.JButton ReservationSlip;
    private javax.swing.JTable UpcomingBookingTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Amount;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_edate;
    private javax.swing.JTextField txt_etime;
    private javax.swing.JTextField txt_rid;
    private javax.swing.JTextField txt_rtype;
    private javax.swing.JTextField txt_sdate;
    private javax.swing.JTextField txt_stime;
    private javax.swing.JTextField txt_tid;
    // End of variables declaration//GEN-END:variables
}

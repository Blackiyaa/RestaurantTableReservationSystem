package ResturantTableReservationSystem;

import Controller.AdministratorController;
import Model.Customer;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CustomerDetails extends javax.swing.JFrame {

    public CustomerDetails() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        tableLoad();
        
        addResBtn.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusTable = new javax.swing.JTable();
        DeleteBtn = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addResBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        CusTable.setBackground(new java.awt.Color(0, 0, 0));
        CusTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CusTable.setForeground(new java.awt.Color(255, 255, 255));
        CusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "NIC", "Email", "Contact NO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CusTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CusTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CusTable);

        DeleteBtn.setText("Delete");
        DeleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_search.setBackground(new java.awt.Color(204, 204, 204));
        txt_search.setForeground(new java.awt.Color(0, 0, 0));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel1.setText("Seach for Customer :");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        addResBtn.setText("Add Reservation");
        addResBtn.setBackground(new java.awt.Color(0, 102, 102));
        addResBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addResBtn.setForeground(new java.awt.Color(255, 255, 255));
        addResBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(DeleteBtn)
                        .addGap(95, 95, 95)
                        .addComponent(addResBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn)
                    .addComponent(addResBtn))
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 830, 570));

        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/HomeIcon.png"))); // NOI18N
        HomeBtn.setBackground(new java.awt.Color(255, 255, 255));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 40));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel9.setText("Customer Details");
        jLabel9.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 540, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/b.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 1350, -1));

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

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new AdministratorMainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete Record",JOptionPane.YES_NO_OPTION);
        
        try{
            if(CusTable.getSelectedRowCount() == 1) {
                int selectRow = CusTable.getSelectedRow();
        
                if (selectRow != -1) { // Check if a row is selected
                    if(x==0){
                        Object value = CusTable.getValueAt(selectRow, 0);

                        String id = String.valueOf(value);
                        AdministratorController.deleteCustomer(id);

                        tableLoad();
                        
                    }else{
                        this.setVisible(true);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a customer for deletion","Error",JOptionPane.ERROR);
                }
            }else if (CusTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Please select a single customer for deletion","Error",JOptionPane.ERROR);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
        }
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CusTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CusTableMouseClicked
        int r = CusTable.getSelectedRow();
        String cid = CusTable.getValueAt(r, 0).toString();
        Customer.id = Integer.parseInt(cid);
        addResBtn.setEnabled(true);
    }//GEN-LAST:event_CusTableMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String srch = txt_search.getText();
        
        AdministratorController.searchCustomer(srch);
        
        try{
            
            CusTable.setModel(DbUtils.resultSetToTableModel(AdministratorController.rs));
            
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{

                AdministratorController.rs.close();
                AdministratorController.pst.close();
            }catch(Exception e){

            }
        
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void addResBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResBtnActionPerformed
        new AddReservation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addResBtnActionPerformed

    
    public void tableLoad(){
    
        AdministratorController.viewCustomerDetails();
        
        try{
            
            CusTable.setModel(DbUtils.resultSetToTableModel(AdministratorController.rs));
            
            
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
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CusTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton addResBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}

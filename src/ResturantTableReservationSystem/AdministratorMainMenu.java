package ResturantTableReservationSystem;

import Controller.AdministratorController;
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
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AdministratorMainMenu extends javax.swing.JFrame {

    public AdministratorMainMenu() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        DailyResBtn = new javax.swing.JButton();
        TableReportBtn = new javax.swing.JButton();
        CusReportBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CusDetailsBtn = new javax.swing.JButton();
        ResDetailsBtn = new javax.swing.JButton();
        TableDetailsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel9.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DineDeck Restaurant");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/Logo1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 660, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255,10));

        DailyResBtn.setBackground(new java.awt.Color(255, 255, 255));
        DailyResBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DailyResBtn.setForeground(new java.awt.Color(0, 0, 0));
        DailyResBtn.setText("Daily Reservations Report");
        DailyResBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyResBtnActionPerformed(evt);
            }
        });

        TableReportBtn.setBackground(new java.awt.Color(255, 255, 255));
        TableReportBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableReportBtn.setForeground(new java.awt.Color(0, 0, 0));
        TableReportBtn.setText("Table List Report");
        TableReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableReportBtnActionPerformed(evt);
            }
        });

        CusReportBtn.setBackground(new java.awt.Color(255, 255, 255));
        CusReportBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CusReportBtn.setForeground(new java.awt.Color(0, 0, 0));
        CusReportBtn.setText("Customer List Report");
        CusReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CusReportBtn)
                .addGap(27, 27, 27)
                .addComponent(DailyResBtn)
                .addGap(28, 28, 28)
                .addComponent(TableReportBtn)
                .addContainerGap(648, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DailyResBtn)
                    .addComponent(TableReportBtn)
                    .addComponent(CusReportBtn))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1170, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        CusDetailsBtn.setBackground(new java.awt.Color(0, 0, 0));
        CusDetailsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CusDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        CusDetailsBtn.setText("View Customer Details");
        CusDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusDetailsBtnActionPerformed(evt);
            }
        });

        ResDetailsBtn.setBackground(new java.awt.Color(0, 0, 0));
        ResDetailsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ResDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ResDetailsBtn.setText("View Reservation Details");
        ResDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResDetailsBtnActionPerformed(evt);
            }
        });

        TableDetailsBtn.setBackground(new java.awt.Color(0, 0, 0));
        TableDetailsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TableDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        TableDetailsBtn.setText("View Table Details");
        TableDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CusDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(TableDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CusDetailsBtn)
                .addGap(39, 39, 39)
                .addComponent(ResDetailsBtn)
                .addGap(39, 39, 39)
                .addComponent(TableDetailsBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 300, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResturantTableReservationSystem/Images/b.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

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

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        CustomerLogin x = new CustomerLogin();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void CusDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusDetailsBtnActionPerformed
        new CustomerDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CusDetailsBtnActionPerformed

    private void ResDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResDetailsBtnActionPerformed
        new ViewReservationDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ResDetailsBtnActionPerformed

    private void TableDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableDetailsBtnActionPerformed
        new TableDetailsView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TableDetailsBtnActionPerformed

    private void CusReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusReportBtnActionPerformed
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Customer list Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
            
            try{
                
                AdministratorController.getCustomerDetailsReport();
                
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(5);
                
                myDocument.open();
                
                float[] columnWidths = new float[] {8,10,8,15,8};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                myDocument.add(new Paragraph("Customer List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                
                table.addCell(new PdfPCell(new Paragraph("Customer ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("NIC",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("ContactNO",FontFactory.getFont(FontFactory.TIMES_ROMAN,13,Font.BOLD))));
                
                while(AdministratorController.rsRep.next()){
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    
                }
                
                myDocument.add(table);
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Generated on "+currentDate+" at "+formattedTime,FontFactory.getFont(FontFactory.TIMES_BOLD,8,Font.PLAIN)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                myDocument.close();
        
                JOptionPane.showMessageDialog(null, "Report ws successfully generated!");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{

                AdministratorController.rsRep.close();
                AdministratorController.pstRep.close();
                }catch(Exception e){

                }
            }
        }
    }//GEN-LAST:event_CusReportBtnActionPerformed

    private void DailyResBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyResBtnActionPerformed
        new GenerateDailyReservationReport().setVisible(true);

    }//GEN-LAST:event_DailyResBtnActionPerformed

    private void TableReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableReportBtnActionPerformed
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Table Details Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
            
            try{
                
                AdministratorController.getTableDetailsReport();
                
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(3);
                
                myDocument.open();
                
                float[] columnWidths = new float[] {8,10,8};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                myDocument.add(new Paragraph("Table List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                
                table.addCell(new PdfPCell(new Paragraph("Table ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("No of Seats",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Charges per Hour",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                
                
                while(AdministratorController.rsRep.next()){
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)))); 
                }
                
                myDocument.add(table);
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Generated on "+currentDate+" at "+formattedTime,FontFactory.getFont(FontFactory.TIMES_BOLD,8,Font.PLAIN)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                myDocument.close();
        
                JOptionPane.showMessageDialog(null, "Report ws successfully generated!");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally{
                try{

                AdministratorController.rsRep.close();
                AdministratorController.pstRep.close();
                }catch(Exception e){

                }
            }
        }
        
    }//GEN-LAST:event_TableReportBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CusDetailsBtn;
    private javax.swing.JButton CusReportBtn;
    private javax.swing.JButton DailyResBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ResDetailsBtn;
    private javax.swing.JButton TableDetailsBtn;
    private javax.swing.JButton TableReportBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}

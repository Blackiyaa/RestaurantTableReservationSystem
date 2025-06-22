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

public class GenerateDailyReservationReport extends javax.swing.JFrame {

    public GenerateDailyReservationReport() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GenDailyResBtn = new javax.swing.JButton();
        DatePick = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        GenDailyResBtn.setBackground(new java.awt.Color(0, 102, 102));
        GenDailyResBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GenDailyResBtn.setForeground(new java.awt.Color(255, 255, 255));
        GenDailyResBtn.setText("Generate Daily Reservation Report");
        GenDailyResBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenDailyResBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(GenDailyResBtn)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatePick, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(DatePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(GenDailyResBtn)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenDailyResBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenDailyResBtnActionPerformed
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        LocalDate givenDate = DatePick.getDate();
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Daily Reservation list Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
            
            try{
                
                AdministratorController.getDailyReservationDetailsReport(givenDate);
                
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(8);
                
                myDocument.open();
                
                float[] columnWidths = new float[] {8,10,8,15,8,8,8,8};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100);
                
                myDocument.add(new Paragraph("Reservations made on "+givenDate,FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                
                table.addCell(new PdfPCell(new Paragraph("Reservation ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Customer ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Table ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Reservation Type",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Start Date",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Start Time",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("End Time",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("End Date",FontFactory.getFont(FontFactory.TIMES_ROMAN,11,Font.BOLD))));
                
                while(AdministratorController.rsRep.next()){
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(AdministratorController.rsRep.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                }
                
                myDocument.add(table);
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Generated on "+currentDate+" at "+formattedTime,FontFactory.getFont(FontFactory.TIMES_BOLD,8,Font.PLAIN)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------"));
                myDocument.close();
        
                JOptionPane.showMessageDialog(null, "Report ws successfully generated!");
                this.dispose();
                
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
    }//GEN-LAST:event_GenDailyResBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateDailyReservationReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker DatePick;
    private javax.swing.JButton GenDailyResBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

package Controller;

import Model.Table;
import Model.Reservation;
import DatabaseConnection.DBConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

public class AdministratorController {
    
    public static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static int count=0;
    public static ResultSet rsRep = null;
    public static PreparedStatement pstRep = null;
    public static ResultSet rsLoad = null;
    public static PreparedStatement pstLoad = null;
    public static ResultSet rsD = null;
    public static PreparedStatement pstD = null;
    
    public static void viewCustomerDetails(){
        
        String sql = "SELECT * FROM Customer";
        
        conn = DBConnection.java_db();
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void deleteCustomer(String id){
        
        String sql = "DELETE FROM Customer WHERE cusID ='"+id+"' ";

        conn = DBConnection.java_db();

        try{
            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Succesfully deleted the record");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{

                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
     
    }
    
    
    public static void searchCustomer(String search){
        
        String sql = "SELECT * FROM Customer WHERE cusID ='"+search+"' OR Name LIKE '%"+search+"%' ";

        conn = DBConnection.java_db();

        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();


        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    //table Control
    
    public static void addTable(Table table){
        String tid = table.gettID();
        int noOfSeats = table.getNoOfSeats();
        double charges = table.getCharges();
        
        String sql = "INSERT INTO ResturantTables (tableID,NoOfSeats,ChargesPerHour) VALUES ('"+tid+"','"+noOfSeats+"','"+charges+"')";
        
        try{
            
            Statement s = DBConnection.java_db().createStatement();
            s.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Details Entered successfully!");
               
            s.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "This table is already exist");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
     public static void viewTableDetails(){
        
        String sql = "SELECT * FROM ResturantTables";
        
        conn = DBConnection.java_db();
        
        try{
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static Table searchTable(String tid){
        
        Table table=null;
        
        String sql = "SELECT * FROM ResturantTables WHERE tableID='"+tid+"'";
        
        conn = DBConnection.java_db();
        
        try{
        
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            table = new Table();
            
            table.settID(rs.getString("tableID"));
            table.setNoOfSeats(rs.getInt("NoOfSeats"));
            table.setCharges(rs.getDouble("ChargesPerHour"));
            
            rs.close();
            pst.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return table;
    } 
     
    public static void deleteTable(String tid){
        
        String sql = "DELETE FROM ResturantTables WHERE tableID ='"+tid+"' ";
    
        conn = DBConnection.java_db();
        
        try{
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Succesfully deleted the record");
            
            pst.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static void updateTable(String tid,int noOfSeats,double charges){
    
        String sql = "UPDATE ResturantTables SET NoOfSeats='"+noOfSeats+"',ChargesPerHour='"+charges+"' Where tableID='"+tid+"'";
    
        conn = DBConnection.java_db();
        
        try{
        
            pst=conn.prepareStatement(sql);
            
            pst.executeUpdate();
            
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Your Details Updated!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void getCustomerDetailsReport(){
        
        String sql = "SELECT * FROM Customer";
    
        conn = DBConnection.java_db();
        
        try{
        
            pstRep=conn.prepareStatement(sql);
            
            rsRep = pstRep.executeQuery();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    public static void getDailyReservationDetailsReport(LocalDate givenDate){
        
        String sql = "SELECT ReservationID,CustomerID,TableID,ReservationType,StartDate,StartTime,EndTime,EndDate FROM Reservation WHERE ReservationDate='"+givenDate+"'";
    
        conn = DBConnection.java_db();
        
        try{
        
            pstRep=conn.prepareStatement(sql);
            
            rsRep = pstRep.executeQuery();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    public static void getTableDetailsReport(){
        
        String sql = "SELECT * FROM ResturantTables";
    
        conn = DBConnection.java_db();
        
        try{
        
            pstRep=conn.prepareStatement(sql);
            
            rsRep = pstRep.executeQuery();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
    //For reservation
    
    public static void viewUpcomingReservatonDetails(){
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        String sql = "SELECT * FROM Reservation " +
                     "WHERE (EndDate > '" + currentDate + "') " +
                     "OR (EndDate = '" + currentDate + "' AND EndTime > '" + currentTime + "')";        
        conn = DBConnection.java_db();
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
  
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void viewOldReservatonDetails(){
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        String sql = "SELECT * FROM Reservation "+
                     "WHERE (EndDate < '"+currentDate+"') " +
                     "OR (EndDate = '"+currentDate+"' AND EndTime<'"+currentTime+"')";
        
        conn = DBConnection.java_db();
        
        try{
            pstLoad = conn.prepareStatement(sql);
            rsLoad = pstLoad.executeQuery();
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void CancelResevation(String rid){
        
        String sql = "DELETE FROM Reservation WHERE ReservationID ='"+rid+"' ";

        conn = DBConnection.java_db();

        try{
            pstD = conn.prepareStatement(sql);
            pstD.execute();

            JOptionPane.showMessageDialog(null, "Succesfully cancelled your reservation!");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{

                
                pstD.close();
            }catch(Exception e){

            }
        }
     
    }
    
    public static void insertReservationForSingleBooking(Reservation reservation){
        int cusid = reservation.getCustomerID();
        String tid = reservation.getTableID();
        String rType = reservation.getReservationType();
        LocalDate startDate = reservation.getStartDate();
        LocalTime startTime = reservation.getStartTime();
        LocalTime endTime = reservation.getEndTime();
        LocalDate currentDate = LocalDate.now();
        
        String sql = "INSERT INTO Reservation (CustomerID,TableID,ReservationType,StartDate,StartTime,EndTime,EndDate,ReservationDate) VALUES ('"+cusid+"','"+tid+"','"+rType+"','"+startDate+"','"+startTime+"','"+endTime+"','"+startDate+"','"+currentDate+"')";
        
        try{
            
            Statement s = DBConnection.java_db().createStatement();
            s.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Table Reserved Successfully! \n Download Your Reservation Slip from View Reservation Details Page");
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void insertReservationForContinousBooking(Reservation reservation){
        int cusid = reservation.getCustomerID();
        String tid = reservation.getTableID();
        String rType = reservation.getReservationType();
        LocalDate startDate = reservation.getStartDate();
        LocalTime startTime = reservation.getStartTime();
        LocalTime endTime = reservation.getEndTime();
        LocalDate endDate = reservation.getEndDate();
        LocalDate currentDate = LocalDate.now();
        
        String sql = "INSERT INTO Reservation (CustomerID,TableID,ReservationType,StartDate,StartTime,EndTime,EndDate,ReservationDate) VALUES ('"+cusid+"','"+tid+"','"+rType+"','"+startDate+"','"+startTime+"','"+endTime+"','"+endDate+"','"+currentDate+"')";
        
        try{
            
            Statement s = DBConnection.java_db().createStatement();
            s.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Table Reserved Successfully! \n Download Your Reservation Slip from View Reservation Details Page Page");
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public static void insertReservationForSpecificBooking(Reservation reservation,LocalDate specDate){
        int cusid = reservation.getCustomerID();
        String tid = reservation.getTableID();
        String rType = reservation.getReservationType();
        LocalTime startTime = reservation.getStartTime();
        LocalTime endTime = reservation.getEndTime();
        LocalDate currentDate = LocalDate.now();
        
        
        String sql = "INSERT INTO Reservation (CustomerID,TableID,ReservationType,StartDate,StartTime,EndTime,EndDate,ReservationDate) VALUES ('"+cusid+"','"+tid+"','"+rType+"','"+specDate+"','"+startTime+"','"+endTime+"','"+specDate+"','"+currentDate+"')";
        
        try{
            
            Statement s = DBConnection.java_db().createStatement();
            s.executeUpdate(sql);
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}

package Controller;

import Model.Reservation;
import Model.Customer;
import DatabaseConnection.DBConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class CustomerController {
    
    static Connection conn = null;
    static ResultSet rs = null;
    static PreparedStatement pst = null;
    public static ResultSet rsD = null;
    public static PreparedStatement pstD = null;
    public static int count=0;
    
    
    //Customer Details Control
    public static String getName(){
        String name="";
        
        String sql = "SELECT Name FROM Customer WHERE CusID = '"+Customer.id+"'";
        
        conn = DBConnection.java_db();
        
        try{
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while(rs.next()){
                name = rs.getString(1);
            }

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{

                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
        return name;
    }
    
    
    public static void Customerlogin(String email,String password){
        String sql = "select cusID,Email,Password from Customer where (Email = ? and Password = ?)";
        
        conn = DBConnection.java_db();
        
        try{
            pst = conn.prepareStatement(sql);

            pst.setString(1, email);
            pst.setString(2, password);

            rs = pst.executeQuery();

            while(rs.next()){
                int id = rs.getInt(1);
                Customer.id = id;
                count=1;
            }

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{

                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }
    }
    
    public static void insertCustomer(Customer customer){
        String name = customer.getName();
        String nic = customer.getNic();
        String email = customer.getEmail();
        String contact = customer.getContactNo();
        String password = customer.getPassword();
        
        String sql = "INSERT INTO Customer (Name,NIC,Email,ContactNO,Password) VALUES ('"+name+"','"+nic+"','"+email+"','"+contact+"','"+password+"')";
        
        try{
            
            Statement s = DBConnection.java_db().createStatement();
            s.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Your Account Created.Login Now!");
               
            s.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static Customer viewCustomerDetails(){
        
        Customer customer=null;
        
        int id = Customer.id;
        
        String sql = "SELECT * FROM Customer WHERE cusID='"+id+"'";
        
        try{
        
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            customer = new Customer();
            
            customer.setId(rs.getInt("cusID"));
            customer.setName(rs.getString("Name"));
            customer.setNic(rs.getString("NIC"));
            customer.setEmail(rs.getString("Email"));
            customer.setContactNo(rs.getString("ContactNO"));
            customer.setPassword(rs.getString("Password"));
            
            rs.close();
            pst.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return customer;
    }

    public static void updateCustomer(String name,String nic,String email,String contact,String password){
    
        int id = Customer.id;
        String sql = "UPDATE Customer SET Name='"+name+"',NIC='"+nic+"',Email='"+email+"',ContactNO='"+contact+"',Password='"+password+"' Where cusID='"+id+"'";
    
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

    //Reservation Controls
    
    
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
            
            JOptionPane.showMessageDialog(null, "Table Reserved Successfully! \n Download Your Reservation Slip from My Reservations Page");
               
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
            
            JOptionPane.showMessageDialog(null, "Table Reserved Successfully! \n Download Your Reservation Slip from My Reservations Page");
               
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
    
    //for reservation page
    
    public static void viewTableDetails(){
        
        String sql = "SELECT * FROM ResturantTables";
        
        conn = DBConnection.java_db();
        
        try{
            
            pstD = conn.prepareStatement(sql);
            rsD = pstD.executeQuery();
            
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static void viewReservationDetails(){
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        String sql = "SELECT TableID,StartDate,StartTime,EndTime,EndDate FROM Reservation "+
                     "WHERE EndDate > '" + currentDate + "' " +
                     "OR (EndDate = '" + currentDate + "' AND EndTime > '" + currentTime + "')"; 
        conn = DBConnection.java_db();
        
        try{
            
            pstD = conn.prepareStatement(sql);
            rsD = pstD.executeQuery();
            
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    
}

package Controller;

import Model.Customer;
import DatabaseConnection.DBConnection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservationController {
    
    static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static ResultSet rsLoad = null;
    public static PreparedStatement pstLoad = null;
    public static ResultSet rsPri = null;
    public static PreparedStatement pstPri = null;
    
    public static ResultSet rsCombo = null;
    public static PreparedStatement pstCombo = null;
    
    public static int notDate = 0;
    
    
    public static boolean checkStartTimeWithEndTime(LocalTime startTime, LocalTime endTime){
    
        boolean checkTime=true;
        
        if(endTime.isBefore(startTime)){
            checkTime = false;
        }
        
        return checkTime;
    }   
    
    public static boolean checkStartDateWithEndDate(LocalDate startDate, LocalDate endDate){
    
        boolean checkDate=true;
        
        if(endDate.isBefore(startDate)){
            checkDate = false;
        }
        
        return checkDate;
    }
    
    public static boolean checkEqualityStartDateWithEndDate(LocalDate startDate, LocalDate endDate){
    
        boolean checkDate=true;
        
        if(startDate.equals(endDate)){
            checkDate = false;
        }
        
        return checkDate;
    }
    
    
    public static List<LocalDate> getSpecificDays(LocalDate startDate, LocalDate endDate, List<DayOfWeek> selectedDays){
        
        List<LocalDate> specificDays = new ArrayList<>();

        //ReservationController.notDate=0;
        
        LocalDate sDate = startDate;
        while (!sDate.isAfter(endDate)) {
            if (selectedDays.contains(sDate.getDayOfWeek())) {
                specificDays.add(sDate);
            }/*else{
                notDate=1;
                break;
            }*/
            sDate = sDate.plusDays(1);
        }

        return specificDays;
    
    }
    
    public static boolean checkEqualityDateWithCurrentDate(LocalDate startDate, LocalDate endDate){
    
        boolean checkDate=true;
        
        LocalDate currentDate = LocalDate.now();
        
        if(startDate.isBefore(currentDate)||endDate.isBefore(currentDate)){
            checkDate = false;
        }
        
        return checkDate;
    }
    
    public static boolean checkEqualityDateWithCurrentTime(LocalDate startDate, LocalTime startTime, LocalTime endTime){
    
        boolean checkTime=true;
        
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        
        if(startDate.equals(currentDate)){
            if(startTime.isBefore(currentTime)||endTime.isBefore(currentTime)){
                checkTime = false;
            }
        }
        return checkTime;
    }
    
    
    public static void viewUpcomingReservatonDetails(){
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        String sql = "SELECT ReservationID,TableID,ReservationType,StartDate,StartTime,EndTime,EndDate FROM Reservation " +
                    "WHERE CustomerID = '" + Customer.id + "' " +
                    "AND (EndDate > '" + currentDate + "' " +
                    "OR (EndDate = '" + currentDate + "' AND EndTime > '" + currentTime + "'))";        
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
        
        String sql = "SELECT ReservationID,TableID,ReservationType,StartDate,StartTime,EndTime,EndDate FROM Reservation "+
                     "WHERE CustomerID = '"+Customer.id+"' "+
                     "AND (EndDate < '"+currentDate+"') " +
                     "OR (EndDate = '"+currentDate+"' AND EndTime<'"+currentTime+"')";
        
        conn = DBConnection.java_db();
        
        try{
            pstLoad = conn.prepareStatement(sql);
            rsLoad = pstLoad.executeQuery();
            
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    //for booking slip
    public static int getCountBetweenDays(LocalDate startDate, LocalDate endDate){
        
        int count =0;

        LocalDate sDate = startDate;
        while (!sDate.isAfter(endDate)) {
            count++;
            sDate = sDate.plusDays(1);
        }

        return count;
    
    }
    
    public static int getCountBetweenTime(int startTime, int endTime){
        
        int count =0;

        count = endTime - startTime;
        
        return count;
    
    }
    
    public static double getTablePrice(String tid){
    
        double chargesPerHour=0.0;
        
        String sql = "SELECT ChargesPerHour FROM ResturantTables WHERE tableID = '"+tid+"'";
        conn = DBConnection.java_db();
        
        try{
            pstPri = conn.prepareStatement(sql);
            rsPri = pstPri.executeQuery();
            
            if(rsPri.next()){
                chargesPerHour = rsPri.getDouble("ChargesPerHour");
            }else{
                JOptionPane.showMessageDialog(null, "No charges per hour found for tableID: " + tid);
            }
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                rsPri.close();
                pstPri.close();
                
            }catch(Exception e){
            
            }
        
        }
        return chargesPerHour;
    }
    

    public static void getTableAvailiableSingleBooking(LocalDate startDate, LocalTime startTime, LocalTime endTime, LocalDate endDate){
        
        String sql ="SELECT tableID " +
                    "FROM ResturantTables " +
                    "WHERE tableID NOT IN (" +
                    "SELECT DISTINCT r.TableID " +
                    "FROM Reservation r " +
                    "WHERE (r.StartDate <= '" + startDate + "' AND r.EndDate >= '" + endDate + "') " +
                    "AND ((" +
                        "(r.StartTime <= '" + startTime + "' AND r.EndTime > '" + startTime + "') OR " +
                        "(r.StartTime < '" + endTime + "' AND r.EndTime >= '" + endTime + "') OR " +
                        "(r.StartTime >= '" + startTime + "' AND r.EndTime <= '" + endTime + "')" +
                    "))" +
                    ")";
                
        conn = DBConnection.java_db();
        
        try{
            pstCombo = conn.prepareStatement(sql);
            
            rsCombo = pstCombo.executeQuery();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    
    public static void getTableAvailiableContinousBooking(LocalDate startDate, LocalTime startTime, LocalTime endTime, LocalDate endDate){
        
        String sql ="SELECT tableID " +
                    "FROM ResturantTables " +
                    "WHERE tableID NOT IN (" +
                    "SELECT DISTINCT r.TableID " +
                    "FROM Reservation r " +
                    "WHERE ("+
                           "(r.StartDate <= '" + startDate + "' AND r.EndDate > '" + startDate + "') OR " +
                           "(r.StartDate < '"+endDate+"' AND r.EndDate >= '"+endDate+"') OR " +
                           "(r.StartDate >= '"+startDate+"' AND r.EndDate <= '"+endDate+"')" +
                           ")"+
                    "AND ((" +
                        "(r.StartTime <= '" + startTime + "' AND r.EndTime > '" + startTime + "') OR " +
                        "(r.StartTime < '" + endTime + "' AND r.EndTime >= '" + endTime + "') OR " +
                        "(r.StartTime >= '" + startTime + "' AND r.EndTime <= '" + endTime + "')" +
                    "))" +
                    ")";
                
        conn = DBConnection.java_db();
        
        try{
            pstCombo = conn.prepareStatement(sql);
            
            rsCombo = pstCombo.executeQuery();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static List<String> getTableAvailiableSpecificDaysBooking(LocalDate startDate, LocalTime startTime, LocalTime endTime, LocalDate endDate){
        List<String> availableTables = new ArrayList<>();
        
        String sql ="SELECT DISTINCT tableID " +
                    "FROM ResturantTables " +
                    "WHERE tableID NOT IN (" +
                    "SELECT DISTINCT r.TableID " +
                    "FROM Reservation r " +
                    "WHERE ("+
                           "(r.StartDate <= '" + startDate + "' AND r.EndDate > '" + startDate + "') OR " +
                           "(r.StartDate < '"+endDate+"' AND r.EndDate >= '"+endDate+"') OR " +
                           "(r.StartDate >= '"+startDate+"' AND r.EndDate <= '"+endDate+"')" +
                           ")"+
                    "AND ((" +
                        "(r.StartTime <= '" + startTime + "' AND r.EndTime > '" + startTime + "') OR " +
                        "(r.StartTime < '" + endTime + "' AND r.EndTime >= '" + endTime + "') OR " +
                        "(r.StartTime >= '" + startTime + "' AND r.EndTime <= '" + endTime + "')" +
                    "))" +
                    ")";
                
        conn = DBConnection.java_db();
        
        try{
            pstCombo = conn.prepareStatement(sql);
                     
            rsCombo = pstCombo.executeQuery();
            
            while(rsCombo.next()){
                availableTables.add(rsCombo.getString("tableID"));
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     
        return availableTables;
    }
}

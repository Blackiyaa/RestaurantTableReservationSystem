package Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Reservation {
    
    private int ReservationID;
    private int customerID;
    private String tableID;
    private String reservationType;
    private LocalDate startDate;
    private LocalTime startTime; 
    private LocalTime endTime;
    private LocalDate endDate;
    private List<LocalDate> specificDays;
    
    
    public int getReservationID() {
        return ReservationID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getTableID() {
        return tableID;
    }

    public String getReservationType() {
        return reservationType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setSpecificDays(List<LocalDate> specificDays) {
        this.specificDays = specificDays;
    }

    public List<LocalDate> getSpecificDays() {
        return specificDays;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Reservation(int ReservationID, int customerID, String tableID, String reservationType, LocalDate startDate, LocalTime startTime, LocalTime endTime, LocalDate endDate, List<LocalDate> specificDays) {
        this.ReservationID = ReservationID;
        this.customerID = customerID;
        this.tableID = tableID;
        this.reservationType = reservationType;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.endDate = endDate;
        this.specificDays = specificDays;
    }

    public Reservation(int customerID, String tableID, String reservationType, LocalDate startDate, LocalTime startTime, LocalTime endTime, LocalDate endDate) {
        this.customerID = customerID;
        this.tableID = tableID;
        this.reservationType = reservationType;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.endDate = endDate;
    }

    public Reservation(int customerID, String tableID, String reservationType, LocalDate startDate, LocalTime startTime, LocalTime endTime) {
        this.customerID = customerID;
        this.tableID = tableID;
        this.reservationType = reservationType;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Reservation(int customerID, String tableID, String reservationType, LocalDate startDate, LocalTime startTime, LocalTime endTime, LocalDate endDate, List<LocalDate> specificDays) {
        this.customerID = customerID;
        this.tableID = tableID;
        this.reservationType = reservationType;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.endDate = endDate;
        this.specificDays = specificDays;
    }

    public Reservation() {
    }
    
    
}

package Model;

public class Table {

    private String tID;
    private int noOfSeats;
    private double charges;

    public Table(String tID, int noOfSeats, double charges) {
        this.tID = tID;
        this.noOfSeats = noOfSeats;
        this.charges = charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public double getCharges() {
        return charges;
    }

    public String gettID() {
        return tID;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void settID(String tID) {
        this.tID = tID;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Table(String tID, int noOfSeats) {
        this.tID = tID;
        this.noOfSeats = noOfSeats;
    }

    public Table() {
        this("",0);
    }
    
    
    
}

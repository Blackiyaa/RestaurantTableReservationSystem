package DatabaseConnection;

import java.sql.*;
import javax.swing.*;

public class DBConnection {
    
    public static Connection java_db(){
        String url = "jdbc:sqlite:C:\\Users\\DELL\\Desktop\\AS2022432\\AS2022432_ResturantTableReservationSystem\\ResturantTableReservationSystem.db";
        Connection conn = null;
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            return conn;
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                return null;
        }
        
    }
}

package atu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Patient {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager
        String URL = "jdbc:mysql://localhost:3306/patient";
        String USER = "root";
        String PASSWORD = "password";
        conn = DriverManager.getConnection(URL, USER, PASSWORD)


        try (Connection conn = DriverManager.getConnection("url""password")) ;  //?????
        System.out.println("Connected to Database");
    }catch(SQLException e){
        e.printStackTrace();
    }
       // close connection = conn.close;   ******Dont forget to close*********
}
//  System.out.println("Hello world!");
package atu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager
        String URL = "jdbc:mysql://localhost:3306/patient";
        String USER = "root";
        String PASSWORD = "password";
        conn = DriverManager.getConnection(URL, USER, PASSWORD)


        try (Connection conn = DriverManager.getConnection("url" "password")) ;  // user missing?????
        System.out.println("Connected to Database");
    }catch(SQLException e){
        System.out.println("Error Database connection not established");
        e.printStackTrace();
        }

    public String PatientInsertSQL() {
        Scanner
                PatientInsertSQL = "INSERT INTO Patient Given Name Values('" + name + "')";
    }
        void setPatientInsert(Object PatientInsertSQL){
        try (Connection conn = DriverManager.getConnection("url" "password")) ;
            PatientInsertSQL = "INSERT INTO Patient Given Name Values('" + name + "')";

        }
       // close connection = conn.close;   ******Dont forget to close*********
}
//  System.out.println("Hello world!");
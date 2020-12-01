/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

/**
 *
 * @author Dipendra
 */
import java.sql.*;
public class DbConnection {
    private static final String username = "root";
    private static final String password = "";
    private static final String conn_string = "jdbc:mysql://localhost:3306/sisdb";
    
    Connection getConnection(){
    Connection conn = null;
    try{
      conn = DriverManager.getConnection(conn_string,username,password);
      System.out.println("Connected");
     }catch(SQLException ex){
       System.out.println(ex.getMessage());
     }
    return conn;
    }
    
}

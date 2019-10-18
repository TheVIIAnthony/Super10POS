/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esecuele;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class conexion {
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/store?useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    public static Connection con;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}

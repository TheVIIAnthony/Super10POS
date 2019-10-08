/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super10.pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    static Connection conn = null;
    public static Connection getConexion(){
    try {
        String url = "jdbc:sqlite:StoreDB.db";
        conn = (Connection)DriverManager.getConnection(url);
        System.out.println("Conexion Correcta");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void MetodoCierreConexion(){
        
        try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    }
}

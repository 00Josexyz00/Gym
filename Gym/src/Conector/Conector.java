package Conector;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conector {

    static Connection contacto = null;

    public static Connection getConexion() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=gimnasio";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        try {
            contacto= DriverManager.getConnection(url,"jose","123");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
        }
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;  
    }
    
    }

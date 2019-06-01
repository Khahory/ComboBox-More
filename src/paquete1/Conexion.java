package paquete1;

import java.sql.*;

public class Conexion {
    Connection cn;

    public Connection conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/a", "root", "");
            System.out.println("La conexion se realizo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }

}
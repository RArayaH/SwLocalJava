package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo Araya
 */
public class Conexion {
    
    public static String bd = "prod1";
    public static String login = "root";
    public static String pass = "";
    
    public static String url = "jdbc:mysql://localhost:3306/"+bd;
    public static Connection conn;
    public static Statement sentencia;
        
    public static boolean buscarProducto;
    
    public static void conectar(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, pass);
            if (conn != null) {
                System.out.println("Conexion establecida con "+bd);
            }
        } catch (SQLException e) {
            System.out.println("Hubo un problema al conectar");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
    
    public static void desconectar() throws SQLException{
        conn.close();
    }
    
}

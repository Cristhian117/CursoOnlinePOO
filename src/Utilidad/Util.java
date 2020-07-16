
package Utilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CristhianPC
 */
public class Util {
    
     public static Connection conn = null;

    //laptop
    public static final String url= "jdbc:postgresql://localhost:5432/datos" ;
    public static final String user= "postgres";
    public static final String password = "1234";
    //public static final String password = "uaf1234";
    //public static final String user= "usrgmcit_uaf";
    //public static final String password = "Uaf091410sbc";
    
    public  Connection getConnection(){
        conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password );
            //JOptionPane.showMessageDialog(null, "Conexion correcta");
            System.out.println("Conexion Exitosa");
        }
        catch (Exception exc){
            //JOptionPane.showMessageDialog(null, "Conexion incorrecta");
            System.out.println("Conexion Fallida");
        }
        return conn;
    }
    
    public void closeConnection(){
        try{
            if(conn!=null){
                conn.close();
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }  
}

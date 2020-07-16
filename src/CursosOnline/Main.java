
package CursosOnline;

import CursosDAO.CursoDAO;
import CursosDAOimpl.CursoDAOImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Entidades.Curso;
import java.util.List;


/**
 *
 * @author CristhianPC
 */
public class Main{

  static String url ="jdbc:postgresql://localhost/datos";
  static String user ="postgres";
  static String password ="1234";
  
    public static void main(String[] args)   throws SQLException {
     

    Connection conn;
      
           try {
               Class.forName("org.postgresql.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       conn = DriverManager.getConnection(url,user,password); //conectar base de datos
       System.out.println("Conexion Exitosa");
       
       String sql = "SELECT id_curso,nombre FROM public.curso;";
       
       PreparedStatement stm = conn.prepareStatement(sql);
       
       ResultSet rs = stm.executeQuery();
       
       while(rs.next()){
           System.out.println(rs.getInt(1)+ "" + rs.getString(2));
       }
       
       //Statement stm = conn.createStatement();   
       }
}

 



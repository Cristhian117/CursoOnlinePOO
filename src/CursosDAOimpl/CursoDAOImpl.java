
package CursosDAOimpl;

import CursosOnline.Main;
import CursosDAO.CursoDAO;
import Entidades.Curso;
import Utilidad.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CristhianPC
 */
public class CursoDAOImpl implements CursoDAO{

   
    @Override
    public ArrayList<Curso> getId_curso(){
        ArrayList<Curso> cursoC = new ArrayList<>();
               Curso curso;
      
           try {
         
               Conexion coneccion = new Conexion();
               Connection conn = null;
               conn = coneccion.getConeccion(conn);
               String sqlmostrar = "Select * From Curso";
               
               Statement st = conn.createStatement();
               ResultSet rs = st.executeQuery(sqlmostrar);
               while(rs.xet()){
                   curso = new Curso();
                   curso.setId_Curso(rs.getInt(1));
                   curso.setNombre(rs.getString(2));
                   cursoC.add(curso);
               }
               
    @Override
    public void newCursos(Curso curso){
             try {
         
               Conexion coneccion = new Conexion();
               Connection conn = null;
               conn = coneccion.getConeccion(conn);
               String sqlinsertar = "Insert into Curso(id, nombre) values (?,?)";
               
               PrepareStatement psta = conn.PrepareStatement(sqlinsertar);
               psta.setInt(1, curso.getId_curso());
               psta.setString(2, curso.getNombre());
               psta.execute();
               conn.commit();
               psta.close();
               
             }  catch (SQLException e){
                 JoptionPane.showMessageDialog(null, "Error: " + e);
             } 
           }          
               
    @Override
    public void updateCursos(Curso curso){
             try {
         
               Conexion coneccion = new Conexion();
               Connection conn = null;
               conn = coneccion.getConeccion(conn);
               String sqlinsertar = "Actualizar Curso set nombre=? where id=?;      
               PrepareStatement psta = conn.PrepareStatement(sqlinsertar);
               psta.setString curso.getNombre
               psta.setId_Curso, curso.getId_curso);
               psta.execute();
               conn.commit();
               psta.close();
               
             }  catch (SQLException e){
                 JoptionPane.showMessageDialog(null, "Error: " + e);
             } 
           }         
               
    @Override
    public void deletecursos(int id){
             try {
         
               Conexion coneccion = new Conexion();
               Connection conn = null;
               conn = coneccion.getConeccion(conn);
               String sqlinsertar = "delete From Cursos where id=?";
               PrepareStatement psta = conn.PrepareStatement(sqlinsertar);
               psta.setInt(1, id);
               psta.execute();
               conn.commit();
               psta.close();
               
             }  catch (SQLException e){
                 JoptionPane.showMessageDialog(null, "Error: " + e);
             } 
           }        
           
}
    

  


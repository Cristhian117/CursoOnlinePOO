
package Entidades;

/**
 *
 * @author CristhianPC
 */
public class Curso {

    private int id_curso;
    private int nombre;

    public Curso(int id_curso, int nombre) {
        this.id_curso = id_curso;
        this.nombre = nombre;
    }

    public Curso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}

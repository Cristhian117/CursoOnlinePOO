
package CursosDAO;


import Entidades.Curso;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CristhianPC
 */
public class CursoDAO {

     private ArrayList<Curso> cursoC = new ArrayList<>();

    public CursoDAO() {
        Curso c = new Curso();
        c.setId_curso(1);
        c.setNombre("");
        
        cursoC.add(c);
    }
    
    
    public void Insertar(Curso c){
        cursoC.add(c);
    }
    
    public Curso Consultar(Curso cs){
        Curso c = null;
        int i = 0;
        for(Curso crs: cursoC){
            if(crs.getId_curso()==cs.getId_curso()){
                c=crs;
            }
        }
        return c;
    }
    
    public ArrayList<Curso> Listar(){
        return cursoC;
    }
}

    
    


package libreria.interfaces;

import java.util.ArrayList;
import libreria.constructor.Editorial;

public interface IEditorialLogica {
  
  public void guardarEditorial ( Editorial editorial );
  
  public void actualizarEditorial ( Editorial editorial );
  
  public void eliminarEditorial ( int id );
  
  public Editorial consultarEditorialPorId ( int id );
  
  public Editorial consultarEditorialPorNombre ( String nombre );
  
  public ArrayList<Editorial> listadoEditoriales ( );
  
}

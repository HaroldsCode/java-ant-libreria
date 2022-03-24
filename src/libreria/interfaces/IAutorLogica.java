
package libreria.interfaces;

import java.util.ArrayList;
import libreria.constructor.Autor;

public interface IAutorLogica {
  
  public void guardarAutor ( Autor autor );
  
  public void actualizarAutor ( Autor autor );
  
  public void eliminarAutor ( int id );
  
  public Autor consultarAutorPorId ( int id );
  
  public Autor consultarAutorPorNombre ( String nombre );
  
  public ArrayList<Autor> listadoAutores ( );
  
}

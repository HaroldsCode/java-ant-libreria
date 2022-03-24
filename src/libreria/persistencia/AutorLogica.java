package libreria.persistencia;

import java.util.ArrayList;
import libreria.constructor.Autor;
import libreria.interfaces.IAutorLogica;

public class AutorLogica implements IAutorLogica {
  
  private static int contador = 102;
  private ArrayList<Autor> dato;

  public AutorLogica() {
    dato = new ArrayList<>();
    
    dato.add( new Autor( 100, "Sun Tzu" ) );
    dato.add( new Autor( 101, "Ross MacDonald" ) );
  }

  @Override
  public void guardarAutor(Autor autor) {
    autor.setId( contador );
    dato.add(autor);
    contador++;
  }

  @Override
  public void actualizarAutor(Autor autor) {
    for ( Autor autorEditar : dato ) {
      if ( autor.getId() == autorEditar.getId() ) {
        autorEditar.setNombre( autor.getNombre() );
      }
    }
  }

  @Override
  public void eliminarAutor(int id) {
    ArrayList<Autor> temporal = new ArrayList<>();
    for ( Autor autor : dato ) {
      if ( autor.getId() != id ) {
        temporal.add(autor);
      }
    }
    dato.clear();
    dato.addAll(temporal);
  }

  @Override
  public Autor consultarAutorPorId(int id) {
    Autor resultado = new Autor();
    for ( Autor autor : dato ) {
      if ( autor.getId() == id ) {
        resultado = new Autor ( autor.getId(), autor.getNombre() );
      }
    }
    return resultado;
  }

  @Override
  public Autor consultarAutorPorNombre(String nombre) {
    Autor respuesta = new Autor();
    for ( Autor autor : dato ) {
      if ( autor.getNombre().equals(nombre) ) {
        respuesta = new Autor( autor.getId(), autor.getNombre() );
      }
    }
    return respuesta;
  }

  @Override
  public ArrayList<Autor> listadoAutores() {
    return dato;
  }
  
}

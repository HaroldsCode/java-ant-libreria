package libreria.persistencia;

import java.util.ArrayList;
import libreria.constructor.Editorial;
import libreria.interfaces.IEditorialLogica;

public class EditorialLogica implements IEditorialLogica {

  private static int contador = 102;
  private ArrayList<Editorial> dato;

  public EditorialLogica() {
    dato = new ArrayList<>();
    dato.add( new Editorial( 100, "DoJo" ) );
    dato.add( new Editorial( 101, "RBA" ) );
  }
  
  @Override
  public void guardarEditorial(Editorial editorial) {
    editorial.setId(contador);
    dato.add(editorial);
    contador++;
  }

  @Override
  public void actualizarEditorial(Editorial editorial) {
    for ( Editorial editorialEditar : dato ) {
      if ( editorial.getId() == editorialEditar.getId() ) {
        editorialEditar.setNombre( editorial.getNombre() );
      }
    }
  }

  @Override
  public void eliminarEditorial(int id) {
    ArrayList<Editorial> temporal = new ArrayList<>();
    for ( Editorial editorial : dato ) {
      if ( editorial.getId() != id ) {
        temporal.add(editorial);
      }
    }
    dato.clear();
    dato.addAll(temporal);
  }

  @Override
  public Editorial consultarEditorialPorId(int id) {
    Editorial resultado = new Editorial();
    for ( Editorial editorial : dato ) {
      if ( editorial.getId() == id ) {
        resultado = new Editorial ( editorial.getId(), editorial.getNombre() );
      }
    }
    return resultado;
  }

  @Override
  public Editorial consultarEditorialPorNombre(String nombre) {
    Editorial respuesta = new Editorial();
    for ( Editorial editorial : dato ) {
      if ( editorial.getNombre().equals(nombre) ) {
        respuesta = new Editorial( editorial.getId(), editorial.getNombre() );
      }
    }
    return respuesta;
  }

  @Override
  public ArrayList<Editorial> listadoEditoriales() {
    return dato;
  }

}

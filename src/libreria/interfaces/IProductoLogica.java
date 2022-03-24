package libreria.interfaces;

import java.util.ArrayList;
import libreria.constructor.Producto;

public interface IProductoLogica {
  
  public void guardarProducto ( Producto producto );
  
  public void actualizarProducto ( Producto producto );
  
  public void eliminarProducto ( int id );
  
  public Producto consultarProductoPorId ( int id );
  
  public ArrayList<Producto> consultarProductoPorNombre ( String nombre );
  
  public ArrayList<Producto> listadoProductos ( );
  
}

package libreria.persistencia;

import java.util.ArrayList;
import libreria.constructor.Autor;
import libreria.constructor.Editorial;
import libreria.constructor.Producto;
import libreria.interfaces.IProductoLogica;

public class ProductoLogica implements IProductoLogica {
  
  private static int contador = 102;
  private ArrayList<Producto> dato;

  public ProductoLogica() {
    this.dato = new ArrayList<>();
    
    dato.add(new Producto(
      100,
      new Editorial( 100, "DoJo" ),
      new Autor( 100, "Sun Tzu" ),
      "El arte de la guerra",
      "2000",
      5,
      15000
    ));
    dato.add(new Producto(
      101,
      new Editorial( 101, "RBA" ),
      new Autor( 101, "Ross MacDonald" ),
      "El blanco móvil",
      "2000",
      5,
      15000
    ));
  }

  @Override
  public void guardarProducto(Producto producto) {
    producto.setId(contador);
    dato.add(producto);
    contador++;
  }

  @Override
  public void actualizarProducto(Producto producto) {
    for ( Producto productoEditar : dato ) {
      if ( producto.getId() == productoEditar.getId() ) {
        productoEditar.setNombre( producto.getNombre() );
        productoEditar.setAutor(producto.getAutor());
        productoEditar.setEditorial(producto.getEditorial());
        productoEditar.setAnho(producto.getAnho());
        productoEditar.setCantidad(producto.getCantidad());
        productoEditar.setPrecio(producto.getPrecio());
      }
    }
  }

  @Override
  public void eliminarProducto(int id) {
    ArrayList<Producto> temporal = new ArrayList<>();
    for ( Producto product : dato ) {
      if ( product.getId() != id ) {
        temporal.add(product);
      }
    }
    dato.clear();
    dato.addAll(temporal);
  }

  @Override
  public Producto consultarProductoPorId(int id) {
    Producto resultado = new Producto();
    for ( Producto producto : dato ) {
      if ( producto.getId() == id ) {
        resultado = new Producto ( producto.getId(), producto.getEditorial(), producto.getAutor(), producto.getNombre(), producto.getAnho(), producto.getCantidad(), producto.getPrecio() );
      }
    }
    return resultado;
  }

  @Override
  public ArrayList<Producto> consultarProductoPorNombre(String nombre) {
    ArrayList<Producto> temporal = new ArrayList<>();
    for ( Producto producto : dato ) {
      if ( producto.getNombre().contains(nombre) ) {
        temporal.add(producto);
      }
    }
    return temporal;
  }

  @Override
  public ArrayList<Producto> listadoProductos() {
    return dato;
  }
  
}

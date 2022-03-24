package libreria.persistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import libreria.constructor.Producto;
import libreria.constructor.Venta;
import libreria.interfaces.IVentaLogica;

public class VentaLogica implements IVentaLogica {
  
  private static int contador = 101;
  private ArrayList<Venta> dato;

  public VentaLogica() {
    dato = new ArrayList<>();
  }

  @Override
  public void guardarVenta(Venta venta) {
    ArrayList<Producto> orden = new ArrayList<>();
    orden.addAll(venta.getOrden());
    
    venta.setId(contador);
    venta.setFechaOrden( LocalDate.now().toString() );
    venta.setOrden(orden);
    dato.add(venta);
    contador++;
  }
  
  @Override
  public Venta ventaPorId ( int id ){
    Venta resultado = new Venta();
    for ( Venta venta : dato ) {
      if ( venta.getId() == id ) {
        resultado = new Venta(
          venta.getId(),
          venta.getOrden(),
          venta.getFechaOrden(),
          venta.getCosto()
        );
      }
    }
    return resultado;
  }

  @Override
  public ArrayList<Venta> listadoVentas() {
    return dato;
  }
}

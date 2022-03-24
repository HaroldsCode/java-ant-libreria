package libreria.persistencia;

import libreria.constructor.Producto;
import libreria.constructor.Venta;
import java.util.ArrayList;

public class Conexion {
  
  public static AutorLogica autor = new AutorLogica();
  
  public static EditorialLogica editorial = new EditorialLogica();
  
  public static ProductoLogica producto = new ProductoLogica();
  
  public static VentaLogica venta = new VentaLogica();

}

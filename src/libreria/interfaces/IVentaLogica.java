package libreria.interfaces;

import java.util.ArrayList;
import libreria.constructor.Venta;

public interface IVentaLogica {
  
  public void guardarVenta ( Venta venta );
  
  public Venta ventaPorId ( int id );
    
  public ArrayList<Venta> listadoVentas ( );
  
}

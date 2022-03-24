package libreria.constructor;

import java.util.ArrayList;

public class Venta {
  private int id;
  private ArrayList<Producto> orden;
  private String fechaOrden;
  private double costo;

  public Venta() {
  }

  public Venta(int id, ArrayList<Producto> orden, String fechaOrden, double costo) {
    this.id = id;
    this.orden = orden;
    this.fechaOrden = fechaOrden;
    this.costo = costo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Producto> getOrden() {
    return orden;
  }

  public void setOrden(ArrayList<Producto> orden) {
    this.orden = orden;
  }

  public String getFechaOrden() {
    return fechaOrden;
  }

  public void setFechaOrden(String fechaOrden) {
    this.fechaOrden = fechaOrden;
  }

  public double getCosto() {
    return costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  @Override
  public String toString() {
    return "Venta{" + "id=" + id + ", orden=" + orden + ", fechaOrden=" + fechaOrden + ", costo=" + costo + '}';
  }
  
}

package libreria.constructor;

public class Producto {
  
  private int id;
  private Editorial editorial;
  private Autor autor;
  private String nombre;
  private String anho;
  private int cantidad;
  private double precio;

  public Producto() {
  }

  public Producto(int id, Editorial editorial, Autor autor, String nombre, String anho, int cantidad, double precio) {
    this.id = id;
    this.editorial = editorial;
    this.autor = autor;
    this.nombre = nombre;
    this.anho = anho;
    this.cantidad = cantidad;
    this.precio = precio;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Editorial getEditorial() {
    return editorial;
  }

  public void setEditorial(Editorial editorial) {
    this.editorial = editorial;
  }

  public Autor getAutor() {
    return autor;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAnho() {
    return anho;
  }

  public void setAnho(String anho) {
    this.anho = anho;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Producto{" + "id=" + id + ", editorial=" + editorial + ", autor=" + autor + ", nombre=" + nombre + ", anho=" + anho + ", cantidad=" + cantidad + ", precio=" + precio + '}';
  }

 
}

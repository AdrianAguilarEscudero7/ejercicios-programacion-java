/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
 * el control de los artículos de un almacén. De cada artículo se debe saber
 * el código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones:
 * 
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * 
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no se
 * pueda sacar más mercancía de la que hay en el almacén.
 * 
 * @author Adrián Aguilar
 */
package ejercicio05;

public class Articulo {
  
  private String codigo;
  private String descripcion;
  private float precioCompra;
  private float precioVenta;
  private int stock;
  
  public Articulo(String codigo, String descripcion, float precioCompra,
      float precioVenta, int stock) {
    
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }
  
  @Override
  public String toString() {
    return "\n*****************************\n"
        + "Código: " + this.codigo
        + "\nDescripción: " + this.descripcion
        + "\nPrecio de compra: " + this.precioCompra
        + "\nPrecio de venta: " + this.precioVenta
        + "\nStock: " + this.stock 
        + "\n*****************************\n";
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public float getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(float precioCompra) {
    this.precioCompra = precioCompra;
  }

  public float getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(float precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
  
}

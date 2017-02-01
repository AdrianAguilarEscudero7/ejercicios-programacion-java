/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú.
 * 
 * @author Adrián Aguilar
 */
package ejercicio02;

public abstract class Vehiculo {
  
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos;
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }
  
  public static int getKilometrajeTotal() {
    return Vehiculo.kilometrosTotales;
  }
  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }
  
  public int getKilometraje() {
    return this.kilometrosRecorridos;
  }
  
  public static void setVehiculosCreados(int v) {
    Vehiculo.vehiculosCreados = v;
  }
  
  public void recorre(int km) {
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
  }
}

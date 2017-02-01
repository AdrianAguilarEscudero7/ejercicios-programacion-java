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

public class Bicicleta extends Vehiculo {

  public Bicicleta() {
    super();
    Vehiculo.setVehiculosCreados(getVehiculosCreados() + 1);
  }
  
  public void caballito() {
    System.out.println("Menudo caballito estoy haciendo...");
  } 
}

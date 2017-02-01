/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public class Canario extends Ave {

  public Canario() {
  }
  
  public void pia() {
    System.out.println("Pío Pío (aquí no duerme ni dios) haha...");
  }
  
  public void seLimpia() {
    System.out.println("Intento limpiarme pero es difícil...");
  }
  
  public void canta() {
    System.out.println("Laralaralarala.. Mejor no..");
  }
}

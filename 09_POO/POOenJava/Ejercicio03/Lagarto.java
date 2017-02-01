/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public class Lagarto extends Animal {

  public Lagarto() {
  }
  
  public void escabullirse() {
    System.out.println("Menudo grandullón, Hmm... Mejor me voy");
  }
  
  public void perderCola() {
    System.out.println("Te regalo la cola y me piro ok?");
  }
  
  public void cambiarColor() {
    System.out.println("Ahora me ves... Ahora no me ves...");
  }
}

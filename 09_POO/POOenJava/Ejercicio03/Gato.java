/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public class Gato extends Mamifero {
  
  public Gato() {
  }
  
  @Override
  public void come(String c) {
    if (c.equals("pescado")) {
      System.out.println("Eso está bastante bueno, gracias...");
    } else {
      System.out.println("No pienso comerme eso, que asco... Mejor dame pescado");
    }
  }
  
  public void seLimpia() {
    System.out.println("Que limpito estoy quedando...");
  }
  
  public void cazaRatones() {
    System.out.println("Vamos a cazar ratones pa bajar la comida");
  }
}

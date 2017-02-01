/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public abstract class Animal {

  public Animal() {
  }
  
  public void come() {
    System.out.println("Estoy comiendo... No interrumpas");
  }
  public void come(String c) {
    System.out.println("Estoy comiendo " + c + "...");
  }
  public void duerme() {
    System.out.println("zZzZzZzzZZZZzzz");
  }
  public void seReproduce() {
    System.out.println("Estoy en mi momento de intimidad...");
  }
}

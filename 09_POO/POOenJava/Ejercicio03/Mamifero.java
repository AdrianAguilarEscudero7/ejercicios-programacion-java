/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public abstract class Mamifero extends Animal {
  
  public Mamifero() {
  }
  
  public void amamanta() {
    System.out.println("Tengo que dar de comer a mis crías");
  }
  
  public void vuelaMamifero() {
    System.out.println("Algunos de nosotros también podemos volar.. Eh aves?");
  }
  
  public void embarazarse() {
    System.out.println("Hay algo dentro de mi barriga, igual es un bebé... :/");
  }
}

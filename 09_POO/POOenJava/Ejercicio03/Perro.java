/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public class Perro extends Mamifero{

  public Perro() {
  }
  
  public void obedece() {
    System.out.println("Le llevo la pelotita a mi dueño para que me de comida");
  }
  
  public void juega() {
    System.out.println("Con los deberes hechos, ya puedo ponerme a jugar =)");
  }
  
  public void ladra() {
    System.out.println("Guau Guau Guau");
  }
}

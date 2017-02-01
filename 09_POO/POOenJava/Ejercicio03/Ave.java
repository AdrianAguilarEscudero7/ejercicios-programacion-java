/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public abstract class Ave extends Animal {
  
  public Ave() {
  }
  
  public void picotea() {
    System.out.println("Quieto o te llevas un picotazo...");
  }
  
  public void vuela() {
    System.out.println("Voy a dar un paseo volando");
  }
  
  public void caza() {
    System.out.println("Me voy de caza, luego vengo...");
  }
}

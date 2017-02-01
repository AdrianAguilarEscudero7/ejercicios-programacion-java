/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;
import java.util.Scanner;

public class PruebaClaseAnimales {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Gato gatlin = new Gato();
    
    gatlin.amamanta();
    gatlin.cazaRatones();
    gatlin.embarazarse();
    gatlin.duerme();
    gatlin.seLimpia();
    gatlin.seReproduce();
    System.out.print("\nDale de comer al gato: ");
    String c = s.nextLine();
    gatlin.come(c);
    
    System.out.println("--------------------------------------");
    
    Perro scooby = new Perro();
    
    scooby.amamanta();
    scooby.come();
    scooby.duerme();
    scooby.embarazarse();
    scooby.juega();
    scooby.ladra();
    scooby.seReproduce();
    scooby.obedece();
    
    System.out.println("--------------------------------------");
    
    Canario canito = new Canario();
    
    canito.canta();
    canito.caza();
    canito.come();
    canito.duerme();
    canito.picotea();
    canito.pia();
    canito.vuela();
    canito.seReproduce();
    
    System.out.println("--------------------------------------");
    
    Pinguino sosio = new Pinguino();
    
    sosio.baila();
    sosio.come();
    sosio.duerme();
    sosio.nada();
    sosio.vuela();
    sosio.seReproduce();
    
    System.out.println("--------------------------------------");
    
    Lagarto lerd = new Lagarto();
    
    lerd.cambiarColor();
    lerd.come();
    lerd.duerme();
    lerd.escabullirse();
    lerd.perderCola();
    lerd.seReproduce();
  }
}

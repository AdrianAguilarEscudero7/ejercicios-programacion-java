/**
 * Crea las clases Animal, Mamífero, Ave, Gato, Perro, Canario, Pingüino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public class Pinguino extends Ave{

  public Pinguino() {
  }
  
  public void nada() {
    System.out.println("Que bien se está en este agua tan congelada");
  }
  
  public void baila() {
    System.out.println("Con estas patas es difícil bailar, cuidado que te piso");
  }
  
  @Override
  public void vuela() {
    System.out.println("La verdad es que no puedo volar, pero no me dais envidia ¬¬");
  }
}

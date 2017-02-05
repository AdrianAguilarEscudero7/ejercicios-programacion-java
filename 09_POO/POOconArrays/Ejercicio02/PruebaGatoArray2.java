/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”) . Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author Adrián Aguilar
 */
package ejercicio02;

public class PruebaGatoArray2 {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];
    
    gato[0] = new Gato("Will","Blanco","Macho");
    gato[1] = new Gato("Bumble","Plateado","Macho");
    gato[2] = new Gato("Nela","Marrón","Hembra");
    gato[3] = new Gato();
    
    int contador = 1;
    for (Gato g : gato) {
      System.out.println("Gato " + contador + "\n*************************\n" + g);
      contador++;
    }
  }
}

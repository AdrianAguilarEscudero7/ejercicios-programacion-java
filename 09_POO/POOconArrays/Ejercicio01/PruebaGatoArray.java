/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * 
 * @author Adrián Aguilar
 */
package ejercicio01;

import java.util.Scanner;

public class PruebaGatoArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Gato[] gato = new Gato[4];
    
    for (int i = 0; i < 4; i++) {
      System.out.print("Introduzca el sexo del gato " + (i+1) + ": ");
      String sexo = s.nextLine();
      
      System.out.print("\nAhora introduzca su raza: ");
      String raza = s.nextLine();
      
      gato[i] = new Gato(sexo,raza);
      System.out.println();
    }
    
    int contador = 1;
    for (Gato g : gato) {
      System.out.println("Gato " + contador + "\n*************************\n" + g);
      contador++;
    }
  }
}

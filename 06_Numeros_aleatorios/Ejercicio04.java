/**
* 
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará 20 números aleatorios entre 0 y 10.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Generamos los 20 números aleatorios
    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
  }
}

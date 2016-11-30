/**
* 
* Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
* Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
*
* Ejemplo 1:
*
* Q J 7 J As
*
* Ejemplo 2:
*
* K 8 J As 7
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa tirará 5 dados aleatorios de póker.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    // Generamos la tirada de los 5 dados de póker al azar
    for (int i = 1; i <= 5; i++) {
      int dados = (int)(Math.random()*6+7);
      
      switch (dados) {
        case 9:
          System.out.print("J ");
          break;
        case 10:
          System.out.print("Q ");
          break;
        case 11:
          System.out.print("K ");
          break;
        case 12:
          System.out.print("As ");
          break;
        default:
          System.out.print(String.valueOf(dados) + " ");
      }
    }
  }
}

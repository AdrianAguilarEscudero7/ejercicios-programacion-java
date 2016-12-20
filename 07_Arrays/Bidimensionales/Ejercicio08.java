/**
* 
* Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
* a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
* indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
* 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
* se indican del 1 al 8.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Ejercicio no terminado, no funciona correctamente
    
    System.out.print("\nBienvenid@, este programa mostrará las casillas que podría saltar un alfil");
    System.out.println(" en ajedrez dada una posición por teclado.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    String blanco = "\u001B[37m";
    String reset = "\033[0m";
    String celeste = "\u001B[36m";
    int[][] tablero = new int[9][9];
    int contador = 8;
    
    for (int y = 9; y >= 0; y--) {
      if ((y != 9) && (y != 0)) {
        System.out.print(y + " ░░");
      } else {
        System.out.print("  ");
      }
      for(int x = 0; x < 10; x++) {
        if ((y == 9) || (y == 0)) {  
          System.out.print("░░");
        } else if (x > 5) {
          if (contador % 2 != 0) {
            System.out.print("██  ");
          } else {
            System.out.print("  ██");
          }
        }
      }
      if ((contador < 8) && (contador >= 0)) {
        System.out.print("░░");
      }
      System.out.println();
      contador--;
    }
    System.out.println("     a b c d e f g h");
    
    System.out.print("\nPor favor, introduzca la posición del alfil (por ejemplo e6): ");
    String posicionAlfil = s.nextLine();
    
    int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96; 
    String filaAlfilString = String.valueOf(posicionAlfil.charAt(1));
    Integer filaAlfil = Integer.parseInt(filaAlfilString);
    
    System.out.println();
    System.out.println("El alfil puede moversea las siguientes posiciones: \n");
    for (int y = 8; y >= 1; y--) {
      for (int x = 1; x <= 8; x++) {
        if (Math.abs((8-filaAlfil)-y) == Math.abs(columnaAlfil-x)) { 
          System.out.print((char)(x+96) + "" + y + " ");
        }
      }
    }
  }
}

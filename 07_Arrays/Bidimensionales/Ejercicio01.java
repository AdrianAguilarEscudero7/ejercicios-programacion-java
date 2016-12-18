/**
* 
* Define un array de números enteros de 3 filas por 6 columnas con nombre num
* y asigna los valores según la siguiente tabla. Muestra el contenido de todos
* los elementos del array dispuestos en forma de tabla como se muestra en la
* figura.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará una tabla de 3 filas y 6 columnas con sus elementos.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int[][] num = {{0,30,2,0,0,5}, {75,0,0,0,0,0}, {0,0,-2,9,0,11}};
    
    // Pintamos la tabla y generamos los elementos del array bidimensional
    System.out.println("┌─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
    System.out.println("│Array num│Columna 0│Columna 1│Columna 2│Columna 3│Columna 4│Columna 5│");
    System.out.println("├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤");
    for (int y = 0; y < 3; y++) {
    System.out.print("│ Fila " + y + "  ");
      for (int x = 0; x < 6; x++) {
        Thread.sleep(500);
        System.out.printf("│%5d    ", num[y][x]);
      }
      if (y == 2) {
        System.out.println("│\n└─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
      } else {
        System.out.println("│\n├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤");
      }
    }
  }
}

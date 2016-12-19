/**
* 
* Realiza un programa que rellene un array de 6 filas por 10 columnas con
* números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
* A continuación, el programa deberá dar la posición tanto del máximo como
* del mínimo.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa generará 60 números aleatorios entre 0 y 1000, finalmente");
    System.out.println(" se mostrará la posición tanto del máximo como del mínimo.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int[][] num = new int[6][10];
    int coordMaxX = 0;
    int coordMaxY = 0;
    int coordMinX = 0;
    int coordMinY = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    System.out.println("  ┌───────────────────────────────────────────────────────────────┐");
    
    // Genera 60 números aleatorios entre 0 y 1000 y los almacena en el array
    for (int y = 5; y >= 0; y--) {
      System.out.print(y + " │");
      for (int x = 0; x < 10; x++) {
        num[y][x] = (int)(Math.random()*1001);
        System.out.printf("%6d", num[y][x]);
        
        if (num[y][x] > maximo) { // Si el número es mayor que el máximo, se guardan él y sus coordenadas
          maximo = num[y][x];
          coordMaxX = x;
          coordMaxY = y;
        }
        if (num[y][x] < minimo) { // Si el número es menor que el mínimo, se guardan él y sus coordenadas
          minimo = num[y][x];
          coordMinX = x;
          coordMinY = y;
        }
      }
      System.out.println("   │");
    }
    System.out.println("  └───────────────────────────────────────────────────────────────┘");
    System.out.println("        0     1     2     3     4     5     6     7     8     9\n");
    
    // Muestra los resultados
    System.out.print("\nEl número máximo es el " + maximo + " y sus coordenadas (x,y) son: ");
    System.out.println("(" + coordMaxX + ", " + coordMaxY + ").");
    System.out.print("\nEl número mínimo es el " + minimo + " y sus coordenadas (x,y) son: ");
    System.out.println("(" + coordMinX + ", " + coordMinY + ").");
  }
}

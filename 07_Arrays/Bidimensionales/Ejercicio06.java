/**
* 
* Modifica el programa anterior de tal forma que no se repita ningún número en el array.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa generará 60 números aleatorios no repetidos entre 0 y 1000,");
    System.out.println(" finalmente se mostrará la posición tanto del máximo como del mínimo.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int[][] num = new int[6][10];
    int coordMaxX = 0;
    int coordMaxY = 0;
    int coordMinX = 0;
    int coordMinY = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int numeroAleatorio = 0;
    int y = 5;
    int x = 0;
    boolean repetido = false;
    
    System.out.println("  ┌───────────────────────────────────────────────────────────────┐");
    
    // Itera las filas mientras sea mayor o igual a 0
    while (y >= 0) {
      x = 0;
      System.out.print(y + " │");
      while (x < 10) { // Itera las columnas mientras sea menor que 10
        repetido = false;
        numeroAleatorio = (int)(Math.random()*1001);
        
        // Comprueba que el número aleatorio no se repite en todo el array
        for (int i = 5; i >= 0 && !repetido; i--) { 
          for (int j = 0; j < 10 && !repetido; j++) {
            if (numeroAleatorio == num[i][j]) {
              repetido = true;
            }
          }
        }
        if (!repetido) { // Si no se repite, lo guarda en el array y lo muestra. Si se repite, no suma la columna
          num[y][x] = numeroAleatorio;
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
          x++;
        }
      }
      System.out.println("   │");
      y--;
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

/**
* 
* Escribe un programa que pida 20 números enteros. Estos números se deben
* introducir en un array de 4 filas por 5 columnas. El programa mostrará las
* sumas parciales de filas y columnas igual que si de una hoja de cálculo se
* tratara. La suma total debe aparecer en la esquina inferior derecha.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa pedirá 20 números enteros y sumara el total de las filas");
    System.out.println(", el total de las columnas y el total final de ambos, como si fuera una hoja de cálculo.");
    System.out.println("-----------------------------------------------------------------------------");
    
    int[][] num =  new int[4][5];
    int sumaFilas = 0;
    int sumaColumnas = 0;
    int sumaTotal = 0;
    int contador = 19;
    String blanco = "\u001B[37m";
    String celeste = "\u001B[36m";
    String amarillo = "\u001B[33m";
    String verde = "\u001B[32m";
    
    // Se introducen los datos por teclado
    for (int y = 0; y < 4; y++) {
      for(int x = 0; x < 5; x++) {
        System.out.print("\nPor favor, introduzca 20 números enteros, vaya pulsando [INTRO]: ");
        num[y][x] = s.nextInt();
        System.out.println("Le quedan " + contador + " número/s.");
        contador--;
      }
    }
    
    // Genera la tabla, sus elementos y suma cada fila
    System.out.print("\n┌─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐\n");
    for (int y = 0; y < 4; y++) {
      sumaFilas = 0;
      for (int x = 0; x < 5; x++) {
        System.out.printf("│%5d    ", num[y][x]);
        sumaFilas += num[y][x]; // Almacena la suma de las filas
      }
      sumaTotal += sumaFilas; // Almacena la suma total de todas las filas
      System.out.printf("│" + celeste + "%5d    " + blanco, sumaFilas);
      System.out.print("│" + amarillo + "Ʃ Fila " + y + " " + blanco);
      System.out.println("│\n├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤");
    }
    
    // Genera la parte final de la tabla y suma cada columna, finalmente, suma el total entre filas y columnas
    for (int x = 0; x < 5; x++) {
      sumaColumnas = 0;
      for (int y = 0; y < 4; y++) {
        sumaColumnas += num[y][x]; // Almacena la suma de las columnas
      }
      sumaTotal += sumaColumnas; // Almacena la suma total 
      System.out.printf("│" + celeste + "%5d    "+ blanco, sumaColumnas);
    } 
    System.out.printf("│" + verde + "%5d    " + blanco + "│  TOTAL  │", sumaTotal);
    System.out.println("\n├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┘");
    System.out.print("│"+amarillo+"ƩColumna0"+blanco+"│"+amarillo+"ƩColumna1"+blanco+"│"+amarillo);
    System.out.println("ƩColumna2"+blanco+"│"+amarillo+"ƩColumna3"+blanco+"│"+amarillo+"ƩColumna4"+blanco+"│  TOTAL  │");
    System.out.println("└─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
  }
}

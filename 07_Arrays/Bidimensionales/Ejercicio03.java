/**
* 
* Modifica el programa anterior de tal forma que los números que se introducen
* en el array se generen de forma aleatoria (valores entre 100 y 999).
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa generará 20 números enteros aleatorios y sumara el total de las filas");
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
    
    // Genera la tabla, sus elementos aleatorios y suma cada fila
    System.out.print("\n┌─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐\n");
    for (int y = 0; y < 4; y++) {
      sumaFilas = 0;
      for (int x = 0; x < 5; x++) {
        num[y][x] = (int)((Math.random()*899)+100); // Almacena los números al azar entre 100 y 999
        System.out.printf("│%6d   ", num[y][x]);
        sumaFilas += num[y][x]; // Almacena la suma de las filas
      }
      sumaTotal += sumaFilas; // Almacena la suma total de todas las filas
      System.out.printf("│" + celeste + "%6d   " + blanco, sumaFilas);
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
      System.out.printf("│" + celeste + "%6d   "+ blanco, sumaColumnas);
    } 
    System.out.printf("│" + verde + "%6d   " + blanco + "│  TOTAL  │", sumaTotal);
    System.out.println("\n├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┘");
    System.out.print("│"+amarillo+"ƩColumna0"+blanco+"│"+amarillo+"ƩColumna1"+blanco+"│"+amarillo);
    System.out.println("ƩColumna2"+blanco+"│"+amarillo+"ƩColumna3"+blanco+"│"+amarillo+"ƩColumna4"+blanco+"│  TOTAL  │");
    System.out.println("└─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
  }
}

/**
* 
* Define un array de 12 números enteros con nombre num y asigna los valores
* según la tabla que se muestra a continuación. Muestra el contenido de todos
* los elementos del array. ¿Qué sucede con los valores de los elementos que no
* han sido inicializados?
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará el contenido de 12 números almacenados en un array.");
    System.out.println("------------------------------------------------------------------------------");
    System.out.println();
    
    int num[] = new int[12]; // Almacenamos un array de dimensión 12
    
    // Almacenamos valores en cada posición
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    System.out.print("Índice  ");
    
    // Generamos 12 números del 0 al 11 para el índice
    for (int i = 0; i < 12; i++) {
      System.out.printf("%-5d ", i);
    }
    
    System.out.println("\n      ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor ");
    
    // Leemos el contenido de las 12 posiciones del array y las almacenamos en n, con un bucle for al estilo 'foreach'
    for (int n : num) {
      System.out.printf("║%-4d ", n);
    }
    
    System.out.println("║\n      ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
  }
}

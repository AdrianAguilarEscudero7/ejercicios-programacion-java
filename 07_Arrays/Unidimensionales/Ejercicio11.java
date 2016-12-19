/**
* 
* Realiza un programa que pida 10 números por teclado y que los almacene en
* un array. A continuación se mostrará el contenido de ese array junto al índice
* (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
* primos a las primeras posiciones, desplazando el resto de números (los que
* no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
* el array resultante.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa pedirá 10 números por teclado y los almacenará en un");
    System.out.print(" array. Finalmente mostrará el array natural y otro con los números primos en las");
    System.out.println(" primeras posiciones, y, en las restantes, el resto de números.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] = new int[10];
    int primo[] = new int[10]; // Almacena los números primos
    int noPrimo[] = new int[10]; // Almacena el resto de números
    int contadorPrimos = 0;
    int contadorNoPrimos = 0;
    boolean esPrimo = true;
    
    // Se introducen los números por teclado
    for (int i = 0; i < 10; i++) {
      System.out.print("\nPor favor, introduzca 10 números, vaya pulsando [INTRO]: ");
      numero[i] = s.nextInt();
      
      esPrimo = true;
      
      // Comprueba si el número introducido es primo o no
      for (int j = 2; j < numero[i] && esPrimo; j++) {
        if ((numero[i] == 1) || (numero[i] == 2)) {
          esPrimo = true;
        } else if (numero[i] % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) { // Si es primo lo almacena en el array primo
        primo[contadorPrimos++] = numero[i];
      } else { // si no, lo almacena en noPrimo
        noPrimo[contadorNoPrimos++] = numero[i];
      }
    }
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Genera el índice de la tabla
    System.out.println("El array normal:\n");
    System.out.print("Índice   ");
    for (int x = 0; x < 10; x++) {
      System.out.printf("%-6d", x);
    }
    
    // Genera la tabla y los valores del array normal
    System.out.println("\n      ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor ");
    for (int n : numero) {
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n      ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
    
    // Vuelve a almacenar en el primer array todos los números primos que hayan salido
    for (int k = 0; k < contadorPrimos; k++) {
      numero[k] = primo[k];
    }
    // Después rellena los huecos restantes con el resto de números
    for (int l = contadorPrimos; l < 10; l++) {
      numero[l] = noPrimo[l - contadorPrimos];
    }
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    // Genera el índice de la nueva tabla modificada
    System.out.println("El array modificado:\n");
    System.out.print("Índice   ");
    for (int y = 0; y < 10; y++) {
      System.out.printf("%-6d", y);
    }
    
    // Genera la tabla y los nuevos valores del array modificado
    System.out.println("\n      ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor ");
    for (int m : numero) {
      System.out.printf("║%3d  ", m);
    }
    System.out.println("║\n      ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
  }
}

/**
* 
* Escribe un programa que pida un número entero positivo por teclado y que
* muestre a continuación los 5 números consecutivos a partir del número
* introducido. Al lado de cada número se debe indicar si se trata de un primo o no.
*
* Ejemplo:
* Por favor, introduzca un número entero positivo: 17
* 17 es primo
* 18 no es primo
* 19 es primo
* 20 no es primo
* 21 no es primo
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio42 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("\nBienvenid@, este programa mostrará los 5 números consecutivos a partir del");
    System.out.println(" número introducido por teclado y determinará si es primo o no.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    boolean esPrimo;
    
    // Salto de línea
    System.out.println();
    
    // Iteramos 5 números consecutivos a partir del número introducido
    for (int i = 0; i < 5; i++) {
      esPrimo = true;
      
      // Comprueba que el número o consecutivos son o no primos
      for (int j = 2; j < numeroIntroducido; j++) {
        if (numeroIntroducido % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.println("El " + numeroIntroducido + " es primo.");
      } else {
        System.out.println("El " + numeroIntroducido + " no es primo.");
      }
      numeroIntroducido++;
    }
  }
} 

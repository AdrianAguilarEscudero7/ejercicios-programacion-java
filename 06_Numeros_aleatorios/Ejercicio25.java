/**
* 
* Escribe un programa que muestre por pantalla 100 números enteros separa-
* dos por un espacio. Los números deben estar generados de forma aleatoria
* en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
* almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará por pantalla 100 números enteros aleatorios entre 10");
    System.out.println(" y 200. Los primos apareceran entre almohadillas y los múltiplos de 5 entre corchetes.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    boolean esPrimo; 
    int multiplos = 0; // Cuenta los múltiplos de 5
    int primos = 0; // Cuenta los números primos
    
    // Genera 100 números al azar entre 10 y 200
    for (int i = 1; i <= 100; i++) {
      int numeros = (int)(Math.random()*191+10);
      
      esPrimo = true;
      
      // Determina los números que son o no primos
      for (int j = 2; j < numeros; j++) {
        if (numeros % j == 0) {
          esPrimo = false;
        }
      }
      // Si es primo, pinta los números entre almohadillas
      if (esPrimo) {
        System.out.print("#" + numeros + "# ");
        primos++;
      } else if (numeros % 5 == 0) { // Si son múltiplos de 5, pinta los números entre corchetes
        System.out.print("[" + numeros + "] ");
        multiplos++;
      } else { // Si no son ninguna de las anteriores, los pinta normal
        System.out.print(numeros + " ");
      }
    }
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.println("\nHan salido " + primos + " números primos, y " + multiplos + " múltiplos de 5.");
  }
}

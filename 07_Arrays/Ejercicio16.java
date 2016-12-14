/**
* 
* Escribe un programa que rellene un array de 20 elementos con números ente-
* ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
* el programa mostrará el array y preguntará si el usuario quiere resaltar los
* múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
* array escribiendo los números que se quieren resaltar entre corchetes.
* Ejemplo:
* 
* 159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
* ¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
* 159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa mostrará un array de 20 elementos aleatorios entre");
    System.out.println(" 0 y 400 y le preguntará si quiere resaltar los múltiplos de 5 o de 7.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int[] numero = new int[20];
    
    // Almacena los 20 números aleatorios en el array
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*401);
    }
    // Muestra los 20 números aleatorios del array
    for (int n : numero) {
      System.out.print(n + " ");
    }
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    int multiplo;
    System.out.print("¿Qué números desea resaltar (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    multiplo = s.nextInt();
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    String amarillo = "\u001B[33m";
    String blanco = "\u001B[37m";
    
    // Resalta los múltiplos de 5 o 7 según haya elegido el usuario
    for (int m : numero) {
      if ((m % 5 == 0) && (multiplo == 1)) {
        System.out.print(amarillo + "[" + m + "] " + blanco);
      } else if ((m % 7 == 0) && (multiplo == 2)) {
        System.out.print(amarillo + "[" + m + "] " + blanco);
      } else {
        System.out.print(m + " ");
      }
    }
  }
}
    

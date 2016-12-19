/**
* 
* Escribe un programa que pida 10 números por teclado y que luego muestre
* los números introducidos junto con las palabras “máximo” y “mínimo” al lado
* del máximo y del mínimo respectivamente.
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará 10 números introducidos por usted con su");
    System.out.println(" máximo y su mínimo.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    int numero[] = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    // Introducimos 10 números por teclado y los almacena en el array numero
    for (int i = 0; i < 10; i++) {
      System.out.print("\nPor favor, introduzca 10 números por teclado, vaya pulsando [Intro]: ");
      numero[i] = Integer.parseInt(s.nextLine());
      
      if (numero[i] > maximo) { // Almacena el máximo
        maximo = numero[i];
      }
      if (numero[i] < minimo) { // Almacena el mínimo
        minimo = numero[i];
      }
    }
    
    System.out.println("------------------------------------------------------------------------------\n");
    
    // Muestra los 10 números y, al máximo y al mínimo junto a la palabra máximo o mínimo
    for (int n : numero) {
      System.out.print(" " + n);
      
      if (n == minimo) {
        System.out.print("[Mínimo]");
      }
      if (n == maximo) {
        System.out.print("[Máximo]");
      }
    }
  }
}

/**
* 
* Escribe un programa que lea 10 números por teclado y que luego los muestre
* en orden inverso, es decir, el primero que se introduce es el último en
* mostrarse y viceversa.
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará a la inversa 10 números introducidos por teclado.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    int num[] = new int[10];
    
    // Introducimos 10 números por teclado
    for (int i = 0; i < 10; i++) {
      System.out.print("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.print("\nLos números introducidos en orden inverso son: ");
    
    // Leemos los 10 números en el orden inverso
    for (int j = 9; j >= 0; j--) {
      System.out.print(num[j] + " ");
    }
  }
}

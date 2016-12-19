/**
* 
* Escribe un programa que lea 15 números por teclado y que los almacene en un
* array. Rota los elementos de ese array, es decir, el elemento de la posición 0
* debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
* la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
* del array.
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará 15 números introducidos por usted rotados en un array");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] = new int[15];
    int rotacion;
    
    // Introducimos los 15 números por teclado y los rotamos directamente
    for (int i = 0; i < 15; i++) {
      rotacion = i + 1;
      if (rotacion > 14) {
        rotacion = 0;
      }
      System.out.print("\nPor favor, introduzca 15 números, vaya pulsando [INTRO]: ");
      numero[rotacion] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("-----------------------------------------------------------------------------\n");
    System.out.println("El array rotado:\n");
    
    // Muestra el índice del array
    for (int j = 0; j < 15; j++) {
      System.out.printf("|%3d ", j);
    }
    System.out.println("|");
    System.out.println("----------------------------------------------------------------------------");
    
    // Muestra el array rotado
    for (int n : numero) {
      System.out.printf("|%3d ", n);
    }
    System.out.println("|");
  }
}

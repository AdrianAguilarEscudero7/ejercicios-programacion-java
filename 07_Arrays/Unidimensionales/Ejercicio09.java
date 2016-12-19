/**
* 
* Realiza un programa que pida 8 números enteros y que luego muestre esos
* números junto con la palabra “par” o “impar” según proceda.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@, este programa pedirá 8 números enteros y mostrará si es par o impar");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] = new int[8];
    
    // Se introducen los números por teclado
    for (int i = 0; i < 8; i++) {
      System.out.print("\nPor favor, introduzca un número entero positivo: ");
      numero[i] = s.nextInt();
    }
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Muestra todos los números del array junto con la palabra par o impar
    for (int n : numero) {
      System.out.print(" " + n);
      if (n % 2 == 0) {
        System.out.print("[Par] ");
      } else {
        System.out.print("[Impar] ");
      }
    }
  }
}

/**
* 
* Realiza un conversor del sistema decimal al sistema de “palotes”.
*
* Ejemplo:
* Por favor, introduzca un número entero positivo: 47021
* El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.println("\nBienvenid@ al conversor del sistema decimal al sistema de palotes.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long reves = 0; // Almacena el número al revés
    long palote; // Almacena el número que se convertirá en palote
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Transforma los números uno a uno en palotes
    while (reves > 0) {
      palote = reves % 10;
      for (int i = 0; i < palote; i++) {
        System.out.print("|");
      }
      System.out.print(" - ");
      reves /= 10;
    }
  }
}

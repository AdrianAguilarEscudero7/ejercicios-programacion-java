/**
* 
* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
* programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
* mitad (división entera entre 2) de la altura más uno.
* Ejemplo:
* Introduzca la altura de la L: 5
*
* *
* *
* *
* *
* * * *
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos la altura por teclado
    System.out.println("\nBienvenid@, este programa pintará la letra 'L' con la altura que usted elija.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca la altura deseada: ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Salto de línea
    System.out.println();
    
    // Pintamos el palo vertical de la 'L'
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    
    // Pintamos el palo horizontal de la 'L'
    for (int j = 1; j <= ((altura/2)+1); j++) {
      System.out.print("* ");
    }
  }
}

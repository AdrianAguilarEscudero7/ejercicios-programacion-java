/**
* 
* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
* asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
* que tanto la anchura como la altura sean mayores o iguales que 2, en caso
* contrario se debe mostrar un mensaje de error.
*
* Ejemplo 1:
* Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
* Ahora introduzca la altura (como mínimo 2): 1
* Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2
*
* Ejemplo 2:
* Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
* Ahora introduzca la altura (como mínimo 2): 4
*
* * * * * * *
* *         * 
* *         *
* * * * * * * 
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio46 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@, este programa pintará un rectángulo hueco dada una altura y una");
    System.out.println(" anchura por teclado, ambas deben ser mayor o iguales que 2.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca la anchura del rectángulo (mínimo 2): ");
    int anchura = Integer.parseInt(s.nextLine());
    System.out.print("\nAhora introduzca la altura (mínimo 2): ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Comprueba que la anchura o altura del rectángulo sean mínimo 2
    if ((anchura < 2) || (altura < 2)) {
      System.out.print("\nLo siento, los datos introducidos no son correctos, el valor mínimo para");
      System.out.print(" la anchura y la altura es 2.");
    } else {
      System.out.println();
      
      // Pinta el rectángulo
      for (int i = 1; i <= altura; i++) {
        System.out.print("* ");
        if ((i == 1) || (i == altura)) {
          for (int j = 1; j < anchura; j++) {
            System.out.print("* ");
          }
        } else {
          for (int k = 2; k < ((anchura*2)-2); k++) {
            System.out.print(" ");
          }
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}

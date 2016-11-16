/**
* 
* Realiza un programa que pinte por pantalla un rombo hueco hecho con
* asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
* sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
* mensaje de error.
*
* Ejemplo:
* Por favor, introduzca la altura del rombo: 5
*
*   * 
*  * *
* *   *
*  * *
*   *
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio40 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa 
    System.out.print("\nBienvenid@, este programa pintará un rombo con una altura introducida por teclado,");
    System.out.println(" el número introducido debe ser impar y mayor o igual a 3.");
    System.out.println("-----------------------------------------------------------------------------");
    
    // Declaramos las variables 
    int altura;
    int filas1 = 1; // Almacena las filas de la parte superior del rombo
    int filas2 = 1; // Almacena las filas de la parte inferior del rombo
    int espaciosDentro1 = 1; // Almacena los espacios interiores de la parte superior del rombo
    int espaciosFuera2 = 2; // Almacena los espacios exteriores de la parte inferior del rombo
    
    // Comprueba que la altura introducida es impar mayor o igual a 3
    do {
      System.out.print("\nPor favor, introduzca una altura, (impar mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());
    } while ((altura < 3) || (altura % 2 == 0));
    
    int espaciosFuera1 = ((altura/2)+1); // Almacena los espacios exteriores de la parte superior del rombo
    int espaciosDentro2 = altura-2; // Almacena los espacios interiores de de la parte inferior del rombo
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Itera al conjunto de elementos de la parte superior del rombo
    while (filas1 <= ((altura/2)+1)) {
      
      // Pinta los espacios exteriores de la parte superior del rombo
      for (int i = 1; i < espaciosFuera1; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      // Pinta los espacios interiores de la parte superior del rombo
      if (filas1 > 1) {
        for (int j = 2; j < espaciosDentro1; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      espaciosFuera1--;
      espaciosDentro1 += 2;
      filas1++;
      System.out.println();
    }
    
    // Itera al conjunto de elementos de la parte inferior del rombo
    while (filas2 <= altura/2) {
      
      // Pinta los espacios exteriores de la parte inferior del rombo
      for (int k = 1; k < espaciosFuera2; k++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      // Pinta los espacios interiores de la parte inferior del rombo
      if (filas2 < altura/2) {
        for (int l = 2; l < espaciosDentro2; l++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      espaciosDentro2 -= 2;
      espaciosFuera2++;
      filas2++;
      System.out.println();
    } 
  } 
}

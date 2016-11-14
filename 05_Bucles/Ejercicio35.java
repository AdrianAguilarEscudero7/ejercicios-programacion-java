/**
* 
* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
* pedir la altura. Se debe comprobar que la altura sea un número impar mayor
* o igual a 3, en caso contrario se debe mostrar un mensaje de error.
*
* Ejemplo:
* Por favor, introduzca la altura de la X: 5
*
*   *   *
*    * *
*     *
*    * *
*   *   *
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa pintará una 'X' con una altura impar mayor o igual");
    System.out.println(" a 3 introducida por usted");
    System.out.println("-----------------------------------------------------------------------------");
    
    int altura; 
    int filas1 = 1; // Para el número de filas de la parte superior de la 'X'
    int filas2 = 1; // Para el número de filas de la parte inferior de la 'X'
    int espaciosDentro2 = 2; // Para los espacios interiores de la parte inferior de la 'X'
    
    // Comprobamos que la altura introducida por teclado sea igual a 3 o mayor
    do {
      System.out.print("\nPor favor, introduzca la altura de la 'X' (impar mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());
    } while ((altura < 3) || (altura % 2 == 0));
    
    int espaciosDentro1 = altura; // Para los espacios interiores de la parte superior de la 'X'
    int espaciosFuera = altura/2; // Para los espacios exteriores de la parte inferior de la 'X'
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Este bucle iterará a todo el conjunto de la parte superior de la 'X' hasta que el número de filas sea 
    // igual a la mitad de la altura más 1 (considero que la parte superior es la que contiene el vértice)
    while (filas1 <= ((altura/2)+1)) {
        
      // Pintamos los espacios exteriores de la parte superior de la 'X'
      for (int j = 1; j < filas1; j++) { 
        System.out.print(" ");
      }
      System.out.print("*");
        
      // Pintamos los espacios interiores de la parte superior hasta que llegue al vértice 
      if (filas1 < ((altura/2)+1)) {
        for (int k = 0; k < espaciosDentro1-2; k++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      filas1++;
      espaciosDentro1 -= 2; 
      System.out.println();
    }
    
    // Este bucle iterará a todo el conjunto de la parte inferior de la 'X' hasta que el número de filas sea
    // igual a la mitad de la altura
    while (filas2 <= altura/2) {
      
      // Pintamos los espacios exteriores de la parte inferior de la 'X'
      for (int l = 1; l < espaciosFuera; l++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      // Pintamos los espacios interiores de la parte inferior de la 'X'
      for (int n = 1; n < espaciosDentro2; n++) {
        System.out.print(" ");
      }
      System.out.print("*");
      espaciosDentro2 += 2;
      espaciosFuera--;
      filas2++;
      System.out.println();
    }
  }
}

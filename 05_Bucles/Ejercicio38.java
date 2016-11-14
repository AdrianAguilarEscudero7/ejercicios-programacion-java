/**
* 
* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
* programa debe pedir la altura. Se debe comprobar que la altura sea un número
* impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
* error.
* 
* Ejemplo:
* Por favor, introduzca la altura del reloj de arena: 5
* 
* *****
*  ***
*   *
*  ***
* *****
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa pintará una 'X' con una altura impar mayor o igual");
    System.out.println(" a 3 introducida por usted");
    System.out.println("-----------------------------------------------------------------------------");
    
    int altura; 
    int filas1 = 1; // Para el número de filas de la parte superior del reloj
    int filas2 = 1; // Para el número de filas de la parte inferior del reloj
    int interior2 = 3; // Para el interior de la parte inferior del reloj
    
    // Comprobamos que la altura introducida por teclado sea igual a 3 o mayor
    do {
      System.out.print("\nPor favor, introduzca la altura de la 'X' (impar mayor o igual a 3): ");
      altura = Integer.parseInt(s.nextLine());
    } while ((altura < 3) || (altura % 2 == 0));
    
    int interior1 = altura; // Para la parte superior del reloj
    int espaciosFuera = altura/2; // Para los espacios exteriores de la parte inferior del reloj
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Este bucle iterará a todo el conjunto de la parte superior del reloj hasta que el número de filas sea 
    // igual a la mitad de la altura más 1 (considero que la parte superior es la que contiene el vértice)
    while (filas1 <= ((altura/2)+1)) {
        
      // Pintamos los espacios exteriores de la parte superior del reloj
      for (int i = 1; i < filas1; i++) { 
        System.out.print(" ");
      }
      
      // Pintamos la parte superior del reloj  
      for (int j = 0; j < interior1; j++) {
        System.out.print("*");
      }
      filas1++;
      interior1 -= 2; 
      System.out.println();
    }
    
    // Este bucle iterará a todo el conjunto de la parte inferior del reloj hasta que el número de filas sea
    // igual a la mitad de la altura
    while (filas2 <= altura/2) {
      
      // Pintamos los espacios exteriores de la parte inferior del reloj
      for (int k = 1; k < espaciosFuera; k++) {
        System.out.print(" ");
      }
      
      // Pintamos el interior de la parte inferior del reloj
      for (int l = 1; l <= interior2; l++) {
        System.out.print("*");
      }
      interior2 += 2;
      espaciosFuera--;
      filas2++;
      System.out.println();
    }
  }
}


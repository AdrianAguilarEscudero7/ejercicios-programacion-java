/**
* 
* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
* programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
* dos asteriscos menos en la base para simular la curvatura de las esquinas
* inferiores.
* Ejemplo 1:
* Introduzca la altura de la U: 5
* 
* *       *
* *       * 
* *       *  
* *       *
*   * * *
*
* Ejemplo 2:
* Introduzca la altura de la U: 4
*
* *     *
* *     *
* *     *
*   * *
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos la altura por teclado
    System.out.println("\nBienvenid@, este programa pintará la letra 'U' con una altura introducida por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Por favor, introduzca la altura de la 'U': ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Declaramos la variable
    int filas = 1;
    
    // Salto de línea
    System.out.println();
    
    // Este bucle iterará los demás hasta que filas sea igual a altura
    while (filas < altura) {
      System.out.print("*");
      
      // Pinta los espacios dentro de la 'U'
      for (int i = 1; i < ((altura*2)-2); i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      filas++;
    }
    
    System.out.print("  ");
    
    // Pinta la base de la 'U'
    for (int j = 1; j < altura-1; j++) {
      System.out.print("* ");
    }
    System.out.print("  ");
  }
}

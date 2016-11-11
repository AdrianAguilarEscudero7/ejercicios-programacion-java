/**
* 
* Escribe un programa que lea un número n e imprima una pirámide de números
* con n filas como en la siguiente figura:
*    1
*   121
*  12321
* 1234321
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@ al dibujante de pirámides, esta pirámide se mostrará con una cantidad");
    System.out.println(" n de números en cada fila según la altura que introduzca.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número para la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables 
    int espacios = altura;
    int filas = 1; // Filas para el número de números por fila según la altura
    int j = 0; 
    
    // Salto de línea
    System.out.println();
    
    // Creamos un bucle que anidará a otros 3 hasta que filas sea igual a altura
    while (filas <= altura) {
      
      // Creamos el bucle para los espacios exteriores a la pirámide
      for (int i = 1; i < espacios; i++) {
      System.out.print(" ");
      }
      
      // Si filas es igual a 1, pintamos el número 1
      if (filas == 1) {
      System.out.print("1");
      }
      
      // Si filas es mayor que 1 creamos dos bucles, uno para los números de 1 a n y otro para los números de n-1 a 1
      if (filas > 1) {
        for (j = 1; j <= filas; j++) {
          System.out.print(j);
        }
        for (int k = j-2; k >= 1; k--) {
          System.out.print(k);
        }
      }
      System.out.println();
      filas++;
      espacios--;
    }
  }
} 

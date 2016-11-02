/**
* 
* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
* los 5 primeros números enteros a partir de uno que se introduce por teclado.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("\nBienvenid@, mostraremos en tres columnas, el cuadrado y el cubo de los cinco");
    System.out.println(" primeros números enteros a partir del suyo.");  
    System.out.println("-------------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero: ");
    int numero = Integer.parseInt(s.nextLine());
    
    // Creamos el bucle correspondiente y mostramos el resultado final
    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("\n %2s | %4s | %4s", (i), (i*i), (i*i*i));
    }
  }
}

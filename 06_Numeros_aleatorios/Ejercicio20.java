/**
* 
* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
* agua. La capacidad será indicada por el usuario. La cuba se llenará con una
* cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
* pueda admitir. El ancho de la cuba no varía.
*
* Ejemplo:
* Por favor, indique la capacidad de la cuba en litros: 3
*
* *    *
* *====*
* *====*
* ******
* 
* La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa pintará una cuba con cierta cantidad de agua aleatoria");
    System.out.println(" . La capacidad la introducirá usted por teclado.");
    System.out.println("-----------------------------------------------------------------------------");
    
    // Introducimos la capacidad por teclado
    System.out.print("\nPor favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(s.nextLine());
    
    int anchura = 4; // Fijamos la anchura de la cuba previamente
    int cantidad = (int)(Math.random()*(capacidad+1)); // Almacenamos la cantidad de agua aleatoria
    int litros = cantidad;
    System.out.println();
    
    // Generamos la altura de la cuba que será igual a su capacidad (sin contar la base)
    for (int i = 1; i <= capacidad; i++) {
      System.out.print("*");
      
      // Empezamos pintando espacios en vez de agua, para que empieze el agua desde la base
      if (cantidad < capacidad) {
        for (int j = 1; j <= anchura; j++) {
          System.out.print(" ");
        }
      } else { // Si cantidad ya no es menor que la capacidad, entonces se empieza a pintar agua
        for (int k = 1; k <= anchura; k++) {
          System.out.print("=");
        }
      }
      cantidad++;
      System.out.print("*");
      System.out.println();
    }
    System.out.print("******");
    System.out.println("\n---------------------------------------------------------------------------");
    System.out.println("\nLa cuba tiene una capacidad de " + capacidad + " L, y contiene " + litros + " L de agua.");
  }
}

/**
* 
* Escribe un programa que diga si un número introducido por teclado es o no
* primo. Un número primo es aquel que sólo es divisible entre él mismo y la
* unidad.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@, este programa determinará si su número introducido es o no primo.");
    System.out.println("------------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número: ");
    int numero = Integer.parseInt(s.nextLine());
    
    // Definimos una variable de tipo booleana determinar las condiciones
    boolean primo = true;
    
    // Creamos el bucle correspondiente
    for (int i = 2; i < numero; i++) {
      // Establecemos la condición para cuando no sea primo
      if (numero % i == 0) {
        primo = false;
      }
    }
    // Establecemos las condiciones y mostramos el resultado por pantalla
    if (primo) {
      System.out.println("\nEl número introducido es primo.");
    } else {
      System.out.println("\nEl número introducido no es primo.");
    }
  }
}

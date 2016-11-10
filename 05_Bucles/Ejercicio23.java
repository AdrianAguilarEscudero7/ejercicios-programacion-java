/**
* 
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa 
    System.out.print("\nBienvenid@, en este programa realizaremos la suma de los números que vaya");
    System.out.println(" introduciendo hasta que supere el valor de 10000.");
    System.out.println("-----------------------------------------------------------------------------");
    
    
    int contador = 0; // Declaramos la variable contador para contar los números y hacer la media
    double suma = 0; // Declaramos la variable suma para el total
    
    // Iteramos la introducción del número hasta que la suma sea mayor a 10000 y contamos los números
    do { 
      System.out.print("\nPor favor, introduzca un número: ");
      int numero = Integer.parseInt(s.nextLine());
      suma += numero;
      contador++;
    } while (suma <= 10000);
    
    // Mostramos por pantalla el resultado
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("\nHa introducido " + contador + " números.");
    System.out.println("\nEl total de los números introducidos es: " + suma);
    System.out.println("\nLa media del total de números introducidos es: " + (suma / contador));
  }  
}

/**
* 
* Escribe un programa que pida una base y un exponente (entero positivo) y
* que calcule la potencia.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@ al calculador de potencias, por favor introduzca una base: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("\nAhora introduzca un exponente (positivo): ");
    int exponente = Integer.parseInt(s.nextLine());
    
    // Definimos la variable auxiliar y la igualamos a la base para utilizarla posteriormente
    int aux = base;
    
    // Creamos un bucle para cuando se introduzca un exponente negativo
    while (exponente < 0) {
      System.out.print("\n¡Error!, por favor, introduzca un exponente positivo: ");
      exponente = Integer.parseInt(s.nextLine());
    } 
    System.out.println("-------------------------------------------------------------------------");
    
    // Establecemos una condición cuando el exponente sea igual a 0
    if (exponente == 0) {
      System.out.println("\nLa potencia " + base + "^" + exponente + " es igual a 1");
    } else {
      // Creamos el bucle correspondiente y mostramos el resultado por pantalla
      for (int i = 1; i < exponente; i++) {
        aux = aux * base; // Utilizamos la variable auxiliar para añadirle el valor de la multiplicación consecutiva
      }
      System.out.println("\nLa potencia " + base + "^" + exponente + " es igual a " + aux);
    }
  }
}

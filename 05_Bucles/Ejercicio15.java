/**
* 
* Escribe un programa que dados dos números, uno real (base) y un entero
* positivo (exponente), saque por pantalla todas las potencias con base el
* numero dado y exponentes entre uno y el exponente introducido. No se deben
* utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
* se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@ al calculador de potencias, por favor introduzca una base (número real): ");
    Double base = Double.parseDouble(s.nextLine());
    System.out.print("\nAhora introduzca un exponente positivo: ");
    int exponente = Integer.parseInt(s.nextLine());
    
    // Definimos las variables 
    double aux = base; // Definimos auxiliar y la igualamos a la base para utilizarla posteriormente
    int contador = 1; // Definimos contador para que haga la función de falso exponente
    
    // Creamos un bucle de error por si el exponente introducido es negativo
    while (exponente < 0) {
      System.out.print("\n¡Error!, por favor, introduzca un exponente positivo: ");
      exponente = Integer.parseInt(s.nextLine());
    } 
    System.out.println("---------------------------------------------------------------------------");
   
    // Establecemos una condición por si el exponente es = a 0
    if (exponente == 0) {
      System.out.println("\n" + base + "^" + exponente + " = 1");
    } else {
      // Creamos el bucle correspondiente y mostramos el resultado por pantalla
      for (int i = 0; i < exponente; i++) {
        System.out.println("\n" + base + "^" + contador + " = " + aux);
        aux = aux * base; // Utilizamos auxiliar para añadir el valor de las multiplicaciones consecutivas
        contador++;
      }
    }
  }
}

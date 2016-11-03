/**
* 
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@, este programa sumará los 100 números siguientes a un número");
    System.out.println(" entero y positivo que introduzca por teclado.");
    System.out.println("--------------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número (entero y positivo): ");
    int numero = Integer.parseInt(s.nextLine());
    
    // Creamos un bucle de error por si el número introducido por el usuario es negativo
    while (numero < 0) {
      System.out.print("\n¡Error!, por favor, introduzca un número entero positivo: ");
      numero = Integer.parseInt(s.nextLine());
    } 
  
    // Definimos la variable suma, donde le asignamos el valor de la variable número para manejarlo
    int suma = numero;
    
    // Creamos el bucle correspondiente y mostramos el resultado por pantalla
    for (int i = numero + 1; i < (numero + 100); i++) {
      suma = suma + i;
    }
    System.out.println("\nLa suma de los 100 números siguientes a " + numero + " es: " + suma);
  }
}

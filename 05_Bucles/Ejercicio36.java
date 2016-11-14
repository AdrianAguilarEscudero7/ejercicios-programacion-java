/**
* 
* Escribe un programa que diga si un número introducido por teclado es o no
* capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
* programa debe aceptar números de cualquier longitud siempre que lo permita
* el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
* long en lugar de int ya que el primero admite números más largos.
*
* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 678
* El 678 no es capicúa.
*
* Ejemplo 2:
* Por favor, introduzca un número entero positivo: 2019102
* El 2019102 es capicúa.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio36 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.println("\nBienvenid@, este programa determinará si el número introducido es o no capicúa");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long reves = 0; // Almacena el número al revés
    long numero = numeroIntroducido;
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Si el número introducido es igual al número al revés, entonces el número introducido será capicúa
    if (numero == reves) {
      System.out.println("\nEl " + numero + " es capicúa.");
    } else {
      System.out.println("\nEl " + numero + " no es capicúa.");
    }
  }
}

/**
* 
* Escribe un programa que permita partir un número introducido por teclado en
* dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
* el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
* el número introducido tiene dos dígitos como mínimo y la posición en la que
* se parte el número está entre 2 y la longitud del número. No se permite en
* este ejercicio el uso de funciones de manejo de String (por ej. para extraer
* subcadenas dentro de una cadena).
*
* Ejemplo:
* Por favor, introduzca un número entero positivo: 406783
* Introduzca la posición a partir de la cual quiere partir el número: 5
* Los números partidos son el 4067 y el 83.
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio43 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@, este programa partirá en dos a un número introducido por teclado.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("\nAhora introduzca la posición a partir de la cual quiere partir el número: ");
    int posicion = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    long numeroReves = 0; // Almacena el número al revés
    long numeroPartido1 = 0; // Almacena la primera partición del número
    long numeroPartido2 = 0; // Almacena la segunda partición del número
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Realiza la primera partición del número hasta la posición introducida
    for (int i = 1; i < posicion; i++) {
      numeroPartido1 = (numeroPartido1 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    
    // Realiza la segunda partición del número después de la posición introducida
    while (numeroReves > 0) {
      numeroPartido2 = (numeroPartido2 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    System.out.print("\nLos números partidos son el " + numeroPartido1 + " y el " + numeroPartido2);
  }
}

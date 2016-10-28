/**
* 
* Muestra la tabla de multiplicar de un número introducido por teclado.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.println("\nBienvenid@ a las tablas de multiplicar");
    System.out.println("-----------------------------------------");
    System.out.print("\nPor favor, introduzca un número por teclado: ");
    int numero = Integer.parseInt(s.nextLine());
    int i = 0;
    System.out.print("\n");
    
    // Creamos el bucle correspondiente
    while (i < 11) {
      System.out.println(numero + "x" + i + " = " + numero * i);
      i++;
    }
  }
}
    

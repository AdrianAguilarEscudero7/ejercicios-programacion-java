/**
* 
* Realiza un programa que pida un número por teclado y que luego muestre ese
* número al revés.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@, en este programa mostraremos el número que usted introduzca al revés.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("-----------------------------------------------------------------------------");
    
    // Declaramos las variables
    int reves = 0; // Para darle la vuelta al número
    int primerNumero = numero; // Para mostrar el primer número introducido
    
    // Da la vuelta al número
    while (numero > 0) {
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
    }
    
    // Mostramos el resultado por pantalla
    System.out.println("\nEl número que introdujo fue el: " + primerNumero);
    System.out.println("\nY ese número al revés es el: " + reves);
  }
}


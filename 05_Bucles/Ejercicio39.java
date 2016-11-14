/**
* 
* Escribe un programa que pida un número entero positivo por teclado y que
* muestre a continuación los números desde el 1 al número introducido junto
* con su factorial.
* 
* Ejemplo:
* Por favor, introduzca un número entero positivo: 7
* 
* 1! = 1
* 2! = 2
* 3! = 6
* 4! = 24
* 5! = 120
* 6! = 720
* 7! = 5040
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("\nBienvenid@, este programa mostrará al número introducido junto con los anteriores,");
    System.out.println(" y con sus correspondientes factoriales");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    int contador = 1; // Cuenta los números del 1 al número introducido
    int factorial = 1; // Almacena el factorial de cada número
    
    // Realiza el factorial de cada número desde el 1 hasta el número introducido
    while (contador <= numeroIntroducido) {
      for (int i = contador-1; i >= 1; i--) {
        factorial = factorial * i;
      }
      System.out.print(contador + "! = ");
      System.out.print(factorial);
      contador++;
      factorial = contador;
      System.out.println();
    }
  }
}
    

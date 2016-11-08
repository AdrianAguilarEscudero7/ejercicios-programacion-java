/**
* 
* Escribe un programa que muestre los n primeros términos de la serie de
* Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
* y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
* los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
* debe introducir por teclado.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.println("\nBienvenid@ a la serie de Fibonacci.");
    System.out.print("\nIntroduzca el número de términos de la serie que desea mostrar: ");
    int terminos = Integer.parseInt(s.nextLine());
    
    // Definimos las variables
    int numero1 = 0;
    int numero2 = 1;
    int fibonacci = 1; // Aquí sumaremos los dos números anteriores
  
    // Salto de línea fuera del bucle
    System.out.println();
    
    // Creamos el bucle y mostramos el resultado por pantalla
    for (int i = 1; i <= terminos; i++) {
      System.out.print(numero1 + ", ");
      fibonacci = numero2 + numero1;
      numero1 = numero2;
      numero2 = fibonacci;
    }
  }    
}

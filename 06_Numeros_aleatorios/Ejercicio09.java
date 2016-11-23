/**
* 
* Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa generará numeros aleatorios pares entre 0 y 100");
    System.out.println(" y no terminará hasta que salga el número 24.");
    System.out.println("-----------------------------------------------------------------------------");
    int contador = 0; // Almacena la cantidad de números que van saliendo
    int numeros;
    System.out.println();
    
    // Genera los números aleatorios que sean pares entre 0 y 100 ambos incluídos hasta que salga el 24
    // Y Muestra los resultados por pantalla
    do {
      numeros = (int)(Math.random()*101);
      if (numeros % 2 == 0) {
        System.out.print(numeros + " ");
        contador++;
      }
    } while (numeros != 24);
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.println("\nSe han generado " + contador + " números pares.");
  }
}
    

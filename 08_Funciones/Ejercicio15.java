/**
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@, este programa mostrará los números primos entre 1 y 1000.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Itera desde el 1 al 1000 y comprueba si cada número es primo, en ese caso lo muestra.
    for (int i = 1; i <= 1000; i++) {
      if (Maths.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}

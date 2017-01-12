/**
 * 
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@, este programa mostrará todos los números capicúa entre 1 y 99999.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Itera desde el 1 al 99999 y comprueba si cada número es capicúa, en ese caso lo muestra.
    for (int i = 1; i <= 99999; i++) {
      if (Maths.esCapicua(i)) {
        System.out.print(i + "  ");
      }
    }
  }
}

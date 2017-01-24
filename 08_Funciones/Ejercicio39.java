/**
 * Esta función convierte los dígitos del número n en las correspondientes
 * palabras y lo devuelve todo en una cadena de caracteres.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import algoritmos.Otros;
import algoritmos.Array;
import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa convierte un número introducido por usted en.");
    System.out.println(" sus correspondientes palabras.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = s.nextInt();
    
    // Realiza la conversión del número a sus correspondientes palabras
    System.out.println("\n" + Otros.convierteEnPalabras(numero));
  }
}


/**
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import algoritmos.Otros;
import algoritmos.Array;
import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@, este programa convertirá a código Morse un número introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = s.nextInt();
    
    // Realiza la conversión al sistema Morse
    System.out.println("\n" + Otros.convierteEnMorse(numero));
  }
}


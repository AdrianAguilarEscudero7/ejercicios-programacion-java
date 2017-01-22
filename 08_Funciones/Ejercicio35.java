/**
 * Convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import algoritmos.Otros;
import java.util.Scanner;

public class Ejercicio35{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nBienvenid@ al sistema de palotes, este programa convertirá cualquier número");
    System.out.println(" entero positivo al sistema de palotes.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = s.nextInt();
    
    System.out.println("\n" + Otros.convierteEnPalotes(numero));
  }
}

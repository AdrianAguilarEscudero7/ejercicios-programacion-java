/**
 * 
 * Escribe un programa que pase de binario a decimal.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@ a la calculadora de binario a decimal.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    System.out.print("Por favor, introduzca un número binario: ");
    int numeroBin = s.nextInt();
    
    // Realiza la conversión de binario a decimal
    int numeroDecimal = Maths.binDecimal(numeroBin);
    
    System.out.print("\nEl número " + numeroBin + " convertido a decimal es el " + numeroDecimal);
  }
}

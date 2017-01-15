/**
 * 
 * Escribe un programa que pase de decimal a binario.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@ a la calculadora de decimal a binario.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    System.out.print("\nPor favor, introduzca un número en base 10: ");
    int numeroBase10 = s.nextInt();
    System.out.println();
    
    // Se realiza la conversión de decimal a binario
    String numBin = Maths.DecimalBin(numeroBase10);
    
    System.out.print("El " + numeroBase10 + " convertido a binario es el: " + numBin);
  }
}
    

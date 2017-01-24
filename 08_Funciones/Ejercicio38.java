/**
 * Devuelve un array con todos los números capicúa que se 
 * encuentren en otro array que se pasa como parámetro.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import algoritmos.Otros;
import algoritmos.Array;
import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa devolverá sólo los números capicúa de un array");
    System.out.println(" introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Se introduce el tamaño del array por teclado
    System.out.print("Por favor, introduzca un tamaño para el array: ");
    int tamaño = s.nextInt();
    
    int[] array = new int[tamaño];
    
    // Se introducen los números en el array
    for (int i = 0; i < tamaño; i++) {
      System.out.print("\nPor favor, vaya introduciendo números y pulsando [Intro]: ");
      int numero = s.nextInt();
      
      array[i] = numero;
    }
    System.out.println("\n");
    
    // Realiza el filtrado de números capicúa
    Array.muestraArrayInt(Otros.filtraCapicuas(array));
  }
}

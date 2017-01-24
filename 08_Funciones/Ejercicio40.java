/**
 * Devuelve un array con todos los números que contienen el 7 
 * (por ej. 7, 27, 782) que se encuentren 
 * en otro array que se pasa como parámetro.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import algoritmos.Otros;
import algoritmos.Array;
import java.util.Scanner;

public class Ejercicio40 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa devolverá sólo los números que contengan un 7");
    System.out.println(" de los números contenidos en el array introducido por usted.");
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
    
    // Realiza el filtrado de números que contengan el 7
    Array.muestraArrayInt(Otros.filtraCon7(array));
  }
}

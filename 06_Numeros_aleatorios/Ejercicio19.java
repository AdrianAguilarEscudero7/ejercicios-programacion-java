/**
* 
* Escribe un programa que muestre 50 números enteros aleatorios comprendi-
* dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
* luego el máximo de los pares el mínimo de los impares y la media de todos los
* números generados.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará 50 números enteros aleatorios entre -100 y 200");
    System.out.println(" , el máximo de los pares, el mínimo de los impares y la media de todos los números.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    int maximoPar = -100; // Almacena una cantidad mínima para determinar el número máximo
    int minimoImpar = 200; // Almacena una cantidad máxima para determinar el número mínimo
    int numeros;
    int suma = 0; // Almacena la suma total 
    
    // Genera los 50 números aleatorios
    for (int i = 1; i <= 50; i++) {
      numeros = (int)(Math.random()*301-100);
      
      // Si el número aleatorio es par y mayor que el máximo anterior, se actualiza el máximo
      if ((numeros % 2 == 0) && (numeros > maximoPar)) {
        maximoPar = numeros;
      } else if ((numeros % 2 != 0) && (numeros < minimoImpar)) { // Si es impar y menor que el mínimo anterior, se actualiza
        minimoImpar = numeros;
      }
      System.out.print(numeros + " ");
      suma = suma + numeros;
    }
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("\nEL máximo de los pares es el " + maximoPar);
    System.out.println("\nEl mínimo de los impares es el " + minimoImpar);
    System.out.println("\nLa media de todos los números es de " + suma/50);
  }
}

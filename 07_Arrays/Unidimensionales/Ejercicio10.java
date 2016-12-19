/**
* 
* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
* y que los almacene en un array. El programa debe ser capaz de pasar todos
* los números pares a las primeras posiciones del array (del 0 en adelante) y
* todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
* es necesario.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa generará 20 números aleatorios entre 0 y 100 y ");
    System.out.println(" los almacenará en un array. En las primeras posiciones estarán los pares.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] = new int[20];
    int par[] = new int[20]; // Almacena los números pares
    int impar[] = new int[20]; // Almacena los números impares
    int contadorPares = 0; 
    int contadorImpares = 0;
    
    // Almacena en el array par o impar los números pares o impares que hayan salido al azar
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      if (numero[i] % 2 == 0) {
        par[contadorPares++] = numero[i];
      } else {
        impar[contadorImpares++] = numero[i];
      }
    }
    
    // Muestra el array normal
    System.out.println("El array normal arriba, y abajo el modificado:\n");
    for (int n : numero) {
      System.out.print(n + " ");
    }
    System.out.println("\n-----------------------------------------------------------------------------");
    
    // Vuelve a almacenar en el primer array todos los números pares que hayan salido
    for (int j = 0; j < contadorPares; j++) {
      numero[j] = par[j];
    }
    // Despúes almacena los impares en los huecos restantes
    for (int k = contadorPares; k < 20; k++) {
      numero[k] = impar[k - contadorPares];
    }
    // Finalmente muestra el array modificado
    for (int m : numero) {
      System.out.print(m + " ");
    }
  }
}

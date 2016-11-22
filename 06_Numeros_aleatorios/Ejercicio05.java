/**
* 
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la media
* de esos números.
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará 50 números aleatorios entre 100 y 199, ");
    System.out.println(" el máximo, el mínimo y la media de esos números.");
    System.out.println("-----------------------------------------------------------------------------");
    int minimo = Integer.MAX_VALUE; // Almacena un valor muy alto para hacer el mínimo
    int maximo = Integer.MIN_VALUE; // Almacena un valor muy pequeño para hacer el máximo
    int suma = 0; // Almacenará la suma total de todos los números
    System.out.println();
    
    // Genera los 50 números aleatorios, y realiza el mínimo, el máximo y la suma total
    for (int i = 0; i < 50; i++) {
      int numeros = (int)(Math.random()*100+100);
      System.out.print(numeros + " ");
      if (numeros > maximo) {
        maximo = numeros;
      } else if (numeros < minimo) {
        minimo = numeros;
      }
      suma = suma + numeros;
    }
    // Muestra los resultados por pantalla
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.println("\nEl número más pequeño de esos 50 es el " + minimo);
    System.out.println("\nEl número más grande de esos 50 es el " + maximo);
    System.out.println("\nLa media de esos números es de " + suma / 2);
  }
}

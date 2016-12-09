/**
* 
* Escribe un programa que rellene un array de 100 elementos con números ente-
* ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
* el programa mostrará el array y preguntará si el usuario quiere destacar el
* máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
* el número destacado entre dobles asteriscos.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa destacará el máximo o el mínimo, según lo que usted elija");
    System.out.println(" , de 100 elementos aleatorios en un array entre 0 y 500.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] = new int[100];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    // Genera 100 números aleatorios entre 0 y 500 y los almacena en el array numero
    // Luego, almacena el máximo y mínimo número aleatorio que haya salido    
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()*501);
      System.out.print(numero[i] + " ");
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      } 
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    System.out.print("¿Qué número desea destacar? (1 - mínimo, 2 - máximo): ");
    int minMax = s.nextInt();
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    String amarillo = "\u001B[33m";
    String blanco = "\u001B[37m";
    
    // Genera de nuevo los 100 números aleatorios con el máximo o mínimo destacado
    for (int j = 0; j < 100; j++) {
      if ((numero[j] == minimo) && (minMax == 1)) {
        System.out.print(amarillo + "**" + numero[j] + "** " + blanco);
      } else if ((numero[j] == maximo) && (minMax == 2)) {
        System.out.print(amarillo + "**" + numero[j] + "** " + blanco);
      } else {
        System.out.print(numero[j] + " ");
      }
    }
  }
}

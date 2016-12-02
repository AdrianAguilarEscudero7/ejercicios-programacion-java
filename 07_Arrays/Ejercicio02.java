/**
* 
* Define un array de 10 caracteres con nombre simbolo y asigna valores a los
* elementos según la tabla que se muestra a continuación. Muestra el contenido
* de todos los elementos del array. ¿Qué sucede con los valores de los elementos
* que no han sido inicializados?
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    /**
    * 
    * No terminado, no se muestra como debiera
    * 
    */
    
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará el contenido de un array de 10 dimensiones.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    char simbolo[] = new char[10]; // Almacenamos un array de dimensión 10
    
    // Almacenamos símbolos en cada posición
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    System.out.print("Índice ");
    
    // Generamos 10 números del 0 al 9 para el índice
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d ", i);
    }
    
    System.out.println("\n       ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor  ");
    
    // Leemos el contenido de las 10 posiciones del array y las almacenamos en n
    for (char n : simbolo) {
      System.out.printf("║%4s ", n);
    }
    
    System.out.println("║\n       ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
  }
}

/**
* 
* Realiza un programa que pida 10 números por teclado y que los almacene en
* un array. A continuación se mostrará el contenido de ese array junto al índice
* (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
* “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
* ambos números están entre 0 y 9. El programa deberá colocar el número de
* la posición inicial en la posición final, rotando el resto de números para que no
* se pierda ninguno. Al final se debe mostrar el array resultante.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa almacenará 10 números introducidos por usted, a");
    System.out.print(" continuación se le pedirán dos posiciones, una inicial y otra final, y colocará");
    System.out.println(" el número de la posición inicial en la posición final.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] = new int[10]; // Almacena los 10 números introducidos por el usuario
    
    // Se introducen los 10 números por teclado
    for (int i = 0; i < 10; i++) {
      System.out.print("\nPor favor, introduzca 10 números, vaya pulsando [INTRO]: ");
      numero[i] = s.nextInt();
    }
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Genera el índice de la tabla
    System.out.println("El array normal:\n");
    System.out.print("Índice   ");
    for (int j = 0; j < 10; j++) {
      System.out.printf("%-6d", j);
    }
    
    // Genera la tabla y los valores del array normal
    System.out.println("\n      ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor ");
    for (int n : numero) {
      System.out.printf("║%3d  ", n);
    }
    System.out.println("║\n      ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
    
    System.out.println("-----------------------------------------------------------------------------");
    
    int posicionInicial;
    int posicionFinal;
   
    // Se introducen las posiciones iniciales y finales y comprueba que se introduzcan correctamente
    do {
      do {
        System.out.print("\nIntroduzca la posición inicial del número que desea mover (entre 0 y 9): ");
        posicionInicial = s.nextInt();
      } while ((posicionInicial < 0) || (posicionInicial > 9));
    
      do {
        System.out.print("\nAhora, introduzca la posición final donde quiere colocarlo (entre 0 y 9): ");
        posicionFinal = s.nextInt();
      } while ((posicionFinal < 0) || (posicionFinal > 9));
      
      if (posicionInicial > posicionFinal) {
        System.out.print("\n-¡Error!, la posición inicial debe ser menor a la posición final.\n");
        System.out.println("-------------------------------------------------------------------------");
      }
    } while (posicionInicial > posicionFinal);  
    
    // Se coloca el valor de la posición inicial en la posición final introducida, y se rotan los números
    // de la derecha del valor de la posición final hasta el valor de la posición inicial
    int aux = numero[9];
    for (int k = 9; k > posicionFinal; k--) {
      numero[k] = numero[k-1];
    }
    numero[posicionFinal] = numero[posicionInicial];
    for (int l = posicionInicial; l > 0; l--) {
      numero[l] = numero[l-1];
    }
    numero[0] = aux;
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Genera el índice de la tabla
    System.out.println("El array modificado:\n");
    System.out.print("Índice   ");
    for (int x = 0; x < 10; x++) {
      System.out.printf("%-6d", x);
    }
    
    // Genera la tabla y los valores del array modificado
    System.out.println("\n      ╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗");
    System.out.print("Valor ");
    for (int m : numero) {
      System.out.printf("║%3d  ", m);
    }
    System.out.println("║\n      ╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝");
  } 
}

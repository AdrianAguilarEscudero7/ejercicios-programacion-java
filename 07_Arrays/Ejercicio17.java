/**
* 
* Escribe un programa que muestre por pantalla un array de 10 números enteros
* generados al azar entre 0 y 100. A continuación, el programa debe pedir
* un número al usuario. Se debe comprobar que el número introducido por
* teclado se encuentra dentro del array, en caso contrario se mostrará un
* mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
* introduzca uno correctamente. A continuación, el programa rotará el array
* hacia la derecha las veces que haga falta hasta que el número introducido
* quede situado en la posición 0 del array. Por último, se mostrará el array rotado
* por pantalla.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa mostrará por pantalla 10 números aleatorios entre 0 ");
    System.out.print(" y 100. A continuación se le pedirá un número, y se comprobará que el número introducido");
    System.out.print(" se encuentra dentro del array. Finalmente, si el número introducido se encuentra dentro");
    System.out.println(" del array, se rotará el array hasta que el número introducido quede en la posición 0.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int[] numero = new int[10];
    
    // Almacena los 10 números al azar entre 0 y 100 ambos incluídos
    for (int i = 0; i < 10; i++) {
      numero[i] = (int)(Math.random()*101);
    }
    
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
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    

    int numeroIntroducido = 0;
    int j;
    boolean seEncuentra = false;
    
    // Se introduce un número por teclado y se comprueba que está en el array, se repite la acción si no lo está.
    do {
      System.out.print("Por favor, introduzca un número entero positivo: ");
      numeroIntroducido = s.nextInt();
      
      seEncuentra = false;
      
      j = 0;
      
      while ((j < 10) && (!seEncuentra)) {
        if (numeroIntroducido != numero[j]) {
          j++;
        } else {
          seEncuentra = true;;
        }
      }
      if (!seEncuentra) {
        System.out.println("\nLo siento, el número que ha introducido no se encuentra en el array. Inténtelo de nuevo.\n");
      }
    } while (!seEncuentra);
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    // Se rota el array sólo si el número introducido no está en la posición 0
    while (numero[0] != numeroIntroducido) {
      int aux = numero[9];
      for (int k = 9; k > 0; k--) {
        numero[k] = numero[k-1];
      }
      numero[0] = aux;
    }
    
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

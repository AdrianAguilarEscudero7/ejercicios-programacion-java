/**
* 
* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
* entre 1 y un número leído por teclado.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@, en este programa mostraremos, contaremos, y sumaremos los múltiplos de 3");
    System.out.println(" comprendidos entre 1 y un número introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    int contador = 0; // Para contar los múltiplos de 3
    int suma = 0; // Para sumarlos
    
    // Salto de línea
    System.out.println();
    
    // Comprueba qué números son múltiplos de 3 y los muestra
    for (int i = 1; i <= numeroIntroducido; i++) {
      if (i % 3 == 0) {
        System.out.print(i + ", ");
        contador++;
        suma = suma + i;
      }
    }
    // Mostramos los resultados por pantalla
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.println("\nEntre el 1 y el " + numeroIntroducido + " hay " + contador + " múltiplos de 3.");
    System.out.println("\nLos " + contador + " múltiplos de 3, suman: " + suma);
  }
}

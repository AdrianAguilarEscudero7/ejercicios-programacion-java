/**
* 
* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
* con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
* convertir un entero en un carácter.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@ a MATRIX");
    System.out.println("---------------------");
    char caracteres; // Almacenamos los caracteres del código ASCII
    String verde = "\033[32m"; // Almacenamos el código para el color verde
    System.out.println();
    
    // Generamos los caracteres aleatorios con interrupcion de 1 milisegundo para darle similitud con Matrix
    for (int i = 0; i < 30000; i++) {
      caracteres = (char)(Math.random()*95+32);
      Thread.sleep(1);
      System.out.print(verde + caracteres);
    }
  }
}

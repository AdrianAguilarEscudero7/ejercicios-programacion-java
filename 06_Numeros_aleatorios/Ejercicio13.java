/**
* 
* Escribe un programa que simule la tirada de dos dados. El programa deberá
* continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
* dados tengan el mismo valor.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará la tirada de dos dados hasta que ambas sean iguales");
    System.out.println("-----------------------------------------------------------------------------");
    int dado1 = 0;
    int dado2 = 0;
    System.out.println();
    
    // Generamos la tirada de dos dados hasta que ambos tengan el mismo valor
    do {
      dado1 = (int)(Math.random()*6+1);
      dado2 = (int)(Math.random()*6+1);
      System.out.println("Ha sacado un " + dado1 + " y un " + dado2);
    } while (dado1 != dado2);
  }
}

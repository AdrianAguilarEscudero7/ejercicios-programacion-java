/**
* 
* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
* también la suma total (los puntos que suman entre los tres dados). 
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará la tirada de 3 dados y realizará la suma total.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    int contador = 1;
    int suma = 0;
    
    // Realizamos la tirada de dados aleatoria
    for (int i = 0; i < 3; i++) {
      int dado = (int)(Math.random()*6+1);
      System.out.println("El dado " + contador + " ha sacado: " + dado);
      suma = suma + dado; // Sumamos el total de los 3 dados
      contador++;
      System.out.println();
    }
    System.out.println("\nLa suma total de los 3 dados es " + suma);
  }
}

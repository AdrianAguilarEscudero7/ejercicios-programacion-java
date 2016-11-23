/**
* 
* Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
* nas para los 14 partidos y el pleno al quince (15 filas).
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará 3 apuestas de la quiniela en 3 columnas");
    System.out.println(" para los 14 partidos y el pleno al 15.");
    System.out.println("-----------------------------------------------------------------------------\n");
    String tipo1 = ""; 
    String tipoX = "";
    String tipo2 = "";
    int quiniela = 0;
    
    // Genera aleatoriamente la quiniela con sus 14 filas y 3 columnas
    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 3; j++) {
        quiniela = (int)(Math.random()*3+1);
        switch (quiniela) {
          case 1:
            tipo1 = "1";
            System.out.printf("|%s    |", tipo1);
            break;
          case 2:
            tipoX = "x";
            System.out.printf("|  %s  |", tipoX);
            break;
          case 3:
            tipo2 = "2";
            System.out.printf("|    %s|", tipo2);
            break;
          default:
            System.out.println("Error.");
        }
      }
      System.out.println();
    }
    // Genera el pleno al 15 aleatoriamente
    quiniela = (int)(Math.random()*3+1);
    System.out.println("---------------------");
    if (quiniela == 1) { 
      System.out.printf(" Pleno al 15: |%s    |", tipo1);
    } else if (quiniela == 2) {
      System.out.printf(" Pleno al 15: |  %s  |", tipoX);
    } else if (quiniela == 3) {
      System.out.printf(" Pleno al 15: |    %s|", tipo2);
    }
  }
}

/**
* 
* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
* de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
* 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio08 {
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
        quiniela = (int)(Math.random()*6+1);
        switch (quiniela) {
          case 1:
          case 2:
          case 3:
            tipo1 = "1";
            System.out.printf("|%s    |", tipo1);
            break;
          case 4:
          case 5:
            tipoX = "x";
            System.out.printf("|  %s  |", tipoX);
            break;
          case 6:
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
    quiniela = (int)(Math.random()*6+1);
    System.out.println("---------------------");
    if ((quiniela == 1) || (quiniela == 2)  || (quiniela == 3)) { 
      System.out.printf(" Pleno al 15: |%s    |", tipo1);
    } else if ((quiniela == 4) || (quiniela == 5)) {
      System.out.printf(" Pleno al 15: |  %s  |", tipoX);
    } else if (quiniela == 6) {
      System.out.printf(" Pleno al 15: |    %s|", tipo2);
    }
  }
}

/**
* 
* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
* aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
* final aparecerá el número de suspensos, el número de suficientes, el número
* de bienes, etc.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará 20 notas generadas al azar y el número de éstas.");
    System.out.println("-----------------------------------------------------------------------------");
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int notas; // Almacena las notas aleatorias
    System.out.println();
    
    // Generamos las 20 notas aleatorias y mostramos el número de cada una por pantalla
    for (int i = 0; i < 20; i++) {
      notas = (int)(Math.random()*5+1);
      switch (notas) {
        case 1:
          System.out.print("suspenso, ");
          contador1++;
          break;
        case 2:
          System.out.print("suficiente, ");
          contador2++;
          break;
        case 3:
          System.out.print("bien, ");
          contador3++;
          break;
        case 4:
          System.out.print("notable, ");
          contador4++;
          break;
        case 5:
          System.out.print("sobresaliente, ");
          contador5++;
          break;
        default:
          System.out.print("Nada.");
      }
    }
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.println("\nEl número de suspensos es " + contador1);
    System.out.println("\nEl número de suficientes es " + contador2);
    System.out.println("\nEl número de bienes es " + contador3);
    System.out.println("\nEl número de notables es " + contador4);
    System.out.println("\nEl número de sobresalientes es " + contador5);
  }
}

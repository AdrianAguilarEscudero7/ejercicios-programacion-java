/**
* 
* Realiza un programa que pinte por pantalla diez líneas formadas por carac-
* teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
* entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
* aleatoria entre 1 y 40 caracteres.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, el programa pintará por pantalla diez líneas formadas por caracteres");
    System.out.println(". El carácter se pintará de manera aleatoria.");
    System.out.println("-----------------------------------------------------------------------------");
    int caracteres = 0; // Almacena los caracteres aleatorios en cada línea
    int longitud = 0; // Almacena la longitud aleatoria de cada línea
    System.out.println();
    
    // Generamos las 10 líneas, las longitudes aleatorias, los caracteres aleatorios y los mostramos
    for (int i = 0; i < 10; i++) {
      longitud = (int)(Math.random()*40+1);
      for (int j = 0; j < longitud; j++) {
        caracteres = (int)(Math.random()*6+1);
        switch (caracteres) {
          case 1:
            System.out.print("*");
            break;
          case 2:
            System.out.print("-");
            break;
          case 3:
            System.out.print("=");
            break;
          case 4:
            System.out.print(".");
            break;
          case 5:
            System.out.print("|");
            break;
          case 6:
            System.out.print("@");
            break;
          default:
            System.out.print("Nada.");
        }
      }
      System.out.println();
    }
  }
}

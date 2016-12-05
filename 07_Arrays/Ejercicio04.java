/**
* 
* Define tres arrays de 20 números enteros cada una, con nombres numero,
* cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
* array cuadrado se deben almacenar los cuadrados de los valores que hay en el
* array numero. En el array cubo se deben almacenar los cubos de los valores que
* hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
* en tres columnas.
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Bienvenid@, este programa mostrará 3 columnas de 20 números aleatorios cada una");
    System.out.println(", la segunda mostrará el cuadrado y la tercera el cubo de esos 20 números aleatorios.");
    System.out.println("------------------------------------------------------------------------------");
    System.out.println();
    
    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];
    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    
    System.out.print("|  n  |   n²  |   n³   |\n");
    System.out.println("------------------------");
    for (int j = 0; j < 20; j++) {
      System.out.printf("|%4d |%6d |%7d |\n", numero[j], cuadrado[j], cubo[j]);
    }
  }
}

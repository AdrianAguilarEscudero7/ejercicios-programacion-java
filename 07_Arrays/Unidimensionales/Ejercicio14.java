/**
* 
* Escribe un programa que pida 8 palabras y las almacene en un array. A
* continuación, las palabras correspondientes a colores se deben almacenar al
* comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
* auxiliares como quieras. Los colores que conoce el programa deben estar en
* otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
* blanco y morado.
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa pedirá 8 palabras y las almacenará en un array. Luego,");
    System.out.print(" ordenará al comienzo las palabras correspondientes a colores, y a continuación, las que");
    System.out.println(" no son colores.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    String color[] = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };
    
    String palabraIntroducida[] = new String[8];
    String auxColor[] = new String[8]; // Almacena primero los colores, luego las palabras
    int contadorColores = 0;
    
    // Se introducen y almacenan las palabras por teclado, si son colores los almacena en el array auxColor
    for (int i = 0; i < 8; i++) {
      System.out.print("\nIntroduzca 8 palabras (si es un color debe estar entre los 9 básicos): ");
      palabraIntroducida[i] = s.nextLine().toLowerCase();
      
      for (String colores : color) {
        if (palabraIntroducida[i].equals(colores)) {
          auxColor[contadorColores++] = colores;
        }
      }
    }
    
    // Almacena en los huecos restantes del array auxColor las palabras que no fueron colores
    for (int j = 0; j < 8; j++) {
      boolean esColor = false;
      
      for (String colores : color) {
        if (palabraIntroducida[j].equals(colores)) {
          esColor = true;
        }
      }
      if (!esColor) {
        auxColor[contadorColores++] = palabraIntroducida[j];
      }
    } 
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    // Genera el índice de la tabla
    System.out.println("El array normal:\n");
    System.out.print("Índice");
    for (int x = 0; x < 8; x++) {
      System.out.printf("%5s    ", x);
    }
    
    // Genera la tabla y los valores del array normal
    System.out.println("\n      ╔════════╦════════╦════════╦════════╦════════╦════════╦════════╦════════╗");
    System.out.print("Valor ");
    for (String n : palabraIntroducida) {
      System.out.printf("║%-8s", n);
    }
    System.out.println("║\n      ╚════════╩════════╩════════╩════════╩════════╩════════╩════════╩════════╝");
    
    System.out.println("\n-----------------------------------------------------------------------------\n");
    
    // Genera el índice de la nueva tabla modificada
    System.out.println("El array modificado:\n");
    System.out.print("Índice");
    for (int y = 0; y < 8; y++) {
      System.out.printf("%5s    ", y);
    }
    
    // Genera la tabla y los nuevos valores del array modificado
    System.out.println("\n      ╔════════╦════════╦════════╦════════╦════════╦════════╦════════╦════════╗");
    System.out.print("Valor ");
    for (String m : auxColor) {
      System.out.printf("║%-8s", m);
    }
    System.out.println("║\n      ╚════════╩════════╩════════╩════════╩════════╩════════╩════════╩════════╝");
  }
}

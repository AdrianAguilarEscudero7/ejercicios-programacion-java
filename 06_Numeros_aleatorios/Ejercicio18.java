/**
* 
* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
* sustituir el color blanco por colores más alegres. Realiza un programa que
* genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
* cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
* que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
* violeta y naranja.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@ al pintamonas, voy a pintar sus 3 dormitorios de manera aleatoria");
    System.out.println(" de rojo, azul, verde, amarillo, violeta o naranja, sin colores repetidos.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    System.out.print("Voy a pintar sus 3 dormitorios de estos 3 colores: ");
    
    int colores = 1; 
    int tipoColor; // Almacena el número para el tipo de color aleatorio
    int repetido = 0; // Almacena el mismo número que salga de manera aleatoria
    int primerColor = 0; // Almacena sólo el primer número que salga de manera aleatoria
    
    // Genera los 3 colores aleatorios sin repetirse ninguno
    while (colores <= 3) {
      tipoColor = (int)(Math.random()*6+1);
      
      // Si es distinto al color repetido o al primer color, genera un color
      if ((tipoColor != repetido) && (tipoColor != primerColor)) {
        
        switch (tipoColor) {
          case 1:
            System.out.print("Rojo ");
            break;
          case 2:
            System.out.print("Azul ");
            break;
          case 3:
            System.out.print("Verde ");
            break;
          case 4:
            System.out.print("Amarillo ");
            break;
          case 5:
            System.out.print("Violeta ");
            break;
          case 6:
            System.out.print("Naranja ");
            break;
          default:
            System.out.print("Nada.");
        }
        if (colores == 2) {
          System.out.print("y ");
        }
        
        // Si colores es igual a 1 almacena el primer color que salió para que no se vuelva a repetir
        if (colores == 1) {
          primerColor = tipoColor;
        } else {
          repetido = tipoColor;
        }
        colores++;
      }
    }
  }
}

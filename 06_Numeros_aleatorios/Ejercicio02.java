/**
* 
* Realiza un programa que muestre al azar el nombre de una carta de la
* baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
* diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
* cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
* sería el 1). Para convertir un número en una cadena de caracteres podemos
* usar String.valueOf(n) . 
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará al azar el nombre de una carta de la baraja francesa.");
    int palo = (int)(Math.random()*4+1);
    int carta = (int)(Math.random()*13+1);
    String tipoCarta = ""; // ALmacena el tipo de carta
    String tipoPalo = ""; // Almacena el tipo de palo
    
    // Selecciona un tipo de palo aleatorio
    switch (palo) {
      case 1:
        tipoPalo = "picas.";
        break;
        
      case 2:
        tipoPalo = "corazones.";
        break;
        
      case 3:
        tipoPalo = "diamantes.";
        break;
        
      case 4:
        tipoPalo = "tréboles.";
        break;
        
      default:
        tipoPalo = "nada.";
    }  
    
    // Selecciona un tipo de carta aleatoria si es igual a 1 o mayor que 10, para las cartas especiales
    if ((carta == 1) || (carta > 10)) {
      switch (carta) {
        case 1:
          tipoCarta = "As";
          break;
        
        case 11:
          tipoCarta = "J";
          break;
          
        case 12:
          tipoCarta = "Q";
          break;
          
        case 13:
          tipoCarta = "K";
          break;
          
        default:
          tipoCarta = "Nada";
      }
      System.out.print("\nHa sacado el/la " + tipoCarta + " de " + tipoPalo);
    } else {
      System.out.print("\nHa sacado el " + carta + " de " + tipoPalo);
    }
  }
}

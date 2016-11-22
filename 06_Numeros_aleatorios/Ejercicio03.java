/**
* 
* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
* de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
      
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará al azar el nombre de una carta de la baraja francesa.");
    int palo = (int)(Math.random()*4+1);
    int carta = (int)(Math.random()*10+1);
    String tipoCarta = ""; // ALmacena el tipo de carta
    String tipoPalo = ""; // Almacena el tipo de palo
    
    // Selecciona un tipo de palo aleatorio
    switch (palo) {
      case 1:
        tipoPalo = "espadas.";
        break;
        
      case 2:
        tipoPalo = "copas.";
        break;
        
      case 3:
        tipoPalo = "bastos.";
        break;
        
      case 4:
        tipoPalo = "oros.";
        break;
        
      default:
        tipoPalo = "nada.";
    }  
    
    // Selecciona un tipo de carta aleatoria si es igual a 1 o mayor que 7, para las cartas especiales
    if ((carta == 1) || (carta > 7)) {
      switch (carta) {
        case 1:
          tipoCarta = "As";
          break;
        
        case 8:
          tipoCarta = "Sota";
          break;
          
        case 9:
          tipoCarta = "Caballo";
          break;
          
        case 10:
          tipoCarta = "Rey";
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

  

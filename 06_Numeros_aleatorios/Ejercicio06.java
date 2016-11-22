/**
* 
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto.
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa pensará un número al azar entre 0 y 100. Usted deberá");
    System.out.println(" adivinarlo y para ello tendrá 5 oportunidades.");
    System.out.println("-----------------------------------------------------------------------------");
    int contador = 4; 
    int numeroSecreto = (int)(Math.random()*101); // Almacenamos el número secreto a adivinar
    int numeroIntroducido = 0; // Almacenamos el número introducido por el usuario
    
    // Realizamos las preguntas hasta que el usuario acierte o se le acaben las oportunidades
    // Mostramos los resultados por pantalla
    do {
      System.out.print("\n¿Qué número es el que estoy pensando?: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if (numeroIntroducido < numeroSecreto) {
        System.out.println("\n¡Ha fallado!, el número que ha introducido es menor que el que estoy pensando...");
        System.out.println("\nLe quedan " + contador + " oportunidades...");
      } else if (numeroIntroducido > numeroSecreto) {
        System.out.println("\n¡Ha fallado!, el número que ha introducido es mayor que el que estoy pensando...");
        System.out.println("\nLe quedan " + contador + " oportunidades...");
      } 
      if (numeroIntroducido == numeroSecreto) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\n¡Enhorabuena, lo ha adivinado!.");
      }
      contador--;
    } while ((contador >= 0) && (numeroIntroducido != numeroSecreto));
    System.out.println("\nEl número que estaba pensando era el " + numeroSecreto);
  }
}
    

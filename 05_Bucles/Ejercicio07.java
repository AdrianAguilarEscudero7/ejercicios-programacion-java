/**
* 
* Realiza el control de acceso a una caja fuerte. La combinación será un
* número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
* acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
* y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
* Tendremos cuatro oportunidades para abrir la caja fuerte.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    
    // Creamos la clase Scanner para introducir datos por teclado
    Scanner s = new Scanner(System.in);
    
    // Definimos las variables
    int claveApertura = 2772;
    int combinacion = 0;
    
    // Presentamos la caja fuerte
    System.out.println("\nBienvenid@ a su caja fuerte");
    System.out.println("---------------------------");
    System.out.println("\n    __________________");
    System.out.println("   /_________________/|");
    System.out.println("   |                | |");
    System.out.println("   |    SAFE BOX    | |");
    System.out.println("   |                | |");
    System.out.println("   |                | |");
    System.out.println("   | (#)            | |");
    System.out.println("   |                | |");
    System.out.println("   |                | /");
    System.out.println("   |________________|/");
    
    // Introducimos por teclado la combinación y mostramos el resultado
    System.out.print("\nPor favor, introduzca la combinación (4 dígitos): ");
    combinacion = Integer.parseInt(s.nextLine());
    if(combinacion == 2772) {
      System.out.println("\nSu caja fuerte se ha abierto satisfactoriamente.");
      System.out.println("     ________________");
      System.out.println("    /_______________/|");
      System.out.println("    |       /      | |");
      System.out.println("    |------ | SAFE | |");
      System.out.println("    |------ |      | |");
      System.out.println("    |------ |      | |");
      System.out.println("    |------ |      | |");
      System.out.println("    |------ | (#)  | |");
      System.out.println("    |------ |      | /");
      System.out.println("    |------ |      |/ ");
      System.out.println("    |------ |     /");
      System.out.println("    |_______|    /");
      System.out.println("            |   /");
      System.out.println("            |  /");
      System.out.println("            | /");
      System.out.println("            |/");
      
      // Si no es cierto, creamos el bucle correspondiente con 3 intentos más
    } else {
      for (int i = 1, intentos = 3; i < 4; i++, intentos--) { 
          System.out.println("\nLo siento... esa no es la combinación correcta, le quedan " + intentos + " intentos más.");
          System.out.print("\nVuelva a introducir la combinación (4 dígitos): ");
          combinacion = Integer.parseInt(s.nextLine());
      }
      
      // Si los 4 intentos son erróneos mostramos un mensaje por pantalla
      System.out.println("-----------------------------------------------------------------------------");
      System.out.println("\nLa caja fuerte se va a bloquear durante un tiempo, inténtelo más tarde.");
    }
  } 
}

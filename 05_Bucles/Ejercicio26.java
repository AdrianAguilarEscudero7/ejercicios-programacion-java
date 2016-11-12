/**
* 
* Realiza un programa que pida primero un número y a continuación un dígito.
* El programa nos debe dar la posición (o posiciones) contando de izquierda a
* derecha que ocupa ese dígito en el número introducido.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@, este programa dará la posición de un dígito que usted elija a partir");
    System.out.println(" de un número previamente introducido (no debe haber ceros en los extremos). ");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.print("\nAhora introduzca un dígito: ");
    int digitoIntroducido = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    int numeroReves = 0; // Almacena el número al revés
    int posicion = 1;
    
    System.out.print("\nEl dígito " + digitoIntroducido + " del número " + numeroIntroducido + " ocupa la/s posicion/es: ");
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Muestra la posición del número
    while (numeroReves > 0) {
      if ((numeroReves % 10) == digitoIntroducido) {
        System.out.print(posicion + " ");
      }
      numeroReves /= 10;
      posicion++;
    }
  }
}

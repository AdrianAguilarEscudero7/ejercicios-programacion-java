/**
* 
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
* por teclado.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("\nBienvenid@, por favor, introduzca un número por teclado: ");
    int numero = Integer.parseInt(s.nextLine());
    int digitos = 1;
    int numero2 = numero;
  
    // Creamos el bucle correspondiente
    while (numero2 >= 10) {
      numero2 = numero2 / 10;
      digitos++; 
    }
     System.out.print("\nEl número " + numero + ", tiene " + digitos + " dígitos.");
  }
}

    

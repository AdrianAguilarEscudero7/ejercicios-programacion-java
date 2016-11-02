/**
* 
* Escribe un programa que lea una lista de diez números y determine cuántos
* son positivos, y cuántos son negativos.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nBienvenid@, este programa leerá una lista de 10 números y determinará cuántos");
    System.out.println(" son positivos, y cuántos son negativos.");
    System.out.println("-----------------------------------------------------------------------------");
    int numero;
    int negativos = 0;
    int positivos = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("\nPor favor, introduzca un número: ");
      numero = Integer.parseInt(s.nextLine());
      
      if (numero < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("\nHay " + positivos + " números positivos, y " + negativos + " números negativos.");

    
    
  }
}

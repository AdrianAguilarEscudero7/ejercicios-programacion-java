/**
* 
* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
* hay dentro de un número. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos.
* 
* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 406783
* El 406783 contiene 4 dígitos pares y 2 dígitos impares.
* 
* Ejemplo 2:
* Por favor, introduzca un número entero positivo: 3177840
* El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio41 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos el número por teclado
    System.out.print("\nBienvenid@, este programa mostrará cuántos números pares e impares hay en");
    System.out.println(" un número introducido por teclado.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long numero = numeroIntroducido;
    long numeroReves = 0; // Almacena el número al revés
    long par; // Almacena el número que se comprobará si es par o impar
    int contadorPar = 0;
    int contadorImpar = 0;
    
    // Pone al número al revés
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Muestra la cantidad de números pares e impares que hay en el número introducido
    while (numeroReves > 0) {
      par = numeroReves % 10;
      if (par % 2 == 0) {
        contadorPar++;
      } else {
        contadorImpar++;
      }
      numeroReves /= 10;
    }
    System.out.print("\nEl " + numero + " contiene " + contadorPar + " dígitos pares y " + contadorImpar);
    System.out.print(" dígitos impares.");
  }
}

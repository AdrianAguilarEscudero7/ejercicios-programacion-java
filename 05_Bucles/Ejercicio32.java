/**
* 
* Escribe un programa que, dado un número entero, diga cuáles son y cuánto
* suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
* izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
* números largos.
* 
* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 94026782
* Dígitos pares: 4 0 2 6 8 2
* Suma de los dígitos pares: 22
* 
* Ejemplo 2:
* Por favor, introduzca un número entero positivo: 31779
* Dígitos pares:
* Suma de los dígitos pares: 0
* 
* Ejemplo 3:
* Por favor, introduzca un número entero positivo: 2404
* Dígitos pares: 2 4 0 4
* Suma de los dígitos pares: 10
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará los dígitos pares de un número entero positivo");
    System.out.println(" introducido por teclado y también los sumará.");
    System.out.println("-----------------------------------------------------------------------------");
    
    // Declaramos las variables
    long numeroIntroducido;
    long reves = 0; // Para almacenar el número al revés
    long suma = 0; // Para sumar los dígitos pares
    
    // Comprueba que el número introducido es entero y positivo
    do {
      System.out.print("\nPor favor, introduzca un número entero positivo: ");
      numeroIntroducido = Long.parseLong(s.nextLine());  
    } while (numeroIntroducido < 0);
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    System.out.print("\nDígitos pares: ");
    
    // Muestra los números pares y la suma de éstos
    while (reves > 0) {
      long par = reves % 10;
      if (par % 2 == 0) {
        System.out.print(par + " ");
        suma = suma + par;
      }
      reves /= 10;
    }
    System.out.println("\nSuma de los dígitos pares: " + suma);
  } 
}

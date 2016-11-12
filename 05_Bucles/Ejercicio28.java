/**
* 
* Escribe un programa que calcule el factorial de un número entero leído por
* teclado.
* Ejemplo:
* Por favor, introduzca un número entero: 6
* 6! = 720
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, en este programa calcularemos el factorial '!' de un número"); 
    System.out.println(" entero mayor que 0, introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    int numeroIntroducido;
    int factorial;
    
    // Introducimos el número por teclado y comprueba que es mayor que 0
    do {
      System.out.print("\nPor favor, introduzca un número entero mayor que 0: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
    } while (numeroIntroducido <= 0);
  
    factorial = numeroIntroducido;
    
    // Realiza el factorial al número introducido
    for (int i = numeroIntroducido-1; i >= 1; i--) {
     factorial = factorial * i;
    }
    
    // Muestra los resultados por pantalla
    System.out.print("\nEl " + numeroIntroducido + "! es, ");
    for (int j = numeroIntroducido; j >= 1; j--) {
     System.out.print(j + "·");
    }
    System.out.println(" = " + factorial);
  }
}

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
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@, en este programa calcularemos el factorial '!' de un número entero introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int factorial = numeroIntroducido;
    
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

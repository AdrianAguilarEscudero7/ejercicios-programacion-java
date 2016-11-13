/**
* 
* Escribe un programa que pida dos números por teclado y que luego mezcle en
* dos números diferentes los dígitos pares y los impares. Se van comprobando
* los dígitos de la siguiente manera: primer dígito del primer número, primer
* dígito del segundo número, segundo dígito del primer número, segundo
* dígito del segundo número, tercer dígito del primer número... Para facilitar
* el ejercicio, podemos suponer que el usuario introducirá dos números de la
* misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
* long en lugar de int donde sea necesario para admitir números largos.
*
* Ejemplo 1:
* Por favor, introduzca un número: 9402
* Introduzca otro número: 6782
* El número formado por los dígitos pares es 640822
* El número formado por los dígitos impares es 97
*
* Ejemplo 2:
* Por favor, introduzca un número: 137
* Introduzca otro número: 909
* El número formado por los dígitos pares es 0
* El número formado por los dígitos impares es 19379
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio34 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los números por teclado
    System.out.print("\nBienvenid@, este programa formará dos números, uno constituido por dígitos pares");
    System.out.println(" y otro constituido por dígitos impares, a partir de dos números introducidos por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número: ");
    long numeroIntroducido1 = Long.parseLong(s.nextLine());
    System.out.print("\nAhora introduzca otro número (de la misma longitud que el anterior): ");
    long numeroIntroducido2 = Long.parseLong(s.nextLine());
    
    // Declaramos las variables
    long revesPar1 = 0; // Almacena el primer número al revés que usaremos para los dígitos pares
    long revesPar2 = 0; // Almacena el segundo número al revés que usaremos para los dígitos pares
    long revesImpar1; // Almacena el primer número al revés que usaremos para los dígitos impares
    long revesImpar2; // Almacena el segundo número al revés que usaremos para los dígitos impares
    long numeroPar1;
    long numeroPar2;
    long numeroImpar1;
    long numeroImpar2;
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Pone el primer número al revés
    while (numeroIntroducido1 > 0) {
      revesPar1 = (revesPar1 * 10) + (numeroIntroducido1 % 10);
      numeroIntroducido1 /= 10;
    }
    revesImpar1 = revesPar1;
    
    // Pone el segundo número al revés
    while (numeroIntroducido2 > 0) {
      revesPar2 = (revesPar2 * 10) + (numeroIntroducido2 % 10);
      numeroIntroducido2 /= 10;
    }
    revesImpar2 = revesPar2;
    
    System.out.print("El número formado por los dígitos pares es: ");
    
    // Muestra los números pares del primer y segundo número consecutivamente
    while ((revesPar1 > 0) && (revesPar2 > 0)) {
      numeroPar1 = revesPar1 % 10;
      if (numeroPar1 % 2 == 0) {
        System.out.print(numeroPar1);
      }
      numeroPar2 = revesPar2 % 10;
      if (numeroPar2 % 2 == 0) {
        System.out.print(numeroPar2);
      }
      revesPar1 /= 10;
      revesPar2 /= 10;
    }
    
    System.out.print("\nEl número formado por los dígitos impares es: ");
    
    // Muestra los números impares del primer y segundo  número consecutivamente
    while ((revesImpar1 > 0) && (revesImpar2 > 0)) {
      numeroImpar1 = revesImpar1 % 10;
      if (numeroImpar1 % 2 != 0) {
        System.out.print(numeroImpar1);
      }
      numeroImpar2 = revesImpar2 % 10;
      if (numeroImpar2 % 2 != 0) {
        System.out.print(numeroImpar2);
      }
      revesImpar1 /= 10;
      revesImpar2 /= 10;
    }
  }
}

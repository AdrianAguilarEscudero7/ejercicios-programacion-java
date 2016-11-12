/**
* 
* Escribe un programa que muestre por pantalla todos los números enteros
* positivos menores a uno leído por teclado que no sean divisibles entre otro
* también leído de igual forma.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa mostrará todos los números enteros positivos menores");
    System.out.println(" a uno que usted introduzca, que no sean divisibles entre otro número también introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    int numeroIntroducido;
    int numeroIntroducido2;
    
    // Introducimos el número del límite por teclado y comprueba que es mayor que 0
    do {
      System.out.print("\nPor favor, introduzca un número entero mayor que 0 (donde quiera poner el límite): ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
    } while (numeroIntroducido <= 0);
    
    // Introducimos el número del cual no se mostrarán sus divisores y comprueba que es mayor que 0
    do {
      System.out.print("\nAhora introduzca un número del cual usted no quiera mostrar sus divisores (entero mayor que 0): ");
      numeroIntroducido2 = Integer.parseInt(s.nextLine());
    } while (numeroIntroducido2 <= 0);
    
    System.out.println("-------------------------------------------------------------------------------");
    System.out.print("\nLos números menores a " + numeroIntroducido + " que no son divisibles entre " + numeroIntroducido2);
    System.out.println(" son:\n");
    
    // Muestra los números no divisibles entre el número previamente introducido
    for (int i = 1; i < numeroIntroducido; i++) {
      if (i % numeroIntroducido2 != 0) {
        System.out.print(i + ", ");
      }
    } 
  }
}

/**
* 
* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
* muestre por pantalla separados por espacios. El programa pedirá entonces
* por teclado dos valores y a continuación cambiará todas las ocurrencias del
* primer valor por el segundo en la lista generada anteriormente. Los números
* que se han cambiado deben aparecer entrecomillados.
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("\nBienvenid@, este programa generará 100 números aleatorios entre 0 y 20 y cambiará");
    System.out.println(" un valor por otro que usted haya elegido.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int numero[] =  new int[100];
    
    // Genera los 100 números aleatorios entre 0 y 20
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random()*20);
    }
    // Muestra los 100 números aleatorios del array
    for (int n : numero) {
      System.out.print(n + " ");
    }
    // Recoge los valores por teclado
    System.out.println("\n-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un valor de los que haya salido que desee cambiar: ");
    int valor = Integer.parseInt(s.nextLine());
    
    System.out.print("\nAhora introduzca el valor por el que desea cambiarlo: ");
    int cambio = Integer.parseInt(s.nextLine());
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    String naranja = "\033[33m";
    String reiniciarColor = "\u001B[0m";
    
    // Genera los 100 números aleatorios con los nuevos valores intercambiados
    for (int k = 0; k < 100; k++) {
      if (numero[k] == valor) {
        numero[k] = cambio;
        System.out.print(naranja + "'" + numero[k] + "' ");
      } else {
        System.out.print(reiniciarColor + numero[k] + " ");
      }
    }
  }
}

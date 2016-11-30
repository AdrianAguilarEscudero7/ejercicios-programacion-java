/**
* 
* Escribe un programa que, dado un número introducido por teclado, elija al azar
* uno de sus dígitos.
*
* Ejemplo 1:
*
* Por favor, introduzca un número entero positivo: 406783
* 7
*
* Ejemplo 2:
*
* Por favor, introduzca un número entero positivo: 406783
* 3
*
* Ejemplo 3:

* Por favor, introduzca un número entero positivo: 406783
* 0
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, voy a elegir un dígito al azar de un número introducido por usted.");
    System.out.println("-----------------------------------------------------------------------------");
    
    int numero; // Almacena el número entero positivo introducido por el usuario
    
    // Itera hasta introducir un número entero positivo por teclado 
    do {
      System.out.print("\nPor favor, introduzca un número entero positivo: ");
      numero = Integer.parseInt(s.nextLine());
    } while (numero < 0);
    
    int numeroReves = 0; // Almacena el número al revés
    int longitud = 0; // Almacena la longitud del número introducido
    
    // Da la vuelta al número
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    
    int posicion = (int)(Math.random()*longitud); // Genera una posición aleatoria de 0 a la longitud del número introducido 
    int digito = 0; // Almacena un dígito según la posición aleatoria resultante
    
    // Recorre el número al revés hasta que llegue a la posición aleatoria
    for (int i = 0; i <= posicion; i++) {
      
      // Si i es igual a la posición, saca el último dígito del número restante
      if (i == posicion) {
        digito = numeroReves % 10;
      }
      numeroReves /= 10;
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("\nDel número que ha introducido, voy a elegir el dígito " + digito);
  }
}

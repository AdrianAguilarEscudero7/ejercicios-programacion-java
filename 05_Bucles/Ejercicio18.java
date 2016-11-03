/**
* 
* Escribe un programa que obtenga los números enteros comprendidos entre
* dos números introducidos por teclado y validados como distintos, el programa
* debe empezar por el menor de los enteros introducidos e ir incrementando de
* 7 en 7.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los números por teclado
    System.out.print("\nBienvenid@, este programa obtendrá los números enteros comprendidos entre");
    System.out.println(" dos números distintos introducidos por teclado (de 7 en 7).");
    System.out.println("----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero: ");
    int numero1 = Integer.parseInt(s.nextLine());
    System.out.print("\nAhora introduzca otro número entero (ha de ser distinto al anterior): ");
    int numero2 = Integer.parseInt(s.nextLine());
    
    // Creamos un bucle de error por si el segundo número es distinto
    while (numero2 == numero1) {
      System.out.print("\n¡Error!, por favor, introduzca un segundo número distinto: ");
      numero2 = Integer.parseInt(s.nextLine());
    }
    System.out.println("----------------------------------------------------------------------------\n");
    
    // Establecemos las condiciones para que se empiece siempre por el número menor introducido
    // Creamos los bucles correspondientes y mostramos los resultados por pantalla
    if ((numero2 > numero1) && ((numero2 - numero1) >= 7)) {
      System.out.println("Los números comprendidos entre " + numero1 + " y " + numero2 + " y, de 7 en 7, son:\n");
      do {
        System.out.print(numero1 + ", ");
        numero1 += 7;
      } while (numero1 < numero2);
    } else if ((numero2 < numero1) && ((numero1 - numero2) >= 7)) {
      System.out.println("Los números comprendidos entre " + numero2 + " y " + numero1 + " y, de 7 en 7, son:\n");
      do {
        System.out.print(numero2 + ", ");
        numero2 += 7;
      } while (numero2 < numero1);
    }
  }
}
    

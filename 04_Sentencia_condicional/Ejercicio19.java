/**
* 
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
* puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio19 {
  public static void main(String[] args) {
  
    // Introducimos el número por teclado
    System.out.print("\nPor favor, introduzca un número entero por teclado. (Máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    // Establecemos las condiciones y mostramos las soluciones por pantalla
    if ((numero > 0) && (numero < 10)) {
      System.out.print("\nEl número " + numero + " tiene: 1 dígito.");
    } else if ((numero >= 10) && (numero < 100)) {
      System.out.print("\nEl número " + numero + " tiene: 2 dígitos.");
    } else if ((numero >= 100) && (numero < 1000)) {
      System.out.print("\nEl número " + numero + " tiene: 3 dígitos.");
    } else if ((numero >= 1000) && (numero < 10000)) {
      System.out.print("\nEl número " + numero + " tiene: 4 dígitos.");
    } else if ((numero >= 10000) && (numero < 100000)) {
      System.out.print("\nEl número " + numero + " tiene: 5 dígitos.");
    } else if ((numero < 0) && (numero > -10)) {
      System.out.print("\nEl número " + numero + " tiene: 1 dígito.");
    } else if ((numero <= -10) && (numero > -100)) {
      System.out.print("\nEl número " + numero + " tiene: 2 dígitos.");
    } else if ((numero <= -100) && (numero > -1000)) {
      System.out.print("\nEl número " + numero + " tiene: 3 dígitos.");
    } else if ((numero <= -1000) && (numero >-10000)) {
      System.out.print("\nEl número " + numero + " tiene: 4 dígitos.");
    } else if ((numero <= -10000) && (numero > -100000)) {
      System.out.print("\nEl número " + numero + " tiene: 5 dígitos.");
    } else {
      System.out.print("\n¡Error!, por favor, introduzca un número entero válido. (Máximo 5 cifras).");
    }
  }
}

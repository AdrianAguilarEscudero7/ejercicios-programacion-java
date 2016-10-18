/**
* 
* Realiza un programa que diga si un número entero positivo introducido por
* teclado es capicúa. Se permiten números de hasta 5 cifras.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio20 {
  public static void main(String[] args) {
 
    // Presentamos el programa e introducimos el número por teclado
    System.out.println("\nBienvenid@, en este programa analizaremos si el número introducido es capicúa.");
    System.out.print("\nPor favor, introduzca un número entero positivo. (Máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    // Establecemos las condiciones y mostramos las soluciones por pantalla
    if (numero < 0) {
      System.out.print("¡Error!, ha introducido un número negativo, por favor, introduzca uno positivo.");
    } else if ((numero >= 0) && (numero < 10)) { 
      System.out.print("\nEl número " + numero + " es capicúa.");
    } else if ((numero >= 10) && (numero < 100) && ((numero % 10) == (numero / 10))) {
      System.out.print("\nEl número " + numero + " es capicúa.");
    } else if ((numero >= 100) && (numero < 1000) && ((numero % 10) == (numero / 100))) {
      System.out.print("\nEl número " + numero + " es capicúa.");
    } else if ((numero >= 1000) && (numero < 10000) && ((numero % 10) == (numero / 1000)) && (((numero / 10) % 10) == ((numero / 100) % 10))) {
      System.out.print("\nEl número " + numero + " es capicúa.");
    } else if ((numero >= 10000) && (numero < 100000) && ((numero % 10) == (numero / 10000)) && (((numero / 10) % 10) == ((numero / 1000) % 10))) {
      System.out.print("\nEl número " + numero + " es capicúa.");
    } else if (numero >= 100000) {
      System.out.print("\n¡Error!, por favor, introduzca un número de 5 cifras como máximo.");
    } else {
      System.out.print("\nEl número " + numero + " no es capicúa.");
    }
  }
}

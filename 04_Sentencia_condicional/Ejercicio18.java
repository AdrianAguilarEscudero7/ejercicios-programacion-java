/**
* 
* Escribe un programa que diga cuál es la primera cifra de un número entero
* introducido por teclado. Se permiten números de hasta 5 cifras.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio18 {
  public static void main(String[] args) {
    
    // Introducimos el número por teclado
    System.out.print("\nPor favor, introduzca un número entero por teclado. (Máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    // Establecemos las condiciones y mostramos la soluciones por pantalla
    if ((numero > 0) && (numero < 10)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero);
    } else if ((numero >= 10) && (numero < 100)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 10);
    } else if ((numero >= 100) && (numero < 1000)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 100);
    } else if ((numero >= 1000) && (numero < 10000)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 1000);
    } else if ((numero >= 10000) && (numero < 100000)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 10000);
    } else if ((numero < 0) && (numero > -10)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero);
    } else if ((numero <= -10) && (numero > -100)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 10);
    } else if ((numero <= -100) && (numero > -1000)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 100);
    } else if ((numero <= -1000) && (numero >-10000)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 1000);
    } else if ((numero <= -10000) && (numero > -100000)) {
      System.out.print("\nLa primera cifra de " + numero + " es: " + numero / 10000);
    } else {
      System.out.print("\n¡Error!, por favor, introduzca un número entero válido. (Máximo 5 cifras).");
    }
  }
}

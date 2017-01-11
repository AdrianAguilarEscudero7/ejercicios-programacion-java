/**
 * Algoritmos matemáticos comunes
 *
 * @author Adrián Aguilar
 */
package algoritmos;
 
public class Maths {
  
  /**
   * Devuelve verdadero si el número que se pasa como pará-
   * metro es capicúa y falso en caso contrario.
   * 
   * Ejercicio01
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es capicúa
   * @return <code>false</code> en caso contrario
   */
  public static boolean esCapicua(long x) {
    long numeroReves = 0;
    long numeroIntroducido = x;
    while (x > 0) {
      numeroReves = (numeroReves * 10) + (x % 10);
      x /= 10;
    }
    if (numeroIntroducido != numeroReves) {
      return false;
    } 
    return true;
  }
  
  /**
   * Devuelve verdadero si el número que se pasa como parámetro
   * es primo y falso en caso contrario.
   * 
   * Ejercicio02
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es primo
   * @return <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    for (int n = 2; n < x; n++) {
      if (x % n == 0) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * Devuelve el menor primo que es mayor al número que
   * se pasa como parámetro.
   * 
   * Ejercicio03
   *
   * @param x un número entero positivo
   * @return el número primo siguiente al introducido
   */
  public static int siguientePrimo(int x) {
    int primoSiguiente = x+1;
    for (int n = 2; n < primoSiguiente; n++) {
      if (primoSiguiente % n == 0) {
        primoSiguiente++;
      }
    }
    return primoSiguiente;
  }
  
  /**
   * Dada una base y un exponente devuelve la potencia.
   * 
   * Ejercicio04
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el resultado de la potencia
   */
  public static int potencia(int x, int y) {
    int potencia = 1;
    for (int i = 0; i < y; i++) {
      potencia *= x;
    }
    return potencia;
  }
  
  /**
   * Cuenta el número de dígitos de un número entero.
   * 
   * Ejercicio05
   *
   * @param x un número entero
   * @return el número de dígitos
   */
  public static int digitos(int x) {
    int contador = 0;
    if (x == 0) {
      contador = 1;
    } else {
      while (Math.abs(x) > 0) {
      x /= 10;
      contador++;
      }
    }
    return contador;
  }
} 

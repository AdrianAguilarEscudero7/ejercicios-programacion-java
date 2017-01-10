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
} 

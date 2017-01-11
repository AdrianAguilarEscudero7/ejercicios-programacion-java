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
  
   /**
   * Le da la vuelta a un número.
   * 
   * Ejercicio06
   *
   * @param x un número entero
   * @return el número al revés
   */
  public static int voltea(int x) {
    int numeroReves = 0;
    while (x > 0) {
      numeroReves = (numeroReves * 10) + (x % 10);
      x /= 10;
    }
    return numeroReves;
  }
  
  /**
   * Devuelve el dígito que está en la posición n de un número
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * Ejercicio07
   *
   * @param x un número entero
   * @param y un número entero
   * @return el dígito de la posición introducida
   */
  public static int digitoN(int x, int y) {
    int contador = 0;
    int digito = 0;
    boolean salir = false;
    int numero = Maths.voltea(x);
    while ((numero > 0) && (!salir)) {
      if (contador == y) {
        digito = numero % 10;
        salir = true;
      } else {
        numero /= 10;
        contador++;
      }
    }
    return digito;
  }
  
  /**
   * Da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. Si no se encuentra, devuelve -1
   * 
   * Ejercicio08
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return la posición del dígito introducido
   * @return -1 en caso de que no se encuentre
   */
  public static int posicionDeDigito(int x, int y) {
    int posicion = 0;
    int numero = Maths.voltea(x);
    while (numero > 0) {
      if (numero % 10 == y) {
        return posicion;
      }
      numero /= 10;
      posicion++;
    }
    return -1;
  }
} 

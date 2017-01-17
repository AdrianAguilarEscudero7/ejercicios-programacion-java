/**
 * Algoritmos con arrays
 *
 * @author Adrián Aguilar
 */
package algoritmos;
 
public class Array {

  /**
   * Genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * Ejercicio20
   *
   * @param x un número entero positivo
   * @param y un número entero
   * @param z un número entero
   * @return el array correspondiente a los parámetros introducidos
   */
  public static int[] generaArrayInt(int x, int maximo, int minimo) {
    int[] array = new int[x];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random()*(maximo-minimo)+minimo);
    }
    return array;
  }
  
//##################################################################################################
  
  /**
   * Devuelve el mínimo del array que se pasa como
   * parámetro.
   * 
   * Ejercicio21
   *
   * @param x un array
   * @return el mínimo del array introducido
   */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    for(int i = 0; i < x.length; i++) {
      if (x[i] < minimo) {
        minimo = x[i];
      }
    }
    return minimo;
  }
  
//##################################################################################################
  
  /**
   * Devuelve el máximo del array que se pasa como
   * parámetro.
   * 
   * Ejercicio22
   *
   * @param x un array
   * @return el máximo del array introducido
   */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    for (int i = 0; i < x.length; i++) {
      if (x[i] > maximo) {
        maximo = x[i];
      }
    }
    return maximo;
  }
  
//##################################################################################################
  
  /**
   * Devuelve la media del array que se pasa como parámetro
   * 
   * Ejercicio23
   *
   * @param x un array
   * @return la media del array introducido
   */
  public static int mediaArrayInt(int[] x) {
    int suma = 0;
    for (int i = 0; i < x.length; i++) {
      suma += x[i];
    }
    return suma/x.length;
  }
  
//##################################################################################################
  
  /**
   * Dice si un número está o no dentro de un array.
   * 
   * Ejercicio24
   *
   * @param x un array
   * @param y un número entero
   * @return <code>true</code> si se encuentra en el array
   * @return <code>false</code> si no se encuentra en el array
   */
  public static boolean estaEnArrayInt(int[] x, int y) {
    for (int i = 0; i < x.length; i++) {
      if (y == x[i]) {
        return true;
      }
    }
    return false;
  }
}

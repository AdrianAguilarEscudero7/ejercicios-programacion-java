/**
 * Algoritmos con arrays bidimensionales
 *
 * @author Adrián Aguilar
 */
package algoritmos;
 
public class ArrayBi {
  
  /**
   * Muestra el array bidimensional que se introduce.
   *
   * @param x un array
   */
  public static void muestraArrayBiInt(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        System.out.printf("%4d ", x[i][j]);
      }
      System.out.println();
    }
  }
  
  //##################################################################################################
  
  /**
   * Genera un array de tamaño n x m con números
   * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * Ejercicio29
   *
   * @param f un número entero positivo
   * @param c un número entero positivo
   * @param maximo un número entero
   * @param minimo un número entero
   * @return el array bidimensional correspondiente a los parámetros introducidos
   */
  public static int[][] generaArrayBiInt(int f, int c, int maximo, int minimo) {
    int[][] array = new int[f][c];
    for (int i = 0; i < f; i++) {
      for (int j = 0; j < c; j++) {
        array[i][j] = (int)(Math.random()*(maximo-minimo)+minimo);
      }
    }
    return array;
  }
  
//##################################################################################################

  /**
   * Devuelve la fila i-ésima del array que se pasa como parámetro.
   * 
   * Ejercicio30
   *
   * @param x un array bidimensional
   * @param f un número entero positivo
   * @return un array (la fila n del array bidimensional)
   */
  public static int[] filaDeArrayBiInt(int[][] x, int f) {
    int[] array = new int[x.length];
    
    for (int i = 0; i < x.length; i++) {
      if (i == f) {
        for (int j = 0; j < x[i].length; j++) {
          array[j] = x[i][j];
        }
      }
    }
    return array;
  }
}

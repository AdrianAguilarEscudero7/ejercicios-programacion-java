/**
 * Algoritmos con arrays
 *
 * @author Adrián Aguilar
 */
package algoritmos;
 
public class Array {
  
  /**
   * Muestra el array que se introduce.
   *
   * @param x un array
   */
  public static void muestraArray(int[] x) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
  }
  
//##################################################################################################  

  /**
   * Genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * Ejercicio20
   *
   * @param x un número entero positivo
   * @param maximo un número entero
   * @param minimo un número entero
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
  
//##################################################################################################
  
  /**
   * Busca un número en un array y devuelve la posición
   * (el índice) en la que se encuentra.
   * 
   * Ejercicio25
   *
   * @param x un array
   * @param y un número entero
   * @return la posición (índice) en la que se encuentra dicho número
   */
  public static int posicionEnArray(int[] x, int y) {
    int posicion = 0;
    for (int i = 0; i < x.length; i++) {
      if (y == x[i]) {
        posicion = i;
      }
    }
    return posicion;
  }
  
//##################################################################################################
  
  /**
   * Le da la vuelta a un array.
   * 
   * Ejercicio26
   *
   * @param x un array
   * @return el array al revés
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] array = new int[x.length];
    for (int i = x.length - 1, j = 0; i >= 0; i--, j++) {
      array[j] = x[i];
    }
    return array;
  }
  
//##################################################################################################
  
  /**
   * Rota n posiciones a la derecha los números de un array.
   *
   * Ejercicio27
   *
   * @param x un array
   * @param y un número entero positivo
   * @return el array rotado hacia la derecha n posiciones
   */
  public static int[] rotaDerechaArrayInt(int[] x, int y) {
    int[] array = new int[x.length];
    int contador = 1;
    
    if (y != 0) {
      int aux = x[x.length-1];
      for (int i = x.length-1; i > 0; i--) {
        array[i] = x[i-1];
      }
      array[0] = aux;
      
      if (y > 1) {
        do {
          int aux2 = array[array.length-1];
          for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
          }
          contador++;
          array[0] = aux2;
        } while(contador < y);
      }
    } else {
      return x;
    }
    return array;
  }
  
//##################################################################################################
  
  /**
   * Rota n posiciones a la izquierda los números de un array.
   *
   * Ejercicio28
   *
   * @param x un array
   * @param y un número entero positivo
   * @return el array rotado hacia la izquierda n posiciones
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int y) {
    int[] array = new int[x.length];
    int contador = 1;
    
    if (y != 0) {
      int aux = x[0];
      for (int i = 0; i < x.length-1; i++) {
        array[i] = x[i+1];
      }
      array[x.length-1] = aux;
      
      if (y > 1) {
        do {
          int aux2 = array[0];
          for (int i = 0; i < x.length-1; i++) {
            array[i] = array[i+1];
          }
          contador++;
          array[array.length-1] = aux2;
        } while(contador < y);
      }
    } else {
      return x;
    }
    return array;
  }
}



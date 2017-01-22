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
    int[] array = new int[x[0].length];
    
    for (int i = 0; i < x.length; i++) {
      if (i == f) {
        for (int j = 0; j < x[i].length; j++) {
          array[j] = x[i][j];
        }
      }
    }
    return array;
  }
  
//##################################################################################################

  /**
   * Devuelve la columna j-ésima del array que se pasa como parámetro.
   * 
   * Ejercicio31
   *
   * @param x un array bidimensional
   * @param c un número entero positivo
   * @return un array (la columna n del array bidimensional)
   */
  public static int[] columnaDeArrayBiInt(int[][] x, int c) {
    int[] array = new int[x.length];
    
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        if (j == c) {
          array[i] = x[i][j];
        }
      }
    }
    return array;
  }
  
//##################################################################################################

  /**
   * Devuelve la fila y la columna (en un array
   * con dos elementos) de la primera ocurrencia de un número dentro de un
   * array bidimensional. Si el número no se encuentra en el array, la función
   * devuelve el array {-1, -1}.
   * 
   * Ejercicio32
   *
   * @param x un array bidimensional
   * @param n un número entero
   * @return un array (las coordenadas del número introducido fila/columna)
   */
  public static int[] coordenadasEnArrayBiInt(int[][] x, int n) {
    int[] arrayFalso = {-1,-1};
    
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        if (x[i][j] == n) {
          int[] array = {i,j};
          return array;
        }
      }
    }
    return arrayFalso;
  }
  
//##################################################################################################

  /**
   * Dice si un número es o no punto de silla, es decir,
   * mínimo en su fila y máximo en su columna.
   * 
   * Ejercicio33
   *
   * @param x un array bidimensional
   * @param f un número entero positivo
   * @param c un número entero positivo
   * @return <code>true</code> si el número es punto de silla
   * @return <code>false</code> si el número no es punto de silla
   */
  public static boolean esPuntoDeSilla(int[][] x, int f, int c) {
    if ((Array.minimoArrayInt(filaDeArrayBiInt(x,f)) == x[f][c]) &&
      (Array.maximoArrayInt(columnaDeArrayBiInt(x,c)) == x[f][c])) {
      return true;
    }
    return false;
  }

//##################################################################################################

  /**
   * Devuelve un array que contiene una de las diagonales del
   * array bidimensional que se pasa como parámetro. Se pasan como
   * parámetros fila, columna y dirección. La fila y la columna determinan
   * el número que marcará las dos posibles diagonales dentro del array. La
   * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
   * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
   * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
   * que va del noreste hacia el suroeste.
   * 
   * Ejercicio34
   *
   * @param x un array bidimensional
   * @param f un número entero positivo
   * @param c un número entero positivo
   * @param s un string
   * @return un array unidimensional (con los valores de la diagonal correspondiente)
   */
  public static int[] diagonal(int[][] x, int f, int c, String s) {
    int[] array = new int[0];
    
    if (s.equals("nose")) {
      int fila = 0;
      int columna = 0;
      
      if (f > c) {
        columna = 0;
        fila = f-c;
      } else if (c > f) {
        fila = 0;
        columna = c-f;
      } else if (f == c) {
        fila = 0;
        columna = 0;
      }
      
      int tamaño = 1;
      int[] tamañoArray = new int[0];
      int filaAux = fila;
      int columnaAux = columna;
      
      for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[0].length; j++) {
          if ((i == fila) && (j == columna)) {
            tamañoArray = new int[tamaño];
            tamaño++;
            fila++;
            columna++;
          }
        }
      }
      
      array = new int[tamañoArray.length];
      int posicion = 0;
      
      for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[0].length; j++) {
          if ((i == filaAux) && (j == columnaAux)) {
            array[posicion] = x[i][j];
            posicion++;
            filaAux++;
            columnaAux++;
          }
        }
      }
    } else if (s.equals("neso")) {
      while ((f > 0) && (c < x[0].length-1)) {
        f--;
        c++;
      }
      int tamaño = 1;
      int[] tamañoArray = new int[0];
      int fila = f;
      int columna = c;
      
      for (int i = 0; i < x.length; i++) {
        for (int j = x[0].length-1; j >= 0; j--) {
          if ((i == f) && (j == c)) {
            tamañoArray = new int[tamaño];
            tamaño++;
            f++;
            c--;
          }
        }
      }
      array = new int[tamañoArray.length];
      int posicion = 0;
      
      for (int i = 0; i < x.length; i++) {
        for (int j = x[0].length-1; j >= 0; j--) {
          if ((i == fila) && (j == columna)) {
            array[posicion] = x[i][j];
            posicion++;
            fila++;
            columna--;
          }
        }
      }
    }
    return array;
  }
}

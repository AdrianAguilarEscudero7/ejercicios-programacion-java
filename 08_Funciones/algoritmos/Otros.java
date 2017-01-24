/**
 * Algoritmos varios
 *
 * @author Adrián Aguilar
 */
package algoritmos;
 
public class Otros {
  
  /**
   * Convierte el número n al sistema de palotes.
   * 
   * Función del Ejercicio35
   * 
   * @param x un número entero positivo
   * @return una cadena de caracteres con los palotes correspondientes al número introducido
   */
  public static String convierteEnPalotes(int x) {
    int numeroReves = Maths.voltea(x);
    int digitos = Maths.digitos(x);
    String palotes = "";
    
    while (numeroReves > 0) {
      for (int i = 0; i < numeroReves % 10; i++) {
        palotes += "| ";
      }
      numeroReves /= 10;
      digitos--; 
      
      if (digitos > 0) {
        palotes += "- ";
      }
    }
    return palotes;
  }
  
//##################################################################################################

  /**
   * Devuelve un array con todos los números primos que se encuentren
   * en otro array que se pasa como parámetro.
   * 
   * Ejercicio36
   *
   * @param x un array unidimensional
   * @return un array con los números primos filtrados
   */
  public static int[] filtraPrimos(int[] x) {
    int tamaño = 0;
    for (int i = 0; i < x.length; i++) {
      if (Maths.esPrimo(x[i])) {
        tamaño++;
      }
    }
    int[] array = new int[tamaño];
    int posicion = 0;
    for (int i = 0; i < x.length; i++) {
      if (Maths.esPrimo(x[i])) {
        array[posicion] = x[i];
        posicion++;
      }
    }
    if (array.length == 0) {
      array = new int[1];
      array[0] = -1;
    }
    return array;
  }

//##################################################################################################

  /**
   * Esta función convierte el número n al sistema Morse y lo devuelve en una
   * cadena de caracteres.
   * 
   * Ejercicio37
   *
   * @param x un número entero positivo
   * @return una cadena de caracteres con el código morse
   */
  public static String convierteEnMorse(int x) {
    int numeroReves = Maths.voltea(x);
    String morse = "";
    
    while (numeroReves > 0) {
      switch (numeroReves % 10) {
        case 1:
          morse += ". _ _ _ _ ";
        break;
        case 2:
          morse += ". . _ _ _ ";
        break;
        case 3:
          morse += ". . . _ _ ";
        break;
        case 4:
          morse += ". . . . _ ";
        break;
        case 5:
          morse += ". . . . . ";
        break;
        case 6:
          morse += "_ . . . . ";
        break;
        case 7:
          morse += "_ _ . . . ";
        break;
        case 8:
          morse += "_ _ _ . . ";
        break;
        case 9:
          morse += "_ _ _ _ . ";
        break;
        case 0:
          morse += "_ _ _ _ _ ";
        break;
        default:
      }
      numeroReves /= 10;
    }
    return morse;
  }
}

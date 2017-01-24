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
  
//##################################################################################################

  /**
   * Devuelve un array con todos los números capicúa que se 
   * encuentren en otro array que se pasa como parámetro.
   * 
   * Ejercicio38
   *
   * @param x un array unidimensional
   * @return un array con los números capicúa filtrados
   */
  public static int[] filtraCapicuas(int[] x) {
    int tamaño = 0;
    for (int i = 0; i < x.length; i++) {
      if (Maths.esCapicua(x[i])) {
        tamaño++;
      }
    }
    int[] array = new int[tamaño];
    int posicion = 0;
    for (int i = 0; i < x.length; i++) {
      if (Maths.esCapicua(x[i])) {
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
   * Esta función convierte los dígitos del número n en las correspondientes
   * palabras y lo devuelve todo en una cadena de caracteres.
   * 
   * Ejercicio39
   *
   * @param x un número entero positivo
   * @return una cadena de caracteres con las palabras correspondientes a cada número introducido
   */
  public static String convierteEnPalabras(int x) {
    int numeroReves = Maths.voltea(x);
    int digitos = Maths.digitos(x);
    String numPalabra = "";
    
    if (x == 0) {
      numPalabra = "cero";
    } else {
      while (numeroReves > 0) {
        switch (numeroReves % 10) {
          case 1:
            numPalabra += "uno";
          break;
          case 2:
            numPalabra += "dos";
          break;
          case 3:
            numPalabra += "tres";
          break;
          case 4:
            numPalabra += "cuatro";
          break;
          case 5:
            numPalabra += "cinco";
          break;
          case 6:
            numPalabra += "seis";
          break;
          case 7:
            numPalabra += "siete";
          break;
          case 8:
            numPalabra += "ocho";
          break;
          case 9:
            numPalabra += "nueve";
          break;
          case 0:
            numPalabra += "cero";
          break;
          default:
        }
        numeroReves /= 10;
        digitos--;
        
        if (digitos > 0) {
          numPalabra += ", ";
        }
      }
    }
    return numPalabra;
  }
  
//##################################################################################################

  /**
   * Devuelve un array con todos los números que contienen el 7 
   * (por ej. 7, 27, 782) que se encuentren en 
   * otro array que se pasa como parámetro.
   * 
   * Ejercicio40
   *
   * @param x un array unidimensional
   * @return un array con los números capicúa filtrados
   */
  public static int[] filtraCon7(int[] x) {
    int tamaño = 0;
    boolean salir = false;
    for (int i = 0; i < x.length; i++) {
      int numeroReves = Maths.voltea(x[i]);
      salir = false;
      
      while ((numeroReves > 0) && (!salir)) {
        if (numeroReves % 10 == 7) {
          tamaño++;
          salir = true;
        }
        numeroReves /= 10;
      }
    }
    int[] array = new int[tamaño];
    int posicion = 0;
    for (int i = 0; i < x.length; i++) {
      int numeroReves2 = Maths.voltea(x[i]);
      salir = false;
      
      while ((numeroReves2 > 0) && (!salir)){
        if (numeroReves2 % 10 == 7) {
          array[posicion] = x[i];
          posicion++;
          salir = true;
        }
        numeroReves2 /= 10;
      }
    }
    if (array.length == 0) {
      array = new int[1];
      array[0] = -1;
    }
    return array;
  }
}

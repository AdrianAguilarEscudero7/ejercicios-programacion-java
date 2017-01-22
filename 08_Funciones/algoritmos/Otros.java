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
}

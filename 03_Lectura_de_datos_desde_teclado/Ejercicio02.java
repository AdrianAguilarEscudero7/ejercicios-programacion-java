/**
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
* convertir debe ser introducida por teclado.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio02  {
  public static void main(String[] args) {  
  
    // Introducimos los valores por teclado
    System.out.print("Bienvenido al conversor de euros-pesetas. Por favor, introduzca una cantidad en €: ");
    String sEuro = System.console().readLine();
    Double euro = Double.parseDouble(sEuro);
    System.out.println("\nHa introducido: " + euro + " €. \n");
  
    // Realizamos la conversión y la mostramos por pantalla
    double peseta = 166.386;
    double conversion = euro * peseta;
    System.out.print("La cantidad introducida equivale a " + (int)conversion + " pesetas.");
  
  }
}
  

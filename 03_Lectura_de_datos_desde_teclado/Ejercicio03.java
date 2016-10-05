/**
* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
* convertir debe ser introducida por teclado.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio03  {
  public static void main(String[] args) {  
  
    // Introducimos los valores por teclado
    System.out.print("Bienvenido al conversor de pesetas-euros. Por favor, introduzca una cantidad en pesetas: ");
    String sPeseta = System.console().readLine();
    int peseta = Integer.parseInt(sPeseta);
    System.out.println("\nHa introducido: " + peseta + " pesetas.\n");
    
    // Realizamos la conversión y la mostramos por pantalla
    double euro = 0.006;
    double conversion = peseta * euro;
    System.out.print("La cantidad introducida equivale a " + conversion + " €.");

  
  }
}

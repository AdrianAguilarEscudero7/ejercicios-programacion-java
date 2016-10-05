/**
* Realiza un conversor de Kb a Mb.
*
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio11 {
  public static void main(String[] args) {  
  
    // Introducimos valores por teclado
    System.out.print("Por favor, introduzca los kilobytes que desea convertir: ");
    int kiloBytes = Integer.parseInt(System.console().readLine());
    
    // Realizamos la conversión y la mostramos por pantalla
    double conversion = kiloBytes * 0.0009765625;
    System.out.print("\nLos kilobytes introducidos equivalen a " + conversion + " megabytes.");
  
  }
}

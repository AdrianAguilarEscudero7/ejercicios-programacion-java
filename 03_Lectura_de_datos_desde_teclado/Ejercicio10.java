/**
* Realiza un conversor de Mb a Kb.
*
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio10 {
  public static void main(String[] args) {  
  
    // Introducimos valores por teclado
    System.out.print("Por favor, introduzca los megabytes que desea convertir: ");
    int megaBytes = Integer.parseInt(System.console().readLine());
    
    // Realizamos la conversión y la mostramos por pantalla
    int conversion = megaBytes * 1024;
    System.out.print("\nLos megabytes introducidos equivalen a " + conversion + " kilobytes.");
  
  }
}

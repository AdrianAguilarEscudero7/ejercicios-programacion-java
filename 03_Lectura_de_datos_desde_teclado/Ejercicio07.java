/**
* Escribe un programa que calcule el total de una factura a partir de la base
* imponible.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio07  {
  public static void main(String[] args) {  
    
    // Introducimos los valores por teclado
    System.out.print("Por favor, introduzca el valor de la base imponible: ");
    String sBaseImp = System.console().readLine();
    Double baseImp = Double.parseDouble(sBaseImp);
    System.out.println("\nLa base imponible introducida es: " + baseImp + " €, se le aplicará un IVA del 21%.");

    // Realizamos la operación y la mostramos por pantalla
    double iva = 0.21;
    double reduccion = baseImp * iva;
    double totalFactura = baseImp + reduccion;
    System.out.print("\nEl total de la factura es de: " + totalFactura + " €.");
  
  
  }
}
  

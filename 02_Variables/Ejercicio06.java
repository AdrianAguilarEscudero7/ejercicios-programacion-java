/**
* Escribe un programa que calcule el total de una factura a partir de la base
* imponible (precio sin IVA). La base imponible estará almacenada en una
* variable.
*
* Operaciones con variables
*
* @author Adrián Aguilar
*/
public class Ejercicio06 {
  public static void main(String[] args) {  
  double iva = 0.21;
  double baseImp = 1500;
  double reduccion = baseImp * iva;
  double total = reduccion + baseImp;

  System.out.println("La base imponible es de: " + baseImp + " €");
  System.out.println("El IVA al 21% es de: " + reduccion + " €");
  System.out.println("El total de la factura es de: " + total + " €");


  }
}

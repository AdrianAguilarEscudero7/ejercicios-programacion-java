/**
* Escribe un programa que calcule el área de un triángulo.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio06  {
  public static void main(String[] args) {  
  
    // Introducimos los valores por teclado
    System.out.print("Introduzca el valor de la base: ");
    String sBase = System.console().readLine();
    System.out.print("Y su unidad: ");
    String sUnidad = System.console().readLine();
    Double base = Double.parseDouble(sBase);
    System.out.println("\n" + base + " " + sUnidad);
    
    System.out.print("\nAhora, introduzca el valor de la altura: ");
    String sAltura = System.console().readLine();
    Double altura = Double.parseDouble(sAltura);
    System.out.println("\n" + altura + " " + sUnidad);
    
    // Ahora realizamos el cálculo del área
    double area = (base * altura) / 2;
    System.out.print("\nEl área de ese triángulo es de: " + area + " " + sUnidad +"²");
    
    
  }    
}    

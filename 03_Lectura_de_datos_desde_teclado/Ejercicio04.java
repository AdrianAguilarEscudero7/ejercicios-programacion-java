/**
* Escribe un programa que sume, reste, multiplique y divida dos números
* introducidos por teclado.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio04  {
  public static void main(String[] args) {  
    
    // Introducimos los términos
    System.out.print("Introduzca dos términos para realizar las operaciones: ");
    String sTermino1 = System.console().readLine();
    int termino1 = Integer.parseInt(sTermino1);
    System.out.print(termino1 + ", ");
    String sTermino2 = System.console().readLine();
    int termino2 = Integer.parseInt(sTermino2);
    
    // Realizamos las operaciones y las mostramos por pantalla
    int suma = termino1 + termino2;
    int resta = termino1 - termino2;
    int mult = termino1 * termino2;
    int divis = termino1 / termino2;
    System.out.println("\n" + termino1 + "+" + termino2 + " = " + suma);
    System.out.println(termino1 + "-" + termino2 + " = " + resta);
    System.out.println(termino1 + "*" + termino2 + " = " + mult);
    System.out.println(termino1 + "/" + termino2 + " = " + divis);
  }
}  

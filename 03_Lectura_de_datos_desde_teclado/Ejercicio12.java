/**
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
* examen de la asignatura Programación para obtener la media deseada. Hay
* que tener en cuenta que la nota del primer examen cuenta el 40% y la del
* segundo examen un 60%.
*
* Ejemplo 1:
* Introduce la nota del primer examen: 7
* ¿Qué nota quieres sacar en el trimestre? 8.5
* Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
*
* Ejemplo 2:
* Introduce la nota del primer examen: 8
* ¿Qué nota quieres sacar en el trimestre? 7
* Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
*
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio12 {
  public static void main(String[] args) {  
  
    // Introducimos los datos por teclado
    System.out.print("Por favor, introduzca su nota del primer examen: ");
    Double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("\n¿Qué nota desea tener en el trimestre?: ");
    Double notaDeseada = Double.parseDouble(System.console().readLine());
    
    
    // Realizamos la operación y la mostramos por pantalla
    double segundaNota = ((notaDeseada - (primeraNota * 0.4)) / 0.6);
    System.out.print("\nPara llegar a tener un " + notaDeseada + " en el trimestre, necesita sacar un " + segundaNota + " en el segundo examen.");
    
  }
}

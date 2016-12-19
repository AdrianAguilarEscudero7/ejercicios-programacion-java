/**
* 
* Realiza un programa que pida la temperatura media que ha hecho en cada mes
* de un determinado año y que muestre a continuación un diagrama de barras
* horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
* de asteriscos o cualquier otro carácter.
*
* Arrays
*
* @author Adrián Aguilar
*/


import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.print("Bienvenid@, este programa mostrará un diagrama de barras horizontales con los datos");
    System.out.print(" que usted haya introducido por teclado, de la temperatura media que ha hecho en cada");
    System.out.println(" mes de un determinado año.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    String mes[] = {
      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
      "Octubre", "Noviembre", "Diciembre"
    };
    int temperatura[] = new int[12];
    
    // Se introducen las temperaturas de los 12 meses por teclado
    for (int i = 0; i < 12; i++) {
      System.out.print("\nPor favor, introduzca la temperatura media de " + mes[i] + ": ");
      temperatura[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("-----------------------------------------------------------------------------\n");
    
    String blanco = "\u001B[37m";
    String azul = "\u001B[34m";
    String amarillo = "\u001B[33m";
    String verde = "\u001B[32m";
    String rojo = "\u001B[31m";
    
    // Genera los 12 meses
    for (int j = 0; j < 12; j++) {
      System.out.printf(blanco + "%-10s", mes[j]);
      System.out.print(amarillo + " │");
      
      // Genera el diagrama de barras según la temperatura introducida en cada mes
      for (int k = 0; k < temperatura[j]; k++) {
        System.out.print(verde + "■");
      }
      // Genera los grados centígrados
      if ((temperatura[j] > -30) && (temperatura[j] < 20)) {
       System.out.print("  " + azul + temperatura[j] + "ºC" + blanco);
      } else if ((temperatura[j] > 19) && (temperatura[j] < 27)) {
        System.out.print("  " + blanco + temperatura[j] + "ºC" + blanco);
      } else {
        System.out.print("  " + rojo + temperatura[j] + "ºC" + blanco);
      }
      System.out.println();
    }
  }
}

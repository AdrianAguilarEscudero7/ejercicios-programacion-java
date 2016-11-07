/**
* 
* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@ al dibujante de pirámides huecas, deberá pedir una altura y un carácter por teclado.");
    System.out.println("----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("\nAhora introduzca el carácter con el que desea dibujar la pirámide: ");
    char caracter = s.nextLine().charAt(0);
    
    // Definimos las variables 
    int cantidad = 1; // Para el número de caracteres por línea
    int espacios = altura; // Espacios es igual al número de espacios por línea según la altura
    int contador = 1; // Declaramos la variable contador para la base de la pirámide
    
    // Salto de línea
    System.out.println();
    
    // Creamos un bucle que anidará a los demás para que se repita la acción hasta que cantidad supere a la altura
    while (cantidad <= altura) {
      
      // Creamos el bucle que se encargará de los espacios fuera de la pirámide
      for (int i = 1; i < espacios; i++) {
        System.out.print(" ");
      }
      
      // Establecemos la condición para pintar los caracteres de la izquierda de la pirámide
      if ((cantidad > 0) && (cantidad < altura)) {
      System.out.print(caracter);
      }
      
      // Establecemos la condición y creamos el bucle para pintar los espacios dentro de la pirámide
      if ((cantidad > 1) && (cantidad < altura)) {
        for (int j = 3; j < cantidad * 2; j++) {
          System.out.print(" ");
        }
      }
      
      // Establecemos la condición para pintar los caracteres a la derecha de la pirámide
      if ((cantidad > 1) && (cantidad < altura)) {
        System.out.print(caracter);
      }
      
      // Establecemos la condición y creamos el bucle para pintar la base de la pirámide
      if (cantidad == altura) {
        do {
          System.out.print(caracter);
          contador++;
        } while (contador < (altura * 2));
      }
      // Salto de línea
      System.out.println();
      espacios--;
      cantidad++;
    }    
  }
}

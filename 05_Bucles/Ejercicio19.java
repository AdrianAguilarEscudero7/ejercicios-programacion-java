/**
* 
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@ al dibujante de pirámides, deberá pedir una altura y un carácter por teclado.");
    System.out.println("----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("\nAhora introduzca el carácter con el que desea dibujar la pirámide: ");
    char caracter = s.nextLine().charAt(0);
    
    // Definimos las variables
    int cantidad = 1; // Para el número de caracteres por línea
    int espacios = altura; // Espacios es igual al número de espacios por linea según la altura
    
    // Salto de línea
    System.out.println();
    
    // Creamos un bucle que anidará a otros dos para que se repita la acción hasta que cantidad supere a la altura
    while (cantidad <= altura) {
      
      // Creamos el bucle para que se repitan los espacios
      for (int i = 1; i < espacios; i++) {
        System.out.print(" ");
      }
      
      // Creamos el bucle para que se multipliquen los caracteres por línea
      for (int j = 1; j < cantidad * 2; j++) {
        System.out.print(caracter);
      }
      // Salto de línea
      System.out.println();
      espacios--;
      cantidad++;
    }
  }
}
    

    
    

/**
 * 
 * Escribe un programa que pase de decimal a binario.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@ a la calculadora de decimal a binario.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Se introducen los datos por teclado
    System.out.print("\nPor favor, introduzca un número en base 10: ");
    int numeroBase10 = s.nextInt();
    System.out.println();
    
    int potencia = 0;
    int contador = 0;
    
    // Calcula la potencia en base 2 hasta que sea inmediatamente superior al número decimal introducido
    do {
      potencia = Maths.potencia(2,contador);
      contador++;
    } while (numeroBase10 / potencia != 0);
    
    // Divide la potencia entre 2 para que sea la potencia más alta que quepa en el número en base decimal introducido
    potencia /= 2;

    System.out.print("El " + numeroBase10 + " convertido a binario es el: ");
    
    // Convierte de decimal a binario utilizando el método del residuo
    if (numeroBase10 == 0) {
      System.out.print("0");
    } else {
      do {
        if (numeroBase10 / potencia == 1) {
          System.out.print("1");
          numeroBase10 -= potencia;
        } else {
          System.out.print("0");
        }
        potencia /= 2;
      } while (potencia != 0);
    }
  }
}
    

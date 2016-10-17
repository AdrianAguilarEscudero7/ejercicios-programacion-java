/**
* 
* Realiza un programa que diga si un número introducido por teclado es par y/o
* divisible entre 5.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio14 {
  public static void main(String[] args) {
  
    // Introducimos los datos por teclado
    System.out.print("\nPor favor introduzca un número entero aleatorio: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    // Establecemos las condiciones y mostramos las soluciones por pantalla
    if ((numero % 2 == 0) && (numero % 5 == 0)) {
      System.out.print("\nEl número que ha introducido es par y divisible entre 5.");
    } else if (numero % 2 == 0) {
      System.out.print("\nEl número que ha introducido es par.");
    } else if (numero % 5 == 0) {
      System.out.print("\nEl número que ha introducido es divisible entre 5.");
    } else {
      System.out.print("\nLo siento, el número que ha introducido no es par ni divisible entre 5.");
    }
  }
}  

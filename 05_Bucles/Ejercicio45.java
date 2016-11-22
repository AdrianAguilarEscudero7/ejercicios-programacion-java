/**
* 
* Escribe un programa que cambie un dígito dentro de un número dando la
* posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
* empezando por el 1. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos. Suponemos que el usuario introduce
* correctamente los datos.
*
* Ejemplo:
* Por favor, introduzca un número entero positivo: 406783
* Introduzca la posición dentro del número: 3
* Introduzca el nuevo dígito: 1
* El número resultante es 401783
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/
import java.util.Scanner;

public class Ejercicio45 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@, este programa cambiará un dígito dentro de un número introducido");
    System.out.println(" por teclado dando la posición y el valor nuevo.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("\nAhora introduzca la posición del dígito que quiere reemplazar: ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.print("\nPor último, introduzca el nuevo dígito: ");
    int nuevoDigito = Integer.parseInt(s.nextLine());
    
    long numeroReves = 0; // Almacena el número al revés
    
    // Pone el número al revés
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    long reemplazamiento = 0; // Almacena el nuevo número
    int contador = 1;
    long digito = 0; // Almacena el dígito a cambiar
    
    // Realiza la modificación del nuevo número con el nuevo dígito y muestra el resultado
    while (numeroReves > 0) {
      digito = numeroReves % 10;
      if (contador == posicion) {
        digito = nuevoDigito;
      }
      reemplazamiento = (reemplazamiento * 10) + digito;
      numeroReves /= 10;
      contador++;
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nEl número resultante es el " + reemplazamiento);
  }
}

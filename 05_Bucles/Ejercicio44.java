/**
* 
* Escribe un programa que sea capaz de insertar un dígito dentro de un número
* indicando la posición. El nuevo dígito se colocará en la posición indicada y el
* resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
* izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
* correctamente los datos. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos.
*
* Ejemplo:
* Por favor, introduzca un número entero positivo: 406783
* Introduzca la posición donde quiere insertar: 3
* Introduzca el dígito que quiere insertar: 5
* El número resultante es 4056783.
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio44 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nBienvenid@, este programa insertará un dígito introducido por teclado dentro");
    System.out.println(" de otro número también introducido por teclado indicando la posición.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    System.out.print("\nAhora introduzca la posición donde quiere insertar el dígito: ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.print("\nPor último, introduzca el número que quiere insertar: ");
    int numeroInsertado = Integer.parseInt(s.nextLine());
    
    // Declaramos las variables
    long numeroReves = 0; // Almacena el número al revés
    long numeroPartido1 = 0; // Almacena la primera partición del número
    long numeroPartido2 = 0; // Almacena la segunda partición del número
    
    // Pone el número al revéś
    while (numeroIntroducido > 0) {
      numeroReves = (numeroReves * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    
    // Realiza la primera partición del número e inserta el número pedido por teclado a continuación
    for (int i = 1; i < posicion; i++) {
      numeroPartido1 = (numeroPartido1 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nEl número resultante es el " + numeroPartido1 + "" + numeroInsertado);
    
    // Realiza la segunda partición del número y la une al número anterior
    while (numeroReves > 0) {
      numeroPartido2 = (numeroPartido2 * 10) + (numeroReves % 10);
      numeroReves /= 10;
    }
    System.out.print(numeroPartido2);
  }
}

/**
* 
* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
* aleatorio. La cabeza se representará con el carácter @ y se debe colocar
* exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
* el cuerpo irá serpenteando de la siguiente manera: se generará de forma
* aleatoria un valor entre tres posibles que hará que el siguiente carácter se
* coloque una posición a la izquierda del anterior, alineado con el anterior o una
* posición a la derecha del anterior. La longitud de la serpiente se pedirá por
* teclado y se supone que el usuario introducirá un dato correcto.
*
* Ejemplo:
*
* Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
*
*         @
*         *
*        *
*         *
*         * 
*          *
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa pintará una serpiente, para su serpenteo aleatorio");
    System.out.println(" . Usted introducirá la longitud de la serpiente contando la cabeza.");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println();
    
    // Introducimos la longitud de la serpiente por teclado
    System.out.print("\nPor favor, introduzca la longitud de la serpiente contando la cabeza: ");
    int longitud = Integer.parseInt(s.nextLine());
    
    int espacios = 13; // Almacenamos los espacios base
    System.out.printf("\n%13s\n", '@');
    
    // Generamos la longitud de la serpiente y la suma aleatoria de espacios, -1, 0, 1
    for (int i = 1; i < longitud; i++) {
      int serpenteo = (int)(Math.random()*3)-1;
      
      espacios += serpenteo;
      
      // Generamos los espacios resultantes y pintamos el carácter al final
      for (int j = 1; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.print("#");
      System.out.println();
    }
  }
}

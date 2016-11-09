/**
* 
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa 
    System.out.print("\nBienvenid@, se le pedirá a continuación una serie de números para realizar");
    System.out.println(" la media de los impares y determinar cuál es el mayor de los pares.");
    System.out.println("-----------------------------------------------------------------------------");
    
    // Declaramos las variables
    int numero = 0;
    int contadorTotal = 0;
    int contadorImpares = 0;
    int contadorPares = 0;
    double suma = 0; 
    int maximo = 0; // Máximo para mostrar el mayor de los pares
    
    // Creamos el bucle correspondiente para iterar los números introducidos
    do {
      System.out.print("\nPor favor, introduzca un número (para terminar introduzca uno negativo): ");
      numero = Integer.parseInt(s.nextLine());
      
      // Establecemos la condición para clasificar a los números impares
      if ((numero % 2 != 0) && (numero >= 0)) {
        suma += numero; // Realizamos la suma de los números impares
        contadorImpares++;
        
        // Establecemos la condición para clasificar a los números pares
      } else if ((numero % 2 == 0) && (numero > maximo)) {
        maximo = numero;
        contadorPares++;
      }
      contadorTotal++;
    } while (numero >= 0);
    
    // Mostramos los resultados por pantalla
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("\nSe han introducido: " + (contadorTotal - 1) + " números.");
    System.out.println("\nLa media de los " + contadorImpares + " números impares introducidos es: " + (suma / contadorImpares));
    System.out.print("\nEl máximo de los " + contadorPares + " números pares es: " + maximo);
  }
}

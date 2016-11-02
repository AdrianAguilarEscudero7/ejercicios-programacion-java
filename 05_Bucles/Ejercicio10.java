/**
* 
* Escribe un programa que calcule la media de un conjunto de números positivos
* introducidos por teclado. A priori, el programa no sabe cuántos números se
* introducirán. El usuario indicará que ha terminado de introducir los datos
* cuando meta un número negativo.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa e introducimos los números por teclado
    System.out.println("\nBienvenid@, calcularemos la media de un conjunto de números positivos.");
    System.out.println("Para finalizar introduzca un número negativo.");
    
    // Definimos las variables necesarias
    double numero;
    double contador = 0; // Parar iterar y dividir la suma entre el número final iterado
    double suma = 0; 
    
    // Creamos el bucle correspondiente y mostramos el resultado por pantalla
    do {
      System.out.print("\nIntroduzca un número positivo: ");
      numero = Integer.parseInt(s.nextLine());
      contador++;
      suma += numero;
        
    } while (numero >= 0);
    
    System.out.print((suma - numero) / (contador - 1));
  }
}

/**
* 
* Escribe un programa que diga cuál es la última cifra de un número entero
* introducido por teclado.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio17 {
  public static void main(String[] args) {
  
    System.out.print("\nPor favor, introduzca un número entero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 0) {
      System.out.print("\nLa última cifra de " + numero + " es: " + (-numero % 10));
    } else {
      System.out.print("\nLa última cifra de " + numero + " es: " + numero % 10);
    }
  }
}

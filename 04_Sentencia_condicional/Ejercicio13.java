/**
* 
* Escribe un programa que ordene tres números enteros introducidos por
* teclado.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio13 {
  public static void main(String[] args) {
 
    // Introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca un número entero aleatorio: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca otro número entero aleatorio: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.print("Finalmente, introduzca el último número aleatorio: ");
    int numero3 = Integer.parseInt(System.console().readLine());
    
    // Realizamos el algoritmo y mostramos las soluciones por pantalla
    if ((numero1 <= numero2) && (numero2 <= numero3)) {
      System.out.println("\nLos números se han ordenado de menor a mayor a: " + numero1 + ", " + numero2 + ", 111" + numero3); 
    } else if ((numero1 <= numero3) && (numero3 <= numero2)) {
      System.out.println("\nLos números se han ordenado de menor a mayor a: " + numero1 + ", " + numero3 + ", " + numero2);
    } else if ((numero2 <= numero3) && (numero3 <= numero1)) {
      System.out.println("\nLos números se han ordenado de menor a mayor a: " + numero2 + ", " + numero3 + ", " + numero1);
    } else if ((numero2 <= numero1) && (numero1 <= numero3)) {
      System.out.println("\nLos números se han ordenado de menor a mayor a: " + numero2 + ", " + numero1 + ", " + numero3);
    } else if ((numero3 <= numero1) && (numero1 <= numero2)) {
      System.out.println("\nLos números se han ordenado de menor a mayor a: " + numero3 + ", " + numero1 + ", " + numero2);
    } else {
      System.out.println("\nLos números se han ordenado de menor a mayor a: " + numero3 + ", " + numero2 + ", " + numero1);
    }
  } 
}

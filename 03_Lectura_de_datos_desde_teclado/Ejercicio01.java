/**
* Realiza un programa que pida dos números y que luego muestre el resultado
* de su multiplicación.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio01  {
  public static void main(String[] args) {  
  
    // Introducimos los números por teclado
    System.out.print("· Por favor introduzca un número: ");
    String sNumero1 = System.console().readLine();
    int numero1 = Integer.parseInt(sNumero1);
    System.out.println("El número que ha introducido es el: " + numero1 + "\n");
    
    System.out.print("· Por favor introduzca otro número: ");
    String sNumero2 = System.console().readLine();
    int numero2 = Integer.parseInt(sNumero2);
    System.out.println("El segundo número que ha introducido es el: " + numero2 + "\n");
    
    // Realizamos la operación y la mostramos por pantalla
    System.out.println("El resultado de la multiplicación de ambos números es de: " + (numero1 * numero2));
  


  }
}

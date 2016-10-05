/**
* Escribe un programa en el que se declaren las variables enteras x e y . Asignales
* los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
* el valor de cada variable, la suma, la resta, la división y la multiplicación.
* 
* Operaciones con variables
*
* @author Adrián Aguilar
*/
public class Ejercicio01 {
  public static void main(String[] args) {  
  int x = 144;
  int y = 999;
  
  System.out.println("El valor de la variable x, es: " + x + ", y el valor de la variable y, es: " + y);

  int suma = x + y;
  System.out.println("La suma entre x e y, es: " + suma);

  int resta = x - y;
  System.out.println("La resta entre x e y, es: " + resta);

  int division = x / y;
  System.out.println("La división entre x e y, es: " + division);

  int multiplicacion = x * y;
  System.out.println("La multiplicación entre x e y, es: " + multiplicacion);
  
  
  } 
}

/**
* 
* Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
* do-while.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/
public class Ejercicio06{
  public static void main(String[] args) {
    
    // Definimos las variables
    int i = 320;
    int j = 20;
    
    // Creamos el bucle correspondiente
    do {
      System.out.println(i);
      i -= j;
    } while (i > 159);
  }
}

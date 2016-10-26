/**
* 
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.  
*
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/
public class Ejercicio03{
  public static void main(String[] args) {
    
    // Definimos las variables
    int i = 1;
    int multiplo = 5;
    
    // Creamos el bucle correspondiente
    do {
      if (i % multiplo == 0) {
        System.out.println(i);
      } else {
      }
      i++;
    } while (i < 101);
  }
}

/**
* 
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
*
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/
public class Ejercicio02 {
  public static void main(String[] args) {
    
    // Definimos las variables
    int i = 1;
    int multiplo = 5;
    
    // Creamos el bucle correspondiente
    while (i < 101) {
      
      if (i % multiplo == 0) {
        System.out.println(i);
      } else {
      }
      i++;
    }  
  }
}
    

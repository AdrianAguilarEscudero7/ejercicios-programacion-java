/**
* 
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/
public class Ejercicio22 {
  public static void main(String[] args) {
    
    // Declaramos una variable de tipo boolean
    boolean esPrimo = true;
    
    for (int i = 2; i <= 100; i++) {
      
      // Comprueba si i es primo
      esPrimo = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          esPrimo = false;
        }
      }
      
      // Muestra el número por pantalla si es primo
      if (esPrimo) {
       System.out.print(i + ", ");
      }
    }
  }
}


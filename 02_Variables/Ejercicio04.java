/**
* Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
* convertir deberá estar almacenada en una variable.
*
* Operaciones con variables
*
* @author Adrián Aguilar
*/
public class Ejercicio04 {
  public static void main(String[] args) {   
  double euro = 15;
  double diferenciaEurPes = 166.683;
  int peseta = (int)euro * (int)diferenciaEurPes;

  System.out.println("Ha introducido "+ euro + " €");
  System.out.println("La cantidad introducida equivale a: " + peseta + " pesetas.");



  }
}

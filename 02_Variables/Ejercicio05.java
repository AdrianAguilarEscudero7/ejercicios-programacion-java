/**
* Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
* convertir deberá estar almacenada en una variable.
*
* Operaciones con variables
*
* @author Adrián Aguilar
*/
public class Ejercicio05 {
  public static void main(String[] args) {   
  int peseta = 500;   
  double diferenciaPesEur = 0.006;
  double euro = peseta * diferenciaPesEur;
  
  System.out.println("Ha introducido " + peseta + " pesetas.");
  System.out.println("La cantidad introducida equivale a: " + euro + " €");


  }
}

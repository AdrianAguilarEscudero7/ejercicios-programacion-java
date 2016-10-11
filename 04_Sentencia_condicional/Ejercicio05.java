/**
* 
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
* b = 0).
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio05  {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduzca una ecuación del tipo (ax + b = 0), primera constante: "); 
    int constante1 = Integer.parseInt(System.console().readLine());
    System.out.print(constante1);
    
    System.out.print(", Ahora introduzca la segunda constante: ");
         
    int constante2 = Integer.parseInt(System.console().readLine());
        
    double ecuacion = (double)(- constante2) / constante1;
    
      if ((constante1 == 0) && (constante2 == 0)) {
      System.out.print("\n0 = 0 (identidad)");
    } else if (constante2 == 0) {
      System.out.print("\nx es igual a: " + (int)ecuacion);
    } else if ((constante1 == 0) && (constante2 != 0)) {
      System.out.print("\n" + constante2 + " = 0 ¡error!, por favor, introduzca unas constantes válidas.");
    } else {
      System.out.print("\nx = " + ecuacion);
    }
    
    
  }
}


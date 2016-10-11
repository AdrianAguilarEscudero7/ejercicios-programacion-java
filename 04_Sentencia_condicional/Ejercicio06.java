/**
* 
* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
* una altura h. Aplica la fórmula t = (√2h/g) siendo g = 9.81 m/s².
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio06  {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca una altura (en metros): ");
    Double altura = Double.parseDouble(System.console().readLine());
    System.out.println(altura + " metros.");
    double formulaT = Math.sqrt((2*altura)/9.81);
    
    if (altura < 0) {
      System.out.print("\n¡Error!, no hay solución real de la raíz cuadrada de un número negativo.");
    } else if(altura == 0) {
      System.out.print("\nEl objeto tardará en caer " + (int)formulaT + " segundos.");
    } else {
      System.out.printf("\nEl objeto tardará en caer %.3f segundos.", formulaT);
    }
  }
}  

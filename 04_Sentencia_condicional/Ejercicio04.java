/**
* 
* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
* las horas extras. Escribe un programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio04  {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca las horas trabajadas esta semana: ");
    Double horas = Double.parseDouble(System.console().readLine());
    double salario;
    
    if ((horas > 0) && (horas <= 40)) {
      salario = horas * 12;
      System.out.println("El sueldo semanal que le corresponde es de " + salario + " €.");
    } else if (horas > 40){
      salario = 480 + (horas - 40) * 16;
      System.out.println("El sueldo semanal que le corresponde es de " + salario + " €.");
    } else if (horas == 0) {
      System.out.println("Lo siento, no ha trabajado esta semana.");
    } else if (horas < 0) {
      System.out.println("¡Error!, por favor, introduzca una hora válida.");
    }  
  }
}    

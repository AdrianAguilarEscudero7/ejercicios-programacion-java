/**
* 
* Realiza un programa que calcule la media de tres notas.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio07  {
  public static void main(String[] args) {
    
    // Introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca su primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("\nPor favor, introduzca su segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("\nPor favor, introduzca su tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
    
    // Realizamos la operación matemática
    double media = ((nota1 + nota2 + nota3)/3);
    double modulo = ((nota1 + nota2 + nota3)%3);
    
    // Establecemos las condiciones y mostramos el resultado por pantalla
    if ((nota1 < 0) || (nota2 < 0) || (nota3 < 0)){
      System.out.println("\n¡Error!, por favor, introduzca una nota válida (no puede ser negativa).");
    } else if (modulo == 0) {
      System.out.println("\nSu nota media final es de " + (int)media);
    } else {
      System.out.printf("\nSu nota media final es de %.3f\n", media);
    }
  }
}  

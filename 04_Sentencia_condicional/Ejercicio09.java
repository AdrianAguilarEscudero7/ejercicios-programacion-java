/**
* 
* Realiza un programa que resuelva una ecuación de segundo grado (del tipo
* ax 2 + bx + c = 0).
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio09 {
  public static void main(String[] args) {
    
    // Introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca la primera constante (a): ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la segunda constante (b): ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Por último, introduzca la tercera constante (c): ");
    int c = Integer.parseInt(System.console().readLine());
    
    // Realizamos las operaciones matemáticas
    double x1 = (-b + Math.sqrt((b*b) - 4 * a * c));
    double x2 = (-b - Math.sqrt((b*b) - 4 * a * c));
    double discriminante = Math.sqrt((b*b) - 4 * a * c);
    double x1Total = (x1 / (2 * a));
    double x2Total = (x2 / (2 * a));
    double cociente = (2 * a);
    
    // Establecemos las condiciones y mostramos las soluciones por pantalla
    if (cociente == 0) {
      System.out.print("\n¡Error!, 'no se puede dividir entre 0'.");
    } else if (discriminante == 0) {
      System.out.print("\nLa solución de la ecuación de segundo grado es, x = " + ((-b) / (2 * a)));
    } else if (discriminante > 0) {
      System.out.printf("\nLas soluciones de la ecuación de segundo grado son, (%.3f) y, (%.3f)", x1Total, x2Total);
    } else {
      System.out.print("\n¡Error!, no existe solución real para la raíz cuadrada de un número negativo.");
    }
  }  
}
 

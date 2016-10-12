/**
* 
* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
* suficiente, bien, notable o sobresaliente).
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio08  {
  public static void main(String[] args) {
    
    // Introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca su primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca su segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca su tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
      
    // Realizamos las operaciones matemáticas
    double media = ((nota1 + nota2 + nota3)/3);
    
    // Establecemos las nuevas condiciones y mostramos las soluciones por pantalla
    if ((nota1 < 0) || (nota2 < 0) || (nota3 < 0)) {
      System.out.println("\n¡Error!, por favor, introduzca una nota válida (no puede ser negativa)."); 
    } else if ((media >= 9) && (media <= 10)) {
      System.out.printf("\nSu nota media final es de %.2f\n", media);
      System.out.print("\n¡Enhorabuena, tiene un sobresaliente!.");
    } else if ((media >= 7) && (media <= 8)) {
      System.out.printf("\nSu nota media final es de %.2f\n", media);
      System.out.print("\nBien hecho, tiene un notable.");
    } else if (media == 6) {
      System.out.printf("\nSu nota media final es de %.2f\n", media);
      System.out.print("\nNo está mal... tiene un bien.");
    } else if (media == 5) {
      System.out.printf("\nSu nota media final es de %.2f\n", media);
      System.out.print("\nTiene un suficiente, ha aprobado por los pelos...");
    } else if ((media < 5) && (media >= 0)) {
      System.out.printf("\nSu nota media final es de %.2f\n", media);
      System.out.print("\nTiene un insuficiente, la próxima vez estudie más...");
    } 
  }
}  

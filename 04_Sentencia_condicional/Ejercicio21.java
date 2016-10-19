/**
* 
* Calcula la nota de un trimestre de la asignatura Programación. El programa
* pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
* Si la media de los dos controles da un número mayor o igual a 5, el alumno
* está aprobado y se mostrará la media. En caso de que la media sea un número
* menor que 5, el alumno habrá tenido que hacer el examen de recuperación
* que se califica como apto o no apto, por tanto se debe preguntar al usuario
* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
* resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
* mantiene la nota media anterior.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio21 {
  public static void main(String[] args) {
  
    System.out.println("\nBienvenid@, vamos a ver cuál ha sido su nota trimestral en programación.");
    System.out.print("\nPor favor, introduzca la nota de su primer examen: ");
    Double examen1 = Double.parseDouble(System.console().readLine());
    System.out.print("\nAhora introduzca la nota de su segundo examen: ");
    Double examen2 = Double.parseDouble(System.console().readLine());
    System.out.println("------------------------------------------------------------------------");
    
    double media = ((examen1 + examen2) / 2);


    if (((examen1 < 0) || (examen1 > 10)) || ((examen2 < 0) || (examen2 > 10))) {
      System.out.print("\n¡Error!, por favor, introduzca una nota válida.");
    } else if ((media >= 5) && (media <= 10)) {
      System.out.println("\nLa nota de su primer examen fue: " + examen1);
      System.out.println("Mientras que la nota de su segundo examen fue: " + examen2);
      System.out.println("\nSu nota de programación es un " + media);
      System.out.println("\n¡Enhorabuena, ha aprobado!.");
    } else if ((media >= 0) && (media < 5)) {
      System.out.println("\nLa nota de su primer examen fue: " + examen1);
      System.out.println("Mientras que la nota de su segundo examen fue: " + examen2);
      System.out.print("\n¡Vaya!, parece que tuvo que hacer una recuperación, ¿cuál fue su resultado?");
      System.out.print(" (apto/no apto): ");
      String recuperacion = System.console().readLine().toLowerCase();
      
      if (recuperacion.equals("apto")) {
        System.out.print("\nEn ese caso, su nota de programación es un 5.");
      } else if (recuperacion.equals("no apto")) {
        System.out.print("\nLo siento, su nota de programación es un " + media + ", tiene que esforzarse más...");
      } else {
        System.out.print("\n¡Error!, ha introducido un valor no válido, por favor escriba (apto/no apto).");
      }
    }
  }
}

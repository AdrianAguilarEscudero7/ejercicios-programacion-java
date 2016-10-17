/**
* 
* Escribe un programa que pinte una pirámide rellena con un carácter introdu-
* cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
* -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
* el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
* izquierda o hacia la derecha.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio15 {
  public static void main(String[] args) {

    // Introducimos los datos por teclado
    System.out.println("\nBienvenido al menú del creador de pirámides.");
    System.out.println("\nPor favor, seleccione una opción del menú.");
    System.out.println("-------------------------------------------------");
    System.out.println("\n1- Crear una pirámide con el vértice hacia arriba.");
    System.out.println("\n2- Crear una pirámide con el vértice hacia abajo.");
    System.out.println("\n3- Crear una pirámide con el vértice hacia la izquierda.");
    System.out.println("\n4- Crear una pirámide con el vértice hacia la derecha.");
    System.out.print("\nOpción: ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    // Desarrollamos el menú con switch y mostramos las pirámides por pantalla según la opción elegida
    switch (opcion) {
      
      // Pirámide con el vértice hacia arriba
      case 1:
        System.out.print("\nPor favor, introduzca el carácter con el que desea crear la pirámide: ");
        String char1 = System.console().readLine().toUpperCase();
        System.out.printf("\n    %9s", char1);
        System.out.printf("\n   %8s %s %s", char1, char1, char1);
        System.out.printf("\n  %7s %s %s %s %s", char1, char1, char1, char1, char1);
        System.out.printf("\n %6s %s %s %s %s %s %s", char1, char1, char1, char1, char1, char1, char1);
        System.out.printf("\n%5s %s %s %s %s %s %s %s %s", char1, char1, char1, char1, char1, char1, char1, char1, char1);
      break;
      
      // Pirámide con el vértice hacia abajo
      case 2:
        System.out.print("\nPor favor, introduzca el carácter con el que desea crear la pirámide: ");
        String char2 = System.console().readLine().toUpperCase();
        System.out.printf("\n%5s %s %s %s %s %s %s %s %s", char2, char2, char2, char2, char2, char2, char2, char2, char2);
        System.out.printf("\n %6s %s %s %s %s %s %s", char2, char2, char2, char2, char2, char2, char2);
        System.out.printf("\n  %7s %s %s %s %s", char2, char2, char2, char2, char2);
        System.out.printf("\n   %8s %s %s", char2, char2, char2);
        System.out.printf("\n    %9s", char2);
      break;
      
      // Pirámide con el vértice hacia la izquierda
      case 3:
        System.out.print("\nPor favor, introduzca el carácter con el que desea crear la pirámide: ");
        String char3 = System.console().readLine().toUpperCase();
        System.out.printf("\n    %9s", char3);
        System.out.printf("\n   %8s %s", char3, char3);
        System.out.printf("\n  %7s %s %s", char3, char3, char3);
        System.out.printf("\n %6s %s %s %s", char3, char3, char3, char3);
        System.out.printf("\n%5s %s %s %s %s", char3, char3, char3, char3, char3);
        System.out.printf("\n %6s %s %s %s", char3, char3, char3, char3);
        System.out.printf("\n  %7s %s %s", char3 ,char3, char3);
        System.out.printf("\n   %8s %s", char3, char3);
        System.out.printf("\n    %9s", char3);
      break;
      
      // Pirámide con el vértice hacia la derecha
      case 4:
        System.out.print("\nPor favor, introduzca el carácter con el que desea crear la pirámide: ");
        String char4 = System.console().readLine().toUpperCase();
        System.out.printf("\n%5s", char4);
        System.out.printf("\n%5s %s", char4, char4);
        System.out.printf("\n%5s %s %s", char4, char4, char4);
        System.out.printf("\n%5s %s %s %s", char4, char4, char4, char4);
        System.out.printf("\n%5s %s %s %s %s", char4, char4, char4, char4, char4);
        System.out.printf("\n%5s %s %s %s", char4, char4, char4, char4);
        System.out.printf("\n%5s %s %s", char4, char4, char4);
        System.out.printf("\n%5s %s", char4, char4);
        System.out.printf("\n%5s", char4);
      break;
      
      default:
        System.out.print("\n¡Error!, por favor, introduzca una opción del menú válida.");
    }
  }
}

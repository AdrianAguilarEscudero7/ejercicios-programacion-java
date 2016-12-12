/**
* 
* Un restaurante nos ha encargado una aplicación para colocar a los clientes en
* sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
* (mesa llena). Cuando llega un cliente se le pregunta cuántos son.  De momento
* el programa no está preparado para colocar a grupos mayores a 4, por tanto,
* si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
* mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
* personas como máximo e intente de nuevo”. Para el grupo que llega,
* se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
* libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
* grupo es de dos personas, se podrá colocar donde haya una o dos personas.
* Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
* vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
* Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
* funcionamiento del programa se ilustra a continuación:
*
* Arrays
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String amarillo = "\u001B[33m";
    String blanco = "\u001B[37m";
    String celeste = "\u001B[36m";
    String rojo = "\u001B[31m";
    String verde = "\u001B[32m";
    
    // Presenta el programa
    System.out.print(celeste + "\n**Bienvenid@ al Chiringuito de Adri ⚓ **." + blanco + " Yo seré el encargado");
    System.out.print(" de la gestión de las mesas del chiringuito. En este chiringuito la capacidad de las");
    System.out.println(" mesas es de 4 comensales como máximo. Entre y disfrute de la comida.");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int mesaAleatoria[] = new int[10];
    
    // Genera al azar las primeras mesas ocupadas
    System.out.println("┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.println("│ Mesa nº │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │  10 │");
    System.out.println("├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│Ocupación");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%3d  ", (mesaAleatoria[i] = (int)(Math.random()*5)));
    }
    System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\n");
    
    int grupos;
    boolean haySitioVacio = true;
    boolean haySitio = true;
    boolean chiringuitoCompleto = false;
    
    // Repite el programa hasta que el usuario introduzca -1, o todas las mesas estén totalmente llenas
    do {
      System.out.print("Bienvenid@, ¿Cuántos son? (introduzca -1 para salir de la aplicación): ");
      grupos = s.nextInt();
      
      int j = 0;
      haySitioVacio = true;
      haySitio = true;
      
      // Si los grupos son mayores a 4, se envía mensaje de error
      if (grupos > 4) {
        System.out.print("\nLo sentimos, no admitimos grupos de " + grupos + ", haga grupos de 4 personas");
        System.out.println(" como máximo e inténtelo de nuevo. Disculpe las molestias.\n");
      } else if ((grupos > 0) && (grupos <= 4)) { // Si no, se empieza a reservar mesas
        
        // Si hay mesas vacías, las utiliza prioritariamente
        while (j <= 9) {
          if (mesaAleatoria[j] == 0) {
            System.out.print(verde + "\nPor favor, siéntense en la mesa número " + (j+1) + ".\n" + blanco);
            mesaAleatoria[j] += grupos;
            
            System.out.println("┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
            System.out.println("│ Mesa nº │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │  10 │");
            System.out.println("├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            System.out.print("│Ocupación");
            for (int k = 0; k < 10; k++) {
              if (k == j) {
                System.out.printf("│" + celeste + "%3d  " + blanco, mesaAleatoria[k]);
              } else {
                System.out.printf("│" + blanco + "%3d  ", mesaAleatoria[k]);
              }
            } 
            System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\n");
            j = 11;
          } else {
            j++;
            haySitioVacio = false;
          }
        }
        // Si no hay sitios vacíos, se comparten las mesas sin pasarse de 4 comensales
        if ((j == 10) && (!haySitioVacio)) {
          j = 0;
          while (j <= 9) {
            if ((mesaAleatoria[j] + grupos) <= 4) {
              System.out.print(amarillo + "\nTendrán que compartir mesa, por favor, siéntense en la");
              System.out.print(" mesa número " + (j+1) + ".\n" + blanco);
              mesaAleatoria[j] += grupos;
              
              System.out.println("┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
              System.out.println("│ Mesa nº │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │  10 │");
              System.out.println("├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
              System.out.print("│Ocupación");
              for (int l = 0; l < 10; l++) {
                if (l == j) {
                  System.out.printf("│" + celeste + "%3d  " + blanco, mesaAleatoria[l]);
                } else {
                  System.out.printf("│" + blanco + "%3d  ", mesaAleatoria[l]);
                }
              }
              System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘\n");
              j = 11;
            } else {
              j++;
              haySitio = false;
            }
          }
        }
        // Si no hay sitio para el grupo que venga, no deja reservar mesa
        if ((j == 10) && (!haySitio)) {
          System.out.print(rojo + "\nLo siento, en estos momentos no queda sitio para su grupo, vuelva después");
          System.out.println(" y disculpe las molestias.\n" + blanco);
        }
        
        int contadorCompleto = 0;
        
        // Si todas las mesas están llenas, cierra la aplicación
        for (int x = 0; x < 10; x++) {
          if (mesaAleatoria[x] == 4) {
            contadorCompleto++;
          }
          if (contadorCompleto == 10) {
            System.out.print("¡Vaya!, parece que nuestro chiringuito esta totalmente lleno, por favor,");
            System.out.println(" vuelva en 1 hora para comprobar si hay algún sitio libre. Gracias.");
            chiringuitoCompleto = true;
          }
        }
      }
    } while ((grupos != -1) && (!chiringuitoCompleto));
  }
}

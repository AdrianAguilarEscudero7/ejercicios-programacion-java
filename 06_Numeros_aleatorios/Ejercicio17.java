/**
* 
* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
* Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
* serán de 4 unidades. No hay que comprobar que los datos se introducen
* correctamente; podemos suponer que el usuario los introduce bien. Dentro
* de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
* situado en cualquiera de las posiciones que quedan en el hueco que forma el
* rectángulo.
*
* Ejemplo:
* Por favor, introduzca la altura de la pecera (como mínimo 4): 4
* Ahora introduzca la anchura (como mínimo 4): 7
*
*  * * * * * * *
*  *           *
*  *       &   *
*  * * * * * * *
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, este programa pintará una pecera con un pez dentro que se moverá");
    System.out.println(" de forma aleatoria dentro de ella. El mínimo del ancho y del alto ha de ser 4.");
    System.out.println("-----------------------------------------------------------------------------");
    int altura;
    int anchura;
    int posicion = 0; // Almacena una posición ascendente hasta que se iguale a la aleatoria
    
    // Comprobamos que la altura y anchura son mínimo 4
    do {
      System.out.print("\nPor favor, introduzca la altura de la pecera (mínimo 4): ");
      altura = Integer.parseInt(s.nextLine());
      System.out.print("\nAhora introduzca la anchura (mínimo 4): ");
      anchura = Integer.parseInt(s.nextLine());
    } while ((altura < 4) || (anchura < 4));
    
    // Generamos la posición del pez de manera aleatoria dentro del rectángulo
    int lugarPez = (int)(Math.random()*(altura-2)*(anchura*2-4));
    System.out.println();
    
    // Generamos el rectángulo
    for (int i = 1; i <= altura; i++) {
      System.out.print("* ");
      
      // Si es igual a 1 o igual a altura, pintamos el techo y la base respectivamente
      if ((i == 1) || (i == altura)) {
        for (int j = 1; j < anchura; j++) {
          System.out.print("* ");
        }
      } else {
        for(int k = 4; k < anchura*2; k++) {
          // Si posición es igual al número aleatorio de la posición del pez, pintamos el pez
          if (posicion == lugarPez) {
            System.out.print("&");
            // si no, pintamos espacios
          } else {
            System.out.print(" ");
          }
          posicion++;
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

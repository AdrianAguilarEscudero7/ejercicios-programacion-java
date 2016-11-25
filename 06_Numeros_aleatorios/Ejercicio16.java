/**
* 
* Realiza un simulador de máquina tragaperras simplificada que cumpla los
* siguientes requisitos:
* 
* a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
* figuras posibles: corazón, diamante, herradura, campana y limón.
* 
* b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
* ha perdido”.
* 
* c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
* ha recuperado su moneda”.
* 
* d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
* 10 monedas”.
* 
* Ejemplo 1:
* diamante diamante limón
* Bien, ha recuperado su moneda
* 
* Ejemplo 2:
* herradura campana diamante
* Lo siento, ha perdido
* 
* Ejemplo 3:
* corazón corazón corazón
* Enhorabuena, ha ganado 10 monedas
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    
    // Presentamos el programa
    System.out.print("\nBienvenid@ a la máquina tragaperras, si consigue 2 figuras iguales le devolveremos");
    System.out.println(" su dinero, si consigue las 3, habrá ganado el premio. ¡Buena suerte!.");
    System.out.println("-----------------------------------------------------------------------------");
    int figuras; // Almacena las figuras al azar
    int figura1 = 0; // Almacena la figura 1
    int figura2 = 0; // Almacena la figura 2
    int figura3 = 0; // Almacena la figura 3
    System.out.println();
    
    // Genera 3 figuras al azar
    for (int i = 1; i <= 3; i++) {
      figuras = (int)(Math.random()*5+1);
      
      // Almacena las 3 figuras
      if (i == 1) {
        figura1 = figuras;
      } else if (i == 2) {
        figura2 = figuras;
      } else if (i == 3) {
        figura3 = figuras;
      }
      switch (figuras) {
        case 1:
          System.out.print("Corazón ");
          break;
        case 2:
          System.out.print("Diamante ");
          break;
        case 3:
          System.out.print("Herradura ");
          break;
        case 4:
          System.out.print("Campana ");
          break;
        case 5:
          System.out.print("Limón ");
          break;
        default:
          System.out.print("Nada");
      }
    }
    System.out.println("\n---------------------------------------------------------------------------");
    
    // Muestra los resultados por pantalla según las condiciones
    if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.print("\n¡Enhorabuena, ha ganado el premio!, aquí tiene sus 10 monedas.");
    } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)) {
      System.out.println("\n¡Uy!, ha estado a punto, aquí tiene su moneda de nuevo. En la siguiente tirada tendrá más suerte.");
    } else {
      System.out.print("\nVaya... ha perdido, no se desanime, a la siguiente tendrá más suerte...");
    }
  } 
}

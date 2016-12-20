/**
*
* Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
* de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
* 
* @author Adrián Aguilar
*/

public class Ejercicio07 {

  // Se definen constantes para representar el
  // Contenido de las celdas
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;
   
  public static void main(String[] args) {
    
    int x;
    int y;
    int[][] cuadrante = new int[7][6];
    String verde = "\u001B[32m";
    String blanco = "\u001B[37m";
    String rojo = "\u001B[31m";
    String amarillo = "\u001B[33m";
    
    // Inicializa el array
    for(y = 0; y < 7; y++) {
      for(x = 0; x < 6; x++) {
        cuadrante[y][x] = VACIO;
      }
    }
    // Coloca la mina
    int minaX = (int)(Math.random()*6);
    int minaY = (int)(Math.random()*7);
    cuadrante[minaY][minaX] = MINA;
    
    // Coloca el tesoro
    int tesoroX;
    int tesoroY;
    do {
      tesoroX = (int)(Math.random()*6);
      tesoroY = (int)(Math.random()*7);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroY][tesoroX] = TESORO;
    
    // Comienza el juego
    System.out.println("¡BUSQUE EL TESORO!\n");
    int distanciaX = 0;
    int distanciaY = 0;
    boolean salir = false;
    boolean minaCerca = false;
    String c = "";
    do {
      if (minaCerca) { // Avisa cuando hay una mina cerca si 'minaCerca' es true
        System.out.println(amarillo + "¡Cuidado, es posible que haya una mina cerca!.\n" + blanco);
      } 
      minaCerca = false;
      // Pinta el cuadrante
      for(y = 6; y >= 0; y--) {
        System.out.print(y + "|");  
        for(x = 0; x < 6; x++) {
          if (cuadrante[y][x] == INTENTO) {
            System.out.print("⛳ ");
          } else {
            System.out.print(verde + "♛ " + blanco);
          }
        }
        System.out.println();   
      }
      System.out.println("  ------------\n  0 1 2 3 4 5\n");
      
      
      // Pide las coordenadas  
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      
      System.out.println();
      
      // Mira lo que hay en las coordenadas indicadas por el usuario
      switch(cuadrante[y][x]) {
        case VACIO:
          cuadrante[y][x] = INTENTO;
          if ((Math.abs((x-minaX)) <= 1) && (Math.abs((y-minaY)) <= 1)) {
            minaCerca = true;
          }
          break;
        case MINA:
          System.out.println("Lo siento, ha perdido.\n");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena, ha encontrado el tesoro!.\n"); 
          salir = true;
          break;
        default:
      }
    } while (!salir);

    // Pinta el cuadrante
    for(y = 6; y >= 0; y--) {
      System.out.print(y + " ");  
      for(x = 0; x < 6; x++) {
        switch(cuadrante[y][x]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = rojo + "☠ " + blanco;
            break;
          case TESORO: 
            c = amarillo + "⛁ " + blanco;
            break;
          case INTENTO:
            c = "⛳ ";
            break;
          default:
        }
        System.out.print(c);
      }      
      System.out.println();    
    }
    System.out.println("  ------------\n  0 1 2 3 4 5\n");
  }
}

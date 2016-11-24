/**
* 
* Realiza un gnerador de melodía con las siguientes condiciones:
*
* a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
* sol, la y si.
*
* b) Una melodía está formada por un número aleatorio de notas mayor o igual
* a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
*
* c) Cada grupo de 4 notas será un compás y estará separado del siguiente
* compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
* con dos barras.
*
* d) La última nota de la melodía debe coincidir con la primera.
* 
* Ejemplo 1:
* do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
*
* Ejemplo 2:
* la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    
    // Presentamos el programa
    System.out.println("\nBienvenid@ al generador de melodías, siéntese y escuche...");
    System.out.println("-----------------------------------------------------------------------------");
    int notas; // Almacena cada nota de forma aleatoria
    int grupos; // Almacena en grupos las notas en múltiplos de 4 desde 4 a 28
    int primeraNota = 0; // Almacena el valor de la primera nota que salga
    
    // Genera una melodía aleatoria de 4 a 28 notas
    int melodia = (int)(Math.random()*8+1);
    System.out.println();
    
    switch (melodia) {
      case 1:
        grupos = 4;
        break;
      case 2:
        grupos = 8;
        break;
      case 4:
        grupos = 12;
        break;
      case 5:
        grupos = 16;
        break;
      case 6:
        grupos = 20;
        break;
      case 7:
        grupos = 24;
        break;
      case 8:
        grupos = 28;
        break;
      default:
        grupos = 4;
    }
    // Genera una nota hasta llegar al máximo de de la melodía
    for (int i = 1; i <= grupos; i++) {
      notas = (int)(Math.random()*7+1);
      
      // Almacenamos el valor de la primera nota para después utilizarla en la nota final
      if (i == 1) {
        primeraNota = notas;    
      }
      // Cambiamos la nota final por la primera nota que salió
      if (i == grupos) {
        notas = primeraNota;
      }
      switch (notas) {
        case 1:
          System.out.print(" do ");
          break;
        case 2:
          System.out.print(" re ");
          break;
        case 3:
          System.out.print(" mi ");
          break;
        case 4:
          System.out.print(" fa ");
          break;
        case 5:
          System.out.print(" sol ");
          break;
        case 6:
          System.out.print(" la ");
          break;
        case 7:
          System.out.print(" si ");
          break;
        default:
          System.out.print("Nada");
      }
      // Pintamos la barra "|" en cada grupo de 4 notas
      if (i % 4 == 0) {
      System.out.print("|");
      }
    }
    System.out.println("|");
  }
}

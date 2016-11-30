/**
* 
* Realiza un programa que genere una secuencia de cinco monedas de curso
* legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
* 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
* posiciones posibles son cara y cruz.
*
* Ejemplo:
*
* 2 céntimos - cara
* 20 céntimos - cruz
* 50 céntimos - cruz
* 1 euro - cruz
* 2 euros - cara
*
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa mostrará la secuencia de 5 monedas y si ha salido cara o cruz.");
    System.out.println("------------------------------------------------------------------------------");
    System.out.println();
    
    int moneda; // Almacena el valor que generará el tipo de moneda al azar
    int cara; // Almacena el valor al azar de cara o cruz
    
    // Genera el tipo de moneda y si es cara o cruz al azar
    for (int i = 1; i <= 5; i++) {
      moneda = (int)(Math.random()*8+1);
      
      // Provoca que la secuencia tenga un retardo de 0.8 secs
      Thread.sleep(800);
      
      switch (moneda) {
        case 1:
          System.out.print("1 céntimo");
          break;
        case 2:
          System.out.print("2 céntimos");
          break;
        case 3:
          System.out.print("5 céntimos");
          break;
        case 4:
          System.out.print("10 céntimos");
          break;
        case 5:
          System.out.print("20 céntimos");
          break;
        case 6:
          System.out.print("50 céntimos");
          break;
        case 7:
          System.out.print("1 euro");
          break;
        case 8:
          System.out.print("2 euros");
          break;
        default:
      }
      System.out.print(" - ");
      
      cara = (int)(Math.random()*2+1);
      
      switch (cara) {
        case 1:
          System.out.print("cara");
          break;
        case 2:
          System.out.print("cruz");
          break;
        default:
      }
      System.out.println();
    }
  }
}

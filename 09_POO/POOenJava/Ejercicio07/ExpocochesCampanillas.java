/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas dispo-
 * nibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.
 * La clase Zona con sus atributos y métodos se muestra a continuación:
 * 
 * @author Adrián Aguilar
 */
package ejercicio07;

import java.util.Scanner;

public class ExpocochesCampanillas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    int opcion;
    
    do {
      System.out.println("\n1. Mostrar número de entradas libres.");
      System.out.println("2. Vender entradas.");
      System.out.println("3. Salir.");
      System.out.print("\nElija una opción: ");
      opcion = Integer.parseInt(s.nextLine());
    
      switch (opcion) {
        case 1:
          System.out.println("\nSala Principal: " + salaPrincipal.getEntradasPorVender()
              + " entradas disponibles.");
          System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender()
            + " entradas disponibles.");
          System.out.println("Zona VIP: " + vip.getEntradasPorVender() + " entradas" +
              " disponibles.");
        break;
        case 2:
          int entradas = 0;
          System.out.print("\n¿Para qué zona quiere las entradas?: ");
          String zona = s.nextLine().toLowerCase();
          if (zona.equals("sala principal")) {
            do {
              System.out.print("¿Cuántas entradas quiere?: ");
              entradas = Integer.parseInt(s.nextLine());
              if (entradas > 50) {
                System.out.println("\nLo siento para esta zona no puede comprar" +
                    " más de 50 entradas.");
              }
            } while (entradas > 50);
            System.out.println();
            salaPrincipal.vender(entradas);
          } else if (zona.equals("compra-venta")) {
            do {
              System.out.print("¿Cuántas entradas quiere?: ");
              entradas = Integer.parseInt(s.nextLine());
              if (entradas > 10) {
                System.out.println("\nLo siento para esta zona no puede comprar" +
                		" más de 10 entradas.");
              }
            } while (entradas > 10);
            System.out.println();
            compraVenta.vender(entradas);
          } else if (zona.equals("vip")) {
            do {
              System.out.print("¿Cuántas entradas quiere?: ");
              entradas = Integer.parseInt(s.nextLine());
              if (entradas > 3) {
                System.out.println("\nLo siento para esta zona no puede comprar" +
                    " más de 3 entradas.");
              }
            } while (entradas > 3);
            System.out.println();
            vip.vender(entradas);
          } else {
            System.out.println("\nLo siento, no ha seleccionado ninguna zona correcta." +
            		" La zona debe ser una de las siguientes (Sala principal, compra-venta," +
            		" vip).");
          }
        break;
      }
    } while(opcion != 3);
    System.out.println("\n¡Hasta pronto!");
  }
}

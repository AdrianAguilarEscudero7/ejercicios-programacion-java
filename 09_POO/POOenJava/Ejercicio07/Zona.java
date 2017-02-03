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

public class Zona {

  private int entradasPorVender;

  public Zona(int n) {
    entradasPorVender = n;
  }

  public int getEntradasPorVender() {
    return entradasPorVender;
  }

  /**
   * Vende un número de entradas.
   * <p>
   * Comprueba si quedan entradas libres antes de realizar la venta.
   * 
   * @param n
   *          número de entradas a vender
   */
  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
          + " entradas para esa zona.");
    }
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}


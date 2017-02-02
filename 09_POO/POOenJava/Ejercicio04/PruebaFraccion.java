/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
 * los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author Adrián Aguilar
 */
package ejercicio04;

public class PruebaFraccion {
  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(24,32);
    Fraccion f2 = new Fraccion(6,4);
    Fraccion f3 = new Fraccion(146,128);
    
    System.out.println(f1);
    
    System.out.println("\n" + f2);
    
    System.out.println("\n" + f1.multiplica(f2));
    
    System.out.println("\n" + f1.divide(f2));
    
    System.out.println("\n" + f3);
    
    System.out.println("\n" + f3.simplifica());
    
    System.out.println("\n" + f2.invierte());
  }
}

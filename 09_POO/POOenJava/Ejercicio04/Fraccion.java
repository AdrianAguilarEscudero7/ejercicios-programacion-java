/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
 * los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author Adrián Aguilar
 */
package ejercicio04;

public class Fraccion {

  private int numerador;
  private int denominador;
  
  public Fraccion(int n, int d) {
    this.numerador = n;
    this.denominador = d;
  }
  
  @Override
  public String toString() {
    return this.numerador + "/" + this.denominador;
  }
  
  public Fraccion invierte() {
    return new Fraccion(this.denominador, this.numerador);
  }
  
  public Fraccion multiplica(Fraccion n) {
    return new Fraccion(this.numerador * n.numerador, this.denominador * n.denominador);
  }
  
  public Fraccion simplifica() {
    int mcd = 1;
    int minimo = Math.min(this.numerador, this.denominador);
    
    for (int i = 2; i <= minimo; i++) {
      if ((this.numerador % i == 0) && (this.denominador % i == 0)) {
        mcd = i;
      }
    }
    return new Fraccion(this.numerador/mcd, this.denominador/mcd);
  }
  
  public Fraccion divide(Fraccion n) {
    return new Fraccion(this.numerador * n.denominador, this.denominador * n.numerador);
  }
}
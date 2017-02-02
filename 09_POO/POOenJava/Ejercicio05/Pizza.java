/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar 
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 * El siguiente código del programa principal debe dar la salida que se muestra:
 * 
 * @author Adrián Aguilar
 */
package ejercicio05;

public class Pizza {

  private static int totalPizzasPedidas = 0;
  private static int totalPizzasServidas = 0;
  
  private String tamanho;
  private String tipo;
  private String estado;
  
  public Pizza(String tipo, String tam) {
    this.tipo = tipo;
    this.tamanho = tam;
    this.estado = "pedida";
    Pizza.totalPizzasPedidas++;
  }
  
  @Override
  public String toString() {
    return "Pizza: " + this.tipo + " " + this.tamanho + ", " + this.estado;
  }
  
  public static int getTotalPedidas() {
    return Pizza.totalPizzasPedidas;
  }
  public static int getTotalServidas() {
    return Pizza.totalPizzasServidas;
  }
  
  public void sirve() {
    if (this.estado.equals("servida")) {
      System.out.println("Esa pizza ya se ha servido.");
    } else {
      this.estado = "servida";
      Pizza.totalPizzasServidas++;
    }
  }
}

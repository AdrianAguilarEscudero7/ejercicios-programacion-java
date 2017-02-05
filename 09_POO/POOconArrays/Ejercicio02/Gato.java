/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”) . Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author Adrián Aguilar
 */
package ejercicio02;

public class Gato {
  
  private String sexo;
  private String color;
  private String nombre;
  

  public Gato (String n, String c, String s) {
    this.nombre = n;
    this.sexo = s;
    this.color = c;
  }
  
  public Gato (String s) {
    this.sexo = s;
    this.nombre = "Wisel";
    this.color = "Negro";
  }
  
  public Gato () {
    this.nombre = "Wisel";
    this.sexo = "Hembra";
    this.color = "Negro";
  }
  
  public String getSexo() {
    return this.sexo;
  }
  
  @Override
  public String toString() {
    return "Nombre: " + this.nombre 
            + "\nColor: " + this.color
            + "\nSexo: " + this.sexo
            + "\n*************************\n";
  }
  
  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */ 
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazará.
   * 
   * @param comida la comida que se le ofrece al gato
   */
  public void come(String comida) {
    
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sí.
   * 
   * @param contrincante es el gato contra el que pelear
   */
  public void peleaCon(Gato contrincante) {
    if (this.getSexo() == "hembra") {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo() == "hembra") {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
}

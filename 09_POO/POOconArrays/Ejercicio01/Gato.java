/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * 
 * @author Adrián Aguilar
 */
package ejercicio01;

public class Gato {
  
  private String sexo;
  private String raza;
  

  public Gato (String s, String r) {
    this.sexo = s;
    this.raza = r;
  }
  
  public Gato (String s) {
    this.sexo = s;
    this.raza = "siamés";
  }
  
  public Gato () {
    this.sexo = "Hembra";
    this.raza = "siamés";
  }
  
  public String getSexo() {
    return this.sexo;
  }
  
  @Override
  public String toString() {
    return "Sexo: " + this.sexo
            + "\nRaza: " + this.raza
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

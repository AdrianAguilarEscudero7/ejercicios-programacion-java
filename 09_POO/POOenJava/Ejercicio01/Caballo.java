  /**
   * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
   * instancias y aplicándole algunos métodos.
   * 
   * @author Adrián Aguilar
   */
package ejercicio01;

public class Caballo {

  public enum Sexo {
    HEMBRA, MACHO
  }

  private Sexo sexo;
  private String raza;
  private int edad;
  private int altura;
  private String temperamento;
  
  public Caballo() {
    this.sexo = Sexo.MACHO;
    this.raza = "Mustang";
    this.edad = 15;
    this.altura = 170;
    this.temperamento = "Nervioso";
  }
  public Caballo(Sexo s, String r, int e, int a, String temp) {
    this.sexo = s;
    this.raza = r;
    this.edad = e;
    this.altura = a;
    this.temperamento = temp;
  }
  public Caballo(Sexo s) {
    this.sexo = s;
    this.raza = "Mustang";
    this.edad = 15;
    this.altura = 170;
    this.temperamento = "Nervioso";
  }
  public String toString() {
    return "****************************"
        + "\nSexo: " + this.sexo
        + "\n" + "Raza: " + this.raza
        + "\n" + "Edad: " + this.edad
        + "\n" + "Altura: " + this.altura
        + "\n" + "Temperamento: " + this.temperamento
        + "\n****************************";
  }
  public void come(String c) {
    if (c.equals("vegetales")) {
      System.out.println("\nGracias, esto está muy bueno.");
    } else {
      System.out.println("\nLo siento, yo soy hervíbor@, solo como vegetales.");
    }
  }
  public void bebe() {
    System.out.println("\nEstoy bebiendo un poco de agua para bajar la comida, no moleste.");
  }
  public void duerme() {
    System.out.println("\nzZZzZzZzZzZzZ");
  }
  public void pasea() {
    System.out.println("\nEstoy paseando tranquilamente...");
  }
  public void trota() {
    System.out.println("\nEstoy trotando...");
  }
  public void galopa() {
    System.out.println("\n¡Estoooooy gaaalopaaandoooo!...");
  }
  public void seReproduce() {
    System.out.println("\nShh, ahora necesito intimidad, fuera.");
  }
  public void seReproduceCon(Caballo pareja) {
    if ((this.sexo == Sexo.MACHO) && (pareja.sexo == Sexo.HEMBRA)) {
      System.out.println("\nVen paquí moza que te empotro.");
    } else if ((this.sexo == Sexo.HEMBRA) && (pareja.sexo == Sexo.MACHO)) {
      System.out.println("\nHola guapo, ¿quieres pasar un buen rato?.");
    } else {
      System.out.println("\nLo siento aún no podemos decidir ser homosexuales =S.");
    }
  }
  public void relincha() {
    System.out.println("\nHhIIIhhbrfff");
  }
}


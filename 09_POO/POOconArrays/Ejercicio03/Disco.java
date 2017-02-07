/**
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 * 
 * @author Adrián Aguilar
 */
package ejercicio03;

public class Disco {

  private String isrc;
  private String autor;
  private String titulo;
  private String genero;
  private float duracion;
  
  public Disco(String isrc, String a, String t, String g, float d) {
    this.isrc = isrc;
    this.autor = a;
    this.titulo = t;
    this.genero = g;
    this.duracion = d;
  }
  
  public String getIsrc() {
    return isrc;
  }
  public void setIsrc(String isrc) {
    this.isrc = isrc;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public float getDuracion() {
    return duracion;
  }

  public void setDuracion(float duracion) {
    this.duracion = duracion;
  }
  
  @Override
  public String toString() {
    return "-----------------------------------------"
        + "\nCódigo ISRC: " + this.isrc
        + "\nAutor: " + this.autor
        + "\nTítulo: " + this.titulo
        + "\nGénero: " + this.genero
        + "\nDuración: " + this.duracion
        + "\n-----------------------------------------\n";
  }
}

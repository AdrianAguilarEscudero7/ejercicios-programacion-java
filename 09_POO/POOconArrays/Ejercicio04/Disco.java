/**
 * Modifica el programa “Colección de discos” como se indica a continuación:
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 * introducido por el usuario existe.
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir
 * que no se pueda repetir.
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 * listado completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género de-
 * terminado) y un listado de discos cuya duración esté en un rango determinado
 * por el usuario.
 * 
 * @author Adrián Aguilar
 */
package ejercicio04;

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

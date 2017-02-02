/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 * 
 * @author Adrián Aguilar
 */
package ejercicio06;

public class Tiempo {

  private int horas;
  private int minutos;
  private int segundos;
  
  public Tiempo(int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }
  
  @Override
  public String toString() {
    return this.horas + "h" + " " + this.minutos + "m" + " " + this.segundos + "s.";
  }
  
  public Tiempo suma(Tiempo t) {
    int newSegundos = 0;
    int newMinutos = 0;
    int newHoras = 0;
    
    if ((this.segundos + t.segundos) > 59) {
      newSegundos += (this.segundos+t.segundos)-60;
      newMinutos++;
    } else {
      newSegundos += this.segundos+t.segundos;
    }
    if ((this.minutos + t.minutos + newMinutos) > 59) {
      newMinutos += (this.minutos+t.minutos)-60;
      newHoras++;
    } else {
      newMinutos += this.minutos+t.minutos;
    }
    if ((this.horas + t.horas + newHoras) > 23) {
      newHoras += (this.horas+t.horas)-24;
    } else {
      newHoras += this.horas+t.horas;
    }
    return new Tiempo(newHoras, newMinutos, newSegundos);
  }
  
  public Tiempo resta(Tiempo t) {
    return new Tiempo(Math.abs(this.horas-t.horas), Math.abs(this.minutos-t.minutos), 
        Math.abs(this.segundos-t.segundos)); 
  }
}

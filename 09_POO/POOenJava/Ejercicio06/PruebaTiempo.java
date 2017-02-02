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

public class PruebaTiempo {
  public static void main(String[] args) {

    Tiempo t1 = new Tiempo(23,20,25);
    Tiempo t2 = new Tiempo(15,40,42);
    
    System.out.println("Hora1: " + t1);
    System.out.println("Hora2: " + t2);
    
    System.out.println();
    
    System.out.println("Suma: " + t1.suma(t2));
    
    System.out.println();
    
    System.out.println("Resta: " + t1.resta(t2));
   
    System.out.println();
    
    System.out.println("Resta inversa: " + t2.resta(t1));
  }
}

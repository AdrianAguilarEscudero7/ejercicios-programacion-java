/**
* 
* Escribe un programa que pida por teclado un día de la semana y que diga qué
* asignatura toca a primera hora ese día.
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio01  {
  public static void main(String[] args) {  
  
    System.out.print("Por favor introduzca un día de la semana (sensible a tildes): ");
    String dia = System.console().readLine().toUpperCase();
    
    if (dia.equals("LUNES")) {
      System.out.print("El lunes a primera hora tienes Sistemas Informáticos");
    } else if (dia.equals("MARTES")) {
        System.out.print("El martes a primera hora tienes Programación.");
    } else if (dia.equals("MIÉRCOLES")) {
        System.out.print("El miércoles a primera hora tienes Programación.");
    } else if (dia.equals("JUEVES")) {
        System.out.print("El jueves a primera hora tienes Bases de Datos.");
    } else if (dia.equals("VIERNES")) {
        System.out.print("El viernes a primera hora tienes Lenguaje de Marcas.");
    } else {
        System.out.print("El día introducido no existe, por favor introduzca un día válido.");
    }    
  }
}

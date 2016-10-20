/**
* 
* Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
* nos está siendo infiel. El programa irá haciendo preguntas que el usuario
* contestará con verdadero o falso. Cada pregunta contestada como verdadero
* sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
* za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
* del programa.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio16 {
  public static void main(String[] args) {
    
    // Presentamos el test e introducimos la pregunta 1
    System.out.println("\n·Bienvenid@ al test de infidelidad.");
    System.out.println("--------------------------------------");
    System.out.println("Se le va a realizar algunas preguntas sobre su vida privada. Conteste (V o F).");
    
    System.out.println("\n1-¿Su pareja parece estar más inquieta de lo normal sin ningún motivo aparente?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta1 = System.console().readLine().toUpperCase();
    
    // Declaramos la variable donde se almacenará la puntuación del test
    int puntuacion = 0;
    
    // Establecemos las condiciones de la pregunta 1
    if (respuesta1.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta1.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 2
    System.out.println("\n2-¿Ha aumentado sus gastos de vestuario?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta2 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 2
    if (respuesta2.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta2.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimmos la pregunta 3
    System.out.println("\n3-¿Ha perdido el interés que mostraba anteriormente por usted?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta3 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 3
    if (respuesta3.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta3.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 4
    System.out.println("\n4-¿ahora se afeita y se asea con más frecuencia? (si es hombre) o, ¿ahora se ");
    System.out.println("arregla el pelo y se asea con más frecuencia? (si es mujer).");
    System.out.print("\nSu respuesta es: ");
    String respuesta4 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 4
    if (respuesta4.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta4.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 5
    System.out.println("\n5-¿No le deja que mire la agenda de su teléfono móvil?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta5 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 5
    if (respuesta5.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta5.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 6
    System.out.println("\n6-¿A veces tiene llamadas que dice no querer contestar cuando está usted delante?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta6 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 6
    if (respuesta6.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta6.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 7
    System.out.println("\n7-¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta7 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 7
    if (respuesta7.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta7.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 8
    System.out.println("\n8-¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta8 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 8
    if (respuesta8.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta8.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 9
    System.out.println("\n9-¿Ha notado que últimamente se perfuma más?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta9 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 9
    if (respuesta9.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta9.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("\n-- Siguiente pregunta...");
    
    // Introducimos la pregunta 10
    System.out.println("\n10-¿Se confunde y le dice que ha estado en sitios donde no ha ido con usted?.");
    System.out.print("\nSu respuesta es: ");
    String respuesta10 = System.console().readLine().toUpperCase();
    
    // Establecemos las condiciones de la pregunta 10
    if (respuesta10.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta10.equals("F")) {
    } else {
      System.out.println("\n¡Error!, lo siento, ha introducido algún valor no válido.");
    }
    System.out.println("--------------------------------------------------------------------------");
    
    // Establecemos las condiciones finales de puntuación y mostramos los resultados por pantalla
    if (puntuacion <= 10) {
      System.out.println("\nHa sacado " + puntuacion + " puntos de infidelidad.");
      System.out.print("\n¡Enhorabuena!, su pareja parece ser totalmente fiel.");
    } else if (puntuacion <= 22) {
      System.out.println("\nHa sacado " + puntuacion + " puntos de infidelidad.");
      System.out.print("\nQuizás exista el peligro de otra persona en su vida o en su mente, aunque");
      System.out.print(" seguramente será algo sin importancia. No baje la guardia.");
    } else if (puntuacion <= 30) {
      System.out.println("\nHa sacado " + puntuacion + " puntos de infidelidad.");
      System.out.print("\nSu pareja tiene todos los ingredientes para estar viviendo un romance con");
      System.out.print(" otra persona. Le aconsejamos que indague un poco más y averigüe qué es");
      System.out.print(" lo que está pasando por su cabeza.");
    }
  }
}  

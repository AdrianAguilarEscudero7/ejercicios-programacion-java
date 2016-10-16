/**
* 
* Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
* que se imparten en el curso. Cada pregunta acertada sumará un punto. El
* programa mostrará al final la calificación obtenida. Pásale el minicuestionario
* a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
* mientos en las diferentes asignaturas del curso.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio12 {
  public static void main(String[] args) {
  
    // Presentamos el cuestionario e introducimos la primera pregunta
    System.out.println("\n¡BIENVENIDO AL MINICUESTIONARIO DE LA CLASE 1º DAW!");
    System.out.println("\n· Se le van a realizar 10 preguntas tipo test de todas las asignaturas.");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("\nPregunta nº1. ¿En qué consiste la tecnología de integración de un microprocesador?.");
    System.out.println("a).- Es el tamaño de la oblea de silicio de cada microprocesador. ");
    System.out.println("b).- Es la distancia mínima entre 2 transistores.");
    System.out.println("c).- Es la versión de los transistores en un microprocesador.");
    System.out.print("\nSu respuesta es: ");
    String respuesta = System.console().readLine().toLowerCase();
    
    // Declaramos la variable donde se almacenarán los puntos y se irán incrementando con los aciertos
    int puntos = 0;

    // Establecemos las condiciones de la primera pregunta y mostramos por pantalla el resultado
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta.equals("a")) || (respuesta.equals("c"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la b. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");  
    }
     
    // Introducimos la segunda pregunta
    System.out.println("\nPregunta nº2. ¿Por qué es importante la tecnología de integración en un microprocesador?.");
    System.out.println("a).- Porque a mayor tecnología de integración, más transistores y por consiguiente, más instrucciones y eficiencia.");
    System.out.println("b).- Porque nos ayuda a integrar en la placa base el microprocesador.");
    System.out.println("c).- Porque el microprocesador será más caro pero más inteligente.");
    System.out.print("\nSu respuesta es: "); 
    String respuesta2 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la segunda pregunta y mostramos por pantalla el resultado
    if (respuesta2.equals("a")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta2.equals("b")) || (respuesta2.equals("c"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la a. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la tercera pregunta
    System.out.println("\nPregunta nº3. ¿Qué supone una mayor frecuencia del microprocesador?.");
    System.out.println("a).- A mayor frecuencia, menor cantidad de instrucciones por segundo.");
    System.out.println("b).- A mayor frecuencia, ayuda a que la placa base sea más rápida.");
    System.out.println("c).- A mayor frecuencia, mayor cantidad de instrucciones por segundo.");
    System.out.print("\nSu respuesta es: ");
    String respuesta3 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la tercera pregunta y mostramos por pantalla el resultado
    if (respuesta3.equals("c")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta3.equals("a")) || (respuesta3.equals("b"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la c. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la cuarta pregunta
    System.out.println("\nPregunta nº4. ¿Qué significan las siglas HTML?.");
    System.out.println("a).- 'High Technology Message Load'.");
    System.out.println("b).- 'HyperText Markup Language'.");
    System.out.println("c).- 'Host Trending Markdown Language'.");
    System.out.print("\nSu respuesta es: ");
    String respuesta4 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la cuarta pregunta y mostramos por pantalla el resultado
    if (respuesta4.equals("b")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta4.equals("a")) || (respuesta4.equals("c"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la b. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la quinta pregunta
    System.out.println("\nPregunta nº5. ¿Qué es HTML?.");
    System.out.println("a).- Es un lenguaje de programación para escribir páginas web.");
    System.out.println("b).- Es un protocolo de transferencia de hipertexto.");
    System.out.println("c).- Es un lenguaje de marcado y etiquetado con el que se estructura la información de una página web.");
    System.out.print("\nSu respuesta es: ");
    String respuesta5 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la quinta pregunta y mostramos por pantalla el resultado
    if (respuesta5.equals("c")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta5.equals("a")) || (respuesta5.equals("b"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la c. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la sexta pregunta
    System.out.println("\nPregunta nº6. ¿Cómo se cierra cada 'case' de un 'switch'?.");
    System.out.println("a).- Con un 'break'.");
    System.out.println("b).- Con un 'end'.");
    System.out.println("c).- Con un 'close'.");
    System.out.print("\nSu respuesta es: ");
    String respuesta6 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la sexta pregunta y mostramos por pantalla el resultado
    if (respuesta6.equals("a")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta6.equals("b")) || (respuesta6.equals("c"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la a. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la séptima pregunta
    System.out.println("\nPregunta nº7. ¿Qué operador lógico significa 'y'?.");
    System.out.println("a).- 'and'.");
    System.out.println("b).- '&&'.");
    System.out.println("c).- 'y'.");
    System.out.print("\nSu respuesta es: ");
    String respuesta7 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la séptima pregunta y mostramos por pantalla el resultado
    if (respuesta7.equals("b")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta7.equals("a")) || (respuesta7.equals("c"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la b. Consigue 0 puntos.");
    } else {  
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la octava pregunta
    System.out.println("\nPregunta nº8. ¿Qué hay que escribir para almacenar una variable de tipo entero?.");
    System.out.println("a).- 'int + variable'.");
    System.out.println("b).- 'double + variable'.");
    System.out.println("c).- 'float + variable'.");
    System.out.print("\nSu respuesta es: ");
    String respuesta8 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la octava pregunta y mostramos por pantalla el resultado
    if (respuesta8.equals("a")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta8.equals("b")) || (respuesta8.equals("c"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la a. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la novena pregunta
    System.out.println("\nPregunta nº9. ¿Qué ventajas tienen las bases de datos respecto a los sistemas de almacenamiento convencionales?.");
    System.out.println("a).- Tienen una capacidad de almacenamiento ligeramente superior.");
    System.out.println("b).- Pueden almacenar infinitos datos.");
    System.out.println("c).- Tienen gran capacidad de almacenamiento, más rapidez, y más precisión.");
    System.out.print("\nSu respuesta es: ");
    String respuesta9 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la novena pregunta y mostramos por pantalla el resultado
    if (respuesta9.equals("c")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta9.equals("a")) || (respuesta9.equals("b"))) {
      System.out.println("\nLo siento, ha fallado, la respuesta correcta era la c. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    // Introducimos la décima pregunta
    System.out.println("\nPregunta nº10. ¿Con qué otro nombre se denominan las filas y columnas en las tablas de las bases de datos?");
    System.out.println("a).- Rayas y líneas.");
    System.out.println("b).- Registros y campos.");
    System.out.println("c).- Horizontales y verticales");
    System.out.print("\nSu respuesta es: ");
    String respuesta10 = System.console().readLine().toLowerCase();
    
    // Establecemos las condiciones de la décima pregunta y mostramos por pantalla el resultado
    if (respuesta10.equals("b")) {
      puntos++;
      System.out.println("\n¡CORRECTO!, ha conseguido 1 punto.");
    } else if ((respuesta10.equals("a")) || (respuesta10.equals("c"))) {
      System.out.println("\nLo siento ha fallado, la respuesta correcta era la b. Consigue 0 puntos.");
    } else {
      System.out.println("\n¡Error!, por favor, introduzca una respuesta válida (a, b o c).");
    }
    
    System.out.println("---------------------------------------------------------------------------------");
    
    // Establecemos las condiciones de la puntuación final y mostramos el resultado por pantalla
    if (puntos < 5) {
      System.out.println("\nSu puntuación es de: " + puntos);
      System.out.println("\nTiene un insuficiente, ha estudiado muy poco...");
    } else if ((puntos >= 5) && (puntos < 6)) {
      System.out.println("\nSu puntuación es de: " + puntos);
      System.out.println("\nTiene un suficiente, la próxima vez estudie más...");
    } else if ((puntos >= 6) && (puntos < 7)) {
      System.out.println("\nSu puntuación es de: " + puntos);
      System.out.println("\nTiene un bien, no está mal...");
    } else if ((puntos >= 7) && (puntos <= 8)) {
      System.out.println("\nSu puntuación es de: " + puntos);
      System.out.println("\nTiene un notable, ¡bien hecho!.");
    } else if ((puntos >= 9) && (puntos <= 10)) {
      System.out.println("\nSu puntuación es de: " + puntos);
      System.out.println("\nTiene un sobresaliente, muy buen trabajo, sigue así.");
    }
  }
}

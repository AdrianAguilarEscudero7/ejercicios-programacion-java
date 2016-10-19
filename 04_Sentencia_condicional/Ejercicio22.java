/**
* 
* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
* hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
* Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
* por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
* a las 15:00h.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio22 {
  public static void main(String[] args) {
  
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca un día de la semana (de lunes a viernes): ");
    String diaSemana = System.console().readLine().toLowerCase();
    System.out.print("\nAhora introduzca una hora (recuerde introducir una hora anterior a las 15:00");
    System.out.print(" si hoy es viernes): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("\nFinalmente, introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine()); 
    System.out.println("--------------------------------------------------------------------------");
  
    // Definimos la variable donde se almacenarán las horas y minutos
    int horasAndMinutos = ((hora * 60) + minutos);
    
    // Establecemos las condiciones y mostramos las soluciones por pantalla
    if ((diaSemana.equals("viernes")) && (hora >= 15)) {
      System.out.print("\n¡Error!, hoy es viernes, introduzca una hora anterior a las 15:00"); 
    } else if (diaSemana.equals("lunes")) {
      System.out.print("\nFaltan " + ((((24 * 4) + 15) * 60) - horasAndMinutos) + " minutos para el fin de semana.");
    } else if (diaSemana.equals("martes")) {
      System.out.print("\nFaltan " + ((((24 * 3) + 15) * 60) - horasAndMinutos) + " minutos para el fin de semana.");
    } else if (diaSemana.equals("miércoles")) {
      System.out.print("\nFaltan " + ((((24 * 2) + 15) * 60) - horasAndMinutos) + " minutos para el fin de semana.");
    } else if (diaSemana.equals("jueves")) {
      System.out.print("\nFaltan " + ((((24 * 1) + 15) * 60) - horasAndMinutos) + " minutos para el fin de semana.");
    } else if (diaSemana.equals("viernes")) {
      System.out.print("\nFaltan " + ((15 * 60) - horasAndMinutos) + " minutos para el fin de semana.");
    } else {
      System.out.print("\n¡Error!, por favor, introduzca un día válido.");
    }
  }
}

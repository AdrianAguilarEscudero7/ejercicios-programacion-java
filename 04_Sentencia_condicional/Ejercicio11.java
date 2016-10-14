/**
* 
* Escribe un programa que dada una hora determinada (horas y minutos),
* calcule los segundos que faltan para llegar a la medianoche.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio11 {
  public static void main(String[] args) {
  
    // Introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca la hora que es (sin minutos): ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    // Realizamos las operaciones matemáticas
    int horaSegundo = horas * 3600;
    int minutoSegundo = minutos * 60;
    int horasAndMinutos = horaSegundo + minutoSegundo;
    
    // Establecemos las condiciones y las mostramos por pantalla
    if ((horas < 0) || (horas > 23)) {
      System.out.print("\n¡Error!, por favor, introduzca un formato de hora válido.");
    } else if ((minutos < 0) || (minutos > 60)) {
      System.out.print("\n¡Error!, por favor, introduzca un formato de hora válido.");
    } else if (minutos == 0){
      System.out.println("\nSon las " + horas + " en punto.");
      System.out.print("\nFaltan " + ((24*3600) - (horasAndMinutos)) + " segundos para medianoche.");
    } else if (((horas == 0) || (horas < 10)) && (minutos < 10)) {
      System.out.println("\nSon las 0" + horas + ":0" + minutos);
      System.out.print("\nFaltan " + ((24*3600) - (horasAndMinutos)) + " segundos para medianoche.");
    } else if ((horas > 9) && (minutos < 10)) {
      System.out.println("\nSon las " + horas + ":0" + minutos);
      System.out.print("\nFaltan " + ((24*3600) - (horasAndMinutos)) + " segundos para medianoche.");
    } else if (((horas == 0) || (horas < 10)) && (minutos > 9)) {
      System.out.println("\nSon las 0" + horas + ":" + minutos);
      System.out.print("\nFaltan " + ((24*3600) - (horasAndMinutos)) + " segundos para medianoche.");
    } else {
      System.out.println("\nSon las " + horas + ":" + minutos);
      System.out.print("\nFaltan " + ((24*3600) - (horasAndMinutos)) + " segundos para medianoche.");
    }
  }
}

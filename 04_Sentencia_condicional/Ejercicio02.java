/**
* 
* Realiza un programa que pida una hora por teclado y que muestre luego
* buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
* tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
* cuenta las horas, los minutos no se deben introducir por teclado.
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio02  {
  public static void main(String[] args) {  
    
    System.out.print("Por favor introduzca una hora por teclado: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 11)) {
      System.out.print("¡Buenos días!");
    } else if ((hora >= 12) && (hora <=20)) {
        System.out.print("¡Buenas tardes!");
    } else if ((hora >= 21) && (hora <= 23) || (hora >=0) && (hora <=5)){
        System.out.print("¡Buenas noches!");
    } else {
        System.out.print("La hora introducida no es correcta, por favor introduzca una hora válida.");
    }
    
  }  
}

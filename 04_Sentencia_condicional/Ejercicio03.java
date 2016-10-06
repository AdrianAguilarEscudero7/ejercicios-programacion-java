/**
* 
* Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
* diente nombre del día de la semana.
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio03  {
  public static void main(String[] args) {  
  
    System.out.print("Por favor, introduzca un número del 1 al 7 para seleccionar un día de la semana: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    String diaSemana;
    
    switch (numero) {
      case 1:
        diaSemana = "Lunes";
        break;
      case 2:
        diaSemana = "Martes";
        break;
      case 3:
        diaSemana = "Miércoles";
        break;
      case 4:    
        diaSemana = "Jueves";
        break;
      case 5:
        diaSemana = "Viernes";
        break;
      case 6:
        diaSemana = "Sábado";
        break;
      case 7:
        diaSemana = "Domingo";
        break;
      default:
        diaSemana = "¡error!, parece que ese día no existe, por favor, introduzca un número de día válido";
    }
        
    System.out.println("Ha seleccionado el número " + numero + ", que corresponde al día: " + diaSemana + ".");    
        
  }
}  

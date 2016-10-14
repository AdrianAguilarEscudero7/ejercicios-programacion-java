/**
* 
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de
* nacimiento.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio10 {
  public static void main(String[] args) {
 
    // Introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca su mes de nacimiento (en números): ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca su día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    // Establecemos las condiciones y mostramos por pantalla los resultados
    switch (mes) {
      case 3:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 21) {
          System.out.print("\nSu signo del zodiaco es Aries ♈");
        } else {
          System.out.print("\nSu signo del zodiaco es Piscis ♓");
        } 
      break;
      
      case 4:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 21) {
          System.out.print("\nSu signo del zodiaco es Tauro ♉");
        } else {
          System.out.print("\nSu signo del zodiaco es Aries ♈");
        }
      break;
      
      case 5: 
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 22) {
          System.out.print("\nSu signo del zodiaco es Géminis ♊");
        } else {
          System.out.print("\nSu signo del zodiaco es Tauro ♉");
        }
      break;
       
      case 6:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 22) {
          System.out.print("\nSu signo del zodiaco es Cáncer ♋");
        } else {
          System.out.print("\nSu signo del zodiaco es Géminis ♊");
        }
      break;
      
      case 7:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 23) {
          System.out.print("\nSu signo del zodiaco es Leo ♌");
        } else {
          System.out.print("\nSu signo del zodiaco es Cáncer ♋");
        }
      break;
      
      case 8:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 24) {
          System.out.print("\nSu signo del zodiaco es Virgo ♍");
        } else {
          System.out.print("\nSu signo del zodiaco es Leo ♌");
        }
      break;
      
      case 9:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 24) {
          System.out.print("\nSu signo del zodiaco es Libra ♎");
        } else {
          System.out.print("\nSu signo del zodiaco es Virgo ♍");
        }
      break; 
      
      case 10:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 24) {
          System.out.print("\nSu signo del zodiaco es Escorpio ♏");
        } else {
          System.out.print("\nSu signo del zodiaco es Libra ♎");
        }
      break;
      
      case 11:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 23) {
          System.out.print("\nSu signo del zodiaco es Sagitario ♐");
        } else {
          System.out.print("\nSu signo del zodiaco es Escorpio ♏");
        }
      break;
      
      case 12:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 22) {
          System.out.print("\nSu signo del zodiaco es Capricornio ♑");
        } else {
          System.out.print("\nSu signo del zodiaco es Sagitario ♐");
        }
      break;
      
      case 1:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 21) {
          System.out.print("\nSu signo del zodiaco es Acuario ♒");
        } else {
          System.out.print("\nSu signo del zodiaco es Capricornio ♑");
        }
      break;
      
      case 2:
        if ((dia > 31) || (dia <= 0)) {
          System.out.print("\n¡Error!, por favor, introduzca un día válido.");
        } else if (dia >= 19) {
          System.out.print("\nSu signo del zodiaco es Piscis ♓");
        } else { 
          System.out.print("\nSu signo del zodiaco es Acuario ♒");
        }
      break;
      default: 
        System.out.print("\n¡Error!, por favor, introduzca un número de mes válido.");
    }
  }
}
 

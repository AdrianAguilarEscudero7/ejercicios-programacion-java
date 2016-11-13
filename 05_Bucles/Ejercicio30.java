/**
* 
* Realiza una programa que calcule las horas transcurridas entre dos horas de
* dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
* El día de la semana se puede pedir como un número (del 1 al 7) o como una
* cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
* los datos correctamente y que el segundo día es posterior al primero.
* 
* Ejemplo:
* Por favor, introduzca la primera hora.
* Día: lunes
* Hora: 18
* Por favor, introduzca la segunda hora.
* Día: martes
* Hora: 20
* Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*
*
* Bucles for, while y do-while.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("\nBienvenid@, en este programa calcularemos las horas transcurridas entre dos horas");
    System.out.println(" de dos días a la semana (no se tienen en cuenta los minutos ni los segundos).");
    System.out.println("-----------------------------------------------------------------------------");
    
    // Declaramos las variables
    String nombreDiaScanner;
    String nombreDiaScanner2;
    int horaDia1;
    int horaDia2;
    String nombreDia1 = "";
    String nombreDia2 = "";
    int numeroDia1;
    int numeroDia2;
    boolean esCorrecto = true; // Para los datos correctos o incorrectos
    
    // Iteramos la recogida de datos mientras haya datos introducidos incorrectos
    do {
      
      // Se recogen los datos introducidos por teclado
      System.out.print("\nPor favor, introduzca el primer día ('Lunes', 'Martes'.. o, (1, 2..): ");
      nombreDiaScanner = s.nextLine().toUpperCase();
      
      switch (nombreDiaScanner) {
        
        case "LUNES":
        case "1":
          numeroDia1 = 1;
          nombreDia1 = "Lunes";
          break;
        
        case "MARTES":
        case "2":
          numeroDia1 = 2;
          nombreDia1 = "Martes";
          break;
        
        case "MIÉRCOLES":
        case "3":
          numeroDia1 = 3;
          nombreDia1 = "Miércoles";
          break;
        
        case "JUEVES":
        case "4":
          numeroDia1 = 4;
          nombreDia1 = "Jueves";
          break;
        
        case "VIERNES":
        case "5":
          numeroDia1 = 5;
          nombreDia1 = "Viernes";
          break;
        
        case "SÁBADO":
        case "6":
          numeroDia1 = 6;
          nombreDia1 = "Sábado";
          break;
          
        case "DOMINGO":
        case "7":
          numeroDia1 = 7;
          nombreDia1 = "Domingo";
          break;
        default: 
          numeroDia1 = 0;
      }
        
      System.out.print("Hora: ");
      horaDia1 = Integer.parseInt(s.nextLine());
      
      System.out.print("\nAhora introduzca el segundo día: ");
      nombreDiaScanner2 = s.nextLine().toUpperCase();
      
      switch (nombreDiaScanner2) {
        
        case "LUNES":
        case "1":
          numeroDia2 = 1;
          nombreDia2 = "Lunes";
          break;
        
        case "MARTES":
        case "2":
          numeroDia2 = 2;
          nombreDia2 = "Martes";
          break;
        
        case "MIÉRCOLES":
        case "3":
          numeroDia2 = 3;
          nombreDia2 = "Miércoles";
          break;
        
        case "JUEVES":
        case "4":
          numeroDia2 = 4;
          nombreDia2 = "Jueves";
          break;
        
        case "VIERNES":
        case "5":
          numeroDia2 = 5;
          nombreDia2 = "Viernes";
          break;
        
        case "SÁBADO":
        case "6":
          numeroDia2 = 6;
          nombreDia2 = "Sábado";
          break;
        
        case "DOMINGO":
        case "7":
          numeroDia2 = 7;
          nombreDia2 = "Domingo";
          break;
        default: 
          numeroDia2 = 0;
      }
    
      System.out.print("Hora: ");
      horaDia2 = Integer.parseInt(s.nextLine());
      
      // Se verifica si lo introducido es correcto o incorrecto
      esCorrecto = true;
      
      // Comprueba si el día introducido es erróneo
      if ((numeroDia1 == 0) || (numeroDia2 == 0)) {
        esCorrecto = false;
        System.out.println("\nLo siento, ha introducido un día no válido.");
      }
      
      // Comprueba si el segundo día es el mismo o va antes del primero 
      if(numeroDia2 <= numeroDia1) {
        esCorrecto = false;
        System.out.println("\n¡Error!, el segundo día no puede ser igual o anterior al primero.");
      }
      
      // Comprueba si la hora es correcta
      if ((horaDia1 < 0) || (horaDia1 > 23) || (horaDia2 < 0) || (horaDia2 > 23)) {
        esCorrecto = false;
        System.out.println("\nLo siento, la hora introducida no es correcta.");
      }
    } while (!esCorrecto);
    
    // Mostramos los resultados por pantalla
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("\nEntre las " + horaDia1 + ":00 del " + nombreDia1 + " y, las " + horaDia2 + ":00");
    System.out.print(" del " + nombreDia2 + " hay " + ((24*numeroDia2 + horaDia2) - (24*numeroDia1 + horaDia1)));
    System.out.println(" hora/s.");
  }
}

/**
* 
* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
* El programa intentará adivinar el número que estás pensando - un número
* entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
* programa debe preguntar si el número que estás pensando es mayor o menor
* que el que te acaba de decir.
*
* Números aleatorios.
*
* @author Adrián Aguilar
*/

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.print("Bienvenid@, este programa intentará adivinar el número que está pensando,");
    System.out.println(" entre 0 y 100, tendrá 5 oportunidades para adivinarlo.");
    System.out.println("-----------------------------------------------------------------------------");
    int oportunidades = 4;
    int minimo = 0;
    int maximo = 100; 
    String respuesta; // Almacena la respuesta del usuario (si/no)
    String tamaño; // Almacena la respuesta del tamaño del usuario (mayor/menor)
    
    // Intenta adivinar el número del usuario y pregunta si es mayor o menor
    do {
      int numeroSecreto = (int)(Math.random()*(maximo - minimo) + minimo);
      System.out.print("\n¿El número que está pensando es el " + numeroSecreto + "? (si/no): ");
      respuesta = s.nextLine().toUpperCase();
      
      // Si la respuesta del usuario es no, pregunta si el número es mayor o menor
      if (respuesta.equals("NO")) {
        System.out.print("\n¿El número que está pensando es mayor o menor?: ");
        tamaño = s.nextLine().toUpperCase();
        System.out.println("Me quedan " + oportunidades + " oportunidades...");
        
        // Si la respuesta del usuario es "mayor", el mínimo será igual al número pensado por la máquina + 1
        if (tamaño.equals("MAYOR")) {
          minimo = numeroSecreto + 1;
        // Si es "menor", el máximo sera igual al número pensado por la máquina - 1  
        } else if (tamaño.equals("MENOR")) {
          maximo = numeroSecreto - 1;
        }
      }
      oportunidades--;
      if (oportunidades < 0) {
        System.out.println("\nVaya.. no he conseguido adivinar su número... :(");
      }
    } while ((!respuesta.equals("SI")) && (oportunidades >= 0)); 
    
    if (respuesta.equals("SI")) {
      System.out.println("\n¡Genial, lo adiviné! =)");
    }
  }
}

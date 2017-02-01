/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Adrián Aguilar
 */
package ejercicio01;
import java.util.Scanner;

import ejercicio01.Caballo.Sexo;

public class PruebaCaballo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("\nIntroduzca los siguientes campos para el caballo Benji.");
    System.out.print("Raza: ");
    String raza = s.nextLine();
    System.out.print("\nEdad: ");
    int edad = Integer.parseInt(s.nextLine());
    System.out.print("\nAltura (en cm): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("\nTemperamento: ");
    String temp = s.nextLine();
    System.out.println();
    
    Caballo benji = new Caballo(Sexo.MACHO,raza,edad,altura,temp);
    Caballo yesi = new Caballo(Sexo.HEMBRA);
    Caballo musti = new Caballo();
    
    System.out.println(benji);
    System.out.println(yesi);
    System.out.println(musti);
    
    yesi.duerme();
    benji.come("carne");
    musti.come("vegetales");
    musti.galopa();
    benji.bebe();
    yesi.trota();
    benji.pasea();
    yesi.seReproduceCon(musti);
    musti.seReproduce();
    benji.seReproduceCon(musti);
    musti.relincha();
  }
}

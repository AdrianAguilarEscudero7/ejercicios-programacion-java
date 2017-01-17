/**
 * 
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 *
 * Funciones
 *
 * @author Adrián Aguilar
 */
import algoritmos.Maths;
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    
    // Presenta el programa
    System.out.println("\nBienvenid@ a la calculadora de bases (decimal, binario, hexadecimal y octal).");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    System.out.println("1) Binario.");
    System.out.println("2) Decimal.");
    System.out.println("3) Hexadecimal.");
    System.out.println("4) Octal.\n");
    
    int tipoBase = 0;
    String sTipoBase = "";
    
    // Se selecciona un tipo de base del menú y se repite siempre que no esté en el menú
    do {
      System.out.print("Por favor, elija un tipo de base: ");
      tipoBase = s.nextInt();
      if ((tipoBase < 1) || (tipoBase > 4)) {
        System.out.println("\n¡Error!, por favor, introduzca una base del menú (1-4).\n");
      }
    } while((tipoBase < 1) || (tipoBase > 4));
    
    boolean binarioRep = false;
    boolean decimalRep = false;
    boolean hexaRep = false;
    boolean octalRep = false;
    
    // Se selecciona un case del switch según al tipo de base seleccionada y se obtienen ciertas funcionalidades
    switch (tipoBase) {
      case 1:
        sTipoBase = "binaria";
        binarioRep = true;
      break;
      case 2:
        sTipoBase = "decimal";
        decimalRep = true;
      break;
      case 3:
        sTipoBase = "hexadecimal";
        hexaRep = true;
      break;
      case 4:
        sTipoBase = "octal";
        octalRep = true;
      break;
      default:
    }
    System.out.println("-----------------------------------------------------------------------------\n");
    
    String numeroHexadecimal = "";    
    long numeroIntroducido = 0;
    
    // Se introduce un string o un número por teclado
    if (tipoBase == 3) {
      System.out.print("Por favor, introduzca un número en base " + sTipoBase + ": ");
      numeroHexadecimal = i.nextLine().toUpperCase();
    } else {
      System.out.print("Por favor, introduzca un número en base " + sTipoBase + ": ");
      numeroIntroducido = s.nextLong();
    }

    System.out.println("-----------------------------------------------------------------------------\n");
    
    // No se muestra de nuevo la base que se seleccionó en el primer menú
    if (!binarioRep) {
      System.out.println("1) Binario.");
    }
    if (!decimalRep) {
      System.out.println("2) Decimal.");
    }
    if (!hexaRep) {
      System.out.println("3) Hexadecimal.");
    }
    if (!octalRep) {
      System.out.println("4) Octal.");
    }
    
    int tipoBase2 = 0;
    
    // Se introduce la segunda base a la que realizar la conversión
    System.out.print("\nAhora introduzca la base a la que desea realizar la conversión: ");
    tipoBase2 = s.nextInt();
    
    System.out.println("-----------------------------------------------------------------------------\n");
    
    // Convierte de binario a decimal
    if ((tipoBase == 1) && (tipoBase2 == 2)) {
      System.out.print("El número " + numeroIntroducido + " convertido a decimal es el ");
      System.out.print(Maths.binDecimal(numeroIntroducido));
      
      // Convierte de binario a hexadecimal
    } else if ((tipoBase == 1) && (tipoBase2 == 3)) {
      System.out.print("El número " + numeroIntroducido + " convertido a hexadecimal es el ");
      System.out.print(Maths.decimalHexa(Maths.binDecimal(numeroIntroducido)));
      
      // Convierte de binario a octal
    } else if ((tipoBase == 1) && (tipoBase2 == 4)) {
      System.out.print("El número " + numeroIntroducido + " convertido a octal es el ");
      System.out.print(Maths.binOctal(numeroIntroducido));
      
      // Convierte de decimal a binario
    } else if ((tipoBase == 2) && (tipoBase2 == 1)) {
      System.out.print("El número " + numeroIntroducido + " convertido a binario es el ");
      System.out.print(Maths.decimalBin(numeroIntroducido));
      
      // Convierte de decimal a hexadecimal
    } else if ((tipoBase == 2) && (tipoBase2 == 3)) {
      System.out.print("El número " + numeroIntroducido + " convertido a hexadecimal es el ");
      System.out.print(Maths.decimalHexa(numeroIntroducido));
      
      // Convierte de decimal a octal
    } else if ((tipoBase == 2) && (tipoBase2 == 4)) {
      System.out.print("El número " + numeroIntroducido + " convertido a octal es el ");
      String numBin = Maths.decimalBin(numeroIntroducido);
      Long binOctal = Long.parseLong(numBin);
      System.out.print(Maths.binOctal(binOctal));
      
      // Convierte de hexadecimal a binario
    } else if ((tipoBase == 3) && (tipoBase2 == 1)) {
      System.out.print("El número " + numeroHexadecimal + " convertido a binario es el ");
      System.out.print(Maths.decimalBin(Maths.hexaDecimal(numeroHexadecimal)));
      
      // Convierte de hexadecimal a decimal
    } else if ((tipoBase == 3) && (tipoBase2 == 2)) {
      System.out.print("El número " + numeroHexadecimal + " convertido a decimal es el ");
      System.out.print(Maths.hexaDecimal(numeroHexadecimal));
      
      // Convierte de hexadecimal a octal
    } else if ((tipoBase == 3) && (tipoBase2 == 4)) {
      System.out.print("El número " + numeroHexadecimal + " convertido a octal es el ");
      long hexaDecimal = Maths.hexaDecimal(numeroHexadecimal);
      String decimalBin = Maths.decimalBin(hexaDecimal);
      Long binOctal = Long.parseLong(decimalBin);
      System.out.print(Maths.binOctal(binOctal));
      
      // Convierte de octal a binario
    } else if ((tipoBase == 4) && (tipoBase2 == 1)) {
      System.out.print("El número " + numeroIntroducido + " convertido a binario es el ");
      System.out.print(Maths.decimalBin(Maths.octalDecimal(numeroIntroducido)));
      
      // Convierte de octal a decimal
    } else if ((tipoBase == 4) && (tipoBase2 == 2)) {
      System.out.print("El número " + numeroIntroducido + " convertido a decimal es el ");
      System.out.print(Maths.octalDecimal(numeroIntroducido));
      
      // Convierte de octal a hexadecimal
    } else if ((tipoBase == 4) && (tipoBase2 == 3)) {
      System.out.print("El número " + numeroIntroducido + " convertido a hexadecimal es el ");
      long octalDecimal = Maths.octalDecimal(numeroIntroducido);
      System.out.print(Maths.decimalHexa(octalDecimal));
    }
  }
}

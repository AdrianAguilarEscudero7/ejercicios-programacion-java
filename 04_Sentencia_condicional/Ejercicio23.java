/**
* 
* Escribe un programa que calcule el precio final de un producto según su
* base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
* reducido o superreducido) y el código promocional. Los tipos de IVA general,
* reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
* gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
* respectivamente que no se aplica promoción, el precio se reduce a la mitad,
* se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
* muestran los valores correctos, aunque los números no estén tabulados.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio23 {
  public static void main(String[] args) {
  
    // Presentamos el programa e introducimos los datos por teclado
    System.out.print("\nPor favor, introduzca la base imponible (precio sin IVA): ");
    Double baseImp = Double.parseDouble(System.console().readLine());
    System.out.print("\nAhora introduzca el tipo de IVA (general, reducido o superreducido): ");
    String iva = System.console().readLine().toLowerCase();
    System.out.print("\nFinalmente, introduzca el código promocional (nopromo, mitad, -5€ o 5%): ");
    String promocion = System.console().readLine().toLowerCase();
    System.out.println("-----------------------------------------------------------------------------");
    
    // Definimos algunas variables de promociones de carácter general aquí fuera
    double nopromo = 0;
    double menos5 = (- 5);
    
    // Establecemos las condiciones y mostramos las soluciones por pantalla
    if (baseImp < 0) {
      System.out.print("¡Error!, por favor, introduzca una base imponible positiva.");
      
    } else if ((iva.equals("general")) && (promocion.equals("nopromo")))  {
      System.out.printf("\nBase imponible: %18.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %16.2f€\n", (baseImp * 0.21));
      System.out.print("Precio con IVA (21%): ");
      System.out.printf("%12.2f€", ((baseImp * 0.21) + baseImp));
      System.out.printf("\nCódigo promoción (nopromo): %6.2f€", (- nopromo));
      System.out.printf("\nTOTAL: %27.2f€", (((baseImp * 0.21) + baseImp) - nopromo));
      
    } else if ((iva.equals("general")) && (promocion.equals("mitad"))) {
      
      double mitad = (((baseImp * 0.21) + baseImp) / 2);
      
      System.out.printf("\nBase imponible: %16.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %14.2f€\n", (baseImp * 0.21));
      System.out.print("Precio con IVA (21%): ");
      System.out.printf("%10.2f€", ((baseImp * 0.21) + baseImp));
      System.out.printf("\nCódigo promoción (mitad): %6.2f€", (- mitad));
      System.out.printf("\nTOTAL: %25.2f€", (((baseImp * 0.21) + baseImp) - mitad));
      
    } else if ((iva.equals("general")) && (promocion.equals("-5€"))) {
      System.out.printf("\nBase imponible: %14.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %12.2f€\n", (baseImp * 0.21));
      System.out.print("Precio con IVA (21%): ");
      System.out.printf("%8.2f€", ((baseImp * 0.21) + baseImp));
      System.out.printf("\nCódigo promoción (-5€): %6.2f€", menos5);
      System.out.printf("\nTOTAL: %23.2f€", (((baseImp * 0.21) + baseImp) + menos5));
      
    } else if ((iva.equals("general")) && (promocion.equals("5%"))) {
      
      double cincoPorciento = (((baseImp * 0.21) + baseImp) * 0.05);
      
      System.out.printf("\nBase imponible: %14.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %12.2f€\n", (baseImp * 0.21));
      System.out.print("Precio con IVA (21%): ");
      System.out.printf("%8.2f€", ((baseImp * 0.21) + baseImp));
      System.out.print("\nCódigo promoción (5%): "); 
      System.out.printf("%7.2f€", (- cincoPorciento));
      System.out.printf("\nTOTAL: %23.2f€", (((baseImp * 0.21) + baseImp) - cincoPorciento));
      
    } else if ((iva.equals("reducido")) && (promocion.equals("nopromo"))) {
      System.out.printf("\nBase imponible: %18.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %16.2f€\n", (baseImp * 0.1));
      System.out.print("Precio con IVA (10%): ");
      System.out.printf("%12.2f€", ((baseImp * 0.1) + baseImp));
      System.out.printf("\nCódigo promoción (nopromo): %6.2f€", (- nopromo));
      System.out.printf("\nTOTAL: %27.2f€", (((baseImp * 0.1) + baseImp) - nopromo));
      
    } else if ((iva.equals("reducido")) && (promocion.equals("mitad"))) {
      
      double mitad = (((baseImp * 0.1) + baseImp) / 2);
      
      System.out.printf("\nBase imponible: %16.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %14.2f€\n", (baseImp * 0.1));
      System.out.print("Precio con IVA (10%): ");
      System.out.printf("%10.2f€", ((baseImp * 0.1) + baseImp));
      System.out.printf("\nCódigo promoción (mitad): %6.2f€", (- mitad));
      System.out.printf("\nTOTAL: %25.2f€", (((baseImp * 0.1) + baseImp) - mitad));
      
    } else if ((iva.equals("reducido")) && (promocion.equals("-5€"))) {
      System.out.printf("\nBase imponible: %14.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %12.2f€\n", (baseImp * 0.1));
      System.out.print("Precio con IVA (10%): ");
      System.out.printf("%8.2f€", ((baseImp * 0.1) + baseImp));
      System.out.printf("\nCódigo promoción (-5€): %6.2f€", menos5);
      System.out.printf("\nTOTAL: %23.2f€", (((baseImp * 0.1) + baseImp) + menos5));
      
    } else if ((iva.equals("reducido")) && (promocion.equals("5%"))) {
      
      double cincoPorciento = (((baseImp * 0.1) + baseImp) * 0.05);
      
      System.out.printf("\nBase imponible: %14.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %12.2f€\n", (baseImp * 0.1));
      System.out.print("Precio con IVA (10%): ");
      System.out.printf("%8.2f€", ((baseImp * 0.1) + baseImp));
      System.out.print("\nCódigo promoción (5%): "); 
      System.out.printf("%7.2f€", (- cincoPorciento));
      System.out.printf("\nTOTAL: %23.2f€", (((baseImp * 0.1) + baseImp) - cincoPorciento));
      
    } else if ((iva.equals("superreducido")) && (promocion.equals("nopromo"))) {
      System.out.printf("\nBase imponible: %18.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %16.2f€\n", (baseImp * 0.04));
      System.out.print("Precio con IVA (4%): ");
      System.out.printf("%13.2f€", ((baseImp * 0.04) + baseImp));
      System.out.printf("\nCódigo promoción (nopromo): %6.2f€", (- nopromo));
      System.out.printf("\nTOTAL: %27.2f€", (((baseImp * 0.04) + baseImp) - nopromo));
      
    } else if ((iva.equals("superreducido")) && (promocion.equals("mitad"))) {
      
      double mitad = (((baseImp * 0.04) + baseImp) / 2);
      
      System.out.printf("\nBase imponible: %16.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %14.2f€\n", (baseImp * 0.04));
      System.out.print("Precio con IVA (4%): ");
      System.out.printf("%11.2f€", ((baseImp * 0.04) + baseImp));
      System.out.printf("\nCódigo promoción (mitad): %6.2f€", (- mitad));
      System.out.printf("\nTOTAL: %25.2f€", (((baseImp * 0.04) + baseImp) - mitad));
      
    } else if ((iva.equals("superreducido")) && (promocion.equals("-5€"))) {
      System.out.printf("\nBase imponible: %14.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %12.2f€\n", (baseImp * 0.04));
      System.out.print("Precio con IVA (4%): ");
      System.out.printf("%9.2f€", ((baseImp * 0.04) + baseImp));
      System.out.printf("\nCódigo promoción (-5€): %6.2f€", menos5);
      System.out.printf("\nTOTAL: %23.2f€", (((baseImp * 0.04) + baseImp) + menos5));
      
    } else if ((iva.equals("superreducido")) && (promocion.equals("5%"))) {
      
      double cincoPorciento = (((baseImp * 0.04) + baseImp) * 0.05);
      
      System.out.printf("\nBase imponible: %14.2f€", baseImp);
      System.out.printf("\nIVA seleccionado: %12.2f€\n", (baseImp * 0.04));
      System.out.print("Precio con IVA (4%): ");
      System.out.printf("%9.2f€", ((baseImp * 0.04) + baseImp));
      System.out.print("\nCódigo promoción (5%): "); 
      System.out.printf("%7.2f€", (- cincoPorciento));
      System.out.printf("\nTOTAL: %23.2f€", (((baseImp * 0.04) + baseImp) - cincoPorciento));
      
    } else {
      System.out.println("\n¡Error!, ha introducido algún carácter no válido.");
    }
  }
}

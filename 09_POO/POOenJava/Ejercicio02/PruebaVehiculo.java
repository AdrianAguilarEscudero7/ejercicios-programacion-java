/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú.
 * 
 * @author Adrián Aguilar
 */
package ejercicio02;
import java.util.Scanner;

public class PruebaVehiculo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Coche mustang = new Coche();
    Bicicleta bike = new Bicicleta();
    int opcion = 0;
    
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      
    do {
      System.out.println("\n1. Anda con la bicicleta.");
      System.out.println("2. Haz el caballito con la bicicleta.");
      System.out.println("3. Anda con el coche.");
      System.out.println("4. Quema rueda con el coche.");
      System.out.println("5. Muestra el número de vehículos totales creados.");
      System.out.println("6. Ver kilometraje de la bicicleta.");
      System.out.println("7. Ver kilometraje del coche.");
      System.out.println("8. Ver kilometraje total."); 
      System.out.println("9. Salir.");
      System.out.print("\nElige una opción del menú (1-9): ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println();
    
      switch(opcion) {
        case 1:
          System.out.print("Introduzca los km a recorrer: ");
          int kmBici = Integer.parseInt(s.nextLine());
          bike.recorre(kmBici);
        break;
        case 2:
          bike.caballito();
        break;
        case 3:
          System.out.print("Introduzca los km a recorrer: ");
          int kmCoche = Integer.parseInt(s.nextLine());
          mustang.recorre(kmCoche);
        break;
        case 4:
          mustang.quemaRueda();
        break;
        case 5:
          System.out.println(Vehiculo.getVehiculosCreados());
        break;
        case 6:
          System.out.println(bike.getKilometraje());
        break;
        case 7:
          System.out.println(mustang.getKilometraje());
        break;
        case 8:
          System.out.println(Vehiculo.getKilometrajeTotal());
        break;
        default:
      }
      System.out.print("\nPulse [Intro] para volver al menú: ");
      String intro = s.nextLine();
    } while (opcion != 9);
  }
}

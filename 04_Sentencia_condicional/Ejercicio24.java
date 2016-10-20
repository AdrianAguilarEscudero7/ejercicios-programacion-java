/**
* 
* Escribe un programa que genere la nómina (bien desglosada) de un empleado
* según las siguientes condiciones:
* • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
* - Jefe de proyecto), los días que ha estado de viaje visitando clientes
* durante el mes y su estado civil (1 - Soltero, 2 - Casado).
* • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
* si se trata de un prog. junior, un prog. senior o un jefe de proyecto
* respectivamente.
* • Por cada día de viaje visitando clientes se pagan 30 euros extra en
* concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
*  de un 25% en caso de estar soltero y un 20% en caso de estar casado.
*
*
*
* Condicionales if y switch
*
* @author Adrián Aguilar
*/
public class Ejercicio24 {
  public static void main(String[] args) {
  
    // Presentamos el programa e introducimos los datos por teclado
    System.out.println("\nBienvenid@ a su nómina, para generarla, siga las indicaciones del menú.");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("\nPor favor, introduzca su cargo:");
    System.out.println("\n1- Programador junior.");
    System.out.println("\n2- Programador senior.");
    System.out.println("\n3- Jefe de proyecto.");
    System.out.print("\nOpción: ");
    int opcion1 = Integer.parseInt(System.console().readLine());
    System.out.println("---------------------------------------------------------------------------");
    
    // Definimos la variable donde se almacenará el sueldo base
    double sueldoBase = 0;
    
    // Establecemos las opciones de los cargos mediante switch
    switch (opcion1) {
      
      case 1:
        sueldoBase = 950;
      break;
      
      case 2:
        sueldoBase = 1200;
      break;
      
      case 3:
        sueldoBase = 1600;
      break;
    }
    
    // Introducimos el número de dietas
    System.out.print("\n¿Cuántos días ha estado de viaje visitando clientes?: ");
    int dias = Integer.parseInt(System.console().readLine());
    System.out.println("---------------------------------------------------------------------------");
    double dietas = dias * 30;
    
    // Establecemos la condición de error
    if (dias < 0) {
      System.out.print("\n¡Error!, por favor, introduzca un número de días válido.");
    } else {
    
      // Introducimos los datos del estado civil por teclado
      System.out.println("\nIntroduzca su estado civil:");
      System.out.println("\n1- Soltero.");
      System.out.println("\n2- Casado.");
      System.out.print("\nOpción: ");
      int opcion2 = Integer.parseInt(System.console().readLine());
      System.out.println("---------------------------------------------------------------------------");
      
      // Definimos las variables donde se aplicará el IRPF
      double irpfAplicado = 0;
      int irpf = 0;
      
      // Establecemos las opciones del estado civil mediante switch
      switch (opcion2) {
        
        case 1:
        irpf = 25;
        irpfAplicado = ((sueldoBase + dietas) * 0.25);
        break;
        
        case 2:
        irpfAplicado = ((sueldoBase + dietas) * 0.2);
        irpf = 20;
        break;
      
    }
      // Mostramos la nómina final completa por pantalla
      System.out.println("\nSu nómina se ha generado...");
      System.out.print("####################################");
      System.out.printf("\n# Sueldo base: %18.2f€ #", sueldoBase);
      System.out.printf("\n# Dietas (" + dias + " viajes): %12.2f€ #", dietas);
      System.out.print("\n####################################");
      System.out.printf("\n# Sueldo bruto: %17.2f€ #", (sueldoBase + dietas));
      System.out.printf("\n# Retención IRPF (" + irpf + "%%): %9.2f€ #", irpfAplicado);
      System.out.print("\n####################################");
      System.out.printf("\n# Sueldo neto: %18.2f€ #", ((sueldoBase + dietas) - irpfAplicado));
      System.out.print("\n####################################");
    }
  }
}

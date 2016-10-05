/**
* Escribe un programa que calcule el salario semanal de un empleado en base
* a las horas trabajadas, a razón de 12 euros la hora.
*
* Lectura de datos
*
* @author Adrián Aguilar
*/
public class Ejercicio08  {
  public static void main(String[] args) {  
    
    // Introducimos los valores por teclado
    System.out.print("Horas trabajadas el lunes: ");
    int horaLunes = Integer.parseInt(System.console().readLine());
    System.out.print("Horas trabajadas el martes: ");
    int horaMartes = Integer.parseInt(System.console().readLine());
    System.out.print("Horas trabajadas el miércoles: ");
    int horaMiercoles = Integer.parseInt(System.console().readLine());
    System.out.print("Horas trabajadas el jueves: ");
    int horaJueves = Integer.parseInt(System.console().readLine());
    System.out.print("Horas trabajadas el viernes: ");
    int horaViernes = Integer.parseInt(System.console().readLine());
    System.out.print("Horas trabajadas el sábado: ");
    int horaSabado = Integer.parseInt(System.console().readLine());
    
    // Mostramos por pantalla las horas trabajadas
    System.out.println("\n|Lunes|Martes|Miércoles|Jueves|Viernes|Sábado|");
    System.out.println("|-----|------|---------|------|-------|------|");
    System.out.printf("|%3d  |%4d  |%5d    |%4d  |%4d   |%4d  |\n", horaLunes, horaMartes, horaMiercoles, horaJueves, horaViernes, horaSabado);
    System.out.println("|-----|------|---------|------|-------|------|");
    
    // Se realiza la operación y se muestra por pantalla el resultado final
    int sumaTotal = horaLunes + horaMartes + horaMiercoles + horaJueves + horaViernes + horaSabado;
    int euroHora = 12;
    int salarioSemanal = sumaTotal * euroHora;
    System.out.println("\nEl salario semanal correspondiente a las horas trabajadas introducidas es de:\n"+salarioSemanal+" €.");
    
  
  }
} 

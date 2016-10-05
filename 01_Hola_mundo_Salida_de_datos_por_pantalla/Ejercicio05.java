/**
* Horario de clase coloreado
*
* @author Adrián Aguilar
*/
public class Ejercicio05  {
  public static void main(String[] args) {
   

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";


       
    System.out.println("    HORARIO   |  Lunes  |  Martes  |  Miércoles  |  Jueves  |  Viernes  |");
    System.out.println("--------------|---------------------------------------------------------|");
    System.out.println(" 8:15 -  9:15 |"+verde+"  S.INF"+blanco+"  |"+rojo+"    PRO"+blanco+"   |"+rojo+"    PRO"+blanco+"      |"+blanco+"  BB.DD.  |"+azul+" L. MARCAS"+blanco+" |");
    System.out.println(blanco+" 9:15 - 10:15 |"+verde+"  S.INF"+blanco+"  |"+rojo+"    PRO"+blanco+"   |"+rojo+"    PRO"+blanco+"      |"+blanco+"  BB.DD.  |"+azul+" L. MARCAS"+blanco+" |");
    System.out.println(blanco+"10:15 - 11:15 |"+verde+"  S.INF"+blanco+"  |"+rojo+"    PRO"+blanco+"   |"+azul+"  L. MARCAS"+blanco+"  |"+blanco+"  BB.DD.  |"+morado+"   E. DES"+blanco+"  |");
    System.out.println(blanco+"--------------|_________|__________|_____________|__________|___________|");
    System.out.println(blanco+"11:15 - 11:45 |____R____|____E_____|_____CR______|____E_____|_____O_____|");
    System.out.println(blanco+"--------------|                                                         |");
    System.out.println(blanco+"11:45 - 12:45 |"+naranja+"   FOL"+blanco+"   |"+blanco+"  BB.DD."+blanco+"  |"+azul+"  L. MARCAS"+blanco+"  |"+rojo+"   PRO"+blanco+"    |"+verde+"   S.INF"+blanco+"   |");
    System.out.println(blanco+"12:45 - 13:45 |"+naranja+"   FOL"+blanco+"   |"+blanco+"  BB.DD."+blanco+"  |"+morado+"    E. DES"+blanco+"   |"+rojo+"   PRO"+blanco+"    |"+verde+"   S.INF"+blanco+"   |");
    System.out.println(blanco+"13:45 - 14:45 |"+naranja+"   FOL"+blanco+"   |"+blanco+"  BB.DD."+blanco+"  |"+morado+"    E. DES"+blanco+"   |"+rojo+"   PRO"+blanco+"    |"+verde+"   S.INF"+blanco+"   |"); 
    
       }
 }
 






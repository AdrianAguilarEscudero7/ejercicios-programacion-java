/**
 * Modifica el programa “Colección de discos” como se indica a continuación:
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 * introducido por el usuario existe.
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir
 * que no se pueda repetir.
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 * listado completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género de-
 * terminado) y un listado de discos cuya duración esté en un rango determinado
 * por el usuario.
 * 
 * @author Adrián Aguilar
 */
package ejercicio04;

import java.util.Scanner;

public class ColeccionDeDiscos {

/////////////Programa principal/////////////////////////////////////////////////

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Disco[] disco = new Disco[3];
    
    // Inserta de inicio un disco y deja los 19 restantes en blanco.
    for (int i = 0; i < disco.length; i++) {
      if (i > 0) {
        disco[i] = new Disco("empty","empty","empty","empty",0);
      } else {
        disco[0] = new Disco("ES-AAA-05-00001","2Pac","All Eyez on Me","Hip-hop"
            ,132.18f);
      }
    }
    
    int opcion;
    do { // Repite todo continuamente mientras la opción no sea 5 (salir)
      do { // Se selecciona una opción del menú y se verifica que sea correcta.
        System.out.println("COLECCIÓN DE DISCOS");
        System.out.println("*******************");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción del menú: ");
        opcion = Integer.parseInt(s.nextLine());
        
        if ((opcion < 1) || (opcion > 5)) {
          System.out.println("\nLo siento introduzca una opción del menu (1-5).");
        }
      } while ((opcion < 1) || (opcion > 5));
    
      switch (opcion) {
        case 1: // Muestra un sublistado con varias opciones
          System.out.println("\nLISTADO");
          System.out.println("*******");
          int opcion2;
          System.out.println("1. Listado completo.");
          System.out.println("2. Listado por autor.");
          System.out.println("3. Listado por género.");
          System.out.println("4. Listado por duración.");
          System.out.print("Introduzca una opción del submenú: ");
          opcion2 = Integer.parseInt(s.nextLine());
          
          switch (opcion2) {
            case 1:
              muestraListado(disco);
            break;
            case 2:
              System.out.print("\nPor favor, introduzca el autor: ");
              String autor = s.nextLine().toUpperCase();
              autorList(disco,autor);
            break;
            case 3:
              System.out.print("\nPor favor, introduzca el género: ");
              String genero = s.nextLine().toUpperCase();
              generoList(disco,genero);
            break;
            case 4:
              System.out.println("\nPor favor, introduzca el rango.");
              System.out.print("Duración mínima: ");
              int minimo = Integer.parseInt(s.nextLine());
              System.out.print("Duración máxima: ");
              int maximo = Integer.parseInt(s.nextLine());
              duracionList(disco,minimo,maximo);
            break;
            default:
              System.out.println("\nLo siento no existe la opción introducida.");
          }
        break;
        case 2: // La opción 2 añade un nuevo disco a la colección
          boolean salir = false;
          for (int i = 0; i < disco.length && !salir; i++) {
            if (!disco[i].getIsrc().equals("empty")) {
              if (i == disco.length-1) {
                System.out.println("\nNo se permitirá introducir los datos de" +
                		" ningún disco hasta que no se borre alguno de la lista.");
              }
            } else {
              salir = true;
              System.out.println("\nNUEVO DISCO");
              System.out.println("***********");
              System.out.println("Por favor, introduzca los datos del nuevo disco.");
              System.out.print("ISRC (ES-AAA-01-00001): ");
              String isrc = s.nextLine().toUpperCase();
              System.out.print("Autor: ");
              String autor = s.nextLine();
              System.out.print("Título: ");
              String titulo = s.nextLine();
              System.out.print("Género: ");
              String genero = s.nextLine();
              System.out.print("Duración: ");
              float duracion = Float.parseFloat(s.nextLine());
              newArticulo(disco,isrc,autor,titulo,genero,duracion);
            }
          }
        break;
        case 3: // La opción 3 modifica un disco de la colección
          System.out.println("\nMODIFICAR");
          System.out.println("*********");
          System.out.print("Por favor, introduzca el ISRC del disco que desea" +
          		" modificar: ");
          String sIsrc = s.nextLine().toUpperCase();
          editArticulo(disco,sIsrc);
        break;
        case 4: // La opción 4 borra un disco de la colección
          System.out.println("\nBORRAR");
          System.out.println("******");
          System.out.print("Por favor, introduzca el ISRC del disco que desea borrar: ");
          String bIsrc = s.nextLine().toUpperCase().toLowerCase();
          borraDisco(disco,bIsrc);
        break;
        default:
      }
      if (opcion == 5) {
        System.out.println("\n¡Hasta pronto!.");
      } else {
        System.out.println();
      }
    } while (opcion != 5);
  }

/////////////Funciones//////////////////////////////////////////////////////////

  /**
   * Muestra el listado de discos
   * 
   * @param d el array de objetos de la clase Disco
   */
  public static void muestraListado(Disco[] d) {
    for (int i = 0; i < d.length; i++) {
      if (d[i].getIsrc().equals("empty")) {
      } else {
        System.out.print(d[i]);
      }
    }
  }
  
  /**
   * Añade un nuevo disco
   * 
   * @param disc el array de objetos de la clase Disco
   * @param isrc el nuevo ISRC
   * @param a el nuevo autor
   * @param t el nuevo título
   * @param g el nuevo género
   * @param d la nueva duración
   */
  public static void newArticulo(Disco[] disc, String isrc, String a, String t,
      String g, float d) {
    
    boolean repetido = false;
    boolean salir = false;
    for (int i = 0; i < disc.length && !salir; i++) {
      if (disc[i].getIsrc().equals("empty")) {
        for (int j = 0; j < disc.length && !salir; j++) {
          if (isrc.equals(disc[j].getIsrc())) {
            repetido = true;
            salir = true;
          } 
        }
        if (!repetido) {
          disc[i] = new Disco(isrc,a,t,g,d);
          salir = true;
        } else {
          System.out.println("\nLo siento el ISRC introducido ya existe.");
          salir = true;
        }
      }
    }
  }
  
  /**
   * Modifica un disco
   * 
   * @param d el array de objetos de la clase Disco
   * @param id el ISRC del disco a modificar
   */
  public static void editArticulo(Disco[] d, String id) {
    Scanner a = new Scanner(System.in);
    
    String intro = "";
    boolean salir = false;
    for (int i = 0; i < d.length && !salir; i++) {
      if (d[i].getIsrc().equals(id)) {
        salir = true;
        System.out.println("\nIntroduzca los nuevos datos del disco, o vaya" +
        		" pulsando [INTRO] para no modificarlos.");
        System.out.println("\nISRC: " + d[i].getIsrc());
        System.out.print("Nuevo ISRC: ");
        String isrc = a.nextLine();
        if (!isrc.equals(intro)) {
          d[i].setIsrc(isrc);
        }
        System.out.println("\nAutor: " + d[i].getAutor());
        System.out.print("Nuevo autor: ");
        String autor = a.nextLine();
        if (!autor.equals(intro)) {
          d[i].setAutor(autor);
        }
        System.out.println("\nTítulo: " + d[i].getTitulo());
        System.out.print("Nuevo título: ");
        String titulo = a.nextLine();
        if (!titulo.equals(intro)) {
          d[i].setTitulo(titulo);
        }
        System.out.println("\nGénero: " + d[i].getGenero());
        System.out.print("Nuevo género: ");
        String genero = a.nextLine();
        if (!genero.equals(intro)) {
          d[i].setGenero(genero);
        }
        System.out.println("\nDuración: " + d[i].getDuracion());
        System.out.print("Nueva duración: ");
        String duracion = a.nextLine();
        if (!duracion.equals(intro)) {
          d[i].setDuracion(Float.parseFloat(duracion));
        }
      }
      if ((i == d.length-1) && (!salir)) {
        System.out.println("\nLo siento, no hay ningún disco con ese ISRC.");
      }
    }
  }
  
  /**
   * Borra un disco de la colección
   * 
   * @param d el array de objetos de la clase Disco
   * @param id el ISRC del disco que se desea borrar
   */
  public static void borraDisco(Disco[] d, String id) {
    boolean salir = false;
    for (int i = 0; i < d.length && !salir; i++) {
      if (d[i].getIsrc().equals(id)) {
        d[i] = new Disco("empty","empty","empty","empty",0);
        System.out.println("\nDisco eliminado correctamente.");
        salir = true;
      }
      if ((i == d.length-1) && (!salir)) {
        System.out.println("\nLo siento, no hay ningún disco con ese ISRC.");
      }
    }
  }
  
  /**
   * Muestra el listado de discos por autor
   * 
   * @param d el array de objetos de la clase Disco
   * @param autor el autor introducido por el usuario
   */
  public static void autorList(Disco[] d, String autor) {
    boolean existe = false;
    System.out.println("\nDiscos de " + autor + ":");
    for (int i = 0; i < d.length; i++) {
      if (d[i].getAutor().toUpperCase().equals(autor)) {
        System.out.println((i+1) + ". " + d[i].getTitulo() + ".");
        existe = true;
      }
    }
    if (!existe) {
      System.out.println("\nLo siento no hay discos de " + autor + ".");
    }
  }
  
  /**
   * Muestra el listado de discos por género
   * 
   * @param d el array de objetos de la clase Disco
   * @param genero el género introducido por el usuario
   */
  public static void generoList(Disco[] d, String genero) {
    boolean existe = false;
    System.out.println("\nDiscos de " + genero + ":");
    for (int i = 0; i < d.length; i++) {
      if (d[i].getGenero().toUpperCase().equals(genero)) {
        System.out.println((i+1) + ". " + d[i].getTitulo() + ".");
        existe = true;
      }
    }
    if (!existe) {
      System.out.println("\nLo siento no hay discos de " + genero + ".");
    }
  }
  
  /**
   * Muestra el listado de discos por duración
   * 
   * @param d el array de objetos de la clase Disco
   * @param minimo la duración mínima introducida por el usuario
   * @param maximo la duración máxima introducida por el usuario
   */
  public static void duracionList(Disco[] d, int minimo, int maximo) {
    boolean existe = false;
    System.out.println("\nDiscos comprendidos en ese rango:");
    for (int i = 0; i < d.length; i++) {
      if ((d[i].getDuracion() >= minimo) && (d[i].getDuracion() <= maximo)) {
        System.out.println((i+1) + ". " + d[i].getTitulo() + ".");
        existe = true;
      }
    }
    if (!existe) {
      System.out.println("\nLo siento no hay discos comprendidos en ese rango.");
    }
  }
}
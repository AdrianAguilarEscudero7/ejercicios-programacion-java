/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
 * el control de los artículos de un almacén. De cada artículo se debe saber
 * el código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones:
 * 
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * 
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no se
 * pueda sacar más mercancía de la que hay en el almacén.
 */
package ejercicio05;

import java.util.Scanner;

public class Gestisimal {

/////////////////Programa principal/////////////////////////////////////////////
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Articulo[] articulo = new Articulo[50];
    
    // Introduce por defecto 4 artículos
    for (int i = 0; i < articulo.length; i++) {
      articulo[0] = new Articulo("01","Leche",1.55f,3.20f,250);
      articulo[1] = new Articulo("02","Patata",1.72f,3.99f,200);
      articulo[2] = new Articulo("03","Agua",1.25f,3.45f,300);
      articulo[3] = new Articulo("04","Pizza",0.99f,2.59f,170);
      if (i > 3) {
        articulo[i] = new Articulo("empty","empty",0,0,0);
      }
    }
    
    // Presenta el programa
    System.out.print("\nBienvenid@ al almacén de Panojas S.A.. Pulse [INTRO]" +
    		" para acceder al menú de gestión del almacén.");
    String entrar = s.nextLine();
    System.out.println("---------------------------------------------------\n");
    
    int opcion;
    do { // Repite la acción del menú mientras sea distinto de 7 (salir)
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Por favor, seleccione una opción del menú: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1: // La opción 1 muestra el listado completo de los artículos
          System.out.println("\nLISTADO");
          System.out.println("───────");
          muestraListado(articulo);
        break;
        case 2: // La opción 2 da de alta un artículo
          boolean salir = false;
          // Comprueba si el almacén esta lleno, en ese caso no deja hacer más altas
          for (int i = 0; i < articulo.length && !salir; i++) {
            if (!articulo[i].getCodigo().equals("empty")) {
              if (i == articulo.length-1) {
                System.out.println("\nNo se permitirá el alta de ningún " +
                		"artículo más debido a que el almacén está lleno.\n");
              }
            } else { // En caso contrario permite dar de alta artículos
              salir = true;
              String codigo;
              boolean repetido = false;
              boolean salir2 = false;
              System.out.println("\nALTAS");
              System.out.println("─────");
              do { // Comprueba que el código del nuevo artículo no exista
                repetido = false;
                salir2 = false;
                System.out.print("Por favor, introduzca el código del artículo: ");
                codigo = s.nextLine();
                for (int j = 0; j < articulo.length && !salir2; j++) {
                  if (codigo.equals(articulo[j].getCodigo())) {
                    System.out.println("\nLo siento, el código introducido ya existe.\n");
                    repetido = true;
                    salir2 = true;
                  }
                }
              } while (repetido);
              System.out.print("Por favor, introduzca la descripción del artículo: ");
              String descripcion = s.nextLine();
              System.out.print("Por favor, introduzca el precio de compra del artículo: ");
              float precioCompra = Float.parseFloat(s.nextLine());
              System.out.print("Por favor, introduzca el precio de venta del artículo: ");
              float precioVenta = Float.parseFloat(s.nextLine());
              System.out.print("Por favor, introduzca el stock del artículo: ");
              int stock = Integer.parseInt(s.nextLine());
              alta(articulo,codigo,descripcion,precioCompra,precioVenta,stock);
              System.out.println();
            }
          }
        break;
        case 3: // La opción 3 da de baja un artículo
          System.out.println("\nBAJAS");
          System.out.println("─────");
          System.out.print("Por favor, introduzca el código del artículo: ");
          String bCode = s.nextLine();
          baja(articulo, bCode);
        break;
        case 4: // La opción 4 modifica un artículo
          System.out.println("\nMODIFICACIÓN");
          System.out.println("────────────");
          System.out.print("Por favor, introduzca el código del artículo: ");
          String mCode = s.nextLine();
          editArticulo(articulo,mCode);
        break;
        case 5: // La opción 5 gestiona la entrada de mercancía
          System.out.println("\nENTRADA DE MERCANCÍA");
          System.out.println("────────────────────");
          System.out.print("Por favor, introduzca el código del artículo: ");
          String eCode = s.nextLine();
          entradaMercancia(articulo,eCode);
          System.out.println();
        break;
        case 6: // La opción 6 gestiona la salida de mercancía
          System.out.println("\nSALIDA DE MERCANCÍA");
          System.out.println("───────────────────");
          System.out.print("Por favor, introduzca el código del artículo: ");
          String sCode = s.nextLine();
          salidaMercancia(articulo,sCode);
          System.out.println();
        break;
        case 7: // La opción 7 sale del programa
          System.out.println("\n¡Hasta pronto!\n");
        break;
        default:
          System.out.println("\nLo siento ha introducido una opción no válida.\n");
      }
    } while (opcion != 7);
  }

////////////////////Funciones///////////////////////////////////////////////////
  
  /**
   * Muestra el listado
   * 
   * @param a el array de objetos de la clase Articulo
   */
  public static void muestraListado(Articulo[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i].getCodigo().equals("empty")) {
      } else {
        System.out.println("Artículo " + a[i].getCodigo() + a[i]);
      }
    }
  }
  
  /**
   * Da de alta un artículo
   * 
   * @param a el array de objetos de la clase Articulo
   * @param c el código del artículo introducido por el usuario
   * @param d la descripción del artículo introducida por el usuario
   * @param pc el precio de compra del artículo introducido
   * @param pv el precio de venta del artículo introducido
   * @param s el stock del artículo introducido
   */
  public static void alta(Articulo[] a, String c, String d, float pc, float pv,
      int s) {
    
    boolean salir = false;
    for (int i = 0; i < a.length && !salir; i++) {
      if (a[i].getCodigo().equals("empty")) {
        a[i] = new Articulo(c,d,pc,pv,s);
        salir = true;
      }
    }
  }
  
  /**
   * Da de baja un artículo
   * 
   * @param a el array de objetos de la clase Articulo
   * @param c el código del artículo introducido por el usuario
   */
  public static void baja(Articulo[] a, String c) {
    boolean salir = false;
    for (int i = 0; i < a.length; i++) {
      if (c.equals(a[i].getCodigo())) {
        salir = true;
        a[i] = new Articulo("empty","empty",0,0,0);
        System.out.println("\n¡Artículo eliminado correctamente!.\n");
      }
      if ((i == (a.length-1) && (!salir))) {
        System.out.println("\nLo siento el código introducido no existe.\n");
      }
    }
  }
  
  /**
   * Modifica un artículo
   * 
   * @param art el array de objetos de la clase Articulo
   * @param c el código introducido por el usuario
   */
  public static void editArticulo(Articulo[] art, String c) {
    Scanner a = new Scanner(System.in);
    
    String intro = "";
    boolean salir = false;
    for (int i = 0; i < art.length && !salir; i++) {
      if (art[i].getCodigo().equals(c)) {
        salir = true;
        System.out.println("\nIntroduzca los nuevos datos del artículo, o vaya" +
            " pulsando [INTRO] para no modificarlos.");
        System.out.println("\nCódigo: " + art[i].getCodigo());
        System.out.print("Nuevo Código: ");
        String codigo = a.nextLine();
        if (!codigo.equals(intro)) {
          art[i].setCodigo(codigo);
        }
        System.out.println("\nDescripción: " + art[i].getDescripcion());
        System.out.print("Nueva Descripción: ");
        String descrip = a.nextLine();
        if (!descrip.equals(intro)) {
          art[i].setDescripcion(descrip);
        }
        System.out.println("\nPrecio de compra: " + art[i].getPrecioCompra());
        System.out.print("Nuevo precio de compra: ");
        String precioCompra = a.nextLine();
        if (!precioCompra.equals(intro)) {
          art[i].setPrecioCompra(Float.parseFloat(precioCompra));
        }
        System.out.println("\nPrecio de venta: " + art[i].getPrecioVenta());
        System.out.print("Nuevo precio de venta: ");
        String precioVenta = a.nextLine();
        if (!precioVenta.equals(intro)) {
          art[i].setPrecioVenta(Float.parseFloat(precioVenta));
        }
        System.out.println("\nStock: " + art[i].getStock());
        System.out.print("Nuevo Stock: ");
        String stock = a.nextLine();
        if (!stock.equals(intro)) {
          art[i].setStock(Integer.parseInt(stock));
        }
        System.out.println();
      }
      if ((i == art.length-1) && (!salir)) {
        System.out.println("\nLo siento, el código introducido no existe.\n");
      }
    }
  }
  
  /**
   * Gestiona la entrada de un determinado artículo al almacén
   * 
   * @param a el array de objetos de la clase Articulo
   * @param code el código de artículo introducido por el usuario
   */
  public static void entradaMercancia(Articulo[] a, String code) {
    Scanner b = new Scanner(System.in);
    
    String tipo = "";
    int auxI = 0;
    boolean salir = false;
    boolean existe = true;
    
    for (int i = 0; i < a.length && !salir; i++) {
      tipo = "";
      if (code.equals(a[i].getCodigo())) {
        tipo += a[i].getDescripcion();
        auxI = i;
        salir = true;
      }
      if ((i == a.length-1) && (!salir)) {
        System.out.println("\nLo siento, el código introducido no existe.");
        existe = false;
      }
    }
    if (existe) {
      System.out.print("\n¿Cuánto va a entrar de " + tipo + "?: ");
      int stock = Integer.parseInt(b.nextLine());
      a[auxI].setStock(a[auxI].getStock() + stock);
      System.out.println("\nHa entrado " + stock + " de " + tipo +
          " correctamente.");
    }
  }
  
  /**
   * Gestiona la salida de un determinado artículo del almacén
   * 
   * @param a el array de objetos de la clase Articulo
   * @param code el código de artículo introducido por el usuario
   */
  public static void salidaMercancia(Articulo[] a, String code) {
    Scanner c = new Scanner(System.in);
    
    String tipo = "";
    int auxI = 0;
    boolean salir = false;
    boolean existe = true;
    
    for (int i = 0; i < a.length && !salir; i++) {
      tipo = "";
      if (code.equals(a[i].getCodigo())) {
        tipo += a[i].getDescripcion();
        auxI = i;
        salir = true;
      }
      if ((i == a.length-1) && (!salir)) {
        System.out.println("\nLo siento, el código introducido no existe.\n");
        existe = false;
      }
    }
    if (existe) {
      System.out.print("\n¿Cuánto va a salir de " + tipo + "?: ");
      int stock = Integer.parseInt(c.nextLine());
      if (a[auxI].getStock() - stock < 0) {
        System.out.println("\nLo siento no hay cantidad suficiente en" +
            " el almacén.");
      } else {
        a[auxI].setStock(a[auxI].getStock() - stock);
        System.out.println("\nHa salido " + stock + " de " + tipo +
            " correctamente.");
      }
    }
  }
}
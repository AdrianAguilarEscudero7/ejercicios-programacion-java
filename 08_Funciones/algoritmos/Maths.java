/**
 * Algoritmos matemáticos comunes
 *
 * @author Adrián Aguilar
 */
package algoritmos;
 
public class Maths {

  /**
   * Devuelve verdadero si el número que se pasa como pará-
   * metro es capicúa y falso en caso contrario.
   * 
   * Ejercicio01
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es capicúa
   * @return <code>false</code> en caso contrario
   */
  public static boolean esCapicua(int x) {
    if (x != Maths.voltea(x)) {
      return false;
    } 
    return true;
  }
  
//##################################################################################################
  
  /**
   * Devuelve verdadero si el número que se pasa como parámetro
   * es primo y falso en caso contrario.
   * 
   * Ejercicio02
   *
   * @param x un número entero positivo
   * @return <code>true</code> si el número es primo
   * @return <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    for (int n = 2; n < x; n++) {
      if (x % n == 0) {
        return false;
      }
    }
    return true;
  }
  
//##################################################################################################
  
  /**
   * Devuelve el menor primo que es mayor al número que
   * se pasa como parámetro.
   * 
   * Ejercicio03
   *
   * @param x un número entero positivo
   * @return el número primo siguiente al introducido
   */
  public static int siguientePrimo(int x) {
    int primoSiguiente = x+1;
    for (int n = 2; n < primoSiguiente; n++) {
      if (primoSiguiente % n == 0) {
        primoSiguiente++;
      }
    }
    return primoSiguiente;
  }
  
//##################################################################################################
  
  /**
   * Dada una base y un exponente devuelve la potencia.
   * 
   * Ejercicio04
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el resultado de la potencia
   */
  public static int potencia(int x, int y) {
    int potencia = 1;
    for (int i = 0; i < y; i++) {
      potencia *= x;
    }
    return potencia;
  }
  
//##################################################################################################
  
  /**
   * Cuenta el número de dígitos de un número entero.
   * 
   * Ejercicio05
   *
   * @param x un número entero
   * @return el número de dígitos
   */
  public static int digitos(long x) {
    int contador = 0;
    if (x == 0) {
      contador = 1;
    } else {
      while (Math.abs(x) > 0) {
        x /= 10;
        contador++;
      }
    }
    return contador;
  }

//##################################################################################################
  
  /**
   * Cuenta el número de dígitos de un número entero.
   * 
   * Ejercicio05
   *
   * @param x un número entero
   * @return el número de dígitos
   */
  public static int digitos(int x) {
    return digitos((long)x);
  }
  
//##################################################################################################
  
  /**
   * Le da la vuelta a un número.
   * 
   * Ejercicio06
   *
   * @param x un número entero
   * @return el número al revés
   */
  public static int voltea(int x) {
    int numeroReves = 0;
    while (x > 0) {
      numeroReves = (numeroReves * 10) + (x % 10);
      x /= 10;
    }
    return numeroReves;
  }
  
//##################################################################################################
  
  /**
   * Devuelve el dígito que está en la posición n de un número
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * Ejercicio07
   *
   * @param x un número entero
   * @param y un número entero
   * @return el dígito de la posición introducida
   */
  public static int digitoN(int x, int y) {
    int contador = 0;
    int digito = 0;
    boolean salir = false;
    int numero = Maths.voltea(x);
    while ((numero > 0) && (!salir)) {
      if (contador == y) {
        digito = numero % 10;
        salir = true;
      } else {
        numero /= 10;
        contador++;
      }
    }
    return digito;
  }
  
//##################################################################################################
  
  /**
   * Da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. Si no se encuentra, devuelve -1
   * 
   * Ejercicio08
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return la posición del dígito introducido
   * @return -1 en caso de que no se encuentre
   */
  public static int posicionDeDigito(int x, int y) {
    int posicion = 0;
    int numero = Maths.voltea(x);
    while (numero > 0) {
      if (numero % 10 == y) {
        return posicion;
      }
      numero /= 10;
      posicion++;
    }
    return -1;
  }
  
//##################################################################################################
  
  /**
   * Le quita a un número n dígitos por detrás (por la
   * derecha).
   * 
   * Ejercicio09
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el número modificado
   */
  public static int quitaPorDetras(int x, int y) {
    int contador = 0;
    do {
      while (contador < y) {
        x /= 10;
        contador++;
      }
    } while((x > 0) && (contador != y));
    return x;
  }
  
//##################################################################################################
  
  /**
   * Le quita a un número n dígitos por delante (por la
   * izquierda).
   * 
   * Ejercicio10  
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el número modificado
   */
  public static int quitaPorDelante(int x, int y) {
    int contador = 0;
    int numero = Maths.voltea(x);
    do {
      while (contador < y) {
        numero /= 10;
        contador++;
      }
    } while ((numero > 0) && (contador != y));
    return Maths.voltea(numero);
  }
  
//##################################################################################################
  
  /**
   * Añade un dígito a un número por detrás.
   * 
   * Ejercicio11  
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el número modificado
   */
  public static int pegaPorDetras(int x, int y) {
    int numero = (x*10)+y;
    return numero;
  }

//##################################################################################################
  
  /**
   * Añade un dígito a un número por delante.
   * 
   * Ejercicio12  
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el número modificado
   */
  public static int pegaPorDelante(int x, int y) {
    int numero = Maths.voltea(x);
    int numeroModif = (numero*10) + y;
    return Maths.voltea(numeroModif);
  }
  
//##################################################################################################
  
  /**
   * Toma como parámetros las posiciones inicial y final
   * dentro de un número y devuelve el trozo correspondiente.
   * 
   * Ejercicio13  
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @param z un número entero positivo
   * @return el número modificado
   */
  public static int trozoDeNumero(int x, int y, int z) {
    int numeroModif = 0;
    int numeroReves = Maths.voltea(x);
    int contadorY = 0;
    int contadorZ = 0;
    do {
      if ((contadorY == y) && (contadorZ <= z)) {
        numeroModif = (numeroModif * 10) + (numeroReves % 10);
      }
      numeroReves /= 10;
      if (contadorY < y) {
        contadorY++;
      }
      contadorZ++;
    } while (contadorZ <= z);
    return numeroModif;
  }
  
//##################################################################################################
  
  /**
   * Pega dos números para formar uno.
   * 
   * Ejercicio14  
   *
   * @param x un número entero positivo
   * @param y un número entero positivo
   * @return el número modificado
   */
  public static int juntaNumeros(int x, int y) {
    int contador = 0;
    int numero = y;
    while (y > 0) {
      y /= 10;
      contador++;
    }
    for (int i = 0; i < contador; i++) {
      x *= 10;
    }
    int numeroModif = x+numero;
    return numeroModif;
  }
  
//##################################################################################################
  
  /**
   * Da la vuelta a un número que acabe en 0
   *
   * @param x un número entero positivo
   * @return el número al revés
   */
  public static String voltea0(int x) {
    String numeroReves = "";
    for (int i = 1; i <= Maths.digitos(x); i++) {
      numeroReves += ((int)((x % Math.pow(10,i)) / Math.pow(10,i-1)));
    }
    return numeroReves;
  }
  
  /**
   * Convierte de binario a decimal
   *
   * @param x un número entero positivo
   * @return la base del tipo decimal
   */
  public static long binDecimal(long x) {
    long potencia = 0;
    long suma = 0;
    long num = x;
    for (int i = 0; i < digitos(x); i++) {
      potencia = (int)Math.pow(2,i);
      if (num % 10 == 1) {
        suma += potencia;
      }
      num /= 10;
    }
    return suma;
  }
  
//##################################################################################################
  
  /**
   * Convierte de binario a octal
   *
   * @param x un número entero positivo
   * @return la base del tipo octal
   */
  public static long binOctal(long x) {
    int suma = 0;
    int numeroIntroducido = (int)x;
    int i = 1;
    
    while (i <= Maths.digitos(numeroIntroducido)) {
      for (int j = 1; j <= 3; j++) {
        int sumaParcial = 0;
        if ((j == 1) && (x % 10 == 1)) {
          sumaParcial += 1;
        } else if ((j == 2) && (x % 10 == 1)) {
          sumaParcial += 2;
        } else if ((j == 3) && (x % 10 == 1)) {
          sumaParcial += 4;
        }
        x /= 10;
        suma += sumaParcial;
        i++;
      }
      if (i <= Maths.digitos(numeroIntroducido)) {
        suma *= 10;
      }
    }
    return Maths.voltea(suma);
  }
  
//##################################################################################################  
  
  /**
   * Convierte de decimal a binario
   *
   * @param x un número entero positivo
   * @return la base del tipo binaria
   */
  public static String decimalBin(long x) {
    int potencia = 0;
    int contador = 0;
    long numeroIntroducido = x;
    
    do {
      potencia = Maths.potencia(2,contador);
      contador++;
    } while (x / potencia != 0);
    
    potencia /= 2;
    String numBin = "";
    
    if (x == 0) {
      numBin = "0";
    } else {
      do {
        if (x / potencia == 1) {
          numBin += "1";
          x -= potencia;
        } else {
          numBin += "0";
        }
        potencia /= 2;
      } while (potencia != 0);
    }
    return numBin;
  }
  
//##################################################################################################  
  
  /**
   * Convierte de decimal a hexadecimal
   *
   * @param x un número entero positivo
   * @return la base del tipo hexadecimal
   */
  public static String decimalHexa(long x) {
    int potencia = 0;
    int contador = 0;
    
    do {
      potencia = Maths.potencia(16,contador);
      contador++;
    } while (x / potencia != 0);
    
    potencia /= 16;
    
    int respuesta = 0;
    boolean salir = false;
    String numHexa = "";
    
    do {
      respuesta = (int)(x / potencia);
      if ((x >= 0) && (x <= 15)) {
        respuesta = (int)x;
        salir = true;
      }
      x -= (respuesta * potencia);
      if ((respuesta >= 0) && (respuesta <= 9)) {
        numHexa += respuesta;
      } else if ((respuesta > 9) && (respuesta <= 15)) {
        switch (respuesta) {
          case 10:
            numHexa += "A";
          break;
          case 11:
            numHexa += "B";
          break;
          case 12:
            numHexa += "C";
          break;
          case 13:
            numHexa += "D";
          break;
          case 14:
            numHexa += "E";
          break;
          case 15:
            numHexa += "F";
          break;
          default:
        }
      }
      potencia /= 16;
    } while (!salir);
    return numHexa;
  }
  
//##################################################################################################
  
  /**
   * Convierte de hexadecimal a decimal
   *
   * @param x una cadena de caracteres
   * @return la base del tipo decimal
   */
  public static int hexaDecimal(String x) {
    int potencia = 0;
    int numeroDecimal = 0;
    
    for (int i = 0; i < x.length(); i++) {
      potencia = Maths.potencia(16,i);
    }
    
    for (int i = 0; i < x.length(); i++) {
      boolean salir = false;
      String caracter = "";
      caracter += x.charAt(i);
      for (int j = 0; j < 10 && !salir; j++) {
        if (caracter.equals(String.valueOf(j))) {
          numeroDecimal += (Integer.parseInt(caracter) * potencia);
          salir = true;
        }
      }
      switch (caracter) {
        case "A":
          numeroDecimal += (10*potencia);
        break;
        case "B":
          numeroDecimal += (11*potencia);
        break;
        case "C":
          numeroDecimal += (12*potencia);
        break;
        case "D":
          numeroDecimal += (13*potencia);
        break;
        case "E":
          numeroDecimal += (14*potencia);
        break;
        case "F":
          numeroDecimal += (15*potencia);
        break;
        default:      
      }
      potencia /= 16;
    }
    return numeroDecimal;
  }
  
//##################################################################################################

  /**
   * Convierte de octal a decimal
   *
   * @param x un número entero positivo
   * @return la base del tipo octal
   */
  public static long octalDecimal(long x) {
    long numeroIntroducido = x;
    int suma = 0;
    for (int i = 0; i < Maths.digitos(numeroIntroducido); i++) {
      long potencia = 0;
      potencia = (Maths.potencia(8,i)) * (x % 10);
      suma += potencia;
      x /= 10;
    }
    return suma;
  }
}

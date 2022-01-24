// This simple script allows you to practice the multiplication tables with the number you choose. 

import java.util.Scanner;

public class Tabla {
  public static void main() {
    System.out.println("Programa para aprender las tablas de multiplicar");
    Scanner console = new Scanner(System.in);
    System.out.println("Introduzca el número con el que desea practicar");
    int tabla = console.nextInt();
    int resultado = 0;
    for (int z = 1; z <= tabla || z <= 10; z++) {
      System.out.println(z + "x" + tabla + " " + "= ¿?");
      System.out.println("Introduzca su respuesta");
      int respuesta = console.nextInt();
      if ((z * tabla) == respuesta) {
        resultado++;
        System.out.println("Valor correcto");
      } else {
        System.out.println("Lo siento se ha equivocado. La respuesta correcta era " + (z * tabla));
      }
    }
    if (tabla >= 10) {
      System.out.println("Has acertado " + resultado + " veces de " + tabla);
    }

    if (tabla < 10) {
      System.out.println("Has acertado " + resultado + " veces de 10 ");
    }
  }
}

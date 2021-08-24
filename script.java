import java.util.Scanner;

public class TempConverter {
  public static void main() {

    Scanner consola = new Scanner(System.in);
    System.out.println("Seleccione si quiere convertir \n Celsius a Fahrenheit(1)  o Fahrenheit a Celsius(2)");
    int eleccion = consola.nextInt();

    if (eleccion == 1) {
      System.out.println("Usted seleccionó convertir \n de Celsius a Fahrenheit");
      System.out.println("Escriba el valor");
      var celsius = consola.nextFloat();
      var fahrenheit = ((celsius * 9 / 5) + 32);
      System.out.println("El valor en Fahrenheit es de: " + fahrenheit);

    }

    if (eleccion == 2) {
      System.out.println("Usted seleccionó convertir \n de Fahrenheit a Celsius");
      System.out.println("Escriba el valor");
      var fahrenheit = consola.nextFloat();
      var celsius = ((fahrenheit - 32) * 5 / 9);
      System.out.println("El valor en Celsius es de: " + celsius);

    }
  }
}

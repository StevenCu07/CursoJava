import java.util.Scanner;

public class CalcularAreaRectangulo {

    public static void main(String[] args) {

        System.out.println("*** Area y perimetro de un rectangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        var base = Double.parseDouble(consola.nextLine());
        System.out.print("Ingrese la altura del rectangulo: ");
        var altura = Double.parseDouble(consola.nextLine());

        var area = base * altura;
        var perimetro = 2 * (base+altura);

        System.out.println("El area del rectangulo es: " + area + "\nEl perimetro es: " + perimetro);

    }

}

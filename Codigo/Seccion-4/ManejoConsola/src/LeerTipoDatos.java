import java.util.Scanner;

public class LeerTipoDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        // Leer un tipo double
        System.out.println("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // Consumimos el caracter de salto de linea
        consola.nextLine();
        // Leer un tipo String
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.println("Proporcione un valor entero: ");
//        var entroString = consola.nextLine();
//        var entero = Integer.parseInt(entroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        //tipo flotante
        System.out.println("Proporcione un valor flotante: ");
//        var flotanteString = consola.nextLine();
//        var flotante = Float.parseFloat(flotanteString);
        var flotante = Integer.parseInt(consola.nextLine());
        System.out.println("flotante = " + flotante);

        //Double.parseDouble(consola.nextLine());
        //Boolean.parseBoolean(consola.nextLine());

        
    }
}

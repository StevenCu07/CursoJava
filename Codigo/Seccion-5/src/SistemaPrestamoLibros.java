import java.util.Scanner;

public class SistemaPrestamoLibros {

    public static void main(String[] args) {

        System.out.println("*** Sistema prestamo libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.println("Cuentas con credencial de estudiante (true/false)? ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("A cuantos km vives de la biblioteca ? ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para prestamo libros? " + esElegiblePrestamo);

    }

}

import java.util.Scanner;

public class RecetasDeCocina {

    public static void main(String[] args) {

        System.out.println("Sistema de Recetas de Cocina");

        var consola = new Scanner(System.in);

        //nombre receta
        System.out.println("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        //ingredientes receta
        System.out.println("Ingrese los ingredientes de la receta: ");
        var ingredientes = consola.nextLine();

        //tiempo de preparacion
        System.out.println("Ingrese el tiempo de preparacion (minutos):");
        var tiempoPreparacion = Double.parseDouble(consola.nextLine());

        //dificultad de la receta
        System.out.println("Dificultad (Facil,Media o Alta):");
        var dificultad = consola.nextLine();

        System.out.println("***Recetas de Cocina***");
        System.out.println("\nNombre de la receta: " + nombreReceta);
        System.out.println("\tIngrese los ingredientes de la receta: " + ingredientes);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultad);

    }

}

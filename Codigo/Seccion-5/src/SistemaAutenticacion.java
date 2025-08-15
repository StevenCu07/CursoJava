import java.util.Scanner;

public class SistemaAutenticacion {

    public static void main(String[] args) {

        System.out.println("*** Sistema de autenticacion ***");
        final var USUARIO = "admin";
        final var PASSWORD = 123;
        var consola = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Ingrese su password: ");
        var password = Integer.parseInt(consola.nextLine());

        boolean autenticado = USUARIO.equals(usuario) && password == PASSWORD;
        System.out.println("Los datos son correctos: " + autenticado);


    }

}

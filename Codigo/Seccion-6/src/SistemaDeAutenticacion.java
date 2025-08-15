import java.util.Scanner;

public class SistemaDeAutenticacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*** Sistema de Autenticacion ***");

        final String usuario = "admin";
        final String contrasena = "1234";

        System.out.println("Ingrese su usuario: ");
        String loginUsuario = sc.next();

        System.out.println("Ingrese su contraseña: ");
        String loginPassword = sc.next();

        if (loginUsuario.equals(usuario) && loginPassword.equals(contrasena)){
            System.out.printf("Bienvenido al sistema");
        } else if (loginUsuario.equals(usuario) && !loginPassword.equals(contrasena)) {
            System.out.printf("Contraseña Incorrecta");
        } else if (!loginUsuario.equals(usuario) && loginPassword.equals(contrasena)) {
            System.out.println("Usuario Incorrecto");
        }else {
            System.out.println("Usuario y contraseña incorrectos");
        }

    }

}

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        System.out.println("*** Bienvenidos al Sistema Bancario ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Desea salir del sistema (true/false)? ");
        var salir = Boolean.parseBoolean(sc.nextLine());

        if(!salir) {
            System.out.println("Continuamos dentro del sistema...");
        }else {
            System.out.println("Saliendo del sistema...");
        }

    }

}

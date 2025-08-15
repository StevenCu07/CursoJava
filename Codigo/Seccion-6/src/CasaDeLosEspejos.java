import java.util.Scanner;

public class CasaDeLosEspejos {

    public static void main(String[] args) {

        System.out.println("*** Bienvenido a la Casa de los Espejos ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Le tiene miedo a la oscuridad (true/false)? ");
        boolean miedoOscuridad = sc.nextBoolean();

        if(edad >= 10 && !miedoOscuridad ) {
            System.out.println("Puede ingresar a la casa de los espejos");
        }else{
            System.out.println("No puede ingresar a la cada de los espejos");
        }

    }

}

import java.util.Scanner;

public class SaludYFitness {

    public static void main(String[] args) {

        System.out.println("*** Bienvenido a la Salud Y fitness ***");
        final int META_PASOS_DIARIO = 1000;
        final double CALORIAS_POR_PASO = 0.04;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese los pasos caminados en el dia ");
        int pasos_diarios = sc.nextInt();

        double calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;

        String mensaje = (pasos_diarios >= META_PASOS_DIARIO) ? nombre+" cumpliste con la meta del dia y quemaste: "+
                calorias_quemadas + " calorias": nombre+ " no cumpliste con la meta del dia y quemaste: "+
                calorias_quemadas +" calorias" ;
        System.out.println(mensaje + " \nNo. pasos que diste: " + pasos_diarios);

    }

}

import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double sinVistaAlMar = 150.50;
        final double conVistaAlMar = 190.50;

        System.out.println("*** Sistema de Reserva de Hotel ***");
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Dias de estadia: ");
        int dias = sc.nextInt();
        System.out.print("Con vista al mar (true/false): ");
        boolean vistaAlMar = sc.nextBoolean();
        double costoTotal = vistaAlMar ? dias * conVistaAlMar : dias * sinVistaAlMar;

        System.out.printf("""
                \n------ Detalles de la Reserva -------
                Cliente: %s
                Dias de estadia: %d
                Costo total: $%.2f
                Habitacion con vista al mar: %s
                """,nombre,dias,costoTotal,vistaAlMar ? "Si" : "No"
        );
    }
}

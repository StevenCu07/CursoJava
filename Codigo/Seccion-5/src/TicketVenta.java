import java.util.Scanner;

public class TicketVenta {

    public static void main(String[] args) {
        System.out.println("*** Ticket Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio lecho: ");
        var pecioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algun descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calcular subtotal sin impuestos
        var subTotal = pecioLeche+precioPan+precioLechuga+precioPlatanos;

        // Aplicar el descuento
        var descuento = subTotal*(descuentoPorcentaje/100.0);

        // Subtotal con descuento
        var subTotalDescuento = subTotal - descuento;

        // Calcular total con impuesto
        var impuesto = subTotalDescuento * 0.19;
        var costoTotal = subTotalDescuento + impuesto;
        System.out.printf("""
                %nTicket de Venta
                %n--------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (19%%) : $%.2f
                Costo total de la compra: $%.2f
                """,subTotal,descuento,descuentoPorcentaje,impuesto,costoTotal);
    }

}

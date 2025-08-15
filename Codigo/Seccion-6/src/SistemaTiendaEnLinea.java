import java.util.Scanner;

public class SistemaTiendaEnLinea {

    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuento ***");
        Scanner sc = new Scanner(System.in);
        double descuento;
        double total;

        System.out.print("Cual fue el monto de tu compra: ");
        double valor = Double.parseDouble(sc.nextLine());

        System.out.print("Eres miembro de la tienda (true/false): )");
        boolean miembroTienda = Boolean.parseBoolean(sc.nextLine());

        if(valor >= 1000){
            descuento = valor * 0.1;
            total = valor - descuento;
            System.out.printf("""
        %nFelicidades, has obtenido un descuento del 10%%
        Monto de la compra: %.2f
        Monto del  descuento: %s
        Monto final de la compra con descuento: %.2f
        """, valor, descuento, total);
        } else if (miembroTienda) {
            descuento = valor * 0.05;
            total = valor - descuento;
            System.out.printf("""
        %nFelicidades, has obtenido un descuento del 5%%
        Monto de la compra: %.2f
        Monto del  descuento: %s
        Monto final de la compra con descuento: %.2f
        """, valor, descuento, total);

        }else {
            System.out.printf("""
        %nNo obtuviste ningún tipo de descuento
        Te invitamos a hacerte miembro de la tienda
        Monto final de la compra: %.2f
        """, valor);
        }

    }

}

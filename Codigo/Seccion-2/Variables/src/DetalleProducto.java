public class DetalleProducto {

    public static void main(String[] args) {

        String nombreProducto = "Pony malta";
        double precioProducto = 3000;
        int cantidadDisponible = 15;
        boolean estaDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        if (!estaDisponible) {
            System.out.println("No esta disponible");
        }else {
            System.out.println("esta disponible");
        }


        nombreProducto = "Coca-Cola";
        precioProducto = 4500;
        cantidadDisponible = 0;
        estaDisponible = false;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        if (!estaDisponible) {
            System.out.println("No esta disponible");
        }else {
            System.out.println("esta disponible");
        }

    }

}

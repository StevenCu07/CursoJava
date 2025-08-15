import java.util.Scanner;

public class SistemaDeEnvios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Sistema de Envios ***");

        Double costo;

        System.out.println("Ingresa el destino del paquete (Nacional/Internacional): ");
        String destino = sc.next();

        System.out.println("Ingresa el peso del paquete (en kg): ");
        double pesoPaquete = sc.nextDouble();

        costo = switch (destino){
            case "nacional" -> pesoPaquete * 10;
            case "internacional" -> pesoPaquete * 20;
            default -> {
                System.out.println("Ingrese un destino valido");
                yield null;
            }
        };

        if (costo != null){
            System.out.printf("El casto de envio del paquete es: $%.2f", costo);
        }

        if(destino.equals("nacional")){
            costo = pesoPaquete * 10;
            System.out.println("El costo de envio del paquete es: $" + costo);
        }else if(destino.equals("internacional")){
            costo = pesoPaquete * 20;
            System.out.println("El costo de envio del paquete es: $" + costo);
        }else {
            System.out.println("Ingrese un destino valido");
        }
    }
}

import java.util.Scanner;

public class EstacionConSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Identificacion de la estacion del año ***");

        System.out.print("Ingrese el numero del mes: ");
        int numeroMes = sc.nextInt();

        switch (numeroMes){
            case 1, 2, 12  -> System.out.println("La estacion del mes " + numeroMes + " es Invierno");
            case 3, 4, 5 -> System.out.println("La estacion del mes " + numeroMes + " es Primavera");
            case 6, 7, 8 -> System.out.println("La estacion del mes " + numeroMes + " es Verano");
            case 9, 10, 11 -> System.out.println("La estacion del mes " + numeroMes + " es Otoño");
            default -> System.out.println("La estacion es desconocida");
        };

    }

}

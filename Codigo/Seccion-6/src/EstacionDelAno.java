import java.util.Scanner;

public class EstacionDelAno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*** Identificacion de la estacion del año ***");

        System.out.print("Ingrese el numero del mes: ");
        int numeroMes = sc.nextInt();

        if(numeroMes == 1 || numeroMes == 2 || numeroMes == 12){
            System.out.println("La estacion del mes " + numeroMes + " es Invierno");
        } else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5) {
            System.out.println("La estacion del mes " + numeroMes + " es Primavera");
        } else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8) {
            System.out.println("La estacion del mes " + numeroMes + " es Verano");
        } else if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11) {
            System.out.println("La estacion del mes " + numeroMes + " es Otoño");
        }else {
            System.out.println("La estacion es desconocida");
        }

    }
}

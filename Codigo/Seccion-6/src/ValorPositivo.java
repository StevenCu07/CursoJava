import java.util.Scanner;

public class ValorPositivo {

    public static void main(String[] args) {

        System.out.println("*** Valor positivo ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero "+ numero +" es positivo");
        } else if (numero < 0) {
            System.out.println("El numero "+ numero +" es negativo");
        } else {
            System.out.println("El numero es cero");
        }

    }

}

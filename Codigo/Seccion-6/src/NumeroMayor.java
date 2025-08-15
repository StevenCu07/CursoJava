import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*** Sistema Numero Mayor ***");

        System.out.print("Ingrese un numero: ");
        int numeroUno = sc.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        int numeroDos = sc.nextInt();

        if(numeroUno > numeroDos){
            System.out.println("El numero " + numeroUno + " es mayor que el numero " + numeroDos);
        }else {
            System.out.println("El numero " + numeroDos + " es mayor que el numero " + numeroUno);
        }

    }
}

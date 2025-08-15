import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        System.out.println("***Numeros aleatorios***");

        var random = new Random();

        //Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero aleatorio 1 = " + numeroAleatorio);

        //Generar un numero aleatorio entre 0 y 10
        var numeroAleatorio2 = random.nextInt(10 + 1);
        System.out.println("Numero aleatorio 2 = " + numeroAleatorio2);

        //Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextDouble() ;
        System.out.println("Flotante aleatorio = " + flotanteAleatorio);

        //Simular el lanzamiento de un dado (1 y 6)
        var dado = random.nextInt(1,6) + 1 ;
        System.out.println("Dado = " + dado);

    }

}

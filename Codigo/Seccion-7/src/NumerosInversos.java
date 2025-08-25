package src;

public class NumerosInversos {

    public static void main(String[] args){

        System.out.println("Numeros del 10 al 1");

        var contador = 10;
        do {
            System.out.print(contador-- + " ");
        }while (contador > 0);

    }

}

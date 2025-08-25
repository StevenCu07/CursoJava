package src;

public class NumerosImpares {

    public static void main(String[] args){
        System.out.println("*** Numeros Impares del 1 al 20 ***");

        var contador = 1;
        do {
            if (!(contador % 2 == 0) ) {  // tambien se puede hacer de la siguiente manera contador % 2 != 00
                System.out.print(contador + " ");
            }
            contador++;
        }
        while(contador <= 20);
    }
}

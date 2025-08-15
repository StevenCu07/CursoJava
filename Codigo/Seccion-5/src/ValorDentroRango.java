import java.util.Scanner;

public class ValorDentroRango {

    public static void main(String[] args) {

        System.out.println("*** Valor dentro del rango ***");

        //Defino los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        // solicitar un valro entre 0 y 5
        System.out.println("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // verificar si el dato esta dentro del ragno
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Esta dentro del rango? " + estaDentroRango);
        var fueraDelRango = dato <= MINIMO || dato >= MAXIMO;
        System.out.println("Esta fuera del rango? " + fueraDelRango);

    }

}

public class OperadoresAsignacion {

    public static void main(String[] args) {

        System.out.println("*** Operadores de asignación ***");

        //Asignacion =
        var miNumero = 10;
        int minumero2;
        minumero2 = 15;

        //Asignacion compuesto +=
        miNumero +=5; //miNumero = miNumero +5;
        System.out.println("miNumero =  " + miNumero);

        // -=, *=, /= y %=
        minumero2 *=2; // miNumero = miNumero * 2;
        System.out.println("minumero2 = " + minumero2);
        minumero2 /= 2;
        System.out.println("minumero2 = " + minumero2);
        minumero2 %= 2;
        System.out.println("minumero2 = " + minumero2);

        //Asignacion de variables multiples
        int a =10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d ",a, b, c);

    }

}

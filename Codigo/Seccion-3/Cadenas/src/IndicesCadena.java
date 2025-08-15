public class IndicesCadena {

    public static void main(String[] args) {

        //manejo en el indice de las cadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);

    }

}

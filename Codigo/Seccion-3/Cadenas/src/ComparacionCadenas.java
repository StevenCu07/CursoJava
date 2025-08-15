public class ComparacionCadenas {

    public static void main(String[] args) {

        //Comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3= new String("Java");

        //comparacion de cadenas comprara la referencia
        System.out.println(cadena1 == cadena2);

        System.out.println(cadena1 == cadena3);

        System.out.println(cadena1.equals(cadena3));

    }

}

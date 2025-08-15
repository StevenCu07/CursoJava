public class CaracteresEspeciales {

    public static void main(String[] args){

        //Caracteres Especiales
        // \n - imprimir un salto de linea
        var cadena = "Hola mundo";
        System.out.println("cadena = " + cadena);
        var cadena2 = "Hola\nmundo";
        System.out.println("cadena2 = " + cadena2);

        // "\t" - tabulador
        var cadena3 = "\tHola\tmundo";
        System.out.println("cadena3 = " + cadena3);

        // '\' - agregar una comilla simple
        var cadena4 = "Hola \'mundo ";
        System.out.println("cadena4 = " + cadena4);

        // "\" - agregar una comilla simple
        var cadena5 = "Hola \"mundo' ";
        System.out.println("cadena5 = " + cadena5);

        // '\\' - agregar la diagonal invertida
        var cadena6 = "Hola \\mundo ";
        System.out.println("cadena6 = " + cadena6);

    }

}

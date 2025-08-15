public class MetodosDeCadenas {

    public static void main(String[] args) {

        //Metodo de cadenas
        var cadena1 = "Hola Mundo";

        // Ver la longitud de la cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','e');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // convertir a mayusculas

        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        System.out.println("minusculas = " + cadena1.toLowerCase());
        
        //eliminar espacios al inicio y al final
        var cadena2 = " Brandon Calzada ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());

    }

}

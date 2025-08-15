public class ReemplazarSubcadenas {

    public static void main(String[] args) {

        // Reemplazar subcadenas
        var cadena = "Hola mundo";
        System.out.println("cadena = " + cadena);

        // Reemplazar "mundo" por "a todos"
        var nuevaCadena = cadena.replace("mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola","Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);

    }

}

public class TipoVar {

    public static void main(String[] args) {
        System.out.println("*** Tipo var en Java ***");

        //sin el uso var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        //con el uso de var
        var nombre2 = "Juan";
        System.out.println("nombre2 = " + nombre2);
        //definir otras utilizando var
        var edad = 28;
        System.out.println("edad = " + edad);
        var sueldo = 123.45;
        System.out.println("sueldo = " + sueldo);
        var genero = 'M';
        System.out.println("genero = " + genero);
        var esCasado = false;
        System.out.println("esCasadp = " + esCasado);

        // al tipo var no se le peude asignar un tipo distinto ejemplo
        // esCasado = "no";
        // al tipo var se le debe asignar el valor cuando se crea ya que sale error por que no tiene un tipo identificado
        // var precio; error  y tambien var apellido = null; esto tambien da error.

    }
}

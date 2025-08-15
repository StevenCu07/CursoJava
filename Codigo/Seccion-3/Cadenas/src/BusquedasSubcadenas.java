public class BusquedasSubcadenas {

    public static void main(String[] args) {
        // Buscar subcadeas
        // indexof - Devuelve el indice de la primera aparicion de la subcadena

        var cadena1 = "Hola mundo";
        // Sbucadena a buscar hola

        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice 1= " + indice1);

        // lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de mundo

        var indice2 = cadena1.lastIndexOf("mundo");
        System.out.println("indice 2 = " + indice2);

        // Subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice 3 = " + indice3);
        var indice4 = cadena1.lastIndexOf("java");
        System.out.println("indice 4 = " + indice4);
    }

}

public class OperadorOr {

    public static void main(String[] args) {

        System.out.println("*** Operador or ***");

        // or regresa true si cualqueira de los valores es true
        boolean a = true, b = false;
        var resultado = a || b;
        System.out.println("resultado a || b: " + resultado);

        b = true; // aqui le asigno a la variable b true para que devuelva tr ue
        resultado = a || b;
        System.out.println("resultado a || b: " + resultado);

        a = false;// aqui le asigno a la variable a false y b false para que devuelva false
        b = false;
        resultado = a || b;
        System.out.println("resultado a || b: " + resultado);



    }

}

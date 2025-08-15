public class OperadoresAnd {

    public static void main(String[] args) {

        System.out.println("*** Operadores and ***");

        boolean a = true, b = false;

        // and regresa true si ambos valores son true
        var resultado = a && b;
        System.out.println("resultado a && b: " + resultado);

         b = true; // aqui le asigno a la variable b el true para que devuelva true
         resultado = a && b;
         System.out.println("resultado a && b: " + resultado);
    }
}

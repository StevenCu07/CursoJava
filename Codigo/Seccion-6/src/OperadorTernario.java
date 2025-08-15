public class OperadorTernario {

    public static void main(String[] args) {

        System.out.println("*** Operador Ternario ***");
        //Sintaxis
        // conficio ? expresion1 : expresion2
        
        // Determinar si un número es par o no
        int numero = 5;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número  "+numero+ " es " + resultado);

        // Valcular si es mayor de edad
        var edad = 20;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad +", "+ mensaje);

        // valor positivo, negativo o cero (operador terniario anidado)
        numero = -1;
        resultado = (numero > 0 ) ? "positivo" : (numero < 0) ? "negativo" : "cero";
        System.out.println("\nEl numero  "+numero+ " es " + resultado);

    }

}

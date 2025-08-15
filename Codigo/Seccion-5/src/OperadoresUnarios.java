public class OperadoresUnarios {

    public static void main(String[] args) {

        System.out.println("*** Operadores unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;
        //Operador unario +
        resultado = +a;
        System.out.println("Resultado +a: "+ resultado);

        //Operador unario -
        resultado = -a;
        System.out.println("Resultado -a: "+ resultado);

        // Operadores Unarios incremento y decremento
        //Pre-incremento
        a = 3;
        resultado = ++a; //primero se incrementa el valor
        System.out.println("Resultado ++a: " + resultado);
        System.out.println("a ya se incremento " + a);

        // post-incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y despues se incrementa
        System.out.println("Resultado a++: " + resultado);
        System.out.println("a a este momento se incrementa " + a);

        //Pre-drecremento
        b = -2;
        resultado = --b; //primero se incrementa y despues se usa el valor
        System.out.println("Resultado --b: "+ resultado);
        System.out.println("b ya se decremento " + b);

        //post-decremento
        b = -2;
        resultado = b--;//Primero se usa el valor y despues se incrementa
        System.out.println("Resultado b--: "+ resultado);
        System.out.println("B en este momento se drecrementa" + b);
    }

}

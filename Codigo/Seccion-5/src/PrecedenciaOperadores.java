public class PrecedenciaOperadores {

    public static void main(String[] args) {

        // Precedencia de operadores en java:
        // 1. Parentesis y corchetes
        // 2. operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalentes == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc

        // Expresion
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. 4 + 6 = 10
        // Paso 4. 10 - 1 = 9
        var a = 12 / 3 + 2 * 3 - 1;
        System.out.println("a = " + a);

    }

}

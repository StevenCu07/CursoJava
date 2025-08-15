public class MasConcatenacionCadenas {

    public static void main(String[] args) {

        // Mas formas de concatenar cadenas en java
        var cadena1 = "Hola";
        var cadena2 = "mundo";
        var cadena3 = cadena1+cadena2;
        System.out.println("concatenacion con + = " + cadena3);

        // Metodo concat
        var cadena4 = cadena1.concat(cadena2);
        var cadena5 = cadena1.concat(" ").concat("mundo");
        System.out.println("concatenacion1 con concat = " + cadena4);
        System.out.println("concatenacion2 con concat = " + cadena5);

        // clase StringBuilder
        var constructorCadenas = new StringBuilder();
//        constructorCadenas.append(cadena1);
//        constructorCadenas.append(" ");
//        constructorCadenas.append(cadena2);
        constructorCadenas.append("Hola").append(" ").append("mundo");
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        // join
        resultado = String.join(" ", cadena1, cadena2, "Adios!");
        System.out.println("resultado StringJoin = " + resultado);

    }

}

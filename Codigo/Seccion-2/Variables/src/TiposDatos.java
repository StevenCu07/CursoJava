public class TiposDatos {

    public static void main(String[] args) {

        //Tipos de datos en Java
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 214783647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9223372036854775807L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante
        float tipoFloat = 123.456F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.13150D;
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 64;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //tipos object (referencia)
        String tipoString = null;
        System.out.println("tipoString = " + tipoString);
        tipoString = "Hello World";
        System.out.println("tipoString = " + tipoString);

    }
}

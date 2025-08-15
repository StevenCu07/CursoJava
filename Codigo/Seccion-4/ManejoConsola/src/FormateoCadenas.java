import java.util.Arrays;

public class FormateoCadenas {

    public static void main(String[] args) {

        System.out.println("*** Formateo de Cadenas ***");

        var nombre = "Noah";
        var edad = 2;
        var salario = 100000.50;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, edad: %d, salario: %.2f", nombre, edad, salario);

        var numeroEmpleado = 12;

        //formateo con text block
        mensaje = """
                %nDetalle persona:\s
                --------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """.formatted(nombre,numeroEmpleado, edad, salario);

        System.out.println(mensaje);

        // formateo con tex block y printf directamente
        System.out.printf("""
                %nDetalle persona:\s
                --------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """, nombre,numeroEmpleado, edad, salario);

    }

}

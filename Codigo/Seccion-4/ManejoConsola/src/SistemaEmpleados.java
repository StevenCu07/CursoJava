import java.util.Scanner;

public class SistemaEmpleados {

    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados *** ");

        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.println("Nombre del empleado: ");
        var nombre = consola.nextLine();

        // Edad del empleado
        System.out.println("Edad del emplado = ");
        var edad = Integer.parseInt(consola.nextLine());

        // Salario del Empleado
        System.out.print("Salario del empleado: ");
        var salario = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.println("Es jefe de departamento (true/false)?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del empleado
        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tedad: " + edad);
//        System.out.println("\tSalario : " + salario);
        System.out.printf("\tSalario: $%.2f%n", salario);
        System.out.println("\tEs jefe de departamento?: " + esJefeDepartamento);

    }

}

import java.util.Scanner;
import java.util.Random;

public class GeneradorIDUnico {

    public static void main(String[] args) {
        
        //Esta forma que se hizo es para imprimir el id si necesidad de guardarlo ya que no se utiliza
        //En caso de que se vaya a utilizar hay que tener en cuenta que ese ID unico se debe guardar
        //En una variable, lo hago en la parte de abajo

        Scanner consola = new Scanner(System.in);
        var random = new Random();

        System.out.println("Digite su nombre: ");
        var nombre = consola.nextLine();

        System.out.println("Digite su apellido: ");
        var apellido = consola.nextLine();

        System.out.println("Digite su año de nacimiento: ");
        var  anoNacimiento=consola.nextInt();

        var num = random.nextInt(0, 9999);

        System.out.printf("""
                %nDetalle persona:\s
                --------------------
                \tNombre: %s
                \tApellido: %s
                \tAño Nacimiento: %d
                \tID: %04d
                
                """,nombre, apellido, anoNacimiento, num);

        System.out.printf("""
                
                Tu nuevo numero de identificación (ID) generado por el sistema es:
                %s%s%d%04d
                
                """,nombre.substring(0,2).toUpperCase(),apellido.substring(0,2).toUpperCase()
                        ,anoNacimiento%100,num);

        var numAleatorio = String.format("%04d", num);
        var idUnico = nombre.substring(0,2).toUpperCase()+ apellido.substring(0,2).toUpperCase()
                +anoNacimiento%100+numAleatorio;
        System.out.println("idUnico = " + idUnico);

    }

}

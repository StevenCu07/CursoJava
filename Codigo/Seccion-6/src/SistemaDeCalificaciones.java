import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Sistema de calificaciones ***");

        System.out.print("Ingrese su calificacion numerica: ");
        double calificacion = sc.nextDouble();

        if(calificacion <= 10 && calificacion >= 9){
            System.out.println("Su calificacion " + calificacion + " en letras es A ");
        } else if (calificacion <= 9 && calificacion >= 8) {
            System.out.println("Su calificacion " + calificacion + " en letras es B ");
        } else if (calificacion <= 8 && calificacion >= 7) {
            System.out.println("Su calificacion " + calificacion + " en letras es C "); 
        }else if (calificacion <= 7 && calificacion >= 6) {
            System.out.println("Su calificacion " + calificacion + " en letras es D ");
        }else if (calificacion <= 6 && calificacion >= 0) {
            System.out.println("Su calificacion " + calificacion + " en letras es F ");
        } else {
            System.out.println("Valor desconocido");
        }


    }

}

public class DiaSemana {

    public static void main(String[] args){
        System.out.println("*** Dia de la semana con Switch ***");

        var dia = 1; // Suponiendo que 1 es lunes, 2 martes, etc

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido: " + dia);

        }

        String diaSemana = switch (dia){
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };
        System.out.println("El dia de la semana es " + diaSemana);

    }

}

public class GeneradorEmail {
    public static void main(String[] args) {

        //Nombre del usuario, empresa y el dominio de esta
        String nombre = "Brandon Steven Calzada";
        String nombreEmpresa = "Cofincafe Armenia";
        String dominioEmpresa = ".com.co";

        //Vamos a normalizar todo reemplazando espacios por . y en minusculas
        String nombreNormalizado = nombre.replace(" ", ".").toLowerCase();
        System.out.println("*** Generador de Email ***");
        System.out.println("Nombre usuario = "+ nombre);
        System.out.println("Nombre usuario normalizado = " + nombreNormalizado);

        //aqui vamos a normalizar y concatenar datos de la empresa para facilitar el email
        String emailNormalizado = nombreEmpresa.replace(" ","").toLowerCase().concat(dominioEmpresa);
        System.out.println("Nombre empresa = "+ nombreEmpresa);
        System.out.println("Extension del dominio = "+ dominioEmpresa);
        System.out.println("Dominio del email normalizado = " + emailNormalizado);

        //aqui ya vamos a concatenar todo con el metodo concat para generar el email
        String email = nombreNormalizado.concat("@").concat(nombreEmpresa.replace(" ","").toLowerCase().concat(dominioEmpresa));
        System.out.println("Email final generado = "+ email);

    }
}

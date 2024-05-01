import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        //System.out.println("Pelicula Interestelar");

        //Declaración de variables.
        int fechaDeLanzamiento = 2014;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Interestelar";
        String sinopsis = """
            Gracias a un descubrimiento, un grupo de científicos y exploradores, encabezados por Cooper, se embarcan en un viaje espacial para encontrar un lugar con las condiciones necesarias para reemplazar a la Tierra y comenzar una nueva vida allí.
                """;
        double mediaEvaluacion = (4.5 + 3.8 + 4.0) / 3;
        double mediaEvaluacionPelicula = 0;

        //Imprimir variables.
        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificacion de la pelicula: " + evaluacion);
        System.out.println("¿Esta incluida en el plan basico?: " + incluidoEnElPlanBasico);
        System.out.println("Media de la evalucación de Interestelar: " + mediaEvaluacion);

        //Condicionales.
        if (fechaDeLanzamiento >= 2020){
            System.out.println("Esta pelicula es actual");
        }else{
            System.out.println("Esta pelicula es retro pero vale la pena verla");
        }

        //Ciclos.
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluacion que le darias a Interestelar (Del 1 al 5)");
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionPelicula = mediaEvaluacionPelicula + notaPelicula;
        }
        System.out.println(("La media de la pelicula es: " + mediaEvaluacionPelicula / 3));
    }
}
//import java.util.Scanner;

import modelo.Pelicula;

public class Main{
    public static void main(String[] args) {
        // Guardar una pelicula
        Pelicula interestelar = new Pelicula();
        interestelar.setNombre("Interestelar");
        interestelar.setTiempoDeDuracionEnMinutos(139);
        interestelar.setFechaDeLanzamiento(2014);

        // Imprimir los valores
        // System.out.println(interestelar.nombre);
        interestelar.muestraFichaTecnica();

        // Guardar otra pelicula
        Pelicula avengers = new Pelicula();
        avengers.setNombre("Avengers");
        avengers.setTiempoDeDuracionEnMinutos(143);
        avengers.setFechaDeLanzamiento(2012);

        // Llamar metodo
        avengers.muestraFichaTecnica();
    }
}

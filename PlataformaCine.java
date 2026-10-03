import java.util.Scanner;

public class PlataformaCine {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pelicula[] peliculas = crearPeliculas();
        mostrarListaGeneral(peliculas);

        System.out.print("\n¿Qué película deseas consultar? (1-5): ");
        int opcion = entrada.nextInt();

        if (opcion >= 1 && opcion <= peliculas.length) {
            mostrarDetallePelicula(peliculas[opcion - 1]);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static Pelicula[] crearPeliculas() {
        Pelicula[] peliculas = new Pelicula[5];

        peliculas[0] = new Pelicula("El diario de Greg", "Comedia", 92,
            new Director("Thor Freudenthal", "Estados Unidos"));
        peliculas[1] = new Pelicula("Los juegos del hambre", "Ciencia ficción", 142,
            new Director("Gary Ross", "Estados Unidos"));
        peliculas[2] = new Pelicula("Pasajeros", "Ciencia ficción y romance", 116,
            new Director("Morten Tyldum", "Noruega"));
        peliculas[3] = new Pelicula("A través de mi ventana", "Romance", 110,
            new Director("Marçal Forés", "España"));
        peliculas[4] = new Pelicula("Divergente", "Ciencia ficción y acción", 139,
            new Director("Neil Burger", "Estados Unidos"));

        return peliculas;
    }

    public static void mostrarListaGeneral(Pelicula[] peliculas) {

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println((i + 1) + ". " + peliculas[i].getTitulo());
        }
    }

    public static void mostrarDetallePelicula(Pelicula pelicula) {
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
        System.out.println("Director: " + pelicula.getDirector().getNombre());
        System.out.println("País de origen: " + pelicula.getDirector().getPaisOrigen());
    }
}
public class PlataformaCine {

    private Pelicula[] peliculas;

    public PlataformaCine(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public void mostrarListaGeneral() {

        System.out.println("Peliculas de la cartelera");

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println((i + 1) + ". " + peliculas[i].getTitulo());
        }
    }

    public void mostrarDetallePelicula(Pelicula pelicula) {
        System.out.println("Detalles de la pelicula");
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
        System.out.println("Director: " + pelicula.getDirector().getNombre());
        System.out.println("País de origen: " + pelicula.getDirector().getPaisOrigen());
    }
}
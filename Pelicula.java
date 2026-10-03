public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private Director director;

    public Pelicula (String titulo, String genero, int duracion, Director director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
    }

    public String getTitulo () {
        return titulo;
    }

    public String getGenero () {
        return genero;
    }

    public int getDuracion () {
        return duracion;
    }

    public Director getDirector () {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public void setDuracion (int duracion) {
        this.duracion = duracion;
    }

    public void setDirector (Director director) {
        this.director = director;
    }
}

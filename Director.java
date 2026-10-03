public class Director {
    private String nombre;
    private String paisOrigen;

    public Director (String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }

    public String getNombre () {
        return nombre;
    }

    public String getPaisOrigen () {
        return paisOrigen;
    }
 
    public void setNombre ( String nombre) {
        this.nombre = nombre;
    }

    public void setPaisOrigen (String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}

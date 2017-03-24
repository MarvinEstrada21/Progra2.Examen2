package marvinestrada_examen2;
public class Canciones {
    private String nombre;
    private String artista;
    private int duracion;
    private String genero;
    private Albums album;

    public Canciones() {
    }

    public Canciones(String nombre, String artista, int duracion, String genero, Albums album) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
    }

    public Canciones(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Albums getAlbum() {
        return album;
    }

    public void setAlbum(Albums album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
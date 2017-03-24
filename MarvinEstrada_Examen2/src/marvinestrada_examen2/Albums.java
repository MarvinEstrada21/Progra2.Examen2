package marvinestrada_examen2;

import java.util.ArrayList;

public class Albums {
    private String nombre;
    private String artista;
    private ArrayList<Canciones> canciones = new ArrayList();

    public Albums() {
    }

    public Albums(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
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

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }
    
    public void setCancion(Canciones ca){
        canciones.add(ca);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
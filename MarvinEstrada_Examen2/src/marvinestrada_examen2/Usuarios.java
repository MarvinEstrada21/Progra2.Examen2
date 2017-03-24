package marvinestrada_examen2;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable{
    private String nombre;
    private int edad;
    private String username;
    private String password;
    private ArrayList<Playlists> playlists = new ArrayList();
    private Playlists favoritos;

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String username, String password, Playlists favoritos) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
        this.favoritos = favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlists> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlists> playlists) {
        this.playlists = playlists;
    }

    public Playlists getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Playlists favoritos) {
        this.favoritos = favoritos;
    }
    
    public void setPlaylist (Playlists pl){
        playlists.add(pl);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
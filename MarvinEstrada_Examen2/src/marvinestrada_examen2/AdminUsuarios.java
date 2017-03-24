package marvinestrada_examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminUsuarios {
    private ArrayList<Usuarios> lista_usuarios = new ArrayList();
    private File archivo = null;

    public AdminUsuarios() {
    }

    public AdminUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ArrayList<Usuarios> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(Usuarios us){
        lista_usuarios.add(us);
    }

    @Override
    public String toString() {
        return "AdminUsuarios{" + "lista_usuarios=" + lista_usuarios + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(lista_usuarios);
            bw.flush();
        } catch (Exception ex) {
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void cargarArchivoBinario(){
        try {
            lista_usuarios = new ArrayList();
            
            Usuarios temp;
            if (archivo.exists()){
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Usuarios) objeto.readObject())!=null){
                        lista_usuarios = (ArrayList<Usuarios>)objeto.readObject();
                    }
                } catch (EOFException e) {
       
                }
                objeto.close();
                entrada.close();       
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
}
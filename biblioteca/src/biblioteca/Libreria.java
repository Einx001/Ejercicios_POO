package biblioteca;

import java.util.ArrayList;

public class Libreria {

    String nombre;
    ArrayList<Publicacion> coleccionPublicaciones;

    public Libreria(String nombre) {
        this.nombre = nombre;
        coleccionPublicaciones = new ArrayList<Publicacion>();
    }

    public void agregarPublicacion(Libro libro) {
        coleccionPublicaciones.add(libro);
    }
    
    public void agregarPublicacion(Revista revista) {
        coleccionPublicaciones.add(revista);
    }
}        
    

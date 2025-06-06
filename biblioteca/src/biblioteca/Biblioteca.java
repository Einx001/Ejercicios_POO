package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();
        // Agregar libros a la lista
        listaPublicaciones.add(new Libro("Cien anios de soledad", 1967, "Gabriel García Marquez", "Sudamericana", "Garcia Marquez, G. (1967)"));
        listaPublicaciones.add(new Libro("1984", 1949, "George Orwell", "Secker & Warburg", "Orwell, G. (1949)"));
        listaPublicaciones.add(new Libro("El amor en los tiempos del colera", 1985, "Gabriel Garcia Marquez", "Sudamericana", "Garcia Marquez, G. (1985)"));
        
        // public Revista(String Titulo, int AnioPublicacion, String Editorial, String periodicidad, String pais)
        // Agregar revista a la lista
        listaPublicaciones.add(new Revista("National Geographic", 2023, "National Geographic Partners", "Mensual", "Estados Unidos"));
        listaPublicaciones.add(new Revista("Muy Interesante", 2022, "Prisa Revistas", "Mensual", "España"));
        listaPublicaciones.add(new Revista("Time", 2024, "Time USA, LLC", "Semanal", "Estados Unidos"));
        
        // Recorrer e imprimir los libros
        System.out.println("Registro de Publicaciones:");
        for (Publicacion publicacion : listaPublicaciones) {
            if(publicacion instanceof Libro){
                Libro libro = (Libro) publicacion;
                libro.imprimir();
            }
            if(publicacion instanceof Revista){
                Revista revista = (Revista) publicacion;
                revista.imprimir();
            }
            System.out.println("------------------------------------------------------------------");
        }
    }
}

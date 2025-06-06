package biblioteca;

public class Publicacion {
    String titulo, editorial;
    int anioPublicacion;

    public Publicacion(String Titulo, int AnioPublicacion, String Editorial) {
        this.titulo = Titulo;
        this.anioPublicacion = AnioPublicacion;
        this.editorial = Editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int AnioPublicacion) {
        this.anioPublicacion = AnioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String Editorial) {
        this.editorial = Editorial;
    }
    
}

package biblioteca;

public class Libro extends Publicacion{
    String autor, referencia_bibliografica;

    public Libro(String Titulo, int AnioPublicacion, String Editorial, String autor, String referencia_bibliografica) {
        super(Titulo, AnioPublicacion, Editorial);
        this.autor = autor;
        this.referencia_bibliografica = referencia_bibliografica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getReferencia_bibliografica() {
        return referencia_bibliografica;
    }

    public void setReferencia_bibliografica(String referencia_bibliografica) {
        this.referencia_bibliografica = referencia_bibliografica;
    }

    public void imprimir(){
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El Autor  del libro es: " + autor);
        System.out.println("La editorial del libro: " + editorial);
        System.out.println("La referencia bibliografica es: " + referencia_bibliografica);
        System.out.println("El año de publicacion del libro: " + anioPublicacion);
    }
}
package biblioteca;

public class Revista extends Publicacion{
    String periodicidad, pais;
    
    public Revista(String Titulo, int AnioPublicacion, String Editorial, String periodicidad, String pais) {
        super(Titulo, AnioPublicacion, Editorial);
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void imprimir(){
        System.out.println("El titulo de la revista es: " + titulo);
        System.out.println("La periodicidad de la revista es: " + periodicidad);
        System.out.println("La editorial de la revista es: " + editorial);
        System.out.println("El pais de la revista es: " + pais);
        System.out.println("El año de publicacion del libro: " + anioPublicacion);
    }
}

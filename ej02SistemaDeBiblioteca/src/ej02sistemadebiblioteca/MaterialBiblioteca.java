package ej02sistemadebiblioteca;

public class MaterialBiblioteca {

    private String titulo;
    private String autor;
    private int yearPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int yearPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAnio de publicacion: " + yearPublicacion);
    }
}

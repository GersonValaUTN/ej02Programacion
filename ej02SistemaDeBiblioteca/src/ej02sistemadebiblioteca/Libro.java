package ej02sistemadebiblioteca;

public class Libro extends MaterialBiblioteca {

    private String ISBN;

    public Libro(String ISBN, String titulo, String autor, int yearPublicacion) {
        super(titulo, autor, yearPublicacion);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("ISBN: " + ISBN + "\n");
    }

}

package ej02sistemadebiblioteca;

public class Revista extends MaterialBiblioteca {

    private int numEdicion;

    public Revista(int numEdicion, String titulo, String autor, int yearPublicacion) {
        super(titulo, autor, yearPublicacion);
        this.numEdicion = numEdicion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de edicion: " + numEdicion + "\n");
    }

}

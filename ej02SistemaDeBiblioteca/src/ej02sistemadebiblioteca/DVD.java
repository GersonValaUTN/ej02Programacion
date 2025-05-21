package ej02sistemadebiblioteca;

public class DVD extends MaterialBiblioteca {

    private float pesoMB;

    public DVD(float pesoMB, String titulo, String autor, int yearPublicacion) {
        super(titulo, autor, yearPublicacion);
        this.pesoMB = pesoMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Peso en MegaBytes: " + pesoMB + " MB" + "\n");
    }

}

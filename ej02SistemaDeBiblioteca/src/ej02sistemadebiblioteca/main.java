package ej02sistemadebiblioteca;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> biblioteca = new ArrayList<>();
        // Libros
        Libro l1 = new Libro("978-3-16-148410-0", "Harry Potter", "Gerson Valashek", 2000);
        Libro l2 = new Libro("978-0-14-028333-4", "1984", "George Orwell", 1949);
        Libro l3 = new Libro("978-0-7432-7356-5", "Angeles y Demonios", "Dan Brown", 2000);
        biblioteca.add(l1);
        biblioteca.add(l2);
        biblioteca.add(l3);

        // Revistas
        Revista r1 = new Revista(365224, "Clarin", "Eduardo Perez", 2024);
        Revista r2 = new Revista(789456, "National Geographic", "Laura Gómez", 2023);
        Revista r3 = new Revista(112233, "Muy Interesante", "Carlos Méndez", 2022);
        biblioteca.add(r1);
        biblioteca.add(r2);
        biblioteca.add(r3);

        // DVDs
        DVD dvd1 = new DVD(512, "Destino Final", "WarnerBros", 2025);
        DVD dvd2 = new DVD(874, "Matrix", "WarnerBros", 1999);
        DVD dvd3 = new DVD(321, "Avatar", "20th Century Fox", 2009);
        biblioteca.add(dvd1);
        biblioteca.add(dvd2);
        biblioteca.add(dvd3);
        for (MaterialBiblioteca material : biblioteca) {
            material.mostrarInfo();
        }
    }
}

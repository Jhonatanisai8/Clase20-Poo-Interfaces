package org.Jhonatan.PooInterfaces.Imprenta;

import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Curriculo;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Genero;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Imprimible;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Informe;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Libro;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Pagina;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Persona;

public class EjemploImprenta {
    public static void main(String[] args) {
        System.out.println("Ejemplo De Implementacion de Interfaces");
        // Ejemplo();
        ejemploLibro();
    }

    public static void Ejemplo() {

        Curriculo cv = new Curriculo(
                new Persona("John", "Ojeda"), "Ingeniero de Sistemas",
                "Resumen Laboral");

        // añadimos experiencias
        cv.addExperecia("Java");
        cv.addExperecia("Oracle DBA");
        cv.addExperecia("Spring Framework");
        cv.addExperecia("Desarrollador FullSack");
        cv.addExperecia("Angular");

        Informe informe = new Informe(
                new Persona("Martin", "Fowler"),
                new Persona("James", "Juarez"),
                "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void ejemploLibro() {
        Curriculo cv = new Curriculo(new Persona("Jhon", "Doe"), "Ingeniero de Sistemas", "Resumen Laboral");

        // objeto de tipo libro
        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de Diseño: Elem. Reusables POO",
                Genero.PROGRAMACIÓN);
        // anadimos paginas
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        // añadimos experiencias
        cv.addExperecia("Java");
        cv.addExperecia("Oracle DBA");
        cv.addExperecia("Spring Framework");
        cv.addExperecia("Desarrollador FullSack");
        cv.addExperecia("Angular");

        Informe informe = new Informe(
                new Persona("Martin", "Fowler"), new Persona("James", "Juarez"),
                "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir() + "\n");
    }
}

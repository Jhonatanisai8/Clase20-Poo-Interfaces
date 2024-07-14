package org.Jhonatan.PooInterfaces.Imprenta;

import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Curriculo;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Genero;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Imprimible;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Informe;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Libro;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Pagina;

public class EjemploImprentaOtimizado {
    public static void main(String[] args) {

    }

    public static void ejemploLibro() {
        Curriculo cv = new Curriculo("Jhon Doe", "Ingeniero de Sistemas", "Resumen Laboral");

        // añadimos experiencias
        cv.addExperecia("Java")
                .addExperecia("Oracle DBA")
                .addExperecia("Spring Framework")
                .addExperecia("Desarrollador FullSack")
                .addExperecia("Angular");

        // objeto de tipo libro
        Libro libro = new Libro("Erich Gamma",
                "Patrones de Diseño: Elem. Reusables POO",
                Genero.PROGRAMACIÓN);
        // anadimos paginas
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir() + "\n");
    }

}

package org.Jhonatan.PooInterfaces.Imprenta;

import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Curriculo;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Hoja;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        System.out.println("Ejemplo De Implementacion de Interfaces");
        Ejemplo();
    }

    public static void Ejemplo() {
        Curriculo cv = new Curriculo("Jhon Doe", "Ingeniero de Sistemas", "Resumen Laboral");

        // añadimos experiencias
        cv.addExperecia("Java");
        cv.addExperecia("Oracle DBA");
        cv.addExperecia("Spring Framework");
        cv.addExperecia("Desarrollador FullSack");
        cv.addExperecia("Angular");

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}

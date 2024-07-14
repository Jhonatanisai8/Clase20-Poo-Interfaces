package org.Jhonatan.PooInterfaces.Imprenta;

import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Curriculo;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Genero;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Imprimible;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Informe;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Libro;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Pagina;
import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Persona;

import static org.Jhonatan.PooInterfaces.Imprenta.Modelo.Imprimible.imprimir;
//import static org.Jhonatan.PooInterfaces.Imprenta.Modelo.Imprimible.TEXTO_DEFECTO;

public class EjemploImprentaOtimizado {
    public static void main(String[] args) {
        ejemploLibro();
        ejemploClaseAnomina();
        ejemploClaseAnomina2();
        ejemploClaseAnomina3();
        ejemploClaseAnominaPasadoPorArgumento();
    }

    public static void ejemploLibro() {
        Curriculo cv = new Curriculo(new Persona("John", "Ojeda"), "Ingeniero de Sistemas", "Resumen Laboral");

        // añadimos experiencias
        cv.addExperecia("Java")
                .addExperecia("Oracle DBA")
                .addExperecia("Spring Framework")
                .addExperecia("Desarrollador FullSack")
                .addExperecia("Angular");

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

        Informe informe = new Informe(
                new Persona("Martin", " Fowler"), new Persona("Patricio", "Juarez"), "Estudio sobre microservicios");
        /*
         * imprimir(cv);
         * imprimir(informe);
         * imprimir(libro);
         */
        imprimir(informe);
        imprimir(libro);
        imprimir(cv);

        // prueba del atributo de tipo final static de la interface imprimible
        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

    public static void ejemploClaseAnomina() {
        imprimir(new Imprimible() {

        });
    }

    public static void ejemploClaseAnomina2() {
        Imprimible obj = new Imprimible() {

        };
        imprimir(obj);
    }

    public static void ejemploClaseAnomina3() {
        Imprimible obj = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola Jhonatan";
            }
        };
        imprimir(obj);
    }

    public static void ejemploClaseAnominaPasadoPorArgumento() {
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola este es un ejemplo de impresion pasada como parametro la metodo Imprimir";
            }
        });
    }
}

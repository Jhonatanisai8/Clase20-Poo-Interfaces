package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private String revisor;

    public Informe(Persona autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por " + this.autor +
                "\nRevisado por: " + this.revisor +
                "\n" + this.contenido;
    }

}

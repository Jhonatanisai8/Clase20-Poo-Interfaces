package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public void imprimir();

}

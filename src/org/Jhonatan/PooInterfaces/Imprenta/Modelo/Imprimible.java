package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

public interface Imprimible {

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    // public String imprimir();
    default String imprimir() {
        return TEXTO_DEFECTO;
    }

    // se puede dejar asi
    // String imprimir();
    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir() + "\n");
    }

}

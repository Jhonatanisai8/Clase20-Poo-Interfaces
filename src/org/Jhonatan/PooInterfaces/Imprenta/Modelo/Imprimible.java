package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

public interface Imprimible {
    // public String imprimir();
    default String imprimir() {
        return "Impriendo un valor por defecto";
    }

    // se puede dejar asi
    // String imprimir();
    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir() + "\n");
    }

}

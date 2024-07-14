package org.Jhonatan.PooInterfaces.Imprenta;

import org.Jhonatan.PooInterfaces.Imprenta.Modelo.Hoja;

public class EjemploImprenta {
    public static void main(String[] args) {
        System.out.println("Ejemplo De Implementacion de Interfaces");
    }


    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}

package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

import java.util.List;

public class Libro {
    List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Libro addPagina(Hoja hoja) {
        this.paginas.add(hoja);
        return this;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Hoja hoja : this.paginas) {
            sb.append(hoja.imprimir()).append("\n");
        }
        return sb.toString();
    }
}

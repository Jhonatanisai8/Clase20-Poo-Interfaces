package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja {

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperecia(String exp) {
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String ex : this.experiencias) {
            sb.append("_").append(ex).append("\n");
        }
        return sb.toString();
    }

}

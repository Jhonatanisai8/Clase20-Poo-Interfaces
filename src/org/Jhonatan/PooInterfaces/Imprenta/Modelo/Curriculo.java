package org.Jhonatan.PooInterfaces.Imprenta.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja {

    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo addExperecia(String exp) {
        this.experiencia.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        return null;
    }

}

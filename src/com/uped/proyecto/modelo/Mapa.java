package com.uped.proyecto.modelo;

public class Mapa extends Material {

    public Mapa(String titulo) {
        super(titulo);
    }

    @Override public int diasPrestamo() {
        return 0;
    }
}

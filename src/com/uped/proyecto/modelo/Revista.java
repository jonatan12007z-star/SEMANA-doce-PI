package com.uped.proyecto.modelo;

public class Revista extends Material implements Prestable {

    public Revista(String titulo) {
        super(titulo);
    }

    @Override public int diasPrestamo() {
        return 7;
    }

    @Override public String prestar(String socio) {
        return titulo + " -> " + socio + " (" + diasPrestamo() + " dias)";
    }

    @Override public int multa(int diasRetraso) {
        return diasRetraso * 2;
    }
}

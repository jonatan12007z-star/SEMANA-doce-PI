package com.uped.proyecto.modelo;

public class EBook extends Material implements Prestable, Digital {

    public EBook(String titulo) {
        super(titulo);
    }

    @Override public int diasPrestamo() {
        return 21;
    }

    @Override public String describir() {
        return "EBook: " + titulo + " [" + formato() + "]";
    }

    @Override public String prestar(String socio) {
        return titulo + " -> " + socio + " (descarga)";
    }

    @Override public String formato() {
        return "PDF";
    }

    @Override public int multa(int diasRetraso) {
        return 0;
    }
}

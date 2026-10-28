package com.uped.proyecto.modelo;

public interface Prestable {

    int MULTA_DIARIA = 1;

    String prestar(String socio);

    default int multa(int diasRetraso) {
        return diasRetraso * MULTA_DIARIA;
    }
}

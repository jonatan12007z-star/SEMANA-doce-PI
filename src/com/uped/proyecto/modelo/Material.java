package com.uped.proyecto.modelo;

public abstract class Material {

    public String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public abstract int diasPrestamo();

    public String describir() {
        return "Material: " + titulo;
    }

    public static String tipo() {
        return "MATERIAL";
    }
}

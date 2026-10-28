package com.uped.proyecto.modelo;

public class Biblioteca {

    public static String registrar(Material m) {
        return "registro general: " + m.titulo;
    }

    public static String registrar(Libro l) {
        return "registro de libro: " + l.titulo;
    }

    public static int multaTotal(Prestable[] items, int dias) {
        int total = 0;

        for (Prestable p : items) {
            total += p.multa(dias);
        }

        return total;
    }
}

import com.uped.proyecto.modelo.*;

public class Main {

    public static void main(String[] args) {
        Material[] fondo = {
                new Libro("Java Basico"),
                new Revista("Byte"),
                new EBook("POO Moderna"),
                new Mapa("El Salvador")
        };

        System.out.println("--- Catalogo ---");
        for (Material m : fondo) {
            System.out.println(m.describir() + " | " + m.diasPrestamo() + " dias");
        }

        System.out.println("--- Prestamos ---");
        for (Material m : fondo) {
            if (m instanceof Prestable) {
                Prestable p = (Prestable) m;
                System.out.println(p.prestar("Ana"));
            } else {
                System.out.println(m.titulo + ": solo en sala");
            }
        }

        System.out.println("--- Ligadura ---");
        Material x = new Libro("Algoritmos");
        System.out.println(x.describir());
        System.out.println(Biblioteca.registrar(x));
        System.out.println(Biblioteca.registrar((Libro) x));
        System.out.println(Material.tipo() + " / " + Libro.tipo());
        System.out.println("--- Multas (3 dias) ---");
        Prestable[] prestados = {
                new Libro("A"), new Revista("B"),
                new EBook("C")};
        for (Prestable p : prestados) {
            System.out.println(p.multa(3));
        }

        System.out.println("Total: $" + Biblioteca.multaTotal(prestados, 3));

    }
}
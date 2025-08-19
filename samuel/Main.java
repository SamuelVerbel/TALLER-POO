public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Utopía", "Ana Isabel Coonejo", 2020, true);
        Libro libro2 = new Libro("Culpa mía", "Mercedez Ron", 2017, true);

        System.out.println("--- Información de los libros ---");
        libro1.mostrarInfo();
        libro2.mostrarInfo();

        libro2.setAutor("Autor Desconocido");
        libro2.setDisponible(false);

        System.out.println("\n--- Después de actualizar autor ---");
        libro1.mostrarInfo();
        libro2.mostrarInfo();

        System.out.println("\n--- Préstamos y devoluciones ---");
        libro1.prestarLibro();
        libro1.prestarLibro();
        libro1.mostrarInfo();

        libro1.devolverLibro();
        libro1.mostrarInfo();
    }
}

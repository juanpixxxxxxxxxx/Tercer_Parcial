package E_4;

public class LibroTexto extends Libro {
    private String curso;

    // Constructor
    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso: " + curso);
    }
}

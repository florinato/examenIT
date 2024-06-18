package examen.examen;

public class Libro extends ColeccionLibros {
    private String nombreLibro;
    public Libro(int id, String nombre, double valor, String nivelAcceso, String nombreLibro) {
        super(id, nombre, valor, nivelAcceso);
        this.nombreLibro = nombreLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public String toString() {
        return "Libro [id=" + id + ", nombreLibro=" + nombreLibro + ", nombre=" + nombre + ", valor=" + valor + "]";
    }
    
        
        
    
    
}

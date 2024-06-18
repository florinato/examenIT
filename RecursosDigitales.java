package examen.examen;
/*Los recursos digitales (como videos, artículos y audios) complementan la información de los libros.
Tienen un identificador único, precio, descripción/nombre y tipo de formato (video, audio, PDF, etc.). */
public class RecursosDigitales extends Biblioteca {
    private String descripcion;
    private Formato formato;

    public RecursosDigitales(String descripcion, Formato formato, int id, String nombre, double valor) {
        super(id, nombre, valor);
        this.descripcion = descripcion;
        this.formato = formato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
    public void calcularIva(ColeccionLibros coleccion){
        coleccion.setValor(coleccion.getValor()+coleccion.getValor()*0.21);
        
    }
    }
    


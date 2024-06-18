package examen.examen;

public class ColeccionLibros extends Biblioteca{

    private String nivelAcceso;

    public ColeccionLibros(int id, String nombre, double valor, String nivelAcceso) {
        super(id, nombre, valor);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "ColeccionesLibros [id=" + id + ", nombre=" + nombre + ", nivelAcceso=" + nivelAcceso + ", valor="
                + valor + "]";
    }
    public void calcularIva(ColeccionLibros coleccion){
        coleccion.setValor(coleccion.getValor()+coleccion.getValor()*0.1);
        
    }
        
    }
    


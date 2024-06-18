package examen.examen;

public abstract class Biblioteca {
    protected int id;
    protected String nombre;
    protected double  valor;
    public Biblioteca(int id, String nombre, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

}

import java.util.ArrayList;

public class Agencia {
    private String nombre;
    private Flota flota;

    private ArrayList<ContratoAlquiler> contratos;

    public Agencia(String nombre, Flota flota) {
        this.nombre = nombre;
        this.flota = flota;
        this.contratos = new ArrayList();

    }

    public String getNombre() {
        return nombre;
    }

    public Flota getFlota() {
        return flota;
    }

    public ArrayList<ContratoAlquiler> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                ", contratos=" + contratos +
                '}';
    }
}

import java.util.ArrayList;

public class VehiculosRent {
    private String nif;
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Agencia> agencias;
    private ArrayList<Flota> flotas;

    public VehiculosRent(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.agencias = new ArrayList<>();
        this.flotas = new ArrayList<>();
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean addFlota(Flota flota){
        for(Flota fl : flotas){
            if(fl.getNombreZona().equals(flota.getNombreZona()))
                return false;
        }
        flotas.add(flota);
        return true;
    }
    public boolean addAgencia(Agencia agencia){
        for(Agencia ag : agencias){
            if(ag.getNombre().equals(agencia.getNombre()))
                return false;
        }
        agencias.add(agencia);
        return true;
    }
    public boolean addCliente(Cliente cliente){
        for(Cliente cl : clientes){
            if(cl.getNombre().equals(cl.getNombre()))
                return false;
        }
        clientes.add(cliente);
        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public ArrayList<Flota> getFlotas() {
        return flotas;
    }

    @Override
    public String toString() {
        return "VehiculosRent{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", clientes=" + clientes +
                ", agencias=" + agencias +
                ", flotas=" + flotas +
                '}';
    }
}

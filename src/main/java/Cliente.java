public class Cliente {
    //Propiedades
    private String nif;
    private String nombre;
    private String numCuenta;
    //Constructor
    public Cliente(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }
    //Getters y setter
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
    //Metodos propios

    //ToString

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}

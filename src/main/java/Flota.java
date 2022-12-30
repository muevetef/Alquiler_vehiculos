import java.util.ArrayList;

public class Flota {
    private String nombreZona;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombreZona) {
        this.nombreZona = nombreZona;
        this.vehiculos = new ArrayList();
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public boolean addVehiculo(Vehiculo vehiculo){
        //Validar si existe por matricula
        for(Vehiculo veh : this.vehiculos){
            if(veh.getMatricula().equals(vehiculo.getMatricula())){
                return false;
            }
        }
        this.vehiculos.add(vehiculo);
        return true;
    }

    public boolean removeVehiculo(String matricula){

       for(Vehiculo veh : this.vehiculos){
           if(veh.getMatricula().equals(matricula)){
               vehiculos.remove(veh);
               return true;
           }
       }
       return false;
    }

    public String listVehiculos(){
        String str = "La flota "+ this.nombreZona + " ";
        if(vehiculos.isEmpty()){
            str += "no tiene vehiculos";
        }else{
            str += "tiene los siguientes vehiculos: \n";
            for(Vehiculo veh : vehiculos){
                str += veh + "\n";
            }
        }
        return str;
    }
    @Override
    public String toString() {
        return "Flota{" +
                "nombreZona='" + nombreZona +
                '}';
    }
}

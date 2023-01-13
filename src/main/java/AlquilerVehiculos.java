import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlquilerVehiculos {

    public static void main(String[] args){
        AlquilerVehiculos pgr = new AlquilerVehiculos();
        pgr.init();

    }

    public void init(){
        VehiculosRent vR = new VehiculosRent("11111111A", "Super Renting 123");
        cargarDatos(vR);
        //Añadir vehiculo
        //Eliminar Vehiculo
        //Listar vehiculos
        //Mostrar Agencias

        //Salir
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        do{
            System.out.println("Elige una opción: ");
            System.out.println("--------------------");
            System.out.println("1. Añade un vehiculo en una flota");
            System.out.println("2. Eliminar un Vehiculo de una flota");
            System.out.println("3. Listar vehiculos de un a flota");
            System.out.println("4. Listar las Agencias");
            System.out.println("5. Cargar datos");
            System.out.println("0. Salir");
            //Esperar entrada de teclado
            int opcion = teclado.nextInt();

            switch (opcion){
                case  1:
                    addVehiculoFlota();
                    break;
                case  2:
                    quitarVehiculoFlota();
                    break;
                case  3:
                    listarVehiculosFlota();
                    break;
                case  4:
                    listarAgencias(vR);
                    break;
                case  5:
                    break;
                case  0:
                    salir = true;
                    break;
            }
        }while (!salir);
    }

    private void listarAgencias(VehiculosRent vR) {
        //TODO Listar las agencias

    }

    private void listarVehiculosFlota() {
    }

    private void quitarVehiculoFlota() {
    }

    private void addVehiculoFlota() {
    }

    public void cargarDatos(VehiculosRent vR){
        cargarFlotas(vR);
        cargarVehiculos(vR);
        cargarAgencias(vR);
    }

    void cargarFlotas(VehiculosRent vR){
        Flota flotaRoja = new Flota("Zona Roja");
        Flota flotaVerde = new Flota("Zona Verde");
        Flota flotaAzul = new Flota("Zona Azul");
        vR.addFlota(flotaRoja);
        vR.addFlota(flotaVerde);
        vR.addFlota(flotaAzul);
    }
    private void cargarVehiculos(VehiculosRent vR) {
        //Crear un objeto de cada vehiculo
        Coche coche = new Coche("111111", "Peugeot", "777", 5, 5);
        Moto moto = new Moto("222222", "Derbi", "Variant", 50);
        Camion camion = new Camion("333333", "Sacnia", "Serie R", 2250);
        vR.getFlotas().get(0).addVehiculo(coche);
        vR.getFlotas().get(1).addVehiculo(moto);
        vR.getFlotas().get(2).addVehiculo(camion);
    }
    private void cargarAgencias(VehiculosRent vR) {
        Agencia ag;
        ag = new Agencia("A1", vR.getFlotas().get(0));
        vR.addAgencia(ag);
        ag = new Agencia("A2", vR.getFlotas().get(1));
        vR.addAgencia(ag);
        ag = new Agencia("A3 ", vR.getFlotas().get(2));
        vR.addAgencia(ag);
    }
}

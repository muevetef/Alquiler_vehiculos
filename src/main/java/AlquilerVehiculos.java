import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlquilerVehiculos {

    public static void main(String[] args){

        //Crear un objeto de cada vehiculo
        Coche coche = new Coche("111111", "Peugeot", "777", 5, 5);
        Moto moto = new Moto("222222", "Derbi", "Variant", 50);
        Camion camion = new Camion("333333", "Sacnia", "Serie R", 2250);
        //Crear dos clientes
        Cliente cl1 = new Cliente("aaaaaa", "Mario");
        Cliente cl2 = new Cliente("bbbbbb", "Luigi");
        //3 contratos de alquiler
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ContratoAlquiler ca1 = new ContratoAlquiler(LocalDate.parse("30/10/2022", dtf),LocalDate.parse("30/12/2022", dtf),30,coche,cl1);
        ContratoAlquiler ca2 = new ContratoAlquiler(LocalDate.parse("03/11/2022", dtf),LocalDate.parse("04/11/2022", dtf),10,moto,cl1);
        ContratoAlquiler ca3 = new ContratoAlquiler(LocalDate.parse("30/10/2021", dtf),LocalDate.parse("30/12/2022", dtf),1,camion,cl2);
        //mostrar los contratos por pantalla
        System.out.println("Contrato 1 => " + ca1);
        System.out.println("Contrato 2 => " + ca2);
        System.out.println("Contrato 3 => " + ca3);
    }
}

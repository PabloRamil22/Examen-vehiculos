import AppVehiculos.Gestor.Gestor;

public class Main {
    public static void main(String[] args) {
        Gestor gestor=new Gestor();
        gestor.mostrarDetallesVehiculo("BMW", "2","12-07-2000");
        System.out.println(gestor.toString());
        gestor.mostrarDetallesMotorizado("BMW", "2", "12-07-2000", "Diesel");
        System.out.println(gestor.toString());
        gestor.mostrarDetallesAutomovil("BMW", "2", "12-07-2000", "Diesel", 4);
        System.out.println(gestor.toString());
        gestor.mostrarDetallesMotocicleta("BMW", "2", "12-07-2000", "Diesel", "4");
        System.out.println(gestor.toString());
    }
}
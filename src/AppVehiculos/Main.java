package AppVehiculos;
import AppVehiculos.Gestor.Gestor;
import AppVehiculos.Modelos.Vehiculomotorizado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestor gestor=new Gestor();
        gestor.mostrarDetallesVehiculo("Opel", "2", "12");
        System.out.println(gestor.toString());
        gestor.mostrarDetallesMotocicleta("Opel", "1", "1", "diesel", "2");
        System.out.println(gestor.toString());


    }
}
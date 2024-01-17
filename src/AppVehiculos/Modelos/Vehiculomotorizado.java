package AppVehiculos.Modelos;

import AppVehiculos.Modelos.Vehiculos;

public class Vehiculomotorizado extends Vehiculos {
    public String combustible;


    public Vehiculomotorizado(String marca, String modelo, String añoFabricacion, String combustible) {
        super(marca, modelo, añoFabricacion);
        this.combustible = combustible;
    }

    public Vehiculomotorizado() {

    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculomotorizado{" +
                "combustible='" + combustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabricacion='" + añoFabricacion + '\'' +
                '}';
    }
}

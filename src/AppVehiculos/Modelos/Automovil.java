package AppVehiculos.Modelos;

public class Automovil extends Vehiculomotorizado {
    public int numeroPuertas;


    public Automovil(String marca, String modelo, String añoFabricacion, String combustible, int numeroPuertas) {
        super(marca, modelo, añoFabricacion, combustible);
        this.numeroPuertas = numeroPuertas;
    }

    public Automovil() {

    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", combustible='" + combustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabricacion='" + añoFabricacion + '\'' +
                '}';
    }
}

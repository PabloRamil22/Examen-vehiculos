package AppVehiculos.Modelos;

public class Automovil extends Vehiculomotorizado {
    private int numeroPuertas;
    public Automovil(String marca, String modelo, String añoFabricacion, String combustible, int numeroPuertas) {
        super(marca, modelo, añoFabricacion, combustible);
        this.numeroPuertas= this.numeroPuertas;
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
                '}';
    }
}

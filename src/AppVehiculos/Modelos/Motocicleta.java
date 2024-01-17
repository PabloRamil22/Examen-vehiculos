package AppVehiculos.Modelos;

public class Motocicleta extends Vehiculomotorizado {
    private String tipoMotocicleta;
    private String combustible;
    private String marca;
    private String modelo;
    private String añoFabricacion;

    public Motocicleta(String marca, String modelo, String añoFabricacion, String combustible, String tipoMotocicleta) {
        super(marca, modelo, añoFabricacion, combustible);
        this.tipoMotocicleta=tipoMotocicleta;
    }

    public Motocicleta() {

    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "tipoMotocicleta='" + tipoMotocicleta + '\'' +
                ", combustible='" + combustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabricacion='" + añoFabricacion + '\'' +
                '}';
    }
}
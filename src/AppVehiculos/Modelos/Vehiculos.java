package AppVehiculos.Modelos;

public class Vehiculos {
    public String marca;
    public String modelo;
    public String añoFabricacion;

    public Vehiculos(String marca, String modelo, String añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public Vehiculos() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +"\n"+
                "modelo='" + modelo + '\'' +"\n"+
                "añoFabricacion='" + añoFabricacion + '\'' +"\n"+
                '}';
    }
}

package AppVehiculos.Gestor;

import AppVehiculos.Modelos.Automovil;
import AppVehiculos.Modelos.Motocicleta;
import AppVehiculos.Modelos.Vehiculomotorizado;
import AppVehiculos.Modelos.Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Gestor {
    private List<Vehiculos> vehiculosList;
    private List<Vehiculomotorizado> vehiculomotorizadoList;
    private List<Automovil> automovilList;
    private List<Motocicleta> motocicletaList;
public Gestor(){
    vehiculosList = new ArrayList<>();
    vehiculomotorizadoList= new ArrayList<>();
    automovilList=new ArrayList<>();
    motocicletaList=new ArrayList<>();

}
public boolean mostrarDetallesVehiculo(String marca, String modelo, String añoFabricacion) {
    Vehiculos vehiculos = new Vehiculos();
    vehiculos.setMarca(marca);
    vehiculos.setModelo(modelo);
    vehiculos.setAñoFabricacion(añoFabricacion);
    return vehiculosList.add(vehiculos);
}
public boolean mostrarDetallesMotorizado(String marca, String modelo, String añoFabricacion, String combustible){
    Vehiculomotorizado vehiculomotorizado=new Vehiculomotorizado();
    vehiculomotorizado.setMarca(marca);
    vehiculomotorizado.setModelo(modelo);
    vehiculomotorizado.setCombustible(combustible);
    vehiculomotorizado.setAñoFabricacion(añoFabricacion);
    return vehiculomotorizadoList.add(vehiculomotorizado);
}
public boolean mostrarDetallesAutomovil(String marca, String modelo, String añoFabricacion, String combustible, int numeroPuertas){
    Automovil automovil=new Automovil();
    automovil.setMarca(marca);
    automovil.setModelo(modelo);
    automovil.setCombustible(combustible);
    automovil.setNumeroPuertas(numeroPuertas);
    automovil.setAñoFabricacion(añoFabricacion);
    return automovilList.add(automovil) ;
}
public boolean mostrarDetallesMotocicleta(String marca, String modelo, String añoFabricaion, String combustible, String tipoMotocicleta){
    Motocicleta motocicleta=new Motocicleta();
    motocicleta.setMarca(marca);
    motocicleta.setModelo(modelo);
    motocicleta.setCombustible(combustible);
    motocicleta.setTipoMotocicleta(tipoMotocicleta);
    motocicleta.setAñoFabricacion(añoFabricaion);
    return motocicletaList.add(motocicleta);

}

    @Override
    public String toString() {
        return "Gestor{" +
                "vehiculosList=" + vehiculosList +
                ", vehiculomotorizadoList=" + vehiculomotorizadoList +
                ", automovilList=" + automovilList +
                ", motocicletaList=" + motocicletaList +
                '}';
    }
}

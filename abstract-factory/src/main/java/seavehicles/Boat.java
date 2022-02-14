package seavehicles;

public class Boat implements ISeaVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto pelo mar");
    }

    @Override
    public void getCargo() {
        System.out.println("Carga colocada no barco");
    }
}

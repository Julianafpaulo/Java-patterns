package vehicle;

public class Car implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando corrida");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, estamos prontos");

    }
}

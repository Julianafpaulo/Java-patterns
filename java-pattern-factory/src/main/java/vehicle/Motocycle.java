package vehicle;

public class Motocycle implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando corrida");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda.");

    }
}

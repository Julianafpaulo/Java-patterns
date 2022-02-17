import builders.CarBuilder;
import builders.TruckBuilder;
import cars.Car;
import cars.Truck;
import director.Director;

public class Main {

    public static void main(String[] args){

        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();

        System.out.println(car.getCarType() + " produzido com sucesso!");

        //criando o caminhao

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();

        System.out.println(truck.result());

    }


}

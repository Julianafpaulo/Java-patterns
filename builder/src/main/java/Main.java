import builders.CarBuilder;
import builders.SportsCarBuilder;
import builders.TruckBuilder;
import cars.Car;
import cars.SportsCar;
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

        //criando o sportscar

        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        director.constructSportsCar(sportsCarBuilder);

        SportsCar sportsCar = sportsCarBuilder.getResult();

        System.out.println(sportsCar.getCarType() +" "+ sportsCar.getColour() +
                " produzido com sucesso!");
    }


}

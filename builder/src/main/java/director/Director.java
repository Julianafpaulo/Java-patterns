package director;

import builders.IBuilder;
import components.CarType;
import components.Colour;
import components.Engine;
import components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setEngine(new Engine(1600));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setEngine(new Engine(13000));
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
    }

}

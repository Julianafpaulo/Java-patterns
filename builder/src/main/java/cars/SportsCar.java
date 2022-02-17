package cars;

import components.CarType;
import components.Colour;
import components.Engine;
import components.Transmission;

public class SportsCar {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Colour colour;

    public SportsCar(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission,
                     Colour colour){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}

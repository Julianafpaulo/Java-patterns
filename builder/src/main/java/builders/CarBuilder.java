package builders;

import cars.Car;
import components.CarType;
import components.Colour;
import components.Engine;
import components.Transmission;

public class CarBuilder implements IBuilder{

    private  CarType carType;
    private  int seats;
    private  Engine engine;
    private  Transmission transmission;
    private Colour colour;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Car getResult(){
        return new Car(carType, seats, engine, transmission);
    }
}

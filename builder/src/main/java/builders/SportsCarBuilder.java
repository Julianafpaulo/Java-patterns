package builders;

import cars.SportsCar;
import components.CarType;
import components.Colour;
import components.Engine;
import components.Transmission;

public class SportsCarBuilder implements IBuilder {

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

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public SportsCar getResult(){
        return new SportsCar(carType,seats,engine,transmission,colour);
    }
}

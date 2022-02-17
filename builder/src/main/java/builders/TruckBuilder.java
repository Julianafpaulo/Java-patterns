package builders;

import cars.Truck;
import components.CarType;
import components.Engine;
import components.Transmission;

public class TruckBuilder implements IBuilder{

    private  CarType carType;
    private  int seats;
    private  Engine engine;
    private  Transmission transmission;

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

    public Truck getresult(){
        return new Truck(carType, seats, engine, transmission);
    }
}

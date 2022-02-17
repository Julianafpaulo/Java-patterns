package builders;

import components.CarType;
import components.Engine;
import components.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}

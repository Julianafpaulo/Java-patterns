package factory;

import aircrafts.Helicopter;
import aircrafts.IAircraft;
import landvehicles.ILandVehicle;
import landvehicles.Motorcycle;
import seavehicles.ISeaVehicle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public ISeaVehicle createSeaVehicle() {
        return null;
    }
}

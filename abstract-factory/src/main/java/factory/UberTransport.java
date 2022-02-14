package factory;

import aircrafts.Airplane;
import aircrafts.IAircraft;
import landvehicles.Car;
import landvehicles.ILandVehicle;
import seavehicles.ISeaVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public ISeaVehicle createSeaVehicle() {
        return null;
    }
}

package factory;

import aircrafts.IAircraft;
import landvehicles.ILandVehicle;
import seavehicles.Boat;
import seavehicles.ISeaVehicle;

public class BoatTransport implements ITransportFactory{

    @Override
    public ISeaVehicle createSeaVehicle() {
        return new Boat();
    }

    @Override
    public ILandVehicle createTransportVehicle() {
        return null;
    }

    @Override
    public IAircraft createTransportAircraft() {
        return null;
    }
}

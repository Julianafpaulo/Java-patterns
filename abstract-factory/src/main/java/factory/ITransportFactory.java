package factory;

import aircrafts.IAircraft;
import landvehicles.ILandVehicle;
import seavehicles.ISeaVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    ISeaVehicle createSeaVehicle();
}

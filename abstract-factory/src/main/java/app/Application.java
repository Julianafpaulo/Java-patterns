package app;

import aircrafts.IAircraft;
import factory.ITransportFactory;
import landvehicles.ILandVehicle;
import seavehicles.ISeaVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private ISeaVehicle seaVehicle;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        seaVehicle = factory.createSeaVehicle();

    }

    public void startRoute(){
        if(seaVehicle!= null)
            seaVehicle.startRoute();
        if(vehicle!= null)
            vehicle.startRoute();
        if(aircraft!= null)
            aircraft.startRoute();
    }
}

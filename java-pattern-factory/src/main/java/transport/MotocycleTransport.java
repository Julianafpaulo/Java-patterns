package transport;

import vehicle.IVehicle;
import vehicle.Motocycle;

public class MotocycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motocycle();
    }
}

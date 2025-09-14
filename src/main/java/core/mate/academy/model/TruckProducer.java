package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("FMX 460", 18_000, 460);
        Truck truck2 = new Truck("FMX 660", 20_000, 660);
        Truck truck3 = new Truck("FMX 160", 30_000, 160);
        return List.of(truck1, truck2, truck3);
    }
}

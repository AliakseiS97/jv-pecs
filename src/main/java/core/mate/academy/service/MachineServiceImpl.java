package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> machines = new BulldozerProducer().get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            List<? extends Machine> machines = new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            List<? extends Machine> machines = new TruckProducer().get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super T> machines,T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }
}

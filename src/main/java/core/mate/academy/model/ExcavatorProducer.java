package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("PC210", 1.2, 21_000);
        Excavator excavator2 = new Excavator("PC310", 1.5, 25_000);
        Excavator excavator3 = new Excavator("PC410", 3.1, 30_000);
        return List.of(excavator1, excavator2, excavator3);
    }
}

package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("ABC", 10_000, 5_000);
        Bulldozer bulldozer2 = new Bulldozer("BCA", 8_000, 2_500);
        Bulldozer bulldozer3 = new Bulldozer("CBA", 2_000, 500);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}

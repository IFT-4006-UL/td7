package td9.infra.persistence.inMemory;

import td9.domain.cruise.Cruise;
import td9.domain.cruise.CruiseId;
import td9.domain.cruise.CruiseRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCruiseRepository implements CruiseRepository {

    private static final Map<CruiseId, Cruise> cruises = new HashMap<>();

    @Override
    public Cruise findById(CruiseId cruiseId) {
        return cruises.get(cruiseId);
    }

    @Override
    public void save(Cruise cruise) {
        cruises.put(cruise.getId(), cruise);
    }
}

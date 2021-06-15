package labor;

import co.com.sofka.domain.generic.AggregateEvent;
import labor.values.LaborId;

public class Labor extends AggregateEvent<LaborId> {
    public Labor(LaborId entityId) {
        super(entityId);
    }
}

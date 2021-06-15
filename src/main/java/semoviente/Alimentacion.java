package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.AlimentacionId;
import semoviente.values.Delta;
import semoviente.values.Tipo;
import semoviente.values.Total;

public class Alimentacion extends Entity<AlimentacionId> {

    private final Tipo tipo;
    private Delta delta;
    private Total total;
    public Alimentacion(AlimentacionId entityId, Tipo tipo) {
        super(entityId);
        this.tipo = tipo;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Delta delta() {
        return delta;
    }

    public Total total() {
        return total;
    }
}

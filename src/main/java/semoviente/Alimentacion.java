package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.AlimentacionId;
import semoviente.values.Delta;
import semoviente.values.Tipo;
import semoviente.values.Total;

import java.util.Objects;

public class Alimentacion extends Entity<AlimentacionId> {

    private final Tipo tipo;
    private Delta delta;
    private Total total;
    public Alimentacion(AlimentacionId entityId, Tipo tipo) {
        super(entityId);
        this.tipo = tipo;
        this.total= new Total(0);
    }

    public void alimentar(Delta delta){
        this.delta = Objects.requireNonNull(delta);
        this.total = total.actualizarTotal(Objects.requireNonNull(delta));
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

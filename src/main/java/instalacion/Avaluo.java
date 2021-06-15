package instalacion;

import co.com.sofka.domain.generic.Entity;
import instalacion.values.AvaluoId;
import instalacion.values.Monto;

import java.util.Set;

public class Avaluo extends Entity<AvaluoId> {
    private Set<Inversion> inversiones;
    private Monto monto;

    public Avaluo(AvaluoId entityId, Inversion inversion, Monto monto) {
        super(entityId);
        this.inversiones.add(inversion);
        this.monto = monto;
    }
}

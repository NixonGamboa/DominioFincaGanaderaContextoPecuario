package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.Fecha;
import semoviente.values.RegistroId;

import java.util.Set;

public class Registro extends Entity<RegistroId> {
    private final Fecha fecha;
    private Produccion produccion;
    private Set<Alimentacion> dieta;
    private Medicacion medicacion;
    public Registro(RegistroId entityId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
    }
}

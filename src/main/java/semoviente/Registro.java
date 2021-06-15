package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.Fecha;
import semoviente.values.RegistroId;

import java.util.List;
import java.util.Set;

public class Registro extends Entity<RegistroId> {
    private final Fecha fecha;
    private Produccion produccion;
    private Set<Alimentacion> dieta;
    private List<Medicacion> medicamentos;
    public Registro(RegistroId entityId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Produccion produccion() {
        return produccion;
    }

    public Set<Alimentacion> dieta() {
        return dieta;
    }

    public List<Medicacion> medicamentos() {
        return medicamentos;
    }
}

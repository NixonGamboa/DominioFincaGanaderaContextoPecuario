package semoviente;

import co.com.sofka.domain.generic.AggregateEvent;
import instalacion.values.InstalacionId;
import semoviente.events.SemovienteCreado;
import semoviente.values.SemovienteId;

import java.util.Set;

public class Semoviente extends AggregateEvent<SemovienteId> {
    protected FichaTecnica fichaTecnica;
    protected Set<Registro> registros;
    protected InstalacionId instalacionId;

    public Semoviente(SemovienteId entityId, FichaTecnica fichaTecnica) {
        super(entityId);
        this.fichaTecnica = fichaTecnica;
        appendChange(new SemovienteCreado(fichaTecnica.getEspecie())).apply();
    }
}

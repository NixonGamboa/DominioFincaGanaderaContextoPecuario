package instalacion;

import co.com.sofka.domain.generic.AggregateEvent;
import instalacion.events.InstalacionConstruida;
import instalacion.values.Area;
import instalacion.values.Capacidad;
import instalacion.values.InstalacionId;
import instalacion.values.Tipo;
import semoviente.Semoviente;

import java.util.Set;

public class Instalacion extends AggregateEvent<InstalacionId> {
    private Tipo tipo;
    private Area area;
    private Capacidad capacidad;
    private Set<Semoviente> semovientes;
    private Avaluo avaluo;

    public Instalacion(InstalacionId entityId, Tipo tipo, Area area, Capacidad capacidad, Avaluo avaluo) {
        super(entityId);
        this.tipo = tipo;
        this.area = area;
        this.capacidad = capacidad;
        this.avaluo = avaluo;
        appendChange(new InstalacionConstruida()).apply();
    }
}

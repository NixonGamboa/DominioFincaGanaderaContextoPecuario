package instalacion.events;

import co.com.sofka.domain.generic.DomainEvent;

public class InstalacionConstruida extends DomainEvent {
    public InstalacionConstruida() {
        super("fincagan.instalacion.instalacionconstruida");
    }
}

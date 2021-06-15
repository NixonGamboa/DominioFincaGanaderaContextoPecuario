package semoviente.events;

import co.com.sofka.domain.generic.DomainEvent;
import semoviente.FichaTecnica;

public class SemovienteCreado extends DomainEvent {
    private FichaTecnica fichaTecnica;

    public SemovienteCreado(FichaTecnica fichaTecnica) {
        super("fincagan.semoviente.semovientecreado");
        this.fichaTecnica = fichaTecnica;
    }
    public FichaTecnica getFichaTecnica(){
        return fichaTecnica;
    }
}

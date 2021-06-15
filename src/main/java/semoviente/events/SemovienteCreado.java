package semoviente.events;

import co.com.sofka.domain.generic.DomainEvent;
import semoviente.values.Especie;

public class SemovienteCreado extends DomainEvent {
    private Especie especie;

    public SemovienteCreado(Especie especie) {
        super("fincagan.semoviente.semovientecreado");
        this.especie = especie;
    }
    public Especie getEspecie(){
        return especie;
    }
}

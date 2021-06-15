package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Etapa implements ValueObject<String> {
    private String etapa;

    public Etapa(String etapa) {
        this.etapa = etapa;
    }

    @Override
    public String value() {
        return etapa;
    }
}

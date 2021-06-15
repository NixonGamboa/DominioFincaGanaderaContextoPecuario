package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tipo implements ValueObject<String> {
    private String tipo;

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String value() {
        return tipo;
    }
}

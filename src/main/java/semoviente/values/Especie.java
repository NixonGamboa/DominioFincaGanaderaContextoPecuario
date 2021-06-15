package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Especie implements ValueObject<String> {
    public String especie;

    public Especie(String especie) {
        this.especie = especie;
    }

    @Override
    public String value() {
        return especie;
    }
}

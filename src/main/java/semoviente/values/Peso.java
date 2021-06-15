package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Peso implements ValueObject<Integer> {
    private Integer peso;

    public Peso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public Integer value() {
        return peso;
    }
}

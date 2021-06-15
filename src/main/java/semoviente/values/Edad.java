package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Edad implements ValueObject<Integer> {
    private Integer edad;

    public Edad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public Integer value() {
        return edad;
    }
}

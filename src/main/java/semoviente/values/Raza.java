package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Raza implements ValueObject<String> {
    private String raza;

    public Raza(String raza) {
        this.raza = raza;
    }

    @Override
    public String value() {
        return raza;
    }
}

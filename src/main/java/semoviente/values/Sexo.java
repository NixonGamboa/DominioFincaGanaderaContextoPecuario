package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Sexo implements ValueObject<String> {
    private String sexo;

    public Sexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String value() {
        return sexo;
    }
}

package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tratamiento implements ValueObject<String> {
    private String diagnostico;

    public Tratamiento(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String value() {
        return diagnostico;
    }
}

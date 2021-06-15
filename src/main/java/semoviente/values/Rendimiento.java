package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Rendimiento implements ValueObject<Integer> {
    private Integer rendimiento;

    public Rendimiento(Integer rendimiento) {
        this.rendimiento = rendimiento;
    }

    @Override
    public Integer value() {
        return rendimiento;
    }
}

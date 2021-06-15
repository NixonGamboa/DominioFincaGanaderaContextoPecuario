package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Delta implements ValueObject<Integer> {
    private Integer delta;

    public Delta(Integer delta) {
        this.delta = delta;
    }
    @Override
    public Integer value() {
        return delta;
    }
}

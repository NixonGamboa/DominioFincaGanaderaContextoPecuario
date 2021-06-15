package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Total implements ValueObject<Integer> {
    private Integer total;

    public Total(Integer total) {
        this.total = total;
    }


    @Override
    public Integer value() {
        return total;
    }

    public Total actualizarTotal(Delta delta) {
        return new Total(this.total+delta.value());
    }
}

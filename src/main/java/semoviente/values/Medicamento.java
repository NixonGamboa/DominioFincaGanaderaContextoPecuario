package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Medicamento implements ValueObject<Medicamento.Props> {
    private final String farmaco;
    private final Integer dosis;

    public Medicamento(String farmaco, Integer dosis) {
        this.farmaco = farmaco;
        this.dosis = dosis;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String farmaco() {
                return farmaco;
            }

            @Override
            public Integer dosis() {
                return dosis;
            }
        };
    }

    public interface Props {
        String farmaco();
        Integer dosis();
    }
}

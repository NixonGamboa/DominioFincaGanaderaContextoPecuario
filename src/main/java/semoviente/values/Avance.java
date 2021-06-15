package semoviente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Avance implements ValueObject<Integer> {
    private Integer porcentaje;

    public Avance(Integer avance) {
        this.porcentaje = avance;
    }

    public Avance avanzarTratamiento(Medicamento medicamento){
        return new Avance(this.porcentaje + medicamento.value().dosis());
    }


    @Override
    public Integer value() {
        return porcentaje;
    }
}

package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.Avance;
import semoviente.values.MedicacionId;
import semoviente.values.Medicamento;
import semoviente.values.Tratamiento;

public class Medicacion extends Entity<MedicacionId> {
    private Tratamiento tratamiento;
    private Medicamento medicamento;
    private Avance avance;

    public Medicacion(MedicacionId entityId, Tratamiento tratamiento, Medicamento medicamento) {
        super(entityId);
        this.tratamiento = tratamiento;
        this.medicamento = medicamento;
    }
}

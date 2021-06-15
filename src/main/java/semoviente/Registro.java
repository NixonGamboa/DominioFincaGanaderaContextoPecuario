package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.Fecha;
import semoviente.values.RegistroId;
import semoviente.values.Tratamiento;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Registro extends Entity<RegistroId> {
    private final Fecha fecha;
    private Produccion produccion;
    private Set<Alimentacion> dieta;
    private List<Medicacion> medicamentos;
    public Registro(RegistroId entityId, Fecha fecha) {
        super(entityId);
        this.fecha = fecha;
    }

    public void agregarAlimentoaDieta(Alimentacion alimento){
        this.dieta.add(Objects.requireNonNull(alimento));
    }
    public void agregarTratamiento(Medicacion medicamento){
        this.medicamentos.add(Objects.requireNonNull(medicamento));
    }


    public Fecha fecha() {
        return fecha;
    }

    public Produccion produccion() {
        return produccion;
    }

    public Set<Alimentacion> dieta() {
        return dieta;
    }

    public List<Medicacion> medicamentos() {
        return medicamentos;
    }
}

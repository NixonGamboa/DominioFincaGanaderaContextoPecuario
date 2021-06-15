package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.Etapa;
import semoviente.values.Peso;
import semoviente.values.ProduccionId;
import semoviente.values.Rendimiento;

import java.util.Objects;

public class Produccion extends Entity<ProduccionId> {
    private Peso peso;
    private Rendimiento rendimiento;
    private Etapa etapa;

     public Produccion(ProduccionId entityId, Peso peso) {
        super(entityId);
        this.peso = peso;
    }

    public void rectificarPeso(Peso peso){
         this.peso = Objects.requireNonNull(peso);
    }
    public void actualizarRendimiento(Rendimiento rendimiento){
         this.rendimiento = Objects.requireNonNull(rendimiento);
    }
    public void modificarEtapa(Etapa etapa){
         this.etapa = Objects.requireNonNull(etapa);
    }

    public Peso peso() {
        return peso;
    }

    public Rendimiento rendimiento() {
        return rendimiento;
    }

    public Etapa etapa() {
        return etapa;
    }
}

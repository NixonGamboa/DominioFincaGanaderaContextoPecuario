package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.*;

public class FichaTecnica extends Entity<FichaTecnicaId> {
    private final Especie especie;
    private final Raza raza;
    private final Sexo sexo;
    private final Color color;
    private  Edad edad;
    private  Peso peso;


    public FichaTecnica(FichaTecnicaId entityId, Especie especie, Raza raza, Edad edad, Sexo sexo, Color color, Peso peso) {
        super(entityId);
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;
        this.peso = peso;
    }


    public Especie getEspecie(){
        return especie;
    }
}

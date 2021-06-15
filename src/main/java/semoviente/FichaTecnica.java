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

    public Especie especie(){
        return especie;
    }

    public Raza raza() {
        return raza;
    }

    public Sexo sexo() {
        return sexo;
    }

    public Color color() {
        return color;
    }

    public Edad edad() {
        return edad;
    }

    public Peso peso() {
        return peso;
    }
}

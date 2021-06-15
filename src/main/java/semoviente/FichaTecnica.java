package semoviente;

import co.com.sofka.domain.generic.Entity;
import semoviente.values.*;

import java.util.Objects;

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

    public void cumplirAnios(Edad edad){
        this.edad=Objects.requireNonNull(edad);
    }

    public void rectificarPeso(Peso peso){
        this.peso = Objects.requireNonNull(peso);
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

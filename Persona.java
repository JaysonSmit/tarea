package org.example;
import java.time.LocalDate;
import java.util.Date;

public class Persona {
    protected String nombre;
    protected String estadosasis;
    protected char genero;
    Date fechaReg;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadosasis() {
        return estadosasis;
    }


    public void setEstadosasis(String estadosasis) {
        this.estadosasis = estadosasis;
    }



    public Persona(String nombre, String estadosasis,char genero) {
        this.nombre = nombre;
        this.estadosasis = estadosasis;
        this.genero=genero;

    }
}

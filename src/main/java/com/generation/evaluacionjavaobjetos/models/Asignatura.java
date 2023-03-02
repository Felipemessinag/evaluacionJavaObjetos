package com.generation.evaluacionjavaobjetos.models;

public class Asignatura {
    public String nombreAsignatura;

    public Asignatura() {
        super();
    }

    public Asignatura( String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    @Override
    public String toString() {
        return  nombreAsignatura;
    }
    
    


    
}

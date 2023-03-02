package com.generation.evaluacionjavaobjetos.models;

public class Profesor {
    public String nombreProfesor;


    
    public Profesor() {
    }
    
    public Profesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    
    @Override
    public String toString() {
        return " " + nombreProfesor + " ";
    }

    
    
}

package com.generation.evaluacionjavaobjetos.models;

public class Curso extends Profesor{
    public Integer cantidadAlumnos;
    
    
    public Curso() {
        super();
    }


    public Curso(String nombreProfesor, String nombreDeCurso, Integer cantidadAlumnos) {
        super(nombreProfesor);
        this.cantidadAlumnos = cantidadAlumnos;
    }



    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }


    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }


    @Override
    public String toString() {
        return super.toString() +" está a cargo de un curso con " + cantidadAlumnos + " alumnos";
    }



    

    
}

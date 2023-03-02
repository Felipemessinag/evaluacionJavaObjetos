package com.generation.evaluacionjavaobjetos.models;

public class Alumno {
    public String nombre;
    public Integer cantidadNotas;
    
    
    public Alumno() {
    }

    public Alumno(String nombre, Integer cantidadNotas, double promedioNotas) {
        this.nombre = nombre;
        this.cantidadNotas = cantidadNotas;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadNotas() {
        return cantidadNotas;
    }

    public void setCantidadNotas(Integer cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
    }


    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", cantidadNotas=" + cantidadNotas +
                 "]";
    }
    

    
}

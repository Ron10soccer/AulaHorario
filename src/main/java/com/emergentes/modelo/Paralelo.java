package com.emergentes.modelo;

public class Paralelo {
    private int id;
    private String nombre_paralelo;

    public Paralelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_paralelo() {
        return nombre_paralelo;
    }

    public void setNombre_paralelo(String nombre_paralelo) {
        this.nombre_paralelo = nombre_paralelo;
    }

    @Override
    public String toString() {
        return "Paralelo{" + "id=" + id + ", nombre_paralelo=" + nombre_paralelo + '}';
    }
    
    
}

package com.emergentes.modelo;
public class Horas {
    private int id;
    private String rango;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    public Horas() {
    }

    @Override
    public String toString() {
        return "Horas{" + "id=" + id + ", rango=" + rango + '}';
    }
    
    
}

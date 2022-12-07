
package com.emergentes.modelo;


public class CatUsusario {
    private int id;
    private String descripcion;

    public CatUsusario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "CatUsusario{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
}

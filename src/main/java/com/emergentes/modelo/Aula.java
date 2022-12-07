
package com.emergentes.modelo;

public class Aula {
    private int id;
    private String descripcion;
    private String ubicacion;

    public Aula() {
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + '}';
    }
    
    
}

package com.emergentes.modelo;

public class Mat_Par {
    private int id;
    private int id_materia;
    private int id_paralelo;
    private String mat_par1;
    //verificar si es neccesario los datos como cer nombre y otros

    public Mat_Par() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_paralelo() {
        return id_paralelo;
    }

    public void setId_paralelo(int id_paralelo) {
        this.id_paralelo = id_paralelo;
    }

    public String getMat_par1() {
        return mat_par1;
    }

    public void setMat_par1(String mat_par1) {
        this.mat_par1 = mat_par1;
    }

    @Override
    public String toString() {
        return "Mat_Par{" + "id=" + id + ", id_materia=" + id_materia + ", id_paralelo=" + id_paralelo + '}';
    }
    
}

package com.iesam.JuanGarcia.ITV.domain.models;

public class Camion implements Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String añoMatriculacion;

    private String tara;
    private String longitud;




    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getAñoMatriculacion() {
        return this.añoMatriculacion;
    }

    @Override
    public String getMatricula() {
        return this.matricula;
    }
}

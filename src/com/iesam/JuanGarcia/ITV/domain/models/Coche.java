package com.iesam.JuanGarcia.ITV.domain.models;

public class Coche implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String añoMatriculacion;
    private Integer numeroPuertas;



    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getAñoMatriculacion() {
        return null;
    }

    @Override
    public String getMatricula() {
        return null;
    }
}

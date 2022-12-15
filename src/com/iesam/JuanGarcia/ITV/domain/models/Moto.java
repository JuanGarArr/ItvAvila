package com.iesam.JuanGarcia.ITV.domain.models;

public class Moto implements  Vehiculo{
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String añoMatriculacion;
    private String diametroRuedas;

    public String getDiametroRuedas() {
        return diametroRuedas;
    }

    public void setDiametroRuedas(String diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
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

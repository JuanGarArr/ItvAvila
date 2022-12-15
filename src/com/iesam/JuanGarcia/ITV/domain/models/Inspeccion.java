package com.iesam.JuanGarcia.ITV.domain.models;

public class Inspeccion {

    private String codInspecion;
    private String dateInspeccion;
    private String resultado;
    private String Matriculavehiculo;
    private String dniCliente;

    public String getCodInspecion() {
        return codInspecion;
    }

    public void setCodInspecion(String codInspecion) {
        this.codInspecion = codInspecion;
    }

    public String getDateInspeccion() {
        return dateInspeccion;
    }

    public void setDateInspeccion(String dateInspeccion) {
        this.dateInspeccion = dateInspeccion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getMatriculavehiculo() {
        return Matriculavehiculo;
    }

    public void setMatriculavehiculo(String matriculavehiculo) {
        Matriculavehiculo = matriculavehiculo;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }
}

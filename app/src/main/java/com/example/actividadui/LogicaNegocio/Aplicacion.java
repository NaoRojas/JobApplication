package com.example.actividadui.LogicaNegocio;


import java.util.Date;

public class Aplicacion {
    private Date startDate;
    private Usuario usuario;
    private Posicion posicion;

    public Aplicacion(Usuario usuario, Posicion posicion,Date startDate) {
        this.startDate = startDate;
        this.usuario = usuario;
        this.posicion = posicion;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Aplicacion{" +
                "startDate=" + startDate +
                ", usuario=" + usuario +
                ", posicion=" + posicion +
                '}';
    }
    // File resume
}

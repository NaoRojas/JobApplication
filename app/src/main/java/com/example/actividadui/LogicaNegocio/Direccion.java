package com.example.actividadui.LogicaNegocio;

public class Direccion {
    private String city;
    private Pais pais;
    private String ZIPcode;
    private Provincia provincia;

    public Direccion(String city, Pais pais, String ZIPcode, Provincia provincia) {
        this.city = city;
        this.pais = pais;
        this.ZIPcode = ZIPcode;
        this.provincia = provincia;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getZIPcode() {
        return ZIPcode;
    }

    public void setZIPcode(String ZIPcode) {
        this.ZIPcode = ZIPcode;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}

package com.example.actividadui.LogicaNegocio;

public class Telefono {

    private String numero;
    private String area_code;

    public Telefono(String numero, String area_code) {
        this.numero = numero;
        this.area_code = area_code;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }
}

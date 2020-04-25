package com.example.actividadui.LogicaNegocio;

import java.util.List;

public class Pais {
    private String id;
    private List<Provincia> provincias;
    private String nombre;

    public Pais(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProvincia(Provincia p){
        provincias.add(p);
    }

    public Provincia getProvincia(int index){
        return provincias.get(index);
    }
}

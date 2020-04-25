package com.example.actividadui.LogicaNegocio;

public class Usuario {
    private Boolean admin;
    private String nombre;
    private String apellido;
    private String password;
    private String correo;
    private Telefono telefono;
    private Direccion direccion;

    public Usuario(Boolean admin, String nombre, String apellido,  String correo,String password) {
        this.admin = admin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.correo = correo;
    }
    public void seUsuario(Telefono telefono, Direccion direccion){
        this.telefono=telefono;
        this.direccion=direccion;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}


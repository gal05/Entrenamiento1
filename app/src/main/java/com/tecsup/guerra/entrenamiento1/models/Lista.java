package com.tecsup.guerra.entrenamiento1.models;

public class Lista {
    private Integer id;
    private String nombre;
    private String direccion;
    private String lugar;
    private Integer telefono;
    private String picture;


    public Lista() {
    }

    public Lista(Integer id, String nombre, String direccion, String lugar, Integer telefono, String picture) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.lugar = lugar;
        this.telefono = telefono;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", lugar='" + lugar + '\'' +
                ", telefono=" + telefono +
                ", picture='" + picture + '\'' +
                '}';
    }
}

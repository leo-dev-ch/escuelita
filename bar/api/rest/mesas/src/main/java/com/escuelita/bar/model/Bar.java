/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuelita.bar.model;

/**
 *
 * @author lgaray
 */
public class Bar {
    private Integer id;
    private String nombre;

    public Bar(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Bar() {
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

    @Override
    public String toString() {
        return "Bar{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
            
}

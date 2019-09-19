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
public abstract class Persona {
    private Integer id;
    private String nombre;
    private Integer documento;

    public Persona() {
    }

    public Persona(String nombre, Integer documento) {
        this.nombre = nombre;
        this.documento = documento;
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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    
    
            
}

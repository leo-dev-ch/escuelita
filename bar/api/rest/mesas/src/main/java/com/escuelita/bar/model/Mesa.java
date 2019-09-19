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

public class Mesa {
    private Integer id;
    private Integer numero;
    private Integer tamanio;
    private Integer CantidadCubierto;
    private Float PrecioCubierto;
    
    private Estado estado;

    public Mesa() {
    }

    public Mesa(Integer numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getCantidadCubierto() {
        return CantidadCubierto;
    }

    public void setCantidadCubierto(Integer CantidadCubierto) {
        this.CantidadCubierto = CantidadCubierto;
    }

    public Float getPrecioCubierto() {
        return PrecioCubierto;
    }

    public void setPrecioCubierto(Float PrecioCubierto) {
        this.PrecioCubierto = PrecioCubierto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
            
}

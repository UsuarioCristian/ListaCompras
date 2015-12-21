package com.app.listadecompras.dominio;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

import java.util.List;
import java.util.Set;

/**
 * Created by cristian on 18-Dec-15.
 */

@Table(name = "Producto")
public class Producto extends Model {

    private String nombre;
    private int precioEstimado;
    private int precioReal;
    private int frecuenciaGlobal;
    private Categoria categoria;
    private Set<List> listas;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioEstimado() {
        return precioEstimado;
    }

    public void setPrecioEstimado(int precioEstimado) {
        this.precioEstimado = precioEstimado;
    }

    public int getPrecioReal() {
        return precioReal;
    }

    public void setPrecioReal(int precioReal) {
        this.precioReal = precioReal;
    }

    public int getFrecuenciaGlobal() {
        return frecuenciaGlobal;
    }

    public void setFrecuenciaGlobal(int frecuenciaGlobal) {
        this.frecuenciaGlobal = frecuenciaGlobal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<List> getListas() {
        return listas;
    }

    public void setListas(Set<List> listas) {
        this.listas = listas;
    }
}

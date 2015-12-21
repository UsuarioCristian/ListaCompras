package com.app.listadecompras.dominio;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

import java.util.Date;
import java.util.Set;

/**
 * Created by cristian on 18-Dec-15.
 */

@Table(name = "Lista")
public class Lista extends Model{

    private Date fecha;
    private Set<Producto> productos;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}

package com.app.listadecompras.dominio;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

import java.util.Set;

/**
 * Created by cristian on 18-Dec-15.
 */

@Table(name = "Categoria")
public class Categoria extends Model{

    private int id;
    private String nombre;
    private Set<Producto> productos;
}

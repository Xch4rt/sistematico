/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.ni.Articulo;

/**
 *
 * @author JADPA01
 */
public class Articulo {

    public Articulo(String code, String nombre, int cantidad, float precio) {
        this.code = code;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    private String code;
    private String nombre;
    private int cantidad;
    private float precio;

    public Articulo() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.Objects;

/**
 *
 * @author jarol
 */
public class Contacto {
    private String nombre;
    private String telefono1;
    private String telefono2;
    private String correo;
    private String direccion;
    private String alias;

    public Contacto(String nombre, String telefono1, String telefono2, String correo, String direccion, String alias) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correo = correo;
        this.direccion = direccion;
        this.alias = alias;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author jarol
 */
public class Contacto {
    private String nombre;
    private List<Long> telefono1;
    private String correo;
    private String direccion;
    private String alias;

    public Contacto(){}

    public Contacto(String nombre, List<Long> telefono1, String correo, String direccion, String alias) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.correo = correo;
        this.direccion = direccion;
        this.alias = alias;
    }

    public List getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(List telefono1) {
        this.telefono1 = telefono1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String contactoArchivo(){
        String telefonos=telefono1.toString().substring(1,telefono1.toString().length()-1);
        String telefonoSinEspacios = telefonos.replace(" ","");
        return nombre+";"+telefonoSinEspacios+";"+correo+";"+direccion+";"+alias+"; ";
    } 
    public String busqueda(){
        return nombre+"  "+telefono1+"  "+"  "+correo+"  "+direccion+"  "+alias;
    }
     public boolean CompararTelefonos(Contacto obj) {
        int contador=0;
        for (int i = 0; i < telefono1.size(); i++) {
            for (int j = 0; j < obj.telefono1.size(); j++) {
                if (!Objects.equals(telefono1.get(i), obj.telefono1.get(j))) {
                    System.out.println("holii");
                    contador++;
                }
            }
        }
         System.out.println(contador);
        if (contador==(telefono1.size()*obj.telefono1.size())-1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String telefonos=telefono1.toString().substring(1,telefono1.toString().length()-1);
        String telefonoSinEspacios = telefonos.replace(" ","");
        return "nombre=" + nombre + ", telefono1=" + telefonoSinEspacios + ", correo=" + correo + ", direccion=" + direccion + ", alias=" + alias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }    
}

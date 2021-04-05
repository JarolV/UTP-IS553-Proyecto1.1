/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jarol
 */
public class Agenda {
    List<Contacto> listaContactos;

    public Agenda() {
        listaContactos =new ArrayList<>();
    }
    public void borrar(int posicion){
        listaContactos.remove(posicion);
    }
    public List<Contacto> getAgenda() {
        return listaContactos;
    }
    public void editar(int c,Contacto cambio){
        listaContactos.get(c).setNombre(cambio.getNombre());
        listaContactos.get(c).setTelefono1(cambio.getTelefono1());
        listaContactos.get(c).setTelefono2(cambio.getTelefono2());
        listaContactos.get(c).setCorreo(cambio.getCorreo());
        listaContactos.get(c).setDireccion(cambio.getDireccion());
        listaContactos.get(c).setAlias(cambio.getAlias());     
    }
    public boolean anadir(Contacto c){
        int contador=0;
        for (int i = 0; i < listaContactos.size(); i++) {
            if(listaContactos.get(i).getTelefono1().equals(c.getTelefono1()) 
             ||listaContactos.get(i).getTelefono1().equals(c.getTelefono2()) && !"".equals(c.getTelefono2())
             ||listaContactos.get(i).getTelefono2().equals(c.getTelefono2()) && !"".equals(c.getTelefono2())
             ||listaContactos.get(i).getTelefono2().equals(c.getTelefono1()) && !"".equals(c.getTelefono1())){
                contador++;
            }   
        }
        if(contador==0){
            listaContactos.add(c);
            return true;
        }else{
            return false;
        }      
    }
    
}

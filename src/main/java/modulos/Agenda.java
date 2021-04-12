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
    public List<Contacto> listaContactos;

    public Agenda() {
        listaContactos =new ArrayList<>();
    }
    public void borrar(int posicion){
        listaContactos.remove(posicion);
    }
    public List<Contacto> getAgenda() {
        return listaContactos;
    }
    public String buscar(String busqueda){
        for (int i = 0; i < listaContactos.size(); i++) {
            if(busqueda.equals(listaContactos.get(i).getNombre()) 
              || buscarTelefonos(busqueda,i)
              || busqueda.equals(listaContactos.get(i).getDireccion())
              || busqueda.equals(listaContactos.get(i).getCorreo())
              || busqueda.equals(listaContactos.get(i).getAlias())){
                return listaContactos.get(i).toString();
            }
         }
        return null;
    }
    public boolean buscarTelefonos(String buscar,int posicion){
        Long numero=Long.parseLong(buscar);
          for (int i = 0; i < listaContactos.get(posicion).getTelefono1().size(); i++) {
            if(listaContactos.get(posicion).getTelefono1().get(i)==numero)
                return true;
           }
        return false;
    }
   
    public void editar(int c,Contacto cambio){
        listaContactos.get(c).setNombre(cambio.getNombre());
        listaContactos.get(c).setTelefono1(cambio.getTelefono1());
        listaContactos.get(c).setCorreo(cambio.getCorreo());
        listaContactos.get(c).setDireccion(cambio.getDireccion());
        listaContactos.get(c).setAlias(cambio.getAlias());     
    }
    public boolean anadir(Contacto c){
        int contador=0;
        for (int i = 0; i < listaContactos.size(); i++) {
            if(!listaContactos.get(i).CompararTelefonos(c)){
                contador++;
            }
        }
        System.out.println(contador);
        if(contador==listaContactos.size()){
            listaContactos.add(c);
            return true;
        }
            
        return false;
    }
    
    
}

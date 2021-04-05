/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modulos.Contacto;

/**
 *
 * @author jarol
 */
public class ModeloTabla extends DefaultTableModel{
    
    private final String[] columnas = {"Nombre", "Telefonos", "correo","Direccion", "Alias"};
    private List<Contacto> datos;

    public ModeloTabla(List<Contacto> datos) {
        this.datos = datos;
        super.setColumnIdentifiers(columnas);
    }

    public void setDatos(List<Contacto> datos) {
        this.datos = datos;
        actualizarDatos();
    }

    public void actualizarDatos() {
        fireTableDataChanged();
    }

    public Contacto getDato(int row) {
        return datos.get(row);
    }

    @Override
    public int getRowCount() {
        return datos == null ? 0 : datos.size();
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Contacto contacto = datos.get(row);
        switch (column) {
            case 0:
                return contacto.getNombre();
            case 1: 
                return contacto.getTelefono1()+" "+contacto.getTelefono2();
            case 2: 
                return contacto.getCorreo();
            case 3:
                return contacto.getDireccion();
            case 4: 
                return contacto.getAlias();
                
        }
        return super.getValueAt(row, column);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0: 
                return String.class;
            case 1:
                return String.class;
            case 2: 
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
        }
        return super.getColumnClass(column);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jarol
 */
public class archivos {

    public archivos() {}
    public void crearArchivo(){
    File archivo =new File("C:\\Users\\jarol\\Desktop\\Programacion 4\\Proyecto1Agenda\\src\\main\\java\\Archivos\\Agenda.txt");
           if(!archivo.exists()){
                try {
                    archivo.createNewFile();
                } catch (IOException ex) {
                    System.out.println("No se pudo crear el archivo");
                }
        }
    }
    public void escribirArchivo(Agenda agenda){
        try {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                fichero = new FileWriter("C:\\Users\\jarol\\Desktop\\Programacion 4\\Proyecto1Agenda\\src\\main\\java\\Archivos\\Agenda.txt");
                pw = new PrintWriter(fichero);
                for (int i = 0; i < agenda.getAgenda().size(); i++) {
                    String contacto = agenda.getAgenda().get(i).contactoArchivo();
                    for (int j = 0; j < contacto.length(); j++)
                        pw.print(contacto.charAt(j));
                    pw.println();
                }
            } catch (IOException ex) {
                System.out.println("No se pudo escribir");
            }
            fichero.close();  
        } catch (IOException ex) {
            System.out.println("No se pudo cerrar el fichero");
        }

    }
    
    public void leerArchivo(Agenda agenda){
      try {
           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jarol\\Desktop\\Programacion 4\\Proyecto1Agenda\\src\\main\\java\\Archivos\\Agenda.txt"));
           String lineaExtraida=br.readLine();
           while(lineaExtraida != null){
               //se extraen los datos
               String[] lista = lineaExtraida.split("\\;");
               String nombre= lista[0];
               //resto de datos
               String correo= lista[2];
               String direccion= lista[3];
               String alias= lista[4];
               //crear y agregar contacto
               String[] lista2 =lista[1].split("\\,");
               String telefono= lista2[0];
               String telefono1=lista2[1];
               Contacto contacto;
               contacto= new Contacto(nombre,telefono,telefono1.trim(),correo,direccion,alias);
               agenda.anadir(contacto);
               lineaExtraida = br.readLine();
           }
        } catch (IOException ex) {
            System.out.println("No se pudo leer");
        }
    }
}

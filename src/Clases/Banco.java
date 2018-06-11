/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author User-PC
 */
public class Banco {
   private String nombre;
   private int identificacion;
   private String Direccion;
   private int Telefono;

    public Banco(String nombre, int identificacion, String Direccion, int Telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }
   
   
    
    
    
}

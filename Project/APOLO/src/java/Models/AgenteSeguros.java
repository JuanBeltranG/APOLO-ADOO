/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author juan-
 */
public class AgenteSeguros {
    
    private String Nombre;
    private String Correo;
    private String Contra;
    private String Telefono;

    public AgenteSeguros(String Nombre, String Correo, String Contra, String Telefono) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contra = Contra;
        this.Telefono = Telefono;
    }
    
    
    

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }
    
    
    
}

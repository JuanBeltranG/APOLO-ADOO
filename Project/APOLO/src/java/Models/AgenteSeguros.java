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
    
    private int ID;
    private String Nombre;
    private String Correo;
    private String Contra;
    private String Telefono;
    private String sexo;
    private String DirOficina;
    

    public AgenteSeguros(String Nombre, String Correo, String Contra, String Telefono) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contra = Contra;
        this.Telefono = Telefono;
    }

    public AgenteSeguros(int ID, String Nombre, String Correo, String Contra, String Telefono, String sexo, String DirOficina) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contra = Contra;
        this.Telefono = Telefono;
        this.sexo = sexo;
        this.DirOficina = DirOficina;
    }

    
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

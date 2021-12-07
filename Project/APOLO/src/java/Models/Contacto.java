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
public class Contacto {
    

    private String Nombre;
    private String Apat;
    private String Amat;
        
    private String Correo;
    private String Direccion;
    private String Telefono;
    private int edad;
    private String Sexo;
    private String EstadoCivil;
    private int PolizasActivas;
    private String AnteceFinanci;
    private String AntecePenal;
    private String AnteceMed;

    
    public Contacto(String Nombre, String Apat, String Amat, String Correo, String Direccion, String Telefono, int edad, String Sexo, String EstadoCivil, int PolizasActivas, String AnteceFinanci, String AntecePenal, String AnteceMed) {
        this.Nombre = Nombre;
        this.Apat = Apat;
        this.Amat = Amat;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.edad = edad;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
        this.PolizasActivas = PolizasActivas;
        this.AnteceFinanci = AnteceFinanci;
        this.AntecePenal = AntecePenal;
        this.AnteceMed = AnteceMed;
    }
    
     

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApat() {
        return Apat;
    }

    public void setApat(String Apat) {
        this.Apat = Apat;
    }

    public String getAmat() {
        return Amat;
    }

    public void setAmat(String Amat) {
        this.Amat = Amat;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public int getPolizasActivas() {
        return PolizasActivas;
    }

    public void setPolizasActivas(int PolizasActivas) {
        this.PolizasActivas = PolizasActivas;
    }

    public String getAnteceFinanci() {
        return AnteceFinanci;
    }

    public void setAnteceFinanci(String AnteceFinanci) {
        this.AnteceFinanci = AnteceFinanci;
    }

    public String getAntecePenal() {
        return AntecePenal;
    }

    public void setAntecePenal(String AntecePenal) {
        this.AntecePenal = AntecePenal;
    }

    public String getAnteceMed() {
        return AnteceMed;
    }

    public void setAnteceMed(String AnteceMed) {
        this.AnteceMed = AnteceMed;
    }
    
}

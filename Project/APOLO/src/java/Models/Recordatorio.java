/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.Date;
/**
 *
 * @author danyv
 */
public class Recordatorio {
    private int Id_Recordatorio;
    private int Id_Agente;
    private String Nombre_Contacto;
    private Date Fecha_Limite;
    private String Texto_Recordatorio;

    public Recordatorio(int Id_Agente, String Nombre_Contacto, Date Fecha_Limite, String Texto_Recordatorio) {
        this.Id_Agente = Id_Agente;
        this.Nombre_Contacto = Nombre_Contacto;
        this.Fecha_Limite = Fecha_Limite;
        this.Texto_Recordatorio = Texto_Recordatorio;
    }

    public Recordatorio(int Id_Recordatorio, int Id_Agente, String Nombre_Contacto, Date Fecha_Limite, String Texto_Recordatorio) {
        this.Id_Recordatorio = Id_Recordatorio;
        this.Id_Agente = Id_Agente;
        this.Nombre_Contacto = Nombre_Contacto;
        this.Fecha_Limite = Fecha_Limite;
        this.Texto_Recordatorio = Texto_Recordatorio;
    }
    
    
    
    

    public int getId_Recordatorio() {
        return Id_Recordatorio;
    }

    public void setId_Recordatorio(int Id_Recordatorio) {
        this.Id_Recordatorio = Id_Recordatorio;
    }

    public int getId_Agente() {
        return Id_Agente;
    }

    public void setId_Agente(int Id_Agente) {
        this.Id_Agente = Id_Agente;
    }

    public String getNombre_Contacto() {
        return Nombre_Contacto;
    }

    public void setNombre_Contacto(String Nombre_Contacto) {
        this.Nombre_Contacto = Nombre_Contacto;
    }

    public Date getFecha_Limite() {
        return Fecha_Limite;
    }

    public void setFecha_Limite(Date Fecha_Limite) {
        this.Fecha_Limite = Fecha_Limite;
    }

    public String getTexto_Recordatorio() {
        return Texto_Recordatorio;
    }

    public void setTexto_Recordatorio(String Texto_Recordatorio) {
        this.Texto_Recordatorio = Texto_Recordatorio;
    }
    
    
}

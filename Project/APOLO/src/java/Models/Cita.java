package Models;

import java.sql.Date;

public class Cita {
    
    private int Id_Cita;
    private int Id_Contacto;
    private int Id_Agente;
    private String Tipo_Cita;
    private Date Fecha;
    private String Direccion_Cita;
    private String Proposito_Cita;
    private String Notas_Importantes;

    public Cita(int Id_Cita, int Id_Contacto, int Id_Agente, String Tipo_Cita, Date Fecha, String Direccion_Cita, String Proposito_Cita, String Notas_Importantes) {
        this.Id_Cita = Id_Cita;
        this.Id_Contacto = Id_Contacto;
        this.Id_Agente = Id_Agente;
        this.Tipo_Cita = Tipo_Cita;
        this.Fecha = Fecha;
        this.Direccion_Cita = Direccion_Cita;
        this.Proposito_Cita = Proposito_Cita;
        this.Notas_Importantes = Notas_Importantes;
    }

    public int getId_Cita() {
        return Id_Cita;
    }

    public void setId_Cita(int Id_Cita) {
        this.Id_Cita = Id_Cita;
    }

    public int getId_Contacto() {
        return Id_Contacto;
    }

    public void setId_Contacto(int Id_Contacto) {
        this.Id_Contacto = Id_Contacto;
    }

    public int getId_Agente() {
        return Id_Agente;
    }

    public void setId_Agente(int Id_Agente) {
        this.Id_Agente = Id_Agente;
    }

    public String getTipo_Cita() {
        return Tipo_Cita;
    }

    public void setTipo_Cita(String Tipo_Cita) {
        this.Tipo_Cita = Tipo_Cita;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDireccion_Cita() {
        return Direccion_Cita;
    }

    public void setDireccion_Cita(String Direccion_Cita) {
        this.Direccion_Cita = Direccion_Cita;
    }

    public String getProposito_Cita() {
        return Proposito_Cita;
    }

    public void setProposito_Cita(String Proposito_Cita) {
        this.Proposito_Cita = Proposito_Cita;
    }

    public String getNotas_Importantes() {
        return Notas_Importantes;
    }

    public void setNotas_Importantes(String Notas_Importantes) {
        this.Notas_Importantes = Notas_Importantes;
    }
    
}
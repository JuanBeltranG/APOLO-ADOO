package DAO;

import DBConection.ConexionBD;
import Models.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CitaDAO {
    
    private Connection conex = null;
    private PreparedStatement sta = null;
    private ResultSet resul = null;
    private final String registra = "call sp_registra_cita(?, ?, ?, ?, ?, ?, ?)";
    private final String elimina = "call sp_elimina_cita(?)";
    private final String actualiza = "call sp_actualiza_cita(?, ?, ?, ?, ?, ?)";
    private final String trae_varios = "call sp_trae_citas(?)";
    
    public int registraCita(Cita nueva_cita){
        int flag = 0;
        
        try{
            ConexionBD conecta = new ConexionBD();
            conex = conecta.getConectar();
            
            sta = conex.prepareCall(registra);
            sta.setInt(1, nueva_cita.getId_Agente());
            sta.setInt(2, nueva_cita.getId_Contacto());
            sta.setString(3, nueva_cita.getTipo_Cita());
            sta.setDate(4, nueva_cita.getFecha());
            sta.setString(5, nueva_cita.getDireccion_Cita());
            sta.setString(6, nueva_cita.getProposito_Cita());
            sta.setString(7, nueva_cita.getNotas_Importantes());
            
            resul = sta.executeQuery();
            
            if(resul.next())
                flag = resul.getInt(1);
            
            conex.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            flag = 0;
        }
        
        return flag;
    }
    
    public int eliminaCita(int Id_Cita){
        int flag = 0;
        
        try{
            ConexionBD conecta = new ConexionBD();
            conex = conecta.getConectar();
            
            sta = conex.prepareCall(registra);
            sta.setInt(1, nueva_cita.getId_Agente());
            sta.setInt(2, nueva_cita.getId_Contacto());
            sta.setString(3, nueva_cita.getTipo_Cita());
            sta.setDate(4, nueva_cita.getFecha());
            sta.setString(5, nueva_cita.getDireccion_Cita());
            sta.setString(6, nueva_cita.getProposito_Cita());
            sta.setString(7, nueva_cita.getNotas_Importantes());
            
            resul = sta.executeQuery();
            
            if(resul.next())
                flag = resul.getInt(1);
            
            conex.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            flag = 0;
        }
        
        return flag;
    }
}
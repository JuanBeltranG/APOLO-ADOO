package DAO;

import DBConection.ConexionBD;
import Models.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
            
            sta = conex.prepareCall(elimina);
            sta.setInt(1, Id_Cita);
            
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
    
    public int actualizaCita(Cita cita_actualizada){
        int flag = 0;
        
        try{
            ConexionBD conecta = new ConexionBD();
            conex = conecta.getConectar();
            
            sta = conex.prepareCall(actualiza);
            sta.setInt(1, cita_actualizada.getId_Cita());
            sta.setString(2, cita_actualizada.getTipo_Cita());
            sta.setDate(3, cita_actualizada.getFecha());
            sta.setString(4, cita_actualizada.getDireccion_Cita());
            sta.setString(5, cita_actualizada.getProposito_Cita());
            sta.setString(6, cita_actualizada.getNotas_Importantes());
            
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
    
    public ArrayList<Cita> traeVariasCitas(int Id_Agente){
        ArrayList<Cita> lista_citas = new ArrayList<>();
        
        try{
            ConexionBD conecta = new ConexionBD();
            conex = conecta.getConectar();
            
            sta = conex.prepareCall(trae_varios);
            sta.setInt(1, Id_Agente);
            
            resul = sta.executeQuery();
            
            while(resul.next())
                lista_citas.add(new Cita(resul.getInt(1), resul.getInt(2), resul.getInt(3), resul.getString(4),
                        resul.getDate(5), resul.getString(6), resul.getString(7), resul.getString(8)));
            
            conex.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lista_citas;
    }
}
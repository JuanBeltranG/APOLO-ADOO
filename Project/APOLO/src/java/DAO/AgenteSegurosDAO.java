/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBConection.ConexionBD;
import Models.AgenteSeguros;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juan-
 */
public class AgenteSegurosDAO {
    
    //Querys para el CRUD a la base de datos
     private final String GuardaAgente = "{call GuardaAgente(?,?,?,?)}";
     private final String InicioSesionAgente = "{call InicioSesionAgente(?,?)}";
     
     
     
     
    //Conexion a la base de datos
    private Connection cnx;
    ConexionBD Conexion = new ConexionBD();

    public AgenteSegurosDAO() {
        this.cnx = Conexion.getConectar();
    }
    
   
    //
    public boolean AltaAgente(AgenteSeguros nuevoAgente){
        
        ResultSet rs = null;
        CallableStatement st = null;
        boolean altaExitosa = false;
        
        try{
            st = cnx.prepareCall(GuardaAgente);
            st.setString(1, nuevoAgente.getNombre());
            st.setString(2, nuevoAgente.getCorreo());
            st.setString(3, nuevoAgente.getContra());
            st.setString(4, nuevoAgente.getTelefono());
        
            rs = st.executeQuery();
            altaExitosa = true;
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        
        return altaExitosa;
    }
    
    
    public boolean InicioSesionAgente(){
        
        boolean UsuarioRegistrado = false;
        
        
        
        
        
        
        
        return UsuarioRegistrado;
    }
    
    
}

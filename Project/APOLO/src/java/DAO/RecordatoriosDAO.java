/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBConection.ConexionBD;
import Models.AgenteSeguros;
import Models.Contacto;
import Models.Recordatorio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danyv
 */
public class RecordatoriosDAO {
    
    //Querys para el CRUD a la base de datos
    private final String GuardaRecordatorio = "{call GuardaRecordatorio(?,?,?,?)}";
    private final String ConsultaRecordatorios = "{call ConsultaRecordatorios(?)}";
   
    //Conexion a la base de datos
    private Connection cnx;
    ConexionBD Conexion = new ConexionBD();

    public RecordatoriosDAO() {
        this.cnx = Conexion.getConectar();
    }

    //
    public boolean AltaRecordatorio(Recordatorio nuevoRecordatorio) {

        ResultSet rs = null;
        CallableStatement st = null;
        boolean altaExitosa = false;

        try {
            st = cnx.prepareCall(GuardaRecordatorio);
            st.setString(1, nuevoRecordatorio.getNombre_Contacto());
            st.setString(2, nuevoRecordatorio.getTexto_Recordatorio());
            st.setDate(3, nuevoRecordatorio.getFecha_Limite());
            st.setInt(4, nuevoRecordatorio.getId_Agente());

            rs = st.executeQuery();
            altaExitosa = true;

        } catch (SQLException ex) {
            System.out.println("EL ERROR DE LA BASE DE DATOS ES"+ ex);
        }

        return altaExitosa;
    }
    
    
    public List<Recordatorio> ConsultarRecordatorios(int IDAgente){
        
        ResultSet rs = null;
        CallableStatement st = null;
        List<Recordatorio> recordatorios = new ArrayList<>();
        
        try {
            st = cnx.prepareCall(ConsultaRecordatorios);
            st.setInt(1, IDAgente);
            
            rs = st.executeQuery();
            while (rs.next()) {
                recordatorios.add((ConvertirRecordatorio(rs)));
            }

        } catch (SQLException ex) {
            System.out.println("El error ocurrido fue: " +ex);
        }
        
        return recordatorios;
        
    }
    
    private Recordatorio ConvertirRecordatorio(ResultSet rs) throws SQLException{
        Recordatorio rec = new Recordatorio(
            rs.getInt("Id_Recordatorio"),
            rs.getInt("Id_Agente"),
            rs.getString("Nombre_Contacto"),
            rs.getDate("Fecha_Limite"),
            rs.getString("Texto_Recordatorio")
        );
        
        return rec;
    }

}

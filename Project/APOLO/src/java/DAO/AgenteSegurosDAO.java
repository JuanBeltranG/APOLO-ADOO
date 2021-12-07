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
    private final String ConsultaRegistro = "{call ConsultaRegistro(?,?)}";
    private final String ConsultaDatosAgente = "{call ConsultaDatosAgente(?,?)}";

    //Conexion a la base de datos
    private Connection cnx;
    ConexionBD Conexion = new ConexionBD();

    public AgenteSegurosDAO() {
        this.cnx = Conexion.getConectar();
    }

    //
    public boolean AltaAgente(AgenteSeguros nuevoAgente) {

        ResultSet rs = null;
        CallableStatement st = null;
        boolean altaExitosa = false;

        try {
            st = cnx.prepareCall(GuardaAgente);
            st.setString(1, nuevoAgente.getNombre());
            st.setString(2, nuevoAgente.getCorreo());
            st.setString(3, nuevoAgente.getContra());
            st.setString(4, nuevoAgente.getTelefono());

            rs = st.executeQuery();
            altaExitosa = true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return altaExitosa;
    }

    public boolean ConsultaUsuarioRegistrado(String correo, String contraseña) {

        boolean UsuarioRegistrado = false;

        ResultSet rs = null;
        CallableStatement st = null;

        try {
            st = cnx.prepareCall(ConsultaRegistro);
            st.setString(1, correo);
            st.setString(2, contraseña);
            rs = st.executeQuery();
            if (rs.next()) {
                UsuarioRegistrado = true;
            }

        } catch (SQLException e) {

            System.out.println("La excepcion fue: " + e);

        }

        return UsuarioRegistrado;
    }

    public AgenteSeguros ConsultaAgente(String correo, String contraseña) {

        ResultSet rs = null;
        CallableStatement st = null;
        AgenteSeguros InfoAgente = null;

        try {

            st = cnx.prepareCall(ConsultaDatosAgente);
            st.setString(1, correo);
            st.setString(2, contraseña);
           
            rs = st.executeQuery();

            if (rs.next()) {
                InfoAgente = ConvertirInfoAgente(rs);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return InfoAgente;

    }
    
    private AgenteSeguros ConvertirInfoAgente(ResultSet rs)throws SQLException{
        
        AgenteSeguros Info = new AgenteSeguros(rs.getInt("Id_Agente"),rs.getString("Nombre_Agente"), rs.getString("Email"), rs.getString("Contra"), rs.getString("Telefono"), rs.getString("Sexo"), rs.getString("Dir_Oficina")); 
        return Info;    
    }
    
    

}

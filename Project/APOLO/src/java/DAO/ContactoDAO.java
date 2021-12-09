/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBConection.ConexionBD;
import Models.Contacto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan-
 */
public class ContactoDAO {
    
    private final String GuardaContacto = "{call GuardaContacto(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
    private final String ConsultaContactos = "{call ConsultaContactos(?)}";
    private final String trae_todos_de_agente = "select * from apolo.contacto where binary apolo.contacto.Id_Agente = ?;";
    
    
    private Connection cnx;
    ConexionBD Conexion = new ConexionBD();
    
    private Connection conex = null;
    private PreparedStatement sta = null;
    private ResultSet resul = null;

    public ContactoDAO() {
        this.cnx = Conexion.getConectar();
    }
    
    public boolean AltaContacto(String correoAgente, Contacto contac){
        
        ResultSet rs = null;
        CallableStatement st = null;
        boolean RegistroExitoso = false;
        
        try {
            st = cnx.prepareCall(GuardaContacto);
            st.setString(1, correoAgente);
            st.setString(2, contac.getNombre());
            st.setString(3, contac.getApat() );
            st.setString(4, contac.getApat());
            st.setString(5, contac.getCorreo());
            st.setString(6,contac.getDireccion() );
            st.setString(7,contac.getTelefono());
            st.setInt(8, contac.getEdad());
            st.setString(9, contac.getSexo());
            st.setString(10, contac.getEstadoCivil());
            st.setInt(11, contac.getPolizasActivas());
            st.setString(12, contac.getAnteceFinanci());
            st.setString(13, contac.getAntecePenal());
            st.setString(14, contac.getAnteceMed());
            
            rs = st.executeQuery();
            
            RegistroExitoso = true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        
        return RegistroExitoso;
    }
    
    
    public List<Contacto> ConsultaContactos(int IDAgente){
        
        ResultSet rs = null;
        CallableStatement st = null;
        List<Contacto> contactos = new ArrayList<>();
        
        try {
            st = cnx.prepareCall(ConsultaContactos);
            st.setInt(1, IDAgente);
            
            rs = st.executeQuery();
            while (rs.next()) {
                contactos.add((ConvertirContacto(rs)));
            }

        } catch (SQLException ex) {
            System.out.println("El error ocurrido fue: " +ex);
        }
        
        return contactos;
    }
    
    private Contacto ConvertirContacto(ResultSet rs) throws SQLException{
        Contacto c = new Contacto(
            rs.getInt("Id_Contacto"),
            rs.getInt("Id_Agente"),
            rs.getString("Nombre_Contacto"),
            rs.getString("ApellidoP_Contacto"),
            rs.getString("ApellidoM_Contacto"),
            rs.getString("Correo"),
            rs.getString("Direccion"),
            rs.getString("Telefono"),
            rs.getInt("Edad"),
            rs.getString("Sexo"),
            rs.getString("Estado_Civil"),
            rs.getInt("Polizas_Activas"),
            rs.getString("Antecedentes_Financieros"),
            rs.getString("Antecedentes_Penales"),
            rs.getString("Antecedentes_Medicos")
        );
        
        return c;
    }
    
    public ArrayList<Contacto> todosContactosAgente(int Id_Agente){
        ArrayList<Contacto> lista_contactos = new ArrayList<>();
        
        try{
            ConexionBD conecta = new ConexionBD();
            conex = conecta.getConectar();
            
            sta = conex.prepareCall(trae_todos_de_agente);
            sta.setInt(1, Id_Agente);
            
            resul = sta.executeQuery();
            
            while(resul.next())
                lista_contactos.add(new Contacto(resul.getInt(1), resul.getInt(2), resul.getString(3), resul.getString(4),
                        resul.getString(5), resul.getString(6), resul.getString(7), resul.getString(8), resul.getInt(9),
                        resul.getString(10), resul.getString(11), resul.getInt(12), resul.getString(13), resul.getString(14),
                        resul.getString(15)));
            
            conex.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lista_contactos;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private Connection Conectar;


    public ConexionBD() {

        String server = "localhost";
        String baseDatos = "APOLO";
        String usr = "root";
<<<<<<< HEAD
        String pswd = "28062001**gar";
        String url = "jdbc:mysql://"+server+"/"+baseDatos;
=======
        String pswd = "dany1905";
        //String url = "jdbc:mysql://"+server+"/"+baseDatos;
        String url = "jdbc:mysql://"+server+"/"+baseDatos+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
>>>>>>> b3a68657f44058286668ec9dce19acb795f5c647

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Conectar = DriverManager.getConnection(url,usr,pswd);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {

        }
    }
    
    public Connection getConectar() {
        return Conectar;
    }
    
    public void cerrarConectar() throws SQLException{
        Conectar.close();
    }
    
}


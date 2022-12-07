
package com.emergentes.utiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Validate extends ConexionDB {
    Connection conn = this.Conectar();
    PreparedStatement pr;
    
    public boolean checkUser(String usuario,String password){
        
            boolean resultado = false;
            try {
            String sql = "select * from usuario where usuario = ? and password=(?)";
            
            pr = conn.prepareStatement(sql);
            pr.setString(1, usuario);
            pr.setString(2, password);
            ResultSet rs = pr.executeQuery();
            resultado = rs.next();
            
            return resultado;
        } catch (SQLException ex) {
                System.out.println("Error al autenticar");
        }
        return resultado;
    }
    
}

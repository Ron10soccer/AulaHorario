
package com.emergentes.utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
     static String url = "jdbc:mysql://localhost:3306/horario_aulas";
    static String driver="com.mysql.cj.jdbc.Driver";
    static String usuario="root";
    static String password="";
    
    protected Connection conn = null;

    public ConexionDB() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
            if(conn != null){
                System.out.println("Conexion Exitosa "+ conn);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en Driver "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro al conectar "+ ex.getMessage());
            }
    }
        //metodo para devover la conexion
        public Connection Conectar()
        {
            return conn;
        }
        public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrae "+ex.getMessage());
           }
        }
}

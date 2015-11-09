/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.quemado.datos;

/**
 *
 * @author Jotate
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class quemadoDatos {
    String dbDriver = "org.apache.derby.jdbc.ClientDriver";
    String dbUri = "jdbc:derby://localhost:1527/JuegoQuemado";
        String dbUser = "monoquemado";
        String dbPass = "monoquemado";
        protected Connection conexion = null;
    protected PreparedStatement pstmt = null;
    protected Statement stmt = null;
    protected ResultSet rs = null;
    protected StringBuilder query = null;
    
    public quemadoDatos(){
    try {
            Class.forName(dbDriver).newInstance();
            conexion = DriverManager.getConnection(
                    dbUri, dbUser, dbPass);

        } catch (Exception ex) {
            throw new Error("error en la conexion",ex);
        }
    }
    
}

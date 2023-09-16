/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.ii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Prof. Nery
 */
public class Conexion{
    Connection con;
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio", "root", "1234");
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("No se pudo realizar la conexion a la base de Datos intentalo de nuevo "+ e);
        }
    }
    public Connection gertConnection(){
        return con;
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo.accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Conexion {
    
    private Connection con = null;
    
    /**
     *
     * @param hostBD
     * @param nombreBD
     * @param certificadoHOST
     * @param usuarioBD
     * @param contrasenaBD
     * @return
     */
    final String hostBD          = "jdbc:mysql://sql10.freemysqlhosting.net/";
    final String nombreBD        = "sql10284899"; 
    final String certificadoHOST ="?useTimezone=true&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";
    final String usuarioBD       = "sql10284899";
    final String contrasenaBD    = "jJ4qkmpksM"; 

    public Connection getConexion(){ 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection( this.hostBD+this.nombreBD+this.certificadoHOST,this.usuarioBD,this.contrasenaBD );
//            System.out.println( "Conexion exitosa a BD: "+this.nombreBD);
        } catch(SQLException e){
            System.err.println(e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Revice su el servidor de Base de Datos");
        }
      return con;  
    } 
}

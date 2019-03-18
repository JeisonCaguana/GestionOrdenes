/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codigovago.modelo.accesoDatos;

import com.codigovago.modelo.Empleado;
import com.codigovago.modelo.Usuario;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Empleados extends Conexion{
    
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    Connection conexion = getConexion();
    
    public boolean registrarEmpleado( Empleado empleado ) {
        String query = "INSERT INTO empleado (emp_codigo,emp_id,emp_cargo,emp_nombre,emp_apellido,emp_telefono,emp_direccion,emp_correo,emp_turno) VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            ps = conexion.prepareStatement( query );
            ps.setInt(1, empleado.getEmp_codigo());
            ps.setString( 2, empleado.getEmp_id()); 
            ps.setString( 3, empleado.getEmp_cargo()); 
            ps.setString( 4, empleado.getEmp_nombre()); 
            ps.setString( 5, empleado.getEmp_apellido()); 
            ps.setString( 6, empleado.getEmp_telefono()); 
            ps.setString( 7, empleado.getEmp_direccion()); 
            ps.setString( 8, empleado.getEmp_correo());
            ps.setString( 9, empleado.getEmp_turno());
            ps.execute();
            registroUsuario( empleado );
            return true;
        } catch (SQLException evt) {
            System.out.println( evt.toString() );
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException evt) {
                System.out.println( evt.toString() );
            }
        }
    }    
    public boolean registroUsuario( Empleado empleado ){
        String query = "INSERT INTO usuario (emp_codigo,usu_cargo,usu_usuario) VALUES(?,?,?);";
        
            String usuario_uss="";
            char buf[] = new char[1];         
            
            usuario_uss+=empleado.getEmp_nombre().charAt(0);
            StringTokenizer nuevoUsuario=  new StringTokenizer(empleado.getEmp_apellido());
            while (nuevoUsuario.hasMoreElements()){
                usuario_uss+= nuevoUsuario.nextElement();
                break;
            }
            usuario_uss+=empleado.getEmp_codigo();
            //md5
        try {
            ps = conexion.prepareStatement( query );
            ps.setInt(1, empleado.getEmp_codigo());  
            ps.setString( 2, empleado.getEmp_cargo());
            ps.setString( 3, usuario_uss.toLowerCase()); 
            ps.execute();
            return true;
        } catch (SQLException evt) {
            System.out.println( evt.toString() );
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException evt) {
                System.out.println( evt.toString() );
            }
        } 
    }
    public String buscarDatosUsuario(int codigoEmpleado ){ 
        String query = "SELECT emp_nombre,emp_apellido,emp_turno FROM empleado WHERE emp_codigo = '"+codigoEmpleado+"' LIMIT 1;";
        String nombre="";
        try {  
            ps = conexion.prepareStatement( query );   
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                 StringTokenizer primerNombre =  new StringTokenizer( rs.getString(1) );
                 StringTokenizer primerApellido =  new StringTokenizer( rs.getString(2) );
                while (primerNombre.hasMoreElements() && primerApellido.hasMoreElements()){
                    nombre+= primerNombre.nextElement()+" "+primerApellido.nextElement();
                    break;
                } 
            }
            return nombre;
            
        } catch (SQLException ex) {
            System.out.println( ex.toString() );
        } 
        return null;
    }

    public String buscarApellido(String correo) {
        String query = "SELECT emp_apellido FROM empleado WHERE emp_correo = '" + correo + "' LIMIT 1;";
//        String[] datos = new String[2];
        String apellido = "";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {

                StringTokenizer primerApellido = new StringTokenizer(rs.getString(1));
                while (primerApellido.hasMoreElements()) {
                    apellido += primerApellido.nextElement();
                    //System.out.println(apellido);
                    break;
                }
            }
            return apellido;

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public int buscarCodigoEmp(String correo) {
        String query = "SELECT emp_codigo FROM empleado WHERE emp_correo = '" + correo + "' LIMIT 1;";
        int id = 0;
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            return id;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return id;
        }
    }

    public int numRandom() {
        return (int) (Math.random() * 99 + 1);
    }
    
    
    public String buscarUsuario(String empCodigo) {
        String query = "SELECT usu_usuario FROM usuario WHERE emp_codigo = '" + empCodigo + "' LIMIT 1;";
        
        String respuesta = "";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                respuesta = rs.getString(1);
            }
            return respuesta;
        } catch (SQLException ex) {
        }
        return respuesta;
    }
    
    public String buscarClave(String usuUsu) {
        String query = "SELECT usu_contrasena FROM usuario WHERE usu_usuario = '" + usuUsu + "' LIMIT 1;";
        
        String respuesta = "";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                respuesta = rs.getString(1);
            }
            return respuesta;
        } catch (SQLException ex) {
        }
        return respuesta;
    }
    
    public void cambioClaveUsu(String claveNueva1, String idEmp) {
        //System.out.println(buscarUsuario(idEmp)+" <:");
        String query = "UPDATE usuario SET usu_contrasena='"+claveNueva1+"'WHERE usu_usuario='"+buscarUsuario(idEmp)+"';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            System.out.println(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

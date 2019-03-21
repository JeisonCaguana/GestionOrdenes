/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo.accesoDatos;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.Empleado;
import com.codigovago.modelo.Usuario;
import com.codigovago.vista.FrmMesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class Login extends Conexion {

    static CorreoElectronico correo = new CorreoElectronico();
    static Roles roles = new Roles();

    public boolean buscarUsuario(String usuario, String clave) {
        String query = "SELECT usu_codigo,usu_usuario,usu_contrasena,usu_cargo FROM usuario WHERE usu_usuario = '" + usuario + "' AND usu_contrasena = '" + clave + "'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean ban = false;
        Connection conexion = getConexion();
        String uss = "";
        String pass = "";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                uss = rs.getString(2);
                pass = rs.getString(3);
            }
            if (usuario.equals(uss) && clave.equals(pass)) {
                int codigo = rs.getInt(1);
                String cargo = rs.getString(4);
                roles.rolesUsuario(codigo, cargo);
                ban = true;
            }
        } catch (SQLException ex) {
            ban = false;
        }
        return ban;
    }
}
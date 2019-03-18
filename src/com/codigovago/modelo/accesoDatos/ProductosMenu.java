/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo.accesoDatos;

import com.codigovago.modelo.ProductoMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class ProductosMenu extends Conexion {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conexion = getConexion();

    public String listaProductoMenu(String seccion) {
        String query = "SELECT prm_nombre FROM producto_menu WHERE seccion ='" + seccion + "' AND prm_disponibilidad='si';";
        String[] datos = new String[1];
        String comboBox = "";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboBox += datos[0] = rs.getString(1) + ",";
            }
            return comboBox;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return "Sin acceso a datos";
    }

    public int ultimoRegistro() {
        String query = "SELECT MAX(ped_codigo) AS ped_codigo FROM pedido;";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (rs.getInt(1) + 1);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return 0;
    }

    public boolean registarMenu(int ped_codigo, String prm_nombre, String det_especificaciones, int det_cantidad,String seccion) {
        double precio = listaPrecioMenu(prm_nombre);
        String query = "INSERT INTO detalle_producto_menu (det_codigo,ped_codigo,prm_nombre,fac_codigo,det_especificaciones,det_cantidad,prm_codigo,precio,seccion) VALUES(null,'" + ped_codigo + "','" + prm_nombre + "',null,'" + det_especificaciones + "'," + det_cantidad + ",null," + precio + ",'"+seccion+"');";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            return true;
        } catch (SQLException evt) {
            System.out.println(evt.getMessage());
            return false;
        }
    }

    public double listaPrecioMenu(String prm_nombre) {
        String query = "SELECT precio FROM producto_menu WHERE prm_nombre ='" + prm_nombre + "' AND prm_disponibilidad='si';";
        double precio = 0.0;
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                precio = Double.parseDouble(rs.getString(1));
            }
            return precio;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return precio;
    }
    public int quitaProductoMenu(String prm_nombre) {
        int ban = 0;
        String query = "DELETE FROM detalle_producto_menu WHERE prm_nombre ='" + prm_nombre + "';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            return ban = 1;
        } catch (SQLException evt) {
            return ban = 0;
        }
    }
    public int actualizaComanda(String prm_nombre, String det_especificaciones, int det_cantidad,int ped_codigo) {
        int ban = 0;
        String query = "UPDATE detalle_producto_menu SET prm_nombre='" + prm_nombre + "',det_especificaciones='" + det_especificaciones + "',det_cantidad='" + det_cantidad + "' WHERE ped_codigo='" + ped_codigo + "';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            return ban = 1;
        } catch (SQLException evt) {
            return ban = 0;
        }
    }
    public int detallaComanda(int ped_codigo) {
        int ban = 0;
        String query = "SELECT det_codigo,det_cantidad,det_especificaciones FROM detalle_producto_menu WHERE ped_codigo='" + ped_codigo + "';";
        String acu  = "";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            while (rs.next()) {
                acu+= rs.getString(1); 
                acu+= rs.getString(2); 
                acu+= rs.getString(3);
            }
            return ban = 1;
        } catch (SQLException evt) {
            return ban = 0;
        }
    }
    
}

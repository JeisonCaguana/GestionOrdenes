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
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class ProductosMenu extends Conexion {
   
    public String listaProductoMenu(String seccion) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String[] datos = new String[1];
        String productos = null;        
        String query = "SELECT prm_nombre FROM producto_menu WHERE seccion ='" + seccion + "' AND prm_disponibilidad='si';";
        
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                productos += datos[0] = rs.getString(1) + ",";
            }
            return productos;
        } catch (SQLException ex) {
            ex.toString();
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
        return productos;
    }
    public int ultimoRegistro() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        int ban = 0;
        String query = "SELECT MAX(ped_codigo) AS ped_codigo FROM pedido;";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ban = (rs.getInt(1) + 1);
            }
            return ban;
        } catch (SQLException e) {
            e.getMessage();
            return ban;
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        } 
    }
    public boolean registarMenu(int ped_codigo, String prm_nombre, String det_especificaciones, int det_cantidad,String seccion) {
        PreparedStatement ps = null; 
        Connection conexion = getConexion();
        boolean ban = false;
        double precio = listaPrecioMenu(prm_nombre);
        String query = "INSERT INTO detalle_producto_menu (det_codigo,ped_codigo,prm_nombre,fac_codigo,det_especificaciones,det_cantidad,prm_codigo,precio,seccion) VALUES(null,'" + ped_codigo + "','" + prm_nombre + "',null,'" + det_especificaciones + "'," + det_cantidad + ",null," + precio + ",'"+seccion+"');";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            ban = true;
            return ban = true;
        } catch (SQLException evt) {
            System.out.println(evt.getMessage());
            ban = false;
            return ban;
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
        //cerrar objtos....................................................................
    }
    public int existeDetallePedido(int ped_codigo, String prm_nombre){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int ban = 0;
        String sql = "SELECT count(det_codigo) FROM detalle_producto_menu WHERE ped_codigo = '"+ped_codigo+"' AND prm_nombre='"+prm_nombre+"'";
        try {
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            if (rs.next()) {
                ban = rs.getInt(1);
            } 
            return ban;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return ban;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    public double listaPrecioMenu(String prm_nombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        String query = "SELECT precio FROM producto_menu WHERE prm_nombre ='" + prm_nombre + "' AND prm_disponibilidad='si';";
        double precio = 0;
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                precio = Double.parseDouble(rs.getString(1));
            }
            return precio;
        } catch (SQLException ex) {
            ex.toString();
            return precio;
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public boolean quitaProductoMenu(String prm_nombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        boolean ban =false;
        String query = "DELETE FROM detalle_producto_menu WHERE prm_nombre ='" + prm_nombre + "';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            return true;
        } catch (SQLException evt) {
            evt.getMessage();
            return ban;
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public boolean actualizaComanda(String prm_nombre, String det_especificaciones, int det_cantidad,int ped_codigo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
        boolean ban = false;
        String query = "UPDATE detalle_producto_menu SET prm_nombre='" + prm_nombre + "',det_especificaciones='" + det_especificaciones + "',det_cantidad='" + det_cantidad + "' WHERE prm_nombre='" + prm_nombre + "';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
            ban = true;
            return ban;
        } catch (SQLException evt) {
            return ban;
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public int detallaComanda(int ped_codigo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = getConexion();
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

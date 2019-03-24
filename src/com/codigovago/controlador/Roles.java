/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.controlador;


import com.codigovago.vista.FrmComandas;
import com.codigovago.vista.FrmLogin;
import com.codigovago.vista.FrmMesa;
import com.codigovago.vista.FrmPlato;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class Roles {

    public static int idEmpleado;

    public void index() {
        FrmLogin FrmLogin = new FrmLogin();
        FrmLogin.setVisible(true);
    }

    public void rolMesero() {
        FrmMesa FrmMesa = new FrmMesa();
        FrmMesa.setVisible(true);
    }
    public void comanda() {
        FrmComandas FrmPedido = new FrmComandas();
        FrmPedido.setVisible(true);
    }
    

    public void rolChef() {
        JOptionPane.showMessageDialog(null, "Interfaz Chef");
    }

    public void rolesUsuario(int id, String Cargo) {
        switch (Cargo) {
            case "Mesero":
                Roles.idEmpleado =id;
                rolMesero(); 
                break;
            case "Chef":
                rolChef();
                break;
            default:
                JOptionPane.showMessageDialog(null, "error");
                break;
        }
    }
    
    public void productosMenu() {
        FrmPlato FrmPlato = new FrmPlato();
        FrmPlato.setVisible(true);
    }
    
    
}

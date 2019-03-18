/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.accesoDatos.Empleados;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON
 */
public class FrmPerfil extends javax.swing.JFrame {

    /**
     * Creates new form FrnPerfil
     */

    Empleados empleados = new Empleados();
    
    public FrmPerfil() {
        this.setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnActualizarClave = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        pass0 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/usuario1.png"))); // NOI18N
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 144, 145));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cédula: 1724196423");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres: Paola Alexandra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos: Villa Pullay");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono: 0983470330");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección: El Manantial");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Nueva contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("Confirme contraseña");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setText("Cambiar Contraseña");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        btnActualizarClave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnActualizarClave.setText("Aceptar");
        btnActualizarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 60, 40));

        lblCorreo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 260, 20));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Escriba su contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 200, -1));
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 200, -1));
        getContentPane().add(pass0, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 200, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/fondo2.png"))); // NOI18N
        jLabel13.setText("Escriba su contraseña");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        FrmMesa mesa = new FrmMesa();
        mesa.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClaveActionPerformed
        char[] claveActual = pass0.getPassword();
        char[] claveNueva = pass1.getPassword();
        char[] claveNuevaConfirmada = pass2.getPassword();
        String claveActualOk = new String(claveActual);
        String claveNuevaOk = new String(claveNueva);
        String claveNuevaConfirmadaOk = new String(claveNuevaConfirmada);

        String id = "" + FrmMesa.idEmp;
        String usuario = empleados.buscarUsuario(id);
        String claveEncontrada = empleados.buscarClave(usuario);

        if (claveActualOk.equals(claveEncontrada)) {
            if (claveNuevaOk.equals(claveNuevaConfirmadaOk)) {
                empleados.cambioClaveUsu(claveNuevaOk, id);
                JOptionPane.showMessageDialog(null, "Su contraseña se ha cambiado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña actual no es correcta");
        }
    }//GEN-LAST:event_btnActualizarClaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarClave;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPasswordField pass0;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    // End of variables declaration//GEN-END:variables
}

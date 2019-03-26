/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.accesoDatos.Conexion;
import com.codigovago.modelo.accesoDatos.Empleados;
import static com.codigovago.vista.FrmMesa.idEmp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON
 */
public final class FrmPerfil extends javax.swing.JFrame {

    /**
     * Creates new form FrnPerfil
     */
    Empleados empleados = new Empleados();
    FrmMesa FrmMesa = new FrmMesa();
        public FrmPerfil() {
        this.setUndecorated(true);
        initComponents();
        buscarDatosUsuario(FrmMesa.idEmp);
    }

    public void buscarDatosUsuario(int emp_codigo) {
        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = cn.getConexion();
        String nombre = "";
        String query = "SELECT emp_nombre,emp_apellido,emp_id,emp_telefono,emp_direccion,emp_correo FROM empleado WHERE emp_codigo = '" + emp_codigo + "' LIMIT 1;";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                StringTokenizer primerNombre = new StringTokenizer(rs.getString(1));
                StringTokenizer primerApellido = new StringTokenizer(rs.getString(2));
                while (primerNombre.hasMoreElements() && primerApellido.hasMoreElements()) {
                    nombre += primerNombre.nextElement() + " " + primerApellido.nextElement();
                    break;
                }
                lblNombre.setText(   "Nombre: "+nombre);
                lblCedula.setText(   "Cédula: "+rs.getString(3));
                lblTelefono.setText( "Teléfono: "+rs.getString(4));
                lblDireccion.setText("Dirección: "+rs.getString(5));
                lblCorreo.setText(   "Correo: "+rs.getString(6));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnActualizarClave = new javax.swing.JButton();
        txtConfirmeContrasena = new javax.swing.JPasswordField();
        txtNuevaContrasena = new javax.swing.JPasswordField();
        txtContrasenaActual = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        txtRuta.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/descarga.png"))); // NOI18N
        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 170));

        lblCedula.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cédula: 099999999");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 190, -1));

        lblNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre: Admin");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 270, 20));

        lblTelefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono: 0983470330");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Dirección: El Manantial");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo: alexavilla123@gmail.com");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 60, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N
        jPanel1.setOpaque(false);

        btnActualizarClave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnActualizarClave.setText("Actualizar");
        btnActualizarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClaveActionPerformed(evt);
            }
        });

        txtNuevaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaContrasenaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Contraseña Actual");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Nueva contraseña");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("Confirme contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarClave)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addComponent(btnActualizarClave)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 380, 210));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/perfil.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClaveActionPerformed
        char[] claveActual = txtContrasenaActual.getPassword();
        char[] claveNueva = txtNuevaContrasena.getPassword();
        char[] claveNuevaConfirmada = txtConfirmeContrasena.getPassword();
        String claveActualOk = new String(claveActual);
        String claveNuevaOk = new String(claveNueva);
        String claveNuevaConfirmadaOk = new String(claveNuevaConfirmada);

        ImageIcon error = new ImageIcon(getClass().getResource("../assets/icons/error.png"));
        ImageIcon alerta = new ImageIcon(getClass().getResource("../assets/icons/alerta.png"));

        String id = "" + FrmMesa.idEmp;
        String usuario = empleados.buscarUsuario(id);
        String claveEncontrada = empleados.buscarClave(usuario);

        if (claveActualOk.equals(claveEncontrada)) {
            if (claveNuevaOk.equals(claveNuevaConfirmadaOk)) {
                empleados.cambioClaveUsu(claveNuevaOk, id);
                JOptionPane.showMessageDialog(null, "Su contraseña se ha cambiado con éxito", "REINTENTE!!", JOptionPane.PLAIN_MESSAGE, error);
                limpiearCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error!!", JOptionPane.PLAIN_MESSAGE, error);
                limpiearCajas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña actual no es correcta", "Error!!", JOptionPane.PLAIN_MESSAGE, error);
            limpiearCajas();
        }
        error = null;
        alerta = null;
    }//GEN-LAST:event_btnActualizarClaveActionPerformed

    void limpiearCajas() {
        txtContrasenaActual.setText("");
        txtConfirmeContrasena.setText("");
        txtNuevaContrasena.setText("");
    }
    private void txtNuevaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaContrasenaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarClave;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPasswordField txtConfirmeContrasena;
    private javax.swing.JPasswordField txtContrasenaActual;
    private javax.swing.JPasswordField txtNuevaContrasena;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}

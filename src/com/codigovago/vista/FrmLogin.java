package com.codigovago.vista;

import com.codigovago.modelo.Usuario;
import com.codigovago.modelo.accesoDatos.Login;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    static Login login = new Login();
    Usuario usuario = new Usuario();

    public FrmLogin() {
        this.setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnOlvideClave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("jcaguana1");
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setOpaque(false);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 320, 40));

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        txtClave.setForeground(new java.awt.Color(255, 255, 255));
        txtClave.setText("Caguana60");
        txtClave.setBorder(null);
        txtClave.setCaretColor(new java.awt.Color(255, 255, 255));
        txtClave.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtClave.setOpaque(false);
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 340, 40));

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/botonIniciarSecion.png"))); // NOI18N
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 310, 80));

        btnOlvideClave.setBorder(null);
        btnOlvideClave.setContentAreaFilled(false);
        btnOlvideClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvideClaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvideClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 300, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Olvidaste tu contraseña?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, -1, 30));

        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/loginIster.JPG"))); // NOI18N
        getContentPane().add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 910));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        ImageIcon error = new ImageIcon(getClass().getResource("../assets/icons/error.png"));
        ImageIcon alerta = new ImageIcon(getClass().getResource("../assets/icons/alerta.png"));
        char[] clave = txtClave.getPassword();
        String clave1 = new String(clave);
        if (txtUsuario.getText().equals("") || clave1.equals("")) {
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos..","Alerta",JOptionPane.PLAIN_MESSAGE, alerta);
        } else {
            usuario.setUsuario_uss(txtUsuario.getText());
            usuario.setClave_uss(clave1);
            if (login.buscarUsuario(txtUsuario.getText(), clave1)) {
            this.setVisible(false);}
            else{
                JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos","REINTENTE!!",JOptionPane.PLAIN_MESSAGE, error);
                txtUsuario.setText("");
                txtClave.setText("");
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnOlvideClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvideClaveActionPerformed
        FrmCorreo ventana = new FrmCorreo();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnOlvideClaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnOlvideClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

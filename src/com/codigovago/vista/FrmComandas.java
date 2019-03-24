/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;
 
import com.codigovago.controlador.Roles;
import com.codigovago.modelo.Fecha; 
import com.codigovago.modelo.Hora;
import com.codigovago.modelo.accesoDatos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEISON
 */
public final class FrmComandas extends javax.swing.JFrame {

    /**
     * Creates new form FrmPedido
     */
    Hora hora;
    Fecha fecha;
    Conexion cn = new Conexion();
    Connection conexion = cn.getConexion();
    Roles Roles = new Roles();
    
    public FrmComandas() {
        this.setUndecorated(true);
        initComponents();
        componentes();

    }

    void componentes() {
        lblPedido.setText("# 000" + FrmPlato.numPedido);
        lblMesa.setText("" + FrmPlato.numMesa);
        horaComanda();
        fechaComanda();
        lblMesero.setText("" + FrmPlato.buscaDatosUsuario);
        comandaBar(FrmPlato.numPedido,"bar");
        comandaCocina(FrmPlato.numPedido,"cocina");
    }

    void comandaCocina(int ped_codigo, String seccion) {
        comandaCocina.isCellSelected(1, 1);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DETALLE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERBACIONES");
        comandaCocina.setModel(modelo);

        String query = "SELECT * FROM detalle_producto_menu WHERE ped_codigo='" + ped_codigo + "' AND seccion ='"+seccion+"';";

        String[] datos = new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                datos[0] = rs.getString(3);
                datos[1] = rs.getString(6);
                datos[2] = rs.getString(5); 
                modelo.addRow(datos);
            }
            comandaCocina.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPlato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void comandaBar(int ped_codigo, String seccion) {
        comandaBar.isCellSelected(1, 1);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DETALLE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERBACIONES");
        comandaBar.setModel(modelo);

        String query = "SELECT * FROM detalle_producto_menu WHERE ped_codigo='" + ped_codigo + "' AND seccion ='"+seccion+"';";

        String[] datos = new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                datos[0] = rs.getString(3);
                datos[1] = rs.getString(6);
                datos[2] = rs.getString(5); 
                modelo.addRow(datos);
            }
            comandaBar.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(FrmPlato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void horaComanda() {
        hora = new Hora(lblHoraComanda);
        Thread time = new Thread(hora);
        time.start();
    }

    void fechaComanda() {
        fecha = new Fecha(lblFechaComanda);
        Thread time = new Thread(fecha);
        time.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblPedido = new javax.swing.JLabel();
        lblFechaComanda = new javax.swing.JLabel();
        lblHoraComanda = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        lblMesero = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comandaCocina = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        comandaBar = new javax.swing.JTable();
        FondoOrden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/ModificarComanda.png"))); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 320, 70));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 40, 50));

        btnCuenta.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/comandaLista.png"))); // NOI18N
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 210, 60));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 340, 120));

        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/añadir.png"))); // NOI18N
        btnAgregar.setContentAreaFilled(false);
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 210, 60));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Observaciones (campo opcional)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblPedido.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPedido.setText("1");
        getContentPane().add(lblPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, -1));

        lblFechaComanda.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblFechaComanda.setText("12/12/1232");
        getContentPane().add(lblFechaComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lblHoraComanda.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblHoraComanda.setText("12:12");
        getContentPane().add(lblHoraComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 70, -1));

        lblMesa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMesa.setText("1");
        getContentPane().add(lblMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, -1));

        lblMesero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMesero.setText("Jeison Caguana");
        getContentPane().add(lblMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        comandaCocina = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        comandaCocina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(comandaCocina);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 450, 460));

        comandaBar = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        comandaBar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane5.setViewportView(comandaBar);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 440, 460));

        FondoOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/Comanda3.png"))); // NOI18N
        getContentPane().add(FondoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1390, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmPlato plato = new FrmPlato();
        plato.setVisible(true);
        this.setVisible(false);
        FrmComandas fn = new FrmComandas();
        fn = null;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        ImageIcon salir = new ImageIcon(getClass().getResource("../assets/icons/alerta.png"));
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro desea cancelar la comanda?", "Cancelar Comanda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, salir);
        if (input == 0) {
            Roles.rolMesero();
            this.setVisible(false); 
        } 
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        Roles.rolMesero();
        this.setVisible(false); 
    }//GEN-LAST:event_btnCuentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoOrden;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JTable comandaBar;
    private javax.swing.JTable comandaCocina;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblFechaComanda;
    private javax.swing.JLabel lblHoraComanda;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}

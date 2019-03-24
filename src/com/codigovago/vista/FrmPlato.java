/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.FechaHora;
import com.codigovago.modelo.accesoDatos.Conexion;
import com.codigovago.modelo.accesoDatos.Empleados;
import com.codigovago.modelo.accesoDatos.ProductosMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public final class FrmPlato extends javax.swing.JFrame {

    /**
     * Creates new form FrmOrden
     */
    FrmMesa FrmMesa = new FrmMesa();
    FechaHora horaFecha; 
    ProductosMenu obProductoMenu = new ProductosMenu();
    Conexion cn = new Conexion();
    Empleados empleados = new Empleados();
    Roles Roles = new Roles();
    Connection conexion = cn.getConexion(); 
    PreparedStatement ps = null;
    public static int numPedido;
    public static int numMesa;  
    public static String buscaDatosUsuario;  
    int numeroPedido = obProductoMenu.ultimoRegistro();
    public FrmPlato() {
        this.setUndecorated(true);
        initComponents();
        componentes();
        txtObservaciones.setLineWrap(true); 

    }
    void activarMesa(int mesa){
        String query  = "INSERT INTO pedido (mes_numero) VALUES('"+mesa+"');"; 
        try {
            ps = conexion.prepareStatement( query );   
            ps.execute();  
            System.out.println("Mesa "+mesa+" OCUPADA");
        } catch (SQLException evt) { 
            evt.toString();  
        } 
    }
    void componentes(){
        lblNombre.setText("Mesero: "+empleados.buscarDatosUsuario(Roles.idEmpleado));
        lblNumMesa.setText("Mesa N# " + FrmMesa.ban);
        lblPedido.setText("Pedido N# 000"+numeroPedido);
        horaFecha();  
        tblComanda.getTableHeader().setPreferredSize(new java.awt.Dimension(40, 40));
        tblComanda.setRowHeight(30);
        tblComanda.setRowHeight(1, 30);
        tblComanda.setFont(new java.awt.Font("Tahoma", 0, 15));  
        cargarComanda(obProductoMenu.ultimoRegistro());
        activarMesa(FrmMesa.ban);
    }

    void cargarComanda(int ped_codigo){ 
        tblComanda.isCellSelected(1, 1);
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("DETALLE"); 
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO UNIDAD");
        modelo.addColumn("OBSERBACIONES"); 
        tblComanda.setModel(modelo);
  
        String query="SELECT * FROM detalle_producto_menu WHERE ped_codigo='"+ped_codigo+"';";
  
        String []datos = new String [4];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                datos[0]=rs.getString(3);
                datos[1]=rs.getString(6);                   
                datos[2]=rs.getString(8)+"0";
                datos[3]=rs.getString(5);
                modelo.addRow(datos);
            }
            tblComanda.setModel(modelo);
        } catch (SQLException ex) {
           Logger.getLogger(FrmPlato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void horaFecha() {
        horaFecha = new FechaHora(lblHoraFecha);
        Thread time = new Thread(horaFecha);
        time.start();
    }
    public boolean listaProdutos(String seccion) {
        String query = "SELECT prm_nombre FROM producto_menu WHERE seccion ='"+seccion+"' AND prm_disponibilidad='si';";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            txtListaPlatos.removeAllItems();
            ps = conexion.prepareStatement(query); 
            rs = ps.executeQuery(); 
            while(rs.next()){
                txtListaPlatos.addItem(rs.getString(1));
            } 
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.JPopupMenu();
        btnSeleccionar = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        grupo_seccion = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComanda = new javax.swing.JTable();
        lblNumMesa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtListaPlatos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        btnComandas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtCantidad = new javax.swing.JComboBox<>();
        lblPedido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JRadioButton();
        cocina = new javax.swing.JRadioButton();
        lblNombre = new javax.swing.JLabel();
        lblHoraFecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FondoOrden = new javax.swing.JLabel();

        btnSeleccionar.setText("Seleccionar");
        grupo1.add(btnSeleccionar);

        btnEliminar.setText("Eliminar Pedido");
        grupo1.add(btnEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblComanda = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblComanda.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        tblComanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DETALLE", "CANTIDAD", "PRECIO", "OBSERVACION"
            }
        ));
        tblComanda.setComponentPopupMenu(grupo1);
        tblComanda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblComanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComandaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComanda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 690, 370));

        lblNumMesa.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblNumMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblNumMesa.setText("Mesa: 1");
        getContentPane().add(lblNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Observación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtListaPlatos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtListaPlatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platos disponibles" }));
        getContentPane().add(txtListaPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 310, 40));

        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setDoubleBuffered(true);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setOpaque(false);
        jScrollPane2.setRequestFocusEnabled(false);
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(null);
        txtObservaciones.setDoubleBuffered(true);
        txtObservaciones.setDragEnabled(true);
        txtObservaciones.setFocusCycleRoot(true);
        txtObservaciones.setFocusTraversalPolicyProvider(true);
        txtObservaciones.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(txtObservaciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 130));

        btnComandas.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnComandas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/comana.png"))); // NOI18N
        btnComandas.setContentAreaFilled(false);
        btnComandas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComandas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnComandas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnComandas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnComandas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComandasActionPerformed(evt);
            }
        });
        getContentPane().add(btnComandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 340, 80));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 50, 50));

        txtCantidad.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 80, 30));

        lblPedido.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblPedido.setText("Pedido: 1");
        getContentPane().add(lblPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 230, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        grupo_seccion.add(bar);
        bar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bar.setForeground(new java.awt.Color(255, 255, 255));
        bar.setText("BAR");
        bar.setBorder(null);
        bar.setOpaque(false);
        bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barActionPerformed(evt);
            }
        });

        grupo_seccion.add(cocina);
        cocina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cocina.setForeground(new java.awt.Color(255, 255, 255));
        cocina.setText("COCINA");
        cocina.setBorder(null);
        cocina.setOpaque(false);
        cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(cocina)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cocina)
                    .addComponent(bar)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, 70));

        lblNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre: Jeison Caguana");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lblHoraFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblHoraFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraFecha.setText("13/12/12 - 09:09:09");
        getContentPane().add(lblHoraFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jPanel2.setOpaque(false);

        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/añadir.png"))); // NOI18N
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        quitar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/quitar.png"))); // NOI18N
        quitar.setContentAreaFilled(false);
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/modificar.png"))); // NOI18N
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/limpiar.png"))); // NOI18N
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(quitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 210, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/descarga.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 90));

        FondoOrden.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        FondoOrden.setForeground(new java.awt.Color(255, 255, 255));
        FondoOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/fondo1.png"))); // NOI18N
        getContentPane().add(FondoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ImageIcon salir = new ImageIcon(getClass().getResource("../assets/icons/alerta.png"));
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro desea cancelar la orden?", "Cancelar Comanda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, salir);
        if (input == 0) {
            Roles.rolMesero();
            this.setVisible(false);
            this.removeAll();
        } 
    }//GEN-LAST:event_btnSalirActionPerformed
    private void btnComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComandasActionPerformed
        numPedido = numeroPedido;
        numMesa   = FrmMesa.ban;
        buscaDatosUsuario = empleados.buscarDatosUsuario(Roles.idEmpleado);
        FrmComandas comandas = new FrmComandas();
        comandas.setVisible(true);       
        this.setVisible(false);
        this.removeAll();
    }//GEN-LAST:event_btnComandasActionPerformed
    private void barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barActionPerformed
        listaProdutos("bar");
    }//GEN-LAST:event_barActionPerformed
    private void cocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocinaActionPerformed
        listaProdutos("cocina");
    }//GEN-LAST:event_cocinaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int fila= tblComanda.getSelectedRow();
        if(fila>=0){
            obProductoMenu.actualizaComanda(txtListaPlatos.getSelectedItem().toString(), txtObservaciones.getText(), Integer.parseInt(txtCantidad.getSelectedItem().toString()),numeroPedido);
            cargarComanda(numeroPedido);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null,"No a seleccionado ningun producto para actualizar");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    void limpiar() {
        listaProdutos("null"); 
        txtCantidad.setSelectedIndex(0);
        txtObservaciones.setText("");
        txtListaPlatos.setSelectedIndex(0);
//        grupo_seccion.clearSelection();
    }
    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed
       int fila= tblComanda.getSelectedRow();
        if(fila>=0){
            obProductoMenu.quitaProductoMenu(tblComanda.getValueAt(fila, 0).toString());
            cargarComanda(numeroPedido);
        }else{
            JOptionPane.showMessageDialog(null,"No a seleccionado ningun producto para quitar");
        }
    }//GEN-LAST:event_quitarActionPerformed
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String seccion = "";
        if (bar.isSelected()) {
            seccion = "bar";
        }
        if (cocina.isSelected()) {
            seccion ="cocina";
        }
        if (obProductoMenu.registarMenu(numeroPedido,txtListaPlatos.getSelectedItem().toString(),txtObservaciones.getText(), Integer.parseInt(txtCantidad.getSelectedItem().toString()), seccion ) ){
            cargarComanda(numeroPedido);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Producto no disponible..");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblComandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComandaMouseClicked
        int fila= tblComanda.getSelectedRow();
        grupo_seccion.clearSelection();
        txtListaPlatos.setActionCommand(tblComanda.getValueAt(fila, 0).toString());
        txtCantidad.setActionCommand(tblComanda.getValueAt(fila, 1).toString());
        txtObservaciones.setText(tblComanda.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tblComandaMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoOrden;
    private javax.swing.JRadioButton bar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComandas;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JRadioButton cocina;
    private javax.swing.JPopupMenu grupo1;
    private javax.swing.ButtonGroup grupo_seccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHoraFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JButton quitar;
    private javax.swing.JTable tblComanda;
    private javax.swing.JComboBox<String> txtCantidad;
    private javax.swing.JComboBox<String> txtListaPlatos;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}

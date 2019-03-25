/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.FechaHora;
import com.codigovago.modelo.accesoDatos.Empleados;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON
 */
public final class FrmMesa extends javax.swing.JFrame {

    /**
     * Creates new form FrmComandero
     */
    public static int ban;
    public static int idEmp;

    Empleados empleados = new Empleados();
    Roles Roles = new Roles();
    FechaHora horaFecha; 
    String nomMesero = "";
    public FrmMesa() {
        this.setUndecorated(true);
        initComponents();
        nomMesero = empleados.buscarDatosUsuario(Roles.idEmpleado);
        btnUsuario.setText("  Mesero: " + nomMesero);
        horaFecha();
    }
    void isNull(){
        empleados = null;
        Roles = null;
        horaFecha = null;
        btnUsuario = null;
        nomMesero = "";
        ban = 0; 
    }

    void horaFecha() {
        horaFecha = new FechaHora(lblHoraFecha);
        Thread time = new Thread(horaFecha);
        time.start();
    }

    void cargarMesa(int ban) {
        this.ban = ban;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
        this.dispose();
        isNull(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMesa1 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa7 = new javax.swing.JButton();
        btnMesa8 = new javax.swing.JButton();
        btnMesa9 = new javax.swing.JButton();
        btnMesa10 = new javax.swing.JButton();
        btnMesa11 = new javax.swing.JButton();
        btnMesa12 = new javax.swing.JButton();
        btnMesa13 = new javax.swing.JButton();
        btnMesa14 = new javax.swing.JButton();
        btnMesa15 = new javax.swing.JButton();
        btnMesa16 = new javax.swing.JButton();
        btnMesa17 = new javax.swing.JButton();
        btnMesa18 = new javax.swing.JButton();
        btnMesa19 = new javax.swing.JButton();
        btnMesa20 = new javax.swing.JButton();
        btnMesa21 = new javax.swing.JButton();
        btnMesa22 = new javax.swing.JButton();
        btnMesa23 = new javax.swing.JButton();
        btnMesa24 = new javax.swing.JButton();
        lblHoraFecha = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        FondoComanda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1360, 740));
        setMinimumSize(new java.awt.Dimension(1360, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMesa1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa1.setForeground(new java.awt.Color(255, 255, 255));
        btnMesa1.setText("1");
        btnMesa1.setBorder(null);
        btnMesa1.setBorderPainted(false);
        btnMesa1.setContentAreaFilled(false);
        btnMesa1.setDefaultCapable(false);
        btnMesa1.setFocusable(false);
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 40, 50));

        btnMesa2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa2.setForeground(new java.awt.Color(255, 255, 255));
        btnMesa2.setText("2");
        btnMesa2.setBorder(null);
        btnMesa2.setBorderPainted(false);
        btnMesa2.setContentAreaFilled(false);
        btnMesa2.setDefaultCapable(false);
        btnMesa2.setFocusable(false);
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 40, 50));

        btnMesa3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa3.setForeground(new java.awt.Color(255, 255, 255));
        btnMesa3.setText("3");
        btnMesa3.setBorder(null);
        btnMesa3.setBorderPainted(false);
        btnMesa3.setContentAreaFilled(false);
        btnMesa3.setDefaultCapable(false);
        btnMesa3.setFocusable(false);
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 40, 50));

        btnMesa4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa4.setForeground(new java.awt.Color(255, 255, 255));
        btnMesa4.setText("4");
        btnMesa4.setBorder(null);
        btnMesa4.setBorderPainted(false);
        btnMesa4.setContentAreaFilled(false);
        btnMesa4.setDefaultCapable(false);
        btnMesa4.setFocusable(false);
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 40, 50));

        btnMesa5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa5.setForeground(new java.awt.Color(255, 255, 255));
        btnMesa5.setText("5");
        btnMesa5.setBorder(null);
        btnMesa5.setBorderPainted(false);
        btnMesa5.setContentAreaFilled(false);
        btnMesa5.setDefaultCapable(false);
        btnMesa5.setFocusable(false);
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 40, 50));

        btnMesa6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa6.setForeground(new java.awt.Color(255, 255, 255));
        btnMesa6.setText("6");
        btnMesa6.setBorder(null);
        btnMesa6.setBorderPainted(false);
        btnMesa6.setContentAreaFilled(false);
        btnMesa6.setDefaultCapable(false);
        btnMesa6.setFocusable(false);
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 40, 50));

        btnMesa7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa7.setText("7");
        btnMesa7.setBorder(null);
        btnMesa7.setBorderPainted(false);
        btnMesa7.setContentAreaFilled(false);
        btnMesa7.setDefaultCapable(false);
        btnMesa7.setFocusable(false);
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 160, 130));

        btnMesa8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa8.setText("8");
        btnMesa8.setBorder(null);
        btnMesa8.setBorderPainted(false);
        btnMesa8.setContentAreaFilled(false);
        btnMesa8.setDefaultCapable(false);
        btnMesa8.setFocusable(false);
        btnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 160, 130));

        btnMesa9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa9.setText("9");
        btnMesa9.setBorder(null);
        btnMesa9.setBorderPainted(false);
        btnMesa9.setContentAreaFilled(false);
        btnMesa9.setDefaultCapable(false);
        btnMesa9.setFocusable(false);
        btnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 160, 130));

        btnMesa10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa10.setText("10");
        btnMesa10.setBorder(null);
        btnMesa10.setBorderPainted(false);
        btnMesa10.setContentAreaFilled(false);
        btnMesa10.setDefaultCapable(false);
        btnMesa10.setFocusable(false);
        btnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 160, 120));

        btnMesa11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa11.setText("11");
        btnMesa11.setBorder(null);
        btnMesa11.setBorderPainted(false);
        btnMesa11.setContentAreaFilled(false);
        btnMesa11.setDefaultCapable(false);
        btnMesa11.setFocusable(false);
        btnMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 160, 120));

        btnMesa12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa12.setText("12");
        btnMesa12.setBorder(null);
        btnMesa12.setBorderPainted(false);
        btnMesa12.setContentAreaFilled(false);
        btnMesa12.setDefaultCapable(false);
        btnMesa12.setFocusable(false);
        btnMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 160, 120));

        btnMesa13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa13.setText("13");
        btnMesa13.setBorder(null);
        btnMesa13.setBorderPainted(false);
        btnMesa13.setContentAreaFilled(false);
        btnMesa13.setDefaultCapable(false);
        btnMesa13.setFocusable(false);
        btnMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 450, 170));

        btnMesa14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa14.setText("14           ");
        btnMesa14.setBorder(null);
        btnMesa14.setBorderPainted(false);
        btnMesa14.setContentAreaFilled(false);
        btnMesa14.setDefaultCapable(false);
        btnMesa14.setFocusable(false);
        btnMesa14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa14.setInheritsPopupMenu(true);
        btnMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, 110, 50));

        btnMesa15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa15.setText("15           ");
        btnMesa15.setBorder(null);
        btnMesa15.setBorderPainted(false);
        btnMesa15.setContentAreaFilled(false);
        btnMesa15.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnMesa15.setDefaultCapable(false);
        btnMesa15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa15.setInheritsPopupMenu(true);
        btnMesa15.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMesa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 530, 110, 60));

        btnMesa16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa16.setText("16           ");
        btnMesa16.setBorder(null);
        btnMesa16.setContentAreaFilled(false);
        btnMesa16.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnMesa16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa16.setInheritsPopupMenu(true);
        btnMesa16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMesa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 460, 110, 60));

        btnMesa17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa17.setText("17           ");
        btnMesa17.setBorder(null);
        btnMesa17.setContentAreaFilled(false);
        btnMesa17.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnMesa17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa17.setInheritsPopupMenu(true);
        btnMesa17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMesa17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 400, 110, 50));

        btnMesa18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa18.setText("18           ");
        btnMesa18.setBorder(null);
        btnMesa18.setContentAreaFilled(false);
        btnMesa18.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnMesa18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa18.setInheritsPopupMenu(true);
        btnMesa18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMesa18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 330, 110, 60));

        btnMesa19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa19.setText("19           ");
        btnMesa19.setBorder(null);
        btnMesa19.setContentAreaFilled(false);
        btnMesa19.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnMesa19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa19.setInheritsPopupMenu(true);
        btnMesa19.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMesa19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 270, 110, 50));

        btnMesa20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa20.setText("20           ");
        btnMesa20.setBorder(null);
        btnMesa20.setContentAreaFilled(false);
        btnMesa20.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnMesa20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesa20.setInheritsPopupMenu(true);
        btnMesa20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMesa20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa20ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 200, 110, 60));

        btnMesa21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa21.setText("21");
        btnMesa21.setBorder(null);
        btnMesa21.setContentAreaFilled(false);
        btnMesa21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 140, 90));

        btnMesa22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa22.setText("22");
        btnMesa22.setBorder(null);
        btnMesa22.setContentAreaFilled(false);
        btnMesa22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 150, 80));

        btnMesa23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa23.setText("23");
        btnMesa23.setBorder(null);
        btnMesa23.setContentAreaFilled(false);
        btnMesa23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 140, 90));

        btnMesa24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMesa24.setText("24");
        btnMesa24.setBorder(null);
        btnMesa24.setContentAreaFilled(false);
        btnMesa24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 150, 90));

        lblHoraFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblHoraFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/relog.png"))); // NOI18N
        lblHoraFecha.setText("13/12/12 - 09:09:09");
        lblHoraFecha.setFocusable(false);
        lblHoraFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHoraFecha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHoraFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, 90));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/salir.png"))); // NOI18N
        btnSalir.setText("Cerrar Sesión");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 210, 60));

        btnUsuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/descarga.png"))); // NOI18N
        btnUsuario.setText("Sr(a). Pepito Peres");
        btnUsuario.setToolTipText("");
        btnUsuario.setBorder(null);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 130));

        FondoComanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/Mesas3.png"))); // NOI18N
        getContentPane().add(FondoComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        cargarMesa(1);
    }//GEN-LAST:event_btnMesa1ActionPerformed
    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        cargarMesa(2); 
    }//GEN-LAST:event_btnMesa2ActionPerformed
    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        cargarMesa(3); 
    }//GEN-LAST:event_btnMesa3ActionPerformed
    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        cargarMesa(4); 
    }//GEN-LAST:event_btnMesa4ActionPerformed
    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        cargarMesa(5); 
    }//GEN-LAST:event_btnMesa5ActionPerformed
    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
        cargarMesa(6); 
    }//GEN-LAST:event_btnMesa6ActionPerformed
    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa7ActionPerformed
        cargarMesa(7); 
    }//GEN-LAST:event_btnMesa7ActionPerformed
    private void btnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa8ActionPerformed
        cargarMesa(8); 
    }//GEN-LAST:event_btnMesa8ActionPerformed
    private void btnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa9ActionPerformed
        cargarMesa(9);
    }//GEN-LAST:event_btnMesa9ActionPerformed
    private void btnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa10ActionPerformed
        cargarMesa(10);
        this.setVisible(false);
    }//GEN-LAST:event_btnMesa10ActionPerformed
    private void btnMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa11ActionPerformed
        cargarMesa(11);
        this.setVisible(false);
    }//GEN-LAST:event_btnMesa11ActionPerformed
    private void btnMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa12ActionPerformed
        cargarMesa(12);
        this.setVisible(false);
    }//GEN-LAST:event_btnMesa12ActionPerformed
    private void btnMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa13ActionPerformed
        cargarMesa(13); 
    }//GEN-LAST:event_btnMesa13ActionPerformed
    private void btnMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa14ActionPerformed
        cargarMesa(14); 
    }//GEN-LAST:event_btnMesa14ActionPerformed
    private void btnMesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa15ActionPerformed
        cargarMesa(15); 
    }//GEN-LAST:event_btnMesa15ActionPerformed
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ImageIcon salir = new ImageIcon(getClass().getResource("../assets/icons/salir.png"));
        int input = JOptionPane.showConfirmDialog(null, "¿Seguro desea serrar sesión?", "Serrar Sessión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, salir);
        if (input == 0) {
            Roles.index();
            this.setVisible(false); 
        }
    }//GEN-LAST:event_btnSalirActionPerformed
    private void btnMesa20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa20ActionPerformed
        cargarMesa(20); 
    }//GEN-LAST:event_btnMesa20ActionPerformed
    private void btnMesa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa16ActionPerformed
        cargarMesa(16); 
    }//GEN-LAST:event_btnMesa16ActionPerformed
    private void btnMesa17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa17ActionPerformed
        cargarMesa(17); 
    }//GEN-LAST:event_btnMesa17ActionPerformed
    private void btnMesa18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa18ActionPerformed
        cargarMesa(18); 
    }//GEN-LAST:event_btnMesa18ActionPerformed
    private void btnMesa19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa19ActionPerformed
        cargarMesa(19); 
    }//GEN-LAST:event_btnMesa19ActionPerformed
    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        FrmPerfil perfil = new FrmPerfil();
        idEmp = Roles.idEmpleado;
        perfil.setVisible(true); 
    }//GEN-LAST:event_btnUsuarioActionPerformed
    private void btnMesa21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa21ActionPerformed
        cargarMesa(21); 
    }//GEN-LAST:event_btnMesa21ActionPerformed
    private void btnMesa22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa22ActionPerformed
        cargarMesa(22); 
    }//GEN-LAST:event_btnMesa22ActionPerformed
    private void btnMesa23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa23ActionPerformed
        cargarMesa(23); 
    }//GEN-LAST:event_btnMesa23ActionPerformed
    private void btnMesa24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa24ActionPerformed
        cargarMesa(24); 
    }//GEN-LAST:event_btnMesa24ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoComanda;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa10;
    private javax.swing.JButton btnMesa11;
    private javax.swing.JButton btnMesa12;
    private javax.swing.JButton btnMesa13;
    private javax.swing.JButton btnMesa14;
    private javax.swing.JButton btnMesa15;
    private javax.swing.JButton btnMesa16;
    private javax.swing.JButton btnMesa17;
    private javax.swing.JButton btnMesa18;
    private javax.swing.JButton btnMesa19;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa20;
    private javax.swing.JButton btnMesa21;
    private javax.swing.JButton btnMesa22;
    private javax.swing.JButton btnMesa23;
    private javax.swing.JButton btnMesa24;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
    private javax.swing.JButton btnMesa8;
    private javax.swing.JButton btnMesa9;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel lblHoraFecha;
    // End of variables declaration//GEN-END:variables
}

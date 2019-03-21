/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo.accesoDatos;

import com.codigovago.controlador.Roles;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties; 
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class CorreoElectronico extends Conexion {

    Empleados empleados = new Empleados();
    Roles roles = new Roles();
    //static ResultSet rs = null; 

    public void cambioClave(String claveNueva, String correo) {
        PreparedStatement ps = null; 
        Connection conexion = getConexion();
        String query = "UPDATE usuario SET usu_contrasena = '" + claveNueva + "' WHERE emp_codigo='" + empleados.buscarCodigoEmp(correo)+"';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
     public int existeCorreo(String emp_correo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(emp_codigo) FROM empleado WHERE emp_correo ='"+emp_correo+"'";
        try {
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    public boolean setCorreo(String correoReceptor, String asunto) {
        boolean ban = false;
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        Session sesion = Session.getDefaultInstance(propiedad);
        String claveNueva = empleados.buscarApellido(correoReceptor) + empleados.numRandom();
        cambioClave(claveNueva, correoReceptor);
        String correoEnvia = "demovago.ec@gmail.com";
        String contrasena = "Chavaclass!23";
        String mensaje = "Estimado: " +empleados.buscarDatosUsuario1(correoReceptor)+"\n" +
        "Hemos recibido una solicitud para acceder a tu cuenta, a través de tu dirección de correo electrónico. "+
        "\n\n Tu contraseña nueva es:   "+claveNueva+" \n" +
        "\n" +
        "Si no has solicitado esta contraseña, no reenvíes este correo electrónico ni des la nueva clave a nadie.\n" +
        " \n \n" +
        "Atentamente,\n" + 
        "El equipo de Cuentas del Módulo Gestion Ordenes Ister";

        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            mail.setSubject(asunto);
            mail.setText(mensaje);

            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correoEnvia, contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transportar.close(); 
            ban = true;
        } catch (AddressException ex) {
            ex.toString();
        } catch (MessagingException ex) {
            ban = false;
        }
        return ban;
    }
}

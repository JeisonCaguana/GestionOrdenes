/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo.accesoDatos;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.Empleado;
import static com.codigovago.modelo.accesoDatos.Empleados.ps;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    Connection conexion = getConexion();

    public void cambioClave(String claveNueva, String correo) {
        //update contraseña de la tabla empleado

        String query = "UPDATE usuario SET usu_contrasena = '" + claveNueva + "' WHERE emp_codigo='" + empleados.buscarCodigoEmp(correo)+"';";
        try {
            ps = conexion.prepareStatement(query);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setCorreo(String correoReceptor, String asunto) {
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
        String mensaje = "Ha solicitado la recuperación de su contraseña." + " "
                + "Su nueva contraseña para el ingreso es:" + " " + claveNueva;

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

            JOptionPane.showMessageDialog(null, "Su contraseña ha sido cambiada con éxito."
                    + "/nRevise su correo");

        } catch (AddressException ex) {
            ex.toString();
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "El correo ingresado no existe. "
                    + "\nInténtelo de nuevo.");
        }

    }

}

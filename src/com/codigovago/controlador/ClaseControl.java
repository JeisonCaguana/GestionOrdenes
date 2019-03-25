package com.codigovago.controlador;

import com.codigovago.modelo.accesoDatos.Empleados;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

 /**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class ClaseControl{
    //static Empleados empleados = new Empleados(); 
    static Roles roles = new Roles();  
    public static void main(String[] args) { 
       roles.index();
      //empleados.buscarDireccionEmpleado(1);
    }  
}

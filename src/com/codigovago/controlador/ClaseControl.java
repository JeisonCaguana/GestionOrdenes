/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codigovago.controlador;

import com.codigovago.modelo.Empleado;  
import com.codigovago.modelo.Usuario;
import com.codigovago.modelo.accesoDatos.Conexion;
import com.codigovago.modelo.accesoDatos.Empleados;
import com.codigovago.modelo.accesoDatos.Login; 
import com.codigovago.modelo.accesoDatos.ProductosMenu;
/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class ClaseControl{
    
    static Conexion conexion = new Conexion();
    static Empleados empleados = new Empleados();
    static Login login = new Login();
    static Empleado empleado;
    static Usuario usuario; 
    static Roles roles = new Roles(); 
    static ProductosMenu obProductoMenu = new ProductosMenu();
    
    public static void main(String[] args) { 
        roles.index();  
    } 
    public static void getConexion(){
        conexion.getConexion();
    }
    public static void getRegistroEmpleado( Empleado empleado ){
        if ( empleados.registrarEmpleado( empleado ) ) {
            System.out.println("Se grabo con exito");
        }else{
            System.out.println("No grabo con exito");
        }
    }
//    public static void getActualizaEmpleado( Empleado empleado ){
//        if ( empleados.actualizarEmpleado( empleado ) ) {
//            System.out.println("Se actualizo con exito");
//        }else{
//            System.out.println("No actualizo");
//        }
//    }
//    public static void getActualizaClave( Usuario usuario ){
//        if ( empleados.actualizarClave( usuario ) ) {
//            System.out.println("Se actualizo con exito su nueva clave");
//        }else{
//            System.out.println("No actualizo la clave");
//        }
//    }
//   
//    public static void getRecuperarClave( Empleado empleado ){
//        if ( login.recuperarClave( empleado ) ) {
//            System.out.println("Correo enviado...");
//        }else{
//            System.out.println("Correo no enviado...");
//        }
//    }
}

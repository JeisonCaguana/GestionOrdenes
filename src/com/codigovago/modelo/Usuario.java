/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com
 */
public class Usuario {
    private int codigo_uss;
    private String usuario_uss;
    private String clave_uss;
    private String cargo_emp;

//    public Usuario(int codigo_uss, String usuario_uss, String clave_uss, String cargo_emp) {
//        this.codigo_uss = codigo_uss;
//        this.usuario_uss = usuario_uss;
//        this.clave_uss = clave_uss;
//        this.cargo_emp = cargo_emp;
//    }
//    public Usuario(String usuario_uss, String clave_uss) {
//        this.usuario_uss = usuario_uss;
//        this.clave_uss = clave_uss; 
//    }
    public void imprimir (Usuario usuario){ 
        System.out.println("USUARIO: "+usuario.getUsuario_uss());
        System.out.println("CLAVE: "+usuario.getClave_uss());
        System.out.println("CARGO: "+usuario.getCargo_emp());
    }
    /**
     * @return the codigo_uss
     */
    public int getCodigo_uss() {
        return codigo_uss;
    }

    /**
     * @param codigo_uss the codigo_uss to set
     */
    public void setCodigo_uss(int codigo_uss) {
        this.codigo_uss = codigo_uss;
    }

    /**
     * @return the usuario_uss
     */
    public String getUsuario_uss() {
        return usuario_uss;
    }

    /**
     * @param usuario_uss the usuario_uss to set
     */
    public void setUsuario_uss(String usuario_uss) {
        this.usuario_uss = usuario_uss;
    }

    /**
     * @return the clave_uss
     */
    public String getClave_uss() {
        return clave_uss;
    }

    /**
     * @param clave_uss the clave_uss to set
     */
    public void setClave_uss(String clave_uss) {
        this.clave_uss = clave_uss;
    }

    /**
     * @return the cargo_emp
     */
    public String getCargo_emp() {
        return cargo_emp;
    }

    /**
     * @param cargo_emp the cargo_emp to set
     */
    public void setCargo_emp(String cargo_emp) {
        this.cargo_emp = cargo_emp;
    }

}

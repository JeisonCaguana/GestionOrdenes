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
public class Empleado {

    private int emp_codigo;
    private String emp_id;//cedula...
    private String emp_cargo;
    private String emp_nombre;
    private String emp_apellido;
    private String emp_telefono;
    private String emp_direccion;
    private String emp_correo;
    private String emp_turno;

    /**
     * @return the emp_codigo
     */
    public int getEmp_codigo() {
        return emp_codigo;
    }

    /**
     * @param emp_codigo the emp_codigo to set
     */
    public void setEmp_codigo(int emp_codigo) {
        this.emp_codigo = emp_codigo;
    }

    /**
     * @return the emp_id
     */
    public String getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return the emp_cargo
     */
    public String getEmp_cargo() {
        return emp_cargo;
    }

    /**
     * @param emp_cargo the emp_cargo to set
     */
    public void setEmp_cargo(String emp_cargo) {
        this.emp_cargo = emp_cargo;
    }

    /**
     * @return the emp_nombre
     */
    public String getEmp_nombre() {
        return emp_nombre;
    }

    /**
     * @param emp_nombre the emp_nombre to set
     */
    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }

    /**
     * @return the emp_apellido
     */
    public String getEmp_apellido() {
        return emp_apellido;
    }

    /**
     * @param emp_apellido the emp_apellido to set
     */
    public void setEmp_apellido(String emp_apellido) {
        this.emp_apellido = emp_apellido;
    }

    /**
     * @return the emp_telefono
     */
    public String getEmp_telefono() {
        return emp_telefono;
    }

    /**
     * @param emp_telefono the emp_telefono to set
     */
    public void setEmp_telefono(String emp_telefono) {
        this.emp_telefono = emp_telefono;
    }

    /**
     * @return the emp_direccion
     */
    public String getEmp_direccion() {
        return emp_direccion;
    }

    /**
     * @param emp_direccion the emp_direccion to set
     */
    public void setEmp_direccion(String emp_direccion) {
        this.emp_direccion = emp_direccion;
    }

    /**
     * @return the emp_correo
     */
    public String getEmp_correo() {
        return emp_correo;
    }

    /**
     * @param emp_correo the emp_correo to set
     */
    public void setEmp_correo(String emp_correo) {
        this.emp_correo = emp_correo;
    }

    /**
     * @return the emp_turno
     */
    public String getEmp_turno() {
        return emp_turno;
    }

    /**
     * @param emp_turno the emp_turno to set
     */
    public void setEmp_turno(String emp_turno) {
        this.emp_turno = emp_turno;
    }

    public void imprimir(Empleado empleado) {
        System.out.println("CEDULA: " + empleado.getEmp_id());
        System.out.println("NOMBRES: " + empleado.getEmp_nombre());
        System.out.println("APELLIDOS: " + empleado.getEmp_apellido());
        System.out.println("TELEFONO: " + empleado.getEmp_telefono());
        System.out.println("DIRECCION: " + empleado.getEmp_direccion());
        System.out.println("CORREO: " + empleado.getEmp_correo());
        System.out.println("CARGO: " + empleado.getEmp_cargo());
        System.out.println("CARGO: " + empleado.getEmp_turno());

    }

    public Empleado(int emp_codigo, String emp_id, String emp_cargo, String emp_nombre, String emp_apellido, String emp_telefono, String emp_direccion, String emp_correo, String emp_turno) {
        this.emp_codigo = emp_codigo;
        this.emp_id = emp_id;
        this.emp_cargo = emp_cargo;
        this.emp_nombre = emp_nombre;
        this.emp_apellido = emp_apellido;
        this.emp_telefono = emp_telefono;
        this.emp_direccion = emp_direccion;
        this.emp_correo = emp_correo;
        this.emp_turno = emp_turno;
    }

   
}

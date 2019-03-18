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
public class ProductoMenu {

    private String prm_codigo;
    private String cat_codigo;
    private String ree_codigo;
    private String prm_nombre;
    private String prm_disponibilidad; 
    private String seccion;
 
    /**
     * @return the prm_codigo
     */
    public String getPrm_codigo() {
        return prm_codigo;
    }

    /**
     * @param prm_codigo the prm_codigo to set
     */
    public void setPrm_codigo(String prm_codigo) {
        this.prm_codigo = prm_codigo;
    }

    /**
     * @return the cat_codigo
     */
    public String getCat_codigo() {
        return cat_codigo;
    }

    /**
     * @param cat_codigo the cat_codigo to set
     */
    public void setCat_codigo(String cat_codigo) {
        this.cat_codigo = cat_codigo;
    }

    /**
     * @return the ree_codigo
     */
    public String getRee_codigo() {
        return ree_codigo;
    }

    /**
     * @param ree_codigo the ree_codigo to set
     */
    public void setRee_codigo(String ree_codigo) {
        this.ree_codigo = ree_codigo;
    }

    /**
     * @return the prm_nombre
     */
    public String getPrm_nombre() {
        return prm_nombre;
    }

    /**
     * @param prm_nombre the prm_nombre to set
     */
    public void setPrm_nombre(String prm_nombre) {
        this.prm_nombre = prm_nombre;
    }

    /**
     * @return the prm_disponibilidad
     */
    public String getPrm_disponibilidad() {
        return prm_disponibilidad;
    }

    /**
     * @param prm_disponibilidad the prm_disponibilidad to set
     */
    public void setPrm_disponibilidad(String prm_disponibilidad) {
        this.prm_disponibilidad = prm_disponibilidad;
    }
    
    /**
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}

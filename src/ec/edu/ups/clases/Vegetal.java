/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Vegetal
 * @author Edison
 */
public abstract class Vegetal extends SerVivo implements Acciones{
    // atributos
    private boolean hojas;
    private boolean fruto;
    private String usoVegetal;
    private String lugarCrecimiento;
    // constructores
    public Vegetal(){
        
    }

    public Vegetal(String nombre, int anosVida, double peso, double tamano, int codigo) {
        super(nombre, anosVida, peso, tamano, codigo);
    }

    public Vegetal(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano, int codigo) {
        super(nombre, anosVida, peso, tamano, codigo);
        this.hojas = hojas;
        this.fruto = fruto;
        this.usoVegetal = usoVegetal;
        this.lugarCrecimiento = lugarCrecimiento;
    }

    public Vegetal(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(nombre, anosVida, peso, tamano);
        this.hojas = hojas;
        this.fruto = fruto;
        this.usoVegetal = usoVegetal;
        this.lugarCrecimiento = lugarCrecimiento;
    }

    
    

    
    // getters y setters
    public boolean isHojas() {
        return hojas;
    }

    public void setHojas(boolean hojas) {
        this.hojas = hojas;
    }

    public boolean isFruto() {
        return fruto;
    }

    public void setFruto(boolean fruto) {
        this.fruto = fruto;
    }

    public String getUsoVegetal() {
        return usoVegetal;
    }

    public void setUsoVegetal(String usoVegetal) {
        this.usoVegetal = usoVegetal;
    }

    public String getLugarCrecimiento() {
        return lugarCrecimiento;
    }

    public void setLugarCrecimiento(String lugarCrecimiento) {
        this.lugarCrecimiento = lugarCrecimiento;
    }
    // metodos
    public boolean hacerFotosintecis(){
        return true;
    }
    public boolean consumirO2(){
        return true;
    }
    public boolean botarCO2(){
        return true;
    }
    // metodo abstracto
    public abstract boolean usarVegetal();
    // toString
    @Override
    public String toString() {
        return super.toString()+ ", Tiene hojas: " + hojas + ", Tiene frutos: " + fruto + ", Uso del Vegetal: " + usoVegetal + ", Lugar de Crecimiento: " + lugarCrecimiento;
    }
    // implementacion de metodos abtractos
    
    
    @Override
    public boolean nacer(){
        return true;
    }
    @Override
    public boolean reproducirse(){
        return true;
    }
  
}

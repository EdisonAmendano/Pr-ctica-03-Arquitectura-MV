/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Pez
 * @author Edison
 */
public final class Pez extends Animal implements Acciones{
    // atributos
    private double profundidad;
    private int numeroDeAletas;
    private String aguaDulceSalada;
    private String tipoDePez;
    
    // constructores
    public Pez (){
        
    }

    public Pez(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano, int codigo) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano, codigo);
    }

    public Pez(double profundidad, int numeroDeAletas, String aguaDulceSalada, String tipoDePez, String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano, int codigo) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano, codigo);
        this.profundidad = profundidad;
        this.numeroDeAletas = numeroDeAletas;
        this.aguaDulceSalada = aguaDulceSalada;
        this.tipoDePez = tipoDePez;
    }

    public Pez(double profundidad, int numeroDeAletas, String aguaDulceSalada, String tipoDePez, String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
        this.profundidad = profundidad;
        this.numeroDeAletas = numeroDeAletas;
        this.aguaDulceSalada = aguaDulceSalada;
        this.tipoDePez = tipoDePez;
    }

    
    
    
    // getters y setters
    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public int getNumeroDeAletas() {
        return numeroDeAletas;
    }

    public void setNumeroDeAletas(int numeroDeAletas) {
        this.numeroDeAletas = numeroDeAletas;
    }

    public String getAguaDulceSalada() {
        return aguaDulceSalada;
    }

    public void setAguaDulceSalada(String aguaDulceSalada) {
        this.aguaDulceSalada = aguaDulceSalada;
    }
    
    public String getTipoDePez() {
        return tipoDePez;
    }

    public void setTipoDePez(String tipoDePez) {
        this.tipoDePez = tipoDePez;
    }

    
    
    
    
    // metodos
    public boolean nadar(){
        return true;
    }
    public boolean cazrComida(){
        return true;
    }
    public boolean ponerHuevos(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "Pez: "+super.toString()+ ", Profundidad: " + profundidad + ", Numero De Aletas: " + numeroDeAletas + ", Agua Dulce o Salada: " + aguaDulceSalada + ", Tipo De Pez: " + tipoDePez;
    }
    // implementacion de metodos abstractos
    @Override
    public boolean cazarAnimal() {
        return true;
    }
    
    @Override
    public boolean nacer(){
        return true;
    }
    @Override
    public boolean reproducirse(){
        return true;
    }
    
    
}

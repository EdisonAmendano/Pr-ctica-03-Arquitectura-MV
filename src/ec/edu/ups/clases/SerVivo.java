/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * SerVivo
 * @author Edison
 */
public class SerVivo implements Comparable<SerVivo>{
    // atrivutos
    private String nombre;
    private int anosVida;
    private double peso;
    private double tamano;
    private int codigo;
    
    // constructores
    public SerVivo(){
        
    }
    
    public SerVivo(String nombre){
        
    }

    public SerVivo(String nombre, int anosVida, double peso, double tamano, int codigo) {
        this.nombre = nombre;
        this.anosVida = anosVida;
        this.peso = peso;
        this.tamano = tamano;
        this.codigo = codigo;
    }

    public SerVivo(String nombre, int anosVida, double peso, double tamano) {
        this.nombre = nombre;
        this.anosVida = anosVida;
        this.peso = peso;
        this.tamano = tamano;
    }
    
    
    
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnosVida() {
        return anosVida;
    }

    public void setAnosVida(int anosVida) {
        this.anosVida = anosVida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    // metodos
    public boolean nacer(){
        return true;
    }
     public boolean reproducirce(){
        return true;
    }
      public boolean morir(){
        return true;
    }
    // metodo abstracto
    

    // toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Años de Vida: " + anosVida + ", Peso: " + peso + ", Tamaño: " + tamano;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SerVivo other = (SerVivo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(SerVivo o) {
        if(nombre.compareTo(o.getNombre()) >= 1){
            return 1;
        }else if(nombre.compareTo(o.getNombre()) <= -1){
            return -1;
        }else {
            return 0;
        }
    }
    
    
    
}

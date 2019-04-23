/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Animal
 * @author Edison
 */
public abstract class Animal extends SerVivo implements Acciones{
    //atributos
    private String domesticoSalvaje;
    private String color;
    private String tipoAlimento;
    private boolean capacidadCazar;
    
    //Constructores
    public Animal(){
        
    }

    public Animal(String nombre, int anosVida, double peso, double tamano, int codigo) {
        super(nombre, anosVida, peso, tamano, codigo);
    }

    public Animal(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano, int codigo) {
        super(nombre, anosVida, peso, tamano, codigo);
        this.domesticoSalvaje = domesticoSalvaje;
        this.color = color;
        this.tipoAlimento = tipoAlimento;
        this.capacidadCazar = capacidadCazar;
    }

    public Animal(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(nombre, anosVida, peso, tamano);
        this.domesticoSalvaje = domesticoSalvaje;
        this.color = color;
        this.tipoAlimento = tipoAlimento;
        this.capacidadCazar = capacidadCazar;
    }

    

    // getters y setters
    public String getDomesticoSalvaje() {
        return domesticoSalvaje;
    }

    public void setDomesticoSalvaje(String domesticoSalvaje) {
        this.domesticoSalvaje = domesticoSalvaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public boolean isCapacidadCazar() {
        return capacidadCazar;
    }

    public void setCapacidadCazar(boolean capacidadCazar) {
        this.capacidadCazar = capacidadCazar;
    }
    
    // metodos
    public boolean jugar(){
        return true;
    }
    public boolean cazar(){
        return true;
    }
    public boolean dormir(){
        return true;
    }
    
    // metodo abstracto
    public abstract boolean cazarAnimal();
    
    // toString
    @Override
    public String toString() {
        return super.toString()+", Domestico o Salvaje: " + domesticoSalvaje + ", Color: " + color + ", Tipo de Alimento: " + tipoAlimento + ", CapacidadCazar: " + capacidadCazar ;
    }

    // implementacion metodos abtractos
    
    
    @Override
    public boolean nacer(){
        return true;
    }
    @Override
    public boolean reproducirse(){
        return true;
    }
    
}

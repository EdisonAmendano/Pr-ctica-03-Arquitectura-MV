/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clontroladores;

import ec.edu.ups.clases.Vascular;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * ControladorVascular
 * En esta clase se ara los crud de Vascular
 * @author Edison
 */
public class ControladorVascular {
    private SortedSet<Vascular> lista;
    private int codigo;
    
    // Constructor
    public ControladorVascular() {
        lista = new TreeSet<>();
        codigo = 0;
    }
    // Creacion del objeto tipo Vascular
    public void create(Vascular objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Vascular
    public Vascular read(int codigo) {
        for (Vascular pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificaion del objeto tipo Vascular
    public void update(Vascular objeto) {
        for (Vascular v : lista) {
           
            if(v.equals(objeto)){
                lista.remove(v);
                lista.add(objeto);
                break;
            }
        }
    }
    
    // Eliminacion del objeto tipo Vascular
    public void delet(int codigo) {
        for (Vascular v : lista) {
           
            if(v.getCodigo()== codigo){
                lista.remove(v);
                break;
            }
        }
    }
    // Listar los objetos tipo Vascular
    public void imprimir(){
        System.out.println("lista Ordenada");
        for (Vascular vivo : lista) {
            System.out.println(vivo.toString());
        }
    }
    // Metodo extra para mostrar por pantalla los codigos de los objetos
    public void codigo(){
       for (Vascular vascular : lista) {
            System.out.println(vascular.getCodigo()+". "+vascular.getNombre());
        } 
    }
}

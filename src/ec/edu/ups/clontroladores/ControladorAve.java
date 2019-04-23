/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clontroladores;

import ec.edu.ups.clases.Ave;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ControladorAve
 * En esta clase se ara los crud de Ave
 * @author Edison
 */
public class ControladorAve {
    private Set<Ave> lista;
    private int codigo;
    // Constructor
    public ControladorAve() {
        lista = new HashSet<>();
        codigo = 0;
    }
    // Creacion del objeto tipo Ave
    public void create(Ave objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Ave
    public Ave read(int codigo) {
        for (Ave pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Ave
    public void update(Ave objeto) {
        for (Ave ave : lista) {
           
            if(ave.equals(objeto)){
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }
    // Eliminacion del objeto tipo Ave
    public void delet(int codigo) {
        for (Ave ave : lista) {
           
            if(ave.getCodigo()== codigo){
                lista.remove(ave);
                break;
            }
        }
    }
    // Listar los objetos tipo Ave
    public void listar (){
        for (Ave ave : lista) {
            System.out.println(ave);
        }
    }
    // Metodo extra para mostrar por pantalla los codigos de los objetos
    public void codigo(){
       for (Ave ave: lista) {
            System.out.println(ave.getCodigo()+". "+ave.getNombre());
        } 
    }
}

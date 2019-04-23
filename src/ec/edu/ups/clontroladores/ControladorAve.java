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
 *
 * @author Edison
 */
public class ControladorAve {
    private Set<Ave> lista;
    private int codigo;

    public ControladorAve() {
        lista = new HashSet<>();
        codigo = 0;
    }

    public void create(Ave objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }

    public Ave read(int codigo) {
        for (Ave pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }

    public void update(Ave objeto) {
        for (Ave ave : lista) {
           
            if(ave.equals(objeto)){
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }

    public void delet(int codigo) {
        for (Ave ave : lista) {
           
            if(ave.getCodigo()== codigo){
                lista.remove(ave);
                break;
            }
        }
    }
    
    public void listar (){
        for (Ave ave : lista) {
            System.out.println(ave);
        }
    }
    
    public void codigo(){
       for (Ave ave: lista) {
            System.out.println(ave.getCodigo()+". "+ave.getNombre());
        } 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clontroladores;

import ec.edu.ups.clases.Pez;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison
 */
public class ControladorPez {

    private List<Pez> lista;
    private int codigo;

    public ControladorPez() {
        codigo = 0;
        lista = new ArrayList<>();
    }

    public void create(Pez objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }

    public Pez read(int codigo) {
        for (Pez pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }

    public void update(Pez objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Pez elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
            }
        }
    }

    public void delet(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Pez elemento = lista.get(i);
            if (elemento.getCodigo() == codigo) {
                lista.remove(i);
                break;
            }
        }
    }
    
    public void listar (){
        for (Pez pez : lista) {
            System.out.println(pez);
        }
    }
    
    public void codigo(){
       for (Pez pez : lista) {
            System.out.println(pez.getCodigo()+". "+pez.getNombre());
        } 
    }
}


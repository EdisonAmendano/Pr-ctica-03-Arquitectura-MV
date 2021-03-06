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
 * ControladorPez
 * En esta clase se ara los crud de Pez
 * @author Edison
 */
public class ControladorPez {

    private List<Pez> lista;
    private int codigo;
    // Constructor
    public ControladorPez() {
        codigo = 0;
        lista = new ArrayList<>();
    }
    // creacion del objeto tipo Pez
    public void create(Pez objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Pez
    public Pez read(int codigo) {
        for (Pez pez : lista) {
            if (pez.getCodigo() == codigo) {
                return pez;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Pez
    public void update(Pez objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Pez elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
            }
        }
    }
    // Eliminacion del objeto tipo Pez
    public void delet(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Pez elemento = lista.get(i);
            if (elemento.getCodigo() == codigo) {
                lista.remove(i);
                break;
            }
        }
    }
    // Listar los objetos tipo Pez
    public void listar (){
        for (Pez pez : lista) {
            System.out.println(pez);
        }
    }
    // Metodo extra para mostrar por pantalla los codigos de los objetos
    public void codigo(){
        
       for (Pez pez : lista) {
            System.out.println(pez.getCodigo()+". "+pez.getNombre());
        } 
       
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clontroladores;

import ec.edu.ups.clases.NoVascular;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edison
 */
public class ControladorNoVascular {

    private Map<Integer, NoVascular> lista;
    private int codigo;

    public ControladorNoVascular() {
        lista = new HashMap<Integer, NoVascular>();
        codigo = 0;
    }

    public void create(NoVascular objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);

    }

    public NoVascular read(int codigo) {
        return lista.get(codigo);
    }

    public void update(NoVascular objeto) {

        lista.remove(objeto.getCodigo());
        lista.put(objeto.getCodigo(), objeto);

    }

    public void delet(int codigo) {
        lista.remove(codigo);

    }

    public void listar() {
        System.out.println(lista.values());
    }
    
}

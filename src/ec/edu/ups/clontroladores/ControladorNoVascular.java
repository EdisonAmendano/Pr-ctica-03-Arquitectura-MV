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
 * ControladorNoVascular
 * En esta clase se ara los crud de NoVascular
 * @author Edison
 */
public class ControladorNoVascular {

    private Map<Integer, NoVascular> lista;
    private int codigo;
    // Constructor
    public ControladorNoVascular() {
        lista = new HashMap<Integer, NoVascular>();
        codigo = 0;
    }
    // Creacion del objeto tipo NoVascular
    public void create(NoVascular objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);

    }
    // Leer el objeto tipo NoVascular
    public NoVascular read(int codigo) {
        return lista.get(codigo);
    }
    // Modificacion del objeto tipo NoVascular
    public void update(NoVascular objeto) {

        lista.remove(objeto.getCodigo());
        lista.put(objeto.getCodigo(), objeto);

    }
    // Eliminacion del objeto tipo NoVascular
    public void delet(int codigo) {
        lista.remove(codigo);

    }
    // Listar los objetos tipo NoVascular
    public void listar() {
        System.out.println(lista.values());
    }
    
}

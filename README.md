1. Crear un repositorio en GitHub con el nombre “Práctica 03 – Arquitectura MVC”.

URL :    https://github.com/EdisonAmendano/Pr-ctica-03-Arquitectura-MV.git
User : EdisonAmendano
2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar varios commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).
  
3. Crear un paquete para los controladores y un paquete para la vista.

4. Crear un controlador por cada clase hija. En total, cuatro controladores.

5. Al menos una clase Controlador debe ser implementada usando la interface List y la clase ArrayList.

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
6. Al menos una clase Controlador debe ser implementada usando la interface Set y la clase HashSet.

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
7. Al menos una clase Controlador debe ser implementada usando la interface SortedSet y la clase TreeSet.

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
8. Al menos una clase Controlador debe ser implementada usando la interface Map y la clase HashMap o la interface Map y la clase TreeMap.

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
9. Crear una clase “Principal”, en donde se demostrará el funcionamiento del sistema completo a través de la consola de java, usando menús y submenús para acceder a las opciones.

package ec.edu.ups.prueva;

import ec.edu.ups.clontroladores.ControladorAve;
import ec.edu.ups.clontroladores.ControladorNoVascular;
import ec.edu.ups.clontroladores.ControladorPez;
import ec.edu.ups.clontroladores.ControladorVascular;
import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.NoVascular;
import ec.edu.ups.clases.Pez;
import ec.edu.ups.clases.Vascular;
import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Principal {

    public static void main(String[] args) {
        Scanner l2 = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner l3 = new Scanner(System.in);
        ControladorPez cp = new ControladorPez();
        ControladorAve ca = new ControladorAve();
        ControladorVascular cv = new ControladorVascular();
        ControladorNoVascular cnv = new ControladorNoVascular();
        int metodo = -1;
        int codigo;
        int o;
        do {
            // Primer menu
            System.out.println("CRUD:\n\t1. Pez\n\t2. Ave\n\t3. Vascular\n\t4. No Vascular\n\t5. Salir");
            o = l2.nextInt();
            switch (o) {
                case 1:
                    do {
                        // Segundo menu
                        System.out.println("1. Create\n2. Reade\n3. Update\n4. Delete\n5. Listar\n6. Regresar");
                        metodo = l2.nextInt();
                        switch (metodo) {

                            case 1:
                                
                                System.out.println("INGRESAR DATOS DEL PEZ:");
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int anosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamano = l2.nextDouble();
                                System.out.println("Ingrese si es domestico o salvaje");
                                String domesticoSalvaje = l2.next();
                                System.out.println("Ingrese el color");
                                String color = l.nextLine();
                                System.out.println("Ingrese el tipo de alimento que consume");
                                String tipoAlimento = l.nextLine();
                                System.out.println("Ingrese si es capaz de casar (true/false)");
                                boolean capacidadCazar = l2.nextBoolean();
                                System.out.println("Ingrese a que profundidad se encuentra el pez");
                                double profundida = l2.nextDouble();
                                System.out.println("Ingrese el numero de aletas del pez");
                                int aletas = l2.nextInt();
                                System.out.println("Ingrese si es de agua dulse o salada");
                                String dulceSalada = l2.next();
                                System.out.println("Ingrese que tipo de pez es");
                                String tipo = l.nextLine();
                                Pez pez = new Pez(profundida, aletas, dulceSalada, tipo, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
                                cp.create(pez);

                                break;
                            case 2:                                
                                System.out.println("Ingrese el codigo del objeto a leer");
                                cp.codigo();
                                System.out.println(cp.read(l2.nextInt()));

                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del objeto a modificar");
                                cp.codigo();
                                codigo = l2.nextInt();
                                if (cp.read(codigo) != null) {
                                    System.out.println("INGRESAR DATOS DEL PEZ:");
                                    System.out.println("Ingresar nombre");
                                    nombre = l.nextLine();
                                    System.out.println("Ingresar los años de vida");
                                    anosVida = l2.nextInt();
                                    System.out.println("Ingresar el peso");
                                    peso = l2.nextDouble();
                                    System.out.println("Ingresar el tamaño");
                                    tamano = l2.nextDouble();
                                    System.out.println("Ingrese si es domestico o salvaje");
                                    domesticoSalvaje = l2.next();
                                    System.out.println("Ingrese el color");
                                    color = l.nextLine();
                                    System.out.println("Ingrese el tipo de alimento que consume");
                                    tipoAlimento = l.nextLine();
                                    System.out.println("Ingrese si es capaz de casar (true/false)");
                                    capacidadCazar = l2.nextBoolean();
                                    System.out.println("Ingrese a que profundidad se encuentra el pez");
                                    profundida = l2.nextDouble();
                                    System.out.println("Ingrese el numero de aletas del pez");
                                    aletas = l2.nextInt();
                                    System.out.println("Ingrese si es de agua dulse o salada");
                                    dulceSalada = l2.next();
                                    System.out.println("Ingrese que tipo de pez es");
                                    tipo = l.nextLine();
                                    Pez pez2 = new Pez(profundida, aletas, dulceSalada, tipo, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano, codigo);
                                    cp.update(pez2);
                                } else {
                                    System.out.println("No existe el objeto");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cp.codigo();
                                codigo = l2.nextInt();
                                cp.delet(codigo);
                                break;
                            case 5:
                                cp.listar();
                                break;
                        }

                    } while (metodo != 6);
                    break;
                case 2:
                    do {
                        System.out.println("1. Create\n2. Reade\n3. Update\n4. Delete\n5. Listar\n6. Regresar");
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:
                                System.out.println("INGRESAR DATOS DEL AVE:");
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int anosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamano = l2.nextDouble();
                                System.out.println("Ingrese si es domestico o salvaje");
                                String domesticoSalvaje = l2.next();
                                System.out.println("Ingrese el color");
                                String color = l.nextLine();
                                System.out.println("Ingrese el tipo de alimento que consume");
                                String tipoAlimento = l.nextLine();
                                System.out.println("Ingrese si es capaz de casar(true/false)");
                                boolean capacidadCazar = l3.nextBoolean();
                                System.out.println("Ingres si es capas de volar (true/false)");
                                boolean capacidadvolar = l2.nextBoolean();
                                System.out.println("Ingrese la maxima altura que puede volar (0 si no vuela)");
                                double maximaalturaVuelo = l2.nextDouble();
                                System.out.println("Ingresas el tamaño de las alas");
                                double tamanoAlas = l2.nextDouble();
                                System.out.println("Ingrese si es capaz de nadar (true/false)");
                                boolean capacidadNadar = l2.nextBoolean();
                                Ave ave = new Ave(maximaalturaVuelo, tamanoAlas, capacidadvolar, capacidadNadar, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
                                ca.create(ave);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                ca.codigo();
                                System.out.println(ca.read(l2.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del objeto a modificar");
                                ca.codigo();
                                codigo = l2.nextInt();
                                if (ca.read(codigo) != null) {
                                    System.out.println("INGRESAR DATOS DEL AVE:");
                                    System.out.println("Ingresar nombre");
                                    nombre = l.nextLine();
                                    System.out.println("Ingresar los años de vida");
                                    anosVida = l2.nextInt();
                                    System.out.println("Ingresar el peso");
                                    peso = l2.nextDouble();
                                    System.out.println("Ingresar el tamaño");
                                    tamano = l2.nextDouble();
                                    System.out.println("Ingrese si es domestico o salvaje");
                                    domesticoSalvaje = l2.next();
                                    System.out.println("Ingrese el color");
                                    color = l.nextLine();
                                    System.out.println("Ingrese el tipo de alimento que consume");
                                    tipoAlimento = l.nextLine();
                                    System.out.println("Ingrese si es capaz de casar(true/false)");
                                    capacidadCazar = l3.nextBoolean();
                                    System.out.println("Ingres si es capas de volar (true/false)");
                                    capacidadvolar = l2.nextBoolean();
                                    System.out.println("Ingrese la maxima altura que puede volar (0 si no vuela)");
                                    maximaalturaVuelo = l2.nextDouble();
                                    System.out.println("Ingresas el tamaño de las alas");
                                    tamanoAlas = l2.nextDouble();
                                    System.out.println("Ingrese si es capaz de nadar (true/false)");
                                    capacidadNadar = l2.nextBoolean();
                                    Ave ave2 = new Ave(maximaalturaVuelo, tamanoAlas, capacidadvolar, capacidadNadar, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano, codigo);
                                    ca.update(ave2);
                                } else {
                                    System.out.println("El objeto no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                ca.codigo();
                                codigo = l2.nextInt();
                                ca.delet(codigo);
                                break;
                            case 5:
                                ca.listar();
                                break;
                        }
                    } while (metodo != 6);
                    break;
                case 3:
                    do {
                        System.out.println("1. Create\n2. Reade\n3. Update\n4. Delete\n5. Listar\n6. Regresar");
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:
                                System.out.println("INGRESAR DATOS DEL VEGETAL VASCULAR:");
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int anosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamano = l2.nextDouble();
                                System.out.println("Ingrese si tiene hojas (true/false)");
                                boolean hojas = l2.nextBoolean();
                                System.out.println("Ingrese si tiene frutos (true/false)");
                                boolean frua = l2.nextBoolean();
                                System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                String usoVegetal = l.nextLine();
                                System.out.println("Ingres el lugar donde crece");
                                String lugarCrecimiento = l.nextLine();
                                System.out.println("Ingrese el tamaño aproximado de la raiz");
                                double tamanoRaiz = l2.nextDouble();
                                System.out.println("Ingrese el tamaño aproximado del tallo");
                                double tamanoTallo = l2.nextDouble();
                                System.out.println("Ingrese el tamaño aproximado de la hoja");
                                double tamanoHoja = l2.nextDouble();
                                System.out.println("Ingrese la cantidad maxiam de fruto que produce");
                                int cantidadMaximaFrutos = l2.nextInt();
                                Vascular vascular = new Vascular(tamanoRaiz, tamanoTallo, tamanoHoja, cantidadMaximaFrutos, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
                                cv.create(vascular);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                cv.codigo();;
                                System.out.println(cv.read(l2.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                cv.codigo();
                                codigo = l2.nextInt();
                                if (cv.read(codigo) != null) {
                                    System.out.println("INGRESAR DATOS DEL VEGETAL VASCULAR:");
                                    System.out.println("Ingresar nombre");
                                    nombre = l.nextLine();
                                    System.out.println("Ingresar los años de vida");
                                    anosVida = l2.nextInt();
                                    System.out.println("Ingresar el peso");
                                    peso = l2.nextDouble();
                                    System.out.println("Ingresar el tamaño");
                                    tamano = l2.nextDouble();
                                    System.out.println("Ingrese si tiene hojas (true/false)");
                                    hojas = l2.nextBoolean();
                                    System.out.println("Ingrese si tiene frutos (true/false)");
                                    frua = l2.nextBoolean();
                                    System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                    usoVegetal = l.nextLine();
                                    System.out.println("Ingres el lugar donde crece");
                                    lugarCrecimiento = l.nextLine();
                                    System.out.println("Ingrese el tamaño aproximado de la raiz");
                                    tamanoRaiz = l2.nextDouble();
                                    System.out.println("Ingrese el tamaño aproximado del tallo");
                                    tamanoTallo = l2.nextDouble();
                                    System.out.println("Ingrese el tamaño aproximado de la hoja");
                                    tamanoHoja = l2.nextDouble();
                                    System.out.println("Ingrese la cantidad maxiam de fruto que produce");
                                    cantidadMaximaFrutos = l2.nextInt();
                                    Vascular vascular2 = new Vascular(tamanoRaiz, tamanoTallo, tamanoHoja, cantidadMaximaFrutos, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano, codigo);
                                    cv.update(vascular2);
                                } else {
                                    System.out.println("El objeno no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cv.codigo();
                                codigo = l2.nextInt();
                                cv.delet(codigo);
                                break;
                            case 5:
                                cv.imprimir();
                                break;
                        }
                    } while (metodo != 6);
                    break;
                case 4:
                    do {
                        System.out.println("1. Create\n2. Reade\n3. Update\n4. Delete\n5. Listar\n6. Regresar");
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:
                                System.out.println("INGRESAR DATOS DEL VEGETAL NO VASCULAR:");
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int anosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamano = l2.nextDouble();
                                System.out.println("Ingrese si tiene hojas (true/false)");
                                boolean hojas = l2.nextBoolean();
                                System.out.println("Ingrese si tiene frutos (true/false)");
                                boolean frua = l2.nextBoolean();
                                System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                String usoVegetal = l.nextLine();
                                System.out.println("Ingres el lugar donde crece");
                                String lugarCrecimiento = l.nextLine();
                                System.out.println("Ingrese el tipo de vegetal no Vascular al que pertenece");
                                String tipo = l.nextLine();
                                System.out.println("Ingrese si tiene rizoides (true/false)");
                                boolean rizoides = l2.nextBoolean();
                                System.out.println("Ingrese si tiene escamas (true/false)");
                                boolean escamas = l2.nextBoolean();
                                System.out.println("Ingrese la cantidad de escamas");
                                double cantidadEscamas = l2.nextDouble();
                                NoVascular noVascular = new NoVascular(tipo, rizoides, escamas, cantidadEscamas, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
                                cnv.create(noVascular);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                System.out.println(cnv.read(l2.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                codigo = l2.nextInt();
                                if (cnv.read(codigo) != null) {
                                    System.out.println("INGRESAR DATOS DEL VEGETAL NO VASCULAR:");
                                    System.out.println("Ingresar nombre");
                                    nombre = l.nextLine();
                                    System.out.println("Ingresar los años de vida");
                                    anosVida = l2.nextInt();
                                    System.out.println("Ingresar el peso");
                                    peso = l2.nextDouble();
                                    System.out.println("Ingresar el tamaño");
                                    tamano = l2.nextDouble();
                                    System.out.println("Ingrese si tiene hojas (true/false)");
                                    hojas = l2.nextBoolean();
                                    System.out.println("Ingrese si tiene frutos (true/false)");
                                    frua = l2.nextBoolean();
                                    System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                    usoVegetal = l.nextLine();
                                    System.out.println("Ingres el lugar donde crece");
                                    lugarCrecimiento = l.nextLine();
                                    System.out.println("Ingrese el tipo de vegetal no Vascular al que pertenece");
                                    tipo = l.nextLine();
                                    System.out.println("Ingrese si tiene rizoides (true/false)");
                                    rizoides = l2.nextBoolean();
                                    System.out.println("Ingrese si tiene escamas (true/false)");
                                    escamas = l2.nextBoolean();
                                    System.out.println("Ingrese la cantidad de escamas");
                                    cantidadEscamas = l2.nextDouble();
                                    NoVascular noVascular2 = new NoVascular(tipo, rizoides, escamas, cantidadEscamas,    hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano, codigo);
                                    cnv.update(noVascular2);
                                }else{
                                    System.out.println("El objeto no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                codigo = l2.nextInt();
                                cnv.delet(codigo);
                                break;
                            case 5:
                                cnv.listar();
                                break;
                        }
                    } while (metodo != 6);
            }
        } while (o < 5);

    }

}

 

10. Desarrollar el diagrama de clases correspondiente usando la herramienta LucidChart. Se debe agregar las clases controladores y la clase “Principal”.
 https://www.lucidchart.com/documents/edit/c6a30393-cf97-4a5c-ad1f-2c7772b5c24c/0

RESULTADO(S) OBTENIDO(S):
Se pudo abstrae de la vida real objeto e implementarlos en el lenguaje de programación java además de la utilización de Modelo Vista Controlador (UML).
CONCLUSIONES:
Se pido observar que la implementación de MVC es muy importante ya que con ello se puede llevar un buen control de las clases y por lo tanto el programa se hace mas eficiente

Nombre de estudiante: Edison Amendaño



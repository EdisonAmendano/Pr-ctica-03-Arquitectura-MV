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
                                    pez = new Pez(profundida, aletas, dulceSalada, tipo, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano, codigo);
                                    cp.update(pez);
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
                                    ave = new Ave(maximaalturaVuelo, tamanoAlas, capacidadvolar, capacidadNadar, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano, codigo);
                                    ca.update(ave);
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
                                    vascular = new Vascular(tamanoRaiz, tamanoTallo, tamanoHoja, cantidadMaximaFrutos, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano, codigo);
                                    cv.update(vascular);
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
                                cnv.codigo();
                                System.out.println(cnv.read(l2.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                cnv.codigo();
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
                                    noVascular = new NoVascular(tipo, rizoides, escamas, cantidadEscamas, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano, codigo);
                                    cnv.update(noVascular);
                                }else{
                                    System.out.println("El objeto no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                cnv.codigo();
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

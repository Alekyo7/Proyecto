package Metodos;
import java.util.Scanner;

import Clases.Cliente;
import Clases.Vendedor;
import Vista.Sistema;

public class Metodos {
    private Cliente cl[] = new Cliente[50];
    private Vendedor vn[] = new Vendedor[50];
    Sistema sis = new Sistema();
    Scanner sc = new Scanner(System.in);
    Metodos met = new Metodos();

    public void crear(int hos){
        System.out.print("Ingrese el nombre del hospedaje: ");
        vn[hos].getHospedaje().setNameL(sc.nextLine());
        System.out.println();

        System.out.print("Ingrese la ubicación del hospedaje: ");
        vn[hos].getHospedaje().setLocation(sc.next());
        System.out.println();

        System.out.print("Ingrese el aforo del hospedaje: ");
        vn[hos].getHospedaje().setAforo(sc.nextInt());
        System.out.println();

        System.out.print("Ingrese el costo del hospedaje por dia y noche: ");
        vn[hos].getHospedaje().setCost(sc.nextDouble());
        System.out.println();
    }

    public void editar(int hos){
        int opc = 0;
        while(opc!=6){
        System.out.println("(1) Nombre del hospedaje");
        System.out.println("(2) Ubicación del hospedaje");
        System.out.println("(3) Aforo del hospedaje");
        System.out.println("(4) Costo del hospedaje");
        System.out.println("(5) Disponibilidad del hospedaje");
        System.out.println("(6) Volver");
        switch(opc){
            case 1:{System.out.print("Ingrese el nuevo nombre: ");
                vn[hos].getHospedaje().setNameL(sc.nextLine());
                break;
            }
            case 2:{System.out.print("Ingrese la nueva ubicación: ");
                vn[hos].getHospedaje().setLocation(sc.next());
                break;
            }
            case 3:{System.out.print("Ingrese el nuevo aforo: ");
                vn[hos].getHospedaje().setAforo(sc.nextInt());
                break;
            }
            case 4:{System.out.print("Ingrese el nuevo precio: ");
                vn[hos].getHospedaje().setCost(sc.nextDouble());
                break;
            }
            case 5:{System.out.print("Ingrese el nueva disponibilidad: ");
                String dispo = sc.next().toUpperCase();
                if(dispo.equals(dispo)){
                    vn[hos].getHospedaje().setDispo(true);
                }
                else{
                    vn[hos].getHospedaje().setDispo(false);
                }
                break;
            }
            case 6:{System.out.println();
                break;
            }
            default:{
                System.out.println("No contamos con esa opción");
            }
        }
        }
    }  

    public void pago(){
        //posible metodo de pago para añadir al menú del cliente despues de hacer reserva
    }

    public void comentarios(){
        //metodo de ver la critica del cliente, creo jeje
    }
    public void menuCliente(){
        int opc = 0;
        do{
        System.out.println("""
            Opciones del cliente:
            (1) Ver todos los hospedajes
             (2) Buscar hospedajes por su nombre
              (3) Buscar hospedajes por su ubicacion
               (4) Buscar hospedaje por precio
                (5) Buscar hospedaje por aforo
                 (6) Hacer reservacion de algun hospedaje
                  (7) Salir
            """);
            opc = sc.nextInt();
            switch (opc) {
                case 1:{ met.mostrarHospedajes(); //Metodo para mostrar el vector con todos los hospedajes
                    break;
                }
                case 2:{met.buscarNombre(); // leer un nombre de hospedaje, if .equals(vectorHospedajes.nombre[i]) syso(hospedajes[i])
                    break;
                }
                case 3:{met.buscarUbicacion(); //igual que con el nombre pero con .ubicacion
                    break;
                }
                case 4:{met.buscarPrecio(); //if presupuesto == [i].precio syso........
                    break;
                }
                case 5:{met.buscarAforo(); //if cantPersonas <= [i].aforo syso......
                    break;
                }
                case 6:{System.out.println("1. Hacer reservacion");
                    System.out.println("2. Cancelar reservacion");
                    opc = sc.nextInt();
                    if(opc == 1){
                        met.reservar();
                    }else{
                        met.menuCliente();
                        break;
                    }
                }
                case 7:System.out.println("Hasta luego");
                    break;
            
                default: System.out.println("Opcion incorrecta");//MOSTRAR HOSPEDAJES CON NUMEROS // 1. HOTEL A&A ...
                    break;// para que el cliente elija que hospedaje quiere
            }
        }while(opc != 7);
    }

    public void reservar(){
        int var = 0;
        int hos = 0;
        System.out.println("Digite el numero del hospedaje al que desea reservar");
            hos = sc.nextInt();
            //if(lodgment[i].getDisponivilidad = true)... else syso("el hospedaje no está disponible")
            //cambiar la disponivilidad del hospedaje
            if(vn[hos].getHospedaje().getDispo() == true){
            System.out.println("Su hospedaje ya esta reservado, desea calificarlo?");
            System.out.println("1. Calificar");
            System.out.println("2. Omitir calificacion");
            var = sc.nextInt();
            if(var == 1){
            met.calificar(hos);
            }
            }
            else{
                System.out.println("El hospedaje que desea no esta disponible");
                System.out.println("1. seleccionar otro hospedaje");
                System.out.println("2. Cancelar reservacion");
                var = sc.nextInt();
                if(var == 1){
                    met.reservar();
                }
            }
    }
    public void calificar(int hos){
        System.out.println("De 1 a 5, que calificacion le da al hospedaje " + vn[hos].getHospedaje().getNameL() + "?");
        System.out.println("1 pesimo ; 5 excelente");
        vn[hos].getHospedaje().setCalificacion(sc.nextInt());
        if(vn[hos].getHospedaje().getCalificacion() < 5 && vn[hos].getHospedaje().getCalificacion() > 0){
        System.out.println("Calificación guardada");
        }else{
            System.out.println("La calificacion no esta en el rango de 1 a 5, vuelva a digitarla");
            met.calificar(hos);
        }
    }
    public void mostrarHospedajes(){
        for (int i = 0; i < vn.length; i++){
            System.out.println(vn[i].getHospedaje().toString());
        }
    }
    public void buscarNombre(){
        String name = "";
        int opc = 0;
        System.out.println("Digite el nombre del hospedaje que busca");
        name = sc.next();
        for(int i = 0; i < vn.length; i++){
        if(vn[i].getHospedaje().getNameL().equals(name)){
            System.out.println("Se encontro el hospedaje que busca");
            System.out.println(vn[i].getHospedaje().toString());
        }else{
            System.out.println("El hospedaje que busca no fue encontrado");
            System.out.println("1. Buscar otro hospedaje nuevamente");
            System.out.println("2. Cancelar busqueda");
            opc = sc.nextInt();
            if(opc == 1){
                met.buscarNombre();
            }
            else{

            }
        }
        }
    }
    public void buscarUbicacion(){
         String ubicacion = "";
        int opc = 0;
        System.out.println("Digite la ubicacion del hospedaje que busca");
        ubicacion = sc.next();
        for(int i = 0; i < vn.length; i++){
        if(vn[i].getHospedaje().getLocation().equals(ubicacion)){
            System.out.println("Se encontro el hospedaje que busca");
            System.out.println(vn[i].getHospedaje().toString());
        }else{
            System.out.println("El hospedaje que busca no fue encontrado");
            System.out.println("1. Buscar otro hospedaje nuevamente");
            System.out.println("2. Cancelar busqueda");
            opc = sc.nextInt();
            if(opc == 1){
                met.buscarUbicacion();
            }
            else{
                
            }
        }
        }

    }
    public void buscarPrecio(){
        double precio = 0;
        int opc = 0;
        System.out.println("Digite el precio del hospedaje que busca");
        precio = sc.nextDouble();
        for(int i = 0; i < vn.length; i++){
        if(vn[i].getHospedaje().getCost() == precio){
            System.out.println("Se encontro el hospedaje que busca");
            System.out.println(vn[i].getHospedaje().toString());
        }else{
            System.out.println("El hospedaje que busca no fue encontrado");
            System.out.println("1. Buscar otro hospedaje nuevamente");
            System.out.println("2. Cancelar busqueda");
            opc = sc.nextInt();
            if(opc == 1){
                met.buscarPrecio();
            }
            else{
                
            }
        }
        }

    }
    public void buscarAforo(){
        int aforo = 0;
        int opc = 0;
        System.out.println("Digite el aforo del hospedaje que busca");
        aforo = sc.nextInt();
        for(int i = 0; i < vn.length; i++){
        if(vn[i].getHospedaje().getAforo() == aforo){
            System.out.println("Se encontro el hospedaje que busca");
            System.out.println(vn[i].getHospedaje().toString());
        }else{
            System.out.println("El hospedaje que busca no fue encontrado");
            System.out.println("1. Buscar otro hospedaje nuevamente");
            System.out.println("2. Cancelar busqueda");
            opc = sc.nextInt();
            if(opc == 1){
                met.buscarAforo();
            }
            else{
                
            }
        }
        }
    }
}

import java.util.Scanner;
public class Sistema {
        Scanner sc = new Scanner(System.in);
        static Sistema sis = new Sistema();
        Pagina pag = new Pagina();
        Metodos met = new Metodos();

        public static void main(String[] args) {
            Sistema sis = new Sistema();
            Scanner sc = new Scanner(System.in);
            int opc = 0;
            int opc2 = 0;
            int opc3 = 0;
    
            while(opc!=3){
                System.out.println("""
                    Bienvenido
                (1) Iniciar sesión
                 (2) Registrarse
                  (3) Salir""");

                opc = sc.nextInt();
                System.out.println();
                switch(opc){
                    case 1:{
                        while(opc2!=3){
                        System.out.println("""
                            Desea iniciar sesión como: 
                        (1) Cliente 
                         (2) Vendedor
                          (3) Volver al inicio
                        """);
                        opc2 = sc.nextInt();
                        System.out.println();
                        switch(opc2){
                            case 1:{
                                System.out.println();
                                met.menuCliente();                            
                                break;
                            }
                            case 2:{
                                System.out.println();
                                met.menuSeller();
                                break;
                            }
                            case 3:{System.out.println();
                                break;
                            }
                            default:System.out.println("Opción incorrecta");
                        }
                        }
                        break;
                    }
                    case 2:{
                        while(opc3!=3){
                        System.out.println("""
                            Desea registrarse como: 
                        (1) Cliente 
                         (2) Vendedor
                          (3) Volver al inicio
                        """);
                        opc2 = sc.nextInt();
                        System.out.println();
                        switch(opc2){
                            case 1:{
                                System.out.println();
                                break;
                            }
                            case 2:{
                                System.out.println();
                                break;
                            }
                            case 3:{System.out.println();
                                break;
                            }
                            default:{
                                System.out.println("Opción incorrecta");
                            }
                        }
                        }
                        break;
                    }
                    case 3:{System.out.println("Te esperamos de vuelta");
                        break;
                    }
                    default:{
                    }
                }
            }
        }
        


}

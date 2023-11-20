public class Pagina {
    private Cliente cl[] = new Cliente[50];
    private Vendedor vn[] = new Vendedor[50];
    private int countC;
    private int countV;

    public Pagina(){
        this.countC = 0;
        this.countV = 0;
    }

    public Pagina(int countC, int countV){
        this.countC = countC;
        this.countV = countV;

    }
    public void tamVectorC(){
        cl = new Cliente[countC];
        setContC(countC + 1);
    }
    public void tamVectorV(){
        vn = new Vendedor[countV];
        setContV(countV + 1);
    }

    public Cliente[] getCliente(){
        return cl;
    }
    public void setCliente(Cliente[] cl){
        this.cl = cl;
    }
    public Vendedor[] getVendedor(){
        return vn;
    }
    public void setVendedor(Vendedor vn1){
        for (int i = 0; i < vn.length; i++) {
            if (vn[i]== null) {
                vn[i]=vn1;
                System.out.println("añadido");
                break;
            }
        }
    }
    public int getContC(){
        return countC;
    }
    public void setContC(int countC){
        this.countC = countC;
    }
    public int getContV(){
        return countV;
    }
    public void setContV(int countV){
        this.countV = countV;
    }
}

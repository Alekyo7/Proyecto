
public class Vendedor {
    private String nameV;
    private String userV;
    private String pWv;
    private Lodgment hospedaje;

    public Vendedor(){
        this.nameV = "";
        this.userV = "";
        this.pWv = "";
        this.hospedaje = new Lodgment();
    }

    public Vendedor(String nameV, String userV, String pWv){
        this.nameV = nameV;
        this.userV = userV;
        this.pWv = pWv;
    }

    public Lodgment getHospedaje(){
        return hospedaje;
    }
    public void setHospedaje(Lodgment hospedaje){
        this.hospedaje = hospedaje;
    }
    public String getNameV(){
        return nameV;
    }
    public String getUserV(){
        return userV;
    }
    public String getPassV(){
        return pWv;
    }

    public void setNameV(String nameV){
        this.nameV = nameV;
    }
    public void setUserV(String userV){
        this.userV = userV;
    }
    public void setPassV(String pWv){
        this.pWv = pWv;
    }
}

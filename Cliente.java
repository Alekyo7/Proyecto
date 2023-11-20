
public class Cliente {
    private String nameC;
    private String userC;
    private String pWc;

    public Cliente(){
        this.nameC = "";
        this.userC = "";
        this.pWc = "";
    }

    public Cliente(String nameC, String userC, String pWc){
        this.nameC = nameC;
        this.userC = userC;
        this.pWc = pWc;
    }
    public String getNameC(){
        return nameC;
    }
    public String getUserC(){
        return userC;
    }
    public String getPassC(){
        return pWc;
    }

    public void setNameC(String nameC){
        this.nameC = nameC;
    }
    public void setUserC(String userC){
        this.userC = userC;
    }
    public void setPassC(String pWc){
        this.pWc = pWc;
    }
}


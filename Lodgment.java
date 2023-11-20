
public class Lodgment {
    private String nameL;
    private boolean disponibilidad;
    private String location;
    private double cost;
    private int aforo;
    private int calificacion;

    public Lodgment(){
        this.nameL = "";
        this.disponibilidad = true;
        this.location = "";
        this.cost = 0;
        this.aforo = 0;
        this.calificacion = 0;
    }

    public Lodgment(String nameL, boolean disponilidad, String location, double cost, int aforo, int calificacion){
        this.nameL = nameL;
        this.disponibilidad = disponilidad;
        this.location = location;
        this.cost = cost;
        this.aforo = aforo;
        this.calificacion = calificacion;
    }

    public int getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }
    public String getNameL(){
        return nameL;
    }
    public boolean getDispo(){
        return disponibilidad;
    }
    public String getLocation(){
        return location;
    }
    public double getCost(){
        return cost;
    }
    public int getAforo(){
        return aforo;
    }

    public void setNameL(String nameL){
        this.nameL = nameL;
    }
    public void setDispo(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setAforo(int aforo){
        this.aforo = aforo;
    }
    public String toString(){
        return "El hospedaje es: " ;
    }
}

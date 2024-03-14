package Classes;

public class Private {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Details();
    }
}
class Pen {
    private String cost;
    private String color;
    static String brand;

    public String getCost(){
        return cost;
    }

    public void setCost(String cost){
        this.cost = cost;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String col){
        color = col;
    }

    public void Details(){
        System.out.println("This pen belongs to : "+brand+" the color of the pen is : "+getColor()+" and the cost of the pen is : "+getCost());
    }

}
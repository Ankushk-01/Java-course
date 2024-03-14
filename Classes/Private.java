package Classes;

public class Private {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p2.setCost2(10,p2);
        p1.setColor("Blue");
        p1.setCost(20);
        p1.Details();
        System.out.println(p2.getCost());
    }
}
class Pen {
    private int cost;
    private String color;
    static String brand;
    static {
        brand = "Butterflow";
    }
    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    // we can ruplicate it via passing the referenc of the object
    public void setCost2(int cost,Pen p2 ){
        p2.cost = cost; // set the 0 as it is default of int type in instance variable
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
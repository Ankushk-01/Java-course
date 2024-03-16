package Classes;

public class Constructors {
    public static void main(String[] args) {
       Fruit apple = new Fruit();
       System.out.println(apple.toString());
       Fruit bannana = new Fruit("bannana", "sweet", 12);
       System.out.println(bannana.toString()); 
       // the default value of String is null and the default value of an object is also null
    //    String is considered as a String 
    }
}

class Fruit{
    private String name;
    private String taste;
    private int price;

    public Fruit(){  // Default Constructor
        this.name = "apple";
        this.taste = "sweet";
        this.price = 100;
    }
    
    public Fruit(String name,String taste,int price){ // perameter Constructor
        this.name = name;
        this.price = price;
        this.taste = taste;
    }
    public Fruit(String name,int price){
        this.taste = "sweet";
        this.name = name;
        this.price = price;
    }

    // Getters

    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public String getTaste(){
        return this.taste;
    }

    // setter

    public void setPrice(int price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTaste(String taste){
        this.taste = taste;
    }

    @Override 
    public String toString(){
        return "Fruit name : "+this.name+"\nFruit Taste : "+this.taste+"\nFruit price : "+this.price;
    }
}


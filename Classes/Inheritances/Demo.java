package Classes.Inheritances;
public class Demo {
    public static void main(String[] args) {
        // AdvCal cal = new AdvCal();
        VeryAdvCal cal = new VeryAdvCal();
        System.out.println(cal.divide(7, 3));
        System.out.println(cal.multi(5, 7));
        System.out.println(cal.add(19,2));
        System.out.println(cal.minus(19,2));
        System.out.println(cal.power(19,2));
    }
}

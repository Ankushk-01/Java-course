public class While {
    public static void main(String[] args) {
        // While loop
        int i = 2;
        while (i<=10) {
            System.out.println("Table : "+i);
            int j = 1;
            while (j<=10) {
                System.out.println(i+" X "+j+" = "+i*j);
                j++;
            }
            i++;
            System.out.println("---------------------------");
        }
    }
}

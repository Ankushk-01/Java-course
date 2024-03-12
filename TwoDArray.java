public class TwoDArray {
    public static void main(String[] args) {
        int num [][] = new int[4][4];
        int num2[][] = new int[3][]; // jagged array
        num2[0] = new int [4];
        num2[1] = new int [2];
        num2[2] = new int [3];

        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                num[i][j] = (int) (Math.random()*10);
            }
        }
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        for(int i = 0;i<num2.length;i++){
            for(int j=0;j<num2[i].length;j++){
                num2[i][j] = (int) (Math.random()*10);
            }
        }
        for (int n[] : num2) 
        {
            for (int m : n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }
    }
}

public class Arrays {
    public static void main(String[] args) {
        int num [] = {3,5,6};
        // System.out.println("num : "+num[0]);
        // System.out.println("num : "+num[1]);
        // System.out.println("num : "+num[2]);
        // for(int i =0;i<num.length;i++)
        // {
        //     System.out.println(num[i]);
        // }
        // int num1 [] = new int[4];
        // for(int i =0;i<num.length;i++)
        // {
        //     System.out.println(num1[i]);
        // }

        int num2 [][] = new int[4][4];
        for(int i =0;i<num2.length;i++)
        {
            for(int j = 0;j<num2[i].length;j++)
            {
                System.out.println("Value : "+num2[i][j]);
            }
        }

    }
}

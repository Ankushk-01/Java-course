package Data;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = { 21, 5, 3, 1, 7, 6, 4, 9,2 };
        System.out.println("before sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] sortedArray = insertionSort(input);
        System.out.println("after sorting");
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] insertionSort(int[] input) {
        for(int i =1;i<input.length;i++){
            for (int j =i;j>=1;j--){
                if (input[j]<input[j-1]) {
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp; 
                }
            }
        }
        return input;
    }
}

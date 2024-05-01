package Data;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = { 21, 5, 3, 1, 7, 6, 4, 9,2 };
        System.out.println("before sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
        mergeSort(input,0,input.length-1);
        System.out.println("After sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
    }

    private static void mergeSort(int[] input, int i, int j) {
        
    }
}

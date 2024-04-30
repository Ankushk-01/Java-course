package Data;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = { 21, 5, 3, 1, 7, 6, 4, 9,2 };
        System.out.println("before sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
        quickSort(input,0,input.length-1);
        System.out.println("After sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
    }

    private static void quickSort(int[] input,int low ,int high) {
        if (low<high) {
            int pi = partition(input,low,high);
            quickSort(input, low, pi-1);
            quickSort(input, pi+1, high);
        }
    }

    private static int partition(int[] input, int low, int high) {
        int i = low-1;
        int pivot = input[high];
        for(int j = low;j<high;j++){
            if (input[j]<pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i+1];
        input[i+1] = input[high];
        input[high] = temp;
        return i+1;
    }
}

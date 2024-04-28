package Data;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = { 2, 5, 3, 1, 7, 6, 4, 9 };
        System.out.println("before sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] sortedArray = selectionSort(input);
        // int[] sortedArray = selectionSortMax(input);
        System.out.println("after sorting");
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    // private static int[] selectionSortMax(int[] input) {
    //     for (int i = input.length - 1; i >= 0; i--) {
    //         int maxIndex = i;
    //         for (int j = i-1; j >=0; j--) {
    //             if (input[maxIndex] < input[j]) {
    //                 maxIndex = j;
    //             }
    //         }
    //         int temp = input[maxIndex];
    //         input[maxIndex] = input[i];
    //         input[i] = temp;
    //     }
    //     return input;
    // }

    private static int[] selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }
}

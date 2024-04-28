package Data;

public class Sorting {
    public static void main(String[] args) {
        int[] input = { 2, 5, 3, 1, 7, 6, 4, 9 };
        System.out.println("before sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] sortedArray = bubbleSort(input);
        System.out.println("after sorting");
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}

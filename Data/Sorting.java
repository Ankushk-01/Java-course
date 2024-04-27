package Data;

public class Sorting {
    public static void main(String[] args) {
        int[] input = { 2, 5, 3, 1, 7, 6, 4, 9 };
        int[] sortedArray = bubbleSort(input);
        for (int element : sortedArray) {
            System.out.println(element);
        }
    }

    private static int[] bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i; j++) {
                int first = input[j];
                int second = 0;
                if (j == input.length - 1) {
                    second = j;
                } else {

                    second = input[j + 1];
                }
                if (first < second) {
                    int temp = first;
                    first = second;
                    second = temp;
                }
            }
        }
        return input;
    }
}

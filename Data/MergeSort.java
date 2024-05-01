package Data;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = { 21, 5, 3, 1, 7, 6, 4, 9, 2 };
        System.out.println("before sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
        mergeSort(input, 0, input.length - 1);
        System.out.println("After sorting");
        for (int element : input) {
            System.out.print(element + " ");
        }
    }

    private static void mergeSort(int[] input, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(input, low, mid);
            mergeSort(input, mid + 1, high);

            merge(input, low, mid, high);
        }
    }

    private static void merge(int[] input, int low, int mid, int high) {
        int n1 = mid - low + 1; // array have zero index but array length must be one.
        int n2 = high - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        int i = 0;
        int j = 0;
        int k = low;
        for (int x = 0; x < n1; x++) {
            leftArr[x] = input[low+x];
        }
        for (int y = 0; y < n2; y++) {
            rightArr[y] = input[mid+1+y];
        }
        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                input[k] = leftArr[i];
                i++;
            } else {
                input[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            input[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            input[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

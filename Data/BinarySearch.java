package Data;

public class BinarySearch {
    public static void main(String[] args) {
        int input[] = {1,2,3,4,5,6,7,8,9};
        int result = binarySearch(input, 3);
        System.out.println("index = "+result);
        
    }
    public static int binarySearch(int [] input,int element){
        int index = 0;
        int left = 0;
        int right = input.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(element == input[mid]){
                return mid;
            }else if (element<mid) {
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return index;
    }
}

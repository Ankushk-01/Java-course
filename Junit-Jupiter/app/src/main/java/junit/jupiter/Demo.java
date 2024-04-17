package junit.jupiter;

public class Demo {
    public String reverseString(String input){
        String result = "";
        char inputArr[] = input.toCharArray();
        int startIndex = 0;
        int lastIndex = inputArr.length-1;
        while (startIndex < lastIndex) {
            char temp = inputArr[startIndex];
            inputArr[startIndex] = inputArr[lastIndex];
            inputArr[lastIndex] = temp;
        }
        result = inputArr.toString();
        return result;
    }
}

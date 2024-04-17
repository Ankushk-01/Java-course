/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package junit.jupiter;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
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
    public static void main(String[] args) {
        App a1 = new App();
        String result = a1.reverseString("Ankush");
        System.out.println("result : "+result);
    }
}

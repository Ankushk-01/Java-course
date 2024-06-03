package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Text.txt");
            int result = fileReader.read();
            while (result!=-1) {
                
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

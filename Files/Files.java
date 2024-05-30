package Files;
import java.io.File;
import java.io.FileWriter;
public class Files {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if (file.exists()) {
            System.out.println("file exists");
        }else{
            System.out.println("File not exists");
        }
        System.out.println(file.getPath()); // give the path which passed in the File constructor
        System.out.println(file.getAbsolutePath());
        try (FileWriter writer = new FileWriter(file)) {
            String content = "1. Tell your name \n2. Where are you from ? \n3. What do you want ?\n4. Welcome home :) ";
            writer.write(content);
        } catch (Exception e) {
            System.out.println("File not found on that path ");
            file.deleteOnExit();
        }
    }
}

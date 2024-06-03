package MiniProjects;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.*;

public class AudioPlayer {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            File file = new File("Deli.wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            while (! response.equalsIgnoreCase("q")) {
                System.out.println(" P : Play , S: Stop, R: Reset , Q: Quit ");
                System.out.print("Enter the Choice : ");
                response = sc.next();
                switch (response) {
                    case "S":
                        clip.stop();
                        break;
                
                    case "P":
                        clip.start();
                        break;
                
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                
                    default:
                    System.out.println("Invalid option");
                    clip.close();
                        break;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

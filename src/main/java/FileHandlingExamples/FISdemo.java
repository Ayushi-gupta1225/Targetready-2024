package FileHandlingExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fisdemo {
    public static void main(String[] args) {
//
        String filePath = "abc.txt";
        File file = new File(filePath);
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        // Your FileInputStream code here...
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            int data = fis.read();
            System.out.println("data: " + data);
            System.out.println(" "+ (char)data);
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}

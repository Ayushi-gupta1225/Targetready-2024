package FileHandlingExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DyanamicFileRead {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis=new FileInputStream("abc.txt");
        int data;
        while((data=fis.read())!=-1){
            System.out.println("data :" +data);
        }
        fis.close();
    }
}

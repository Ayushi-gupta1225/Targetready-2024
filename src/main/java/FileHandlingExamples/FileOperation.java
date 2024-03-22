package FileHandlingExamples;

import java.io.File;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        try {
            //file creation
            File f = new File("D:\\Targetassisgnment\\Targetready-2024\\src\\main\\java\\FileHandlingExamples\\cba.txt");
            if (f.createNewFile())
                System.out.println("file created");
            else
                System.out.println("file already exists");

            //file deletion
            boolean result=f.delete();
            if(result==true)
                System.out.println("file deleted");
            else
                System.out.println("file deletion not possible");


        }catch(Exception e ){
            System.err.println(e);
            }
        }
    }

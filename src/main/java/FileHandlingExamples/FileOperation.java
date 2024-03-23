package FileHandlingExamples;

import java.io.*;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        try {
            //file creation
            File f = new File("D:\\Targetassisgnment\\Targetready-2024\\src\\main\\java\\FileHandlingExamples\\cba.txt");
            if (f.createNewFile())
                System.out.println("file created");
            else
                System.out.println("file already exists");


            //file writing
           // File f2=new File("D:\\Targetassisgnment\\Targetready-2024\\src\\main\\java\\FileHandlingExamples\\cba.txt");
            String data="101 , ayushi gupta , agra ,up";
            FileWriter output=new FileWriter("cbc.txt");
            output.write(data);
            System.out.println("data is written");

            //file reading
            char[]  c=new char[100];
            FileReader fr=new FileReader("cbc.txt");
            fr.read(c);
            System.out.println("data read from file");
            System.out.println(c);
            fr.close();

            //file deletion
            boolean result=f.delete();
            if(result==true)
                System.out.println("file deleted");
            else
                System.out.println("file deletion not possible");

            //character streams
            //Reader is an abstract class for reading character streams.
            //It's used for reading text data
            Reader reader = new FileReader("example.txt");
            int charstream = reader.read(); // Read a single character
            while (charstream != -1) {
                // Process the character
                System.out.print((char) charstream);
                charstream = reader.read(); // Read the next character
            }
            reader.close();


            output.close();

        }catch(Exception e ){
            System.err.println(e);
            }
        }
    }

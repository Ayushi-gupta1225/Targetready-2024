package FileHandlingExamples;


import java.io.*;
//prog to create write n append data to file
public class BinaryFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //in fos ive given true inorder to append data
        FileOutputStream fos=new FileOutputStream("abc.txt",true);
        DataOutputStream dw=new DataOutputStream(fos);
        //buffered reader is used for taking inputs , itslike the scanner class
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int rno=0;String name=""; double avgmarks=0.0;
        for(int i=0;i<1;i++)
        {
            System.out.println("enter rno");
            rno=Integer.parseInt(br.readLine());
            System.out.println("enter name");
            name=br.readLine();
            System.out.println("enter avg marks");
            avgmarks=Double.parseDouble(br.readLine());
            dw.writeInt(rno);
            dw.writeUTF(name);
            dw.writeDouble(avgmarks);
        }
        fos.close();
        dw.close();
    }
}

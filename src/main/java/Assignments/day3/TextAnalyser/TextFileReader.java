package Assignments.day3.TextAnalyser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
    // Method to read the contents of the text file into an array of strings
    public String[] readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString().split("\n");
    }
}

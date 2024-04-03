package org.targetindia.day3.TextAnalyser;

import java.util.Scanner;

public class TextFileAnalyzerMain {
    public static void main(String[] args) {
        try {
            // Accept filename input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the filename: ");
            String filename = scanner.nextLine();
            scanner.close();

            // Read the contents of the file
            TextFileReader reader = new TextFileReader();
            String[] lines = reader.readFile(filename);

            // Display the contents of the file
            System.out.println("Contents of the file:");
            for (int i = 0; i < lines.length; i++) {
                System.out.println("Line " + (i + 1) + ": " + lines[i]);
            }

            // Analyze the text file
            TextAnalyzer analyzer = new TextAnalyzer();
            // Find and display the longest line
            String longestLine = analyzer.findLongestLine(lines);
            System.out.println("\nLongest line:\n" + longestLine);
            // Find and display the shortest line
            String shortestLine = analyzer.findShortestLine(lines);
            System.out.println("\nShortest line:\n" + shortestLine);
            // Count and display the number of words in each line
            int[] wordCounts = analyzer.countWords(lines);
            System.out.println("\nWord count for each line:");
            for (int i = 0; i < lines.length; i++) {
                System.out.println("Line " + (i + 1) + ": " + wordCounts[i] + " words");
            }
            // Sort and display the word count array in descending order
            analyzer.sortWordCount(wordCounts);
            System.out.println("\nSorted word count:");
            for (int wordCount : wordCounts) {
                System.out.println(wordCount + " words");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


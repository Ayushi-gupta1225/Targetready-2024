package org.targetindia.day3.TextAnalyser;

import java.util.Arrays;

public class TextAnalyzer {
    // Method to find the longest line in the array of strings
    public String findLongestLine(String[] lines) {
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }

    // Method to find the shortest line in the array of strings
    public String findShortestLine(String[] lines) {
        String shortestLine = lines[0];
        for (String line : lines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
        }
        return shortestLine;
    }

    // Method to count the number of words in each line and store them in an array
    public int[] countWords(String[] lines) {
        int[] wordCounts = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split("\\s+");
            wordCounts[i] = words.length;
        }
        return wordCounts;
    }

    // Method to sort the array of word counts in descending order
    public void sortWordCount(int[] wordCounts) {
        Arrays.sort(wordCounts);
        for (int i = 0; i < wordCounts.length / 2; i++) {
            int temp = wordCounts[i];
            wordCounts[i] = wordCounts[wordCounts.length - i - 1];
            wordCounts[wordCounts.length - i - 1] = temp;
        }
    }
}

package org.targetindia.day1.word;
import java.util.Scanner;

public class numtowords {

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"};

    private static String convertToWords(int number) {
        if (number < 10) {
            return ones[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + ones[number % 10];
        } else if (number < 1000) {
            return ones[number / 100] + " Hundred " + convertToWords(number % 100);
        } else if (number < 1000000) {
            return convertToWords(number / 1000) + " Thousand " + convertToWords(number % 1000);
        } else if (number < 1000000000) {
            return convertToWords(number / 1000000) + " Million " + convertToWords(number % 1000000);
        } else {
            return "Number out of range";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number in words: " + convertToWords(number));
        scanner.close();
    }
}

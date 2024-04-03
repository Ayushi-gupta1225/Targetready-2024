package org.targetindia.day1.calender;
import java.util.Scanner;
public class inputreader {
    public static int[] readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        return new int[]{year, month};
    }
}
